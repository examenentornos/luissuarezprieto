package ExamenTrimestre3;

import java.util.Scanner;

public class ExamenEmpresa {

	public static int Datos(String cod, String nombre, String anti, String plus) {

		if (cod.length() > 3 || cod.length() < 3 || cod.equals("000")) {

			throw new RuntimeException();

		} else {

			int cod2 = Integer.valueOf(cod);
			

			if (nombre.length() > 20 || nombre.length() == 0) {

				throw new RuntimeException();

			} else {

				if (anti.length() > 2 || anti.length() < 2) {

					throw new RuntimeException();

				} else {

					int anti2 = Integer.valueOf(anti);

					if (anti2 < 0) {

						throw new RuntimeException();

					} else {

						if (plus.equalsIgnoreCase("SI")) {

							if (anti2 >= 5) {
								return 1000;
							} else {
								return 300;
							}

						} else if (plus.equalsIgnoreCase("NO")) {

							if (anti2 >= 5) {
								return 500;
							} else {
								return 100;
							}

						}else if (!plus.equalsIgnoreCase("SI") || !plus.equalsIgnoreCase("NO")){
							throw new RuntimeException();
						}

					}

				}

			}

		}
		return -1;

	}

	public static int Separar(String Empresa) {

		if (Empresa.length() > 27) {
			throw new RuntimeException();
		}

		Scanner escaner = new Scanner(Empresa);
		escaner.useDelimiter(";");
		String codigo = escaner.next();
		String nombre = escaner.next();
		String antiguedad = escaner.next();
		String plus = escaner.next();
		
		if (Datos(codigo, nombre, antiguedad, plus) == -1){
			throw new RuntimeException();
		}else{
			return Datos(codigo, nombre, antiguedad, plus);
		}

	}

	public static void main(String[] args) {
		
		
		
	}

}
