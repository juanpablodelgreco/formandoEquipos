package formandoEquipos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LeerEscribir {

	public static void Leer(String path, Equipo e) {
		try {
			Scanner sc = new Scanner(new File(path));
			String[] respuestas;
			e.setCantPreguntas(sc.nextInt());
			e.setCantidadColaboradores(sc.nextInt());
			respuestas = new String[e.getCantidadColaboradores()];
			for (int i = 0; i < e.getCantidadColaboradores(); i++) {
				respuestas[i] = sc.next();
			}
			e.setRespuestas(respuestas);
		} catch (FileNotFoundException e1) {
			System.out.println("No se pudo abrir el archivo " + path);
		}

	}

	public static void Escribir(String outputPath, Equipo e) {
		try {
			PrintWriter pw = new PrintWriter(new File(outputPath));
			pw.println(e.getResAfinidad());
			pw.println(e.getMaxAfinidad());
			pw.close();
			System.out.println("Se creo con exito el archivo "+outputPath+"!");
		} catch (FileNotFoundException e1) {
			System.out.println("No se pudo crear el archivo "+outputPath);
		}
		
		
	}
}
