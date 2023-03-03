package funciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import validator.validarTabla;

public class leerArchivo {
	public static void Archivo() {
		
		String[] salida;

		try {
			FileReader f = new FileReader("tablatokens.txt");
			BufferedReader br = new BufferedReader(f);

			while (br.ready()) {
				String entrada = br.readLine();
				String[] partesEntrada = entrada.split(",");
				
				if(partesEntrada[2].equals("-2")) {
					
				}
				
				crearTabla.tabla();
				
				validarTabla.validar();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado " + e);
		} catch (IOException e) {
			System.out.println("Excepcion" + e);
		}
	}

}
