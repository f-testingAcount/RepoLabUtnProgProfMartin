/* Este codigo ha sido generado por el modulo psexport 20180125-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "PRACTICA04.java."

import java.io.*;

public class Practica04 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double cant_lts;
		double importe;
		double km;
		double kml;
		double pr;
		System.out.println("Ingrese kil�metros recorridos");
		km = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese precio de combustible por litro");
		pr = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingrese kil�metros recorrido por litro");
		kml = Double.parseDouble(bufEntrada.readLine());
		cant_lts = km/kml;
		importe = cant_lts*pr;
		System.out.println("Cantidad de litros consumidos: "+cant_lts);
		System.out.println("Importe gastado en combustible: $ "+importe);
	}


}

