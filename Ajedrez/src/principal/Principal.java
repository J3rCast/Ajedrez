package principal;
import java.util.Scanner;

import logica.Alfil;
import logica.Caballo;
import logica.Peon;
import logica.Reina;
import logica.Rey;
import logica.Torre;

public class Principal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Indique la ficha\n 1: Peon\n2: Torre\n3: Reina\n4: Rey\n5: Alfil\n6: Caballo\n");
			int pieza = sc.nextInt();
			System.out.println("Indique la posicion en la fila\n");
			int posicionX = sc.nextInt();
			System.out.println("Indique la posicion en la columna\n");
			int posicionY = sc.nextInt();
			
			if (pieza == 1) {
				Peon peon = new Peon(posicionX, posicionY);
				peon.calcularMovimiento(posicionX, posicionY);
				peon.imprimirMov();
			} else if (pieza == 2) {
				Torre torre = new Torre(posicionX, posicionY);
				torre.calcularMovimiento(posicionX, posicionY);
				torre.imprimirMov();
			} else if (pieza == 3) {
				Reina reina = new Reina(posicionX, posicionY);
				reina.calcularMovimiento(posicionX, posicionY);
				reina.imprimirMov();
			} else if (pieza == 4) {
				Rey rey = new Rey(posicionX, posicionY);
			} else if (pieza == 5) {
				Alfil alfil = new Alfil(posicionX, posicionY);
			} else if (pieza == 6) {
				Caballo caballo = new Caballo(posicionX, posicionY);
			}
		}
	}
}