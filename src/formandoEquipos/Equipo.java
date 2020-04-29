package formandoEquipos;

public class Equipo {
	public int cantPreguntas;
	public int cantidadColaboradores;
	public String maxAfinidad;
	public int resAfinidad;
	public String []respuestas;
	
	
	public int getCantPreguntas() {
		return cantPreguntas;
	}
	public void setCantPreguntas(int cantPreguntas) {
		this.cantPreguntas = cantPreguntas;
	}
	public int getCantidadColaboradores() {
		return cantidadColaboradores;
	}
	public void setCantidadColaboradores(int cantidadColaboradores) {
		this.cantidadColaboradores = cantidadColaboradores;
	}
	public String[] getRespuestas() {
		return respuestas;
	}
	public void setRespuestas(String[] respuestas) {
		this.respuestas = respuestas;
	}
	public String getMaxAfinidad() {
		return maxAfinidad;
	}
	public void setMaxAfinidad(String maxAfinidad) {
		this.maxAfinidad = maxAfinidad;
	}
	public int getResAfinidad() {
		return resAfinidad;
	}
	public void setResAfinidad(int resAfinidad) {
		this.resAfinidad = resAfinidad;
	}
	
	
}
