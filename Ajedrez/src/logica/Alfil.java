package logica;

public class Alfil extends Pieza {
	private int movimientos = 0;
	
	public void calcularMovimientos(int fila, int columna) {
        int nuevaFila = fila - 1;
        int nuevaColumna = columna - 1;
        while (nuevaFila >= 0 && nuevaColumna >= 0) {
            this.movimientos++;
            nuevaFila--;
            nuevaColumna--;
        }

        nuevaFila = fila - 1;
        nuevaColumna = columna + 1;
        while (nuevaFila >= 0 && nuevaColumna < 8) {
            this.movimientos++;
            nuevaFila--;
            nuevaColumna++;
        }

        nuevaFila = fila + 1;
        nuevaColumna = columna - 1;
        while (nuevaFila < 8 && nuevaColumna >= 0) {
            this.movimientos++;
            nuevaFila++;
            nuevaColumna--;
        }

        nuevaFila = fila + 1;
        nuevaColumna = columna + 1;
        while (nuevaFila < 8 && nuevaColumna < 8) {
            this.movimientos++;
            nuevaFila++;
            nuevaColumna++;
        }
    }
	
	public void imprimirMov() {
		System.out.println("La cantidad de casillas que la pieza se puede mover es de: " + this.movimientos + "\n");
	}
	
	public Alfil(int x, int y) {
		super(x, y);
	}
}
