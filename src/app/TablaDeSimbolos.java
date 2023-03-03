package app;

import funciones.ImprimirTabla;
import funciones.leerArchivo;


public class TablaDeSimbolos {

	public static void main(String[] args) {
		leerArchivo.Archivo();
		
		ImprimirTabla.imprimir();
	}

}
