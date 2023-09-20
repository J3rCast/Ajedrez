package logica;

public class Rey extends Pieza{
	private int movimientos = 0;
	
	public void calcularMovimiento(int fila, int columna) {
		fila--;
		columna--;
		if (fila > 0 && columna > 0) {
		    this.movimientos++;
		}

		if (fila > 0) {
		    this.movimientos++;
		}

		if (fila > 0 && columna < 7) {
		    this.movimientos++;
		}

		if (columna > 0) {
		    this.movimientos++;
		}

		if (columna < 7) {
		    this.movimientos++;
		}

		if (fila < 7 && columna > 0) {
		    this.movimientos++;
		}

		if (fila < 7) {
		    this.movimientos++;
		}

		if (fila < 7 && columna < 7) {
		    this.movimientos++;
		}
	}
	
	public void imprimirMov() {
		System.out.println("La cantidad de casillas que la pieza se puede mover es de: " + this.movimientos + "\n");
	}
	
	public Rey(int x, int y) {
		super(x, y);
	}
}
