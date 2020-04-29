package formandoEquipos;

public class Main {
	
	public static void main(String[] args) {
		int numero = 7;
		String inputPath = "lote_de_pruebas/Inputs/"+numero+".txt",
			   outputPath = "lote_de_pruebas/Outputs/"+numero+".txt";
		Equipo e = new Equipo();
		LeerEscribir.Leer(inputPath, e);
		ordenarRespuestas(e.respuestas);
		maximaAfinidad(e);
		LeerEscribir.Escribir(outputPath, e);
	}
	
	private static void maximaAfinidad(Equipo e) {
		String afinidad = "", maxAfinidad = "", respAnt = "";
		int letra = 0, respuestas = 0, maxRespuestas = 0, maxResp = 0, cantidad = 2;
		for (int i = 1; i < e.getRespuestas().length; i++) {

			while (letra < e.cantPreguntas
					&& e.getRespuestas()[i].charAt(letra) == e.getRespuestas()[i - 1].charAt(letra)) {
				afinidad += e.getRespuestas()[i].charAt(letra);
				respuestas = afinidad.length();
				letra++;
			}

			if (maxAfinidad.compareTo(afinidad) == 0) {
				maxResp++;
			} 
			if (respAnt.compareTo(afinidad) == 0) {
				cantidad++;
			} else {
				cantidad = 2;
			}
			
			if (respuestas > maxRespuestas) {
				maxAfinidad = afinidad;
				maxRespuestas = respuestas;
				maxResp = 2;
			}
			if (respuestas == maxRespuestas && cantidad > maxResp) {
				maxAfinidad = afinidad;
				maxRespuestas = respuestas;
				maxResp = cantidad;
			}
			letra = 0;
			respuestas = 0;
			respAnt = afinidad;
			afinidad = "";
		}
		if (maxRespuestas == 0) {
			e.setMaxAfinidad("No hay afinidad en este equipo");
		} else {
			e.setMaxAfinidad(maxAfinidad);
			e.setResAfinidad(maxResp * maxRespuestas * maxRespuestas);
		}
	}

	private static void ordenarRespuestas(String[] respuestas) {
		int i, j;
		String aux;
		for(i=0; i<respuestas.length-1; i++) {
			for(j=0 ; j<respuestas.length-1; j++) {
				if(respuestas[j].compareTo(respuestas[j+1]) > 0) {
					aux = respuestas[j];
					respuestas[j] = respuestas[j+1];
					respuestas[j+1] = aux;
				}
			}
		}
		
	}
	
}
