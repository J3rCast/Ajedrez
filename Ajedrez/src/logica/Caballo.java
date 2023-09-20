package logica;

public class Caballo extends Pieza{
	private int contador = 0;
	
	public int calcularMovimiento(int fila, int col) {
        int[][] movimientos = {{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2},
                         {1, -2}, {1, 2}, {2, -1}, {2, 1}};

        for (int[] movimiento : movimientos) {
            int nuevaFila = fila + movimientos[0];
            int nuevaCol = col + movimientos[1];

            if (nuevaFila >= 0 && nuevaFila < 8 && nuevaCol >= 0 && nuevaCol < 8) {
                this.contador++;
            }
        }

        return count;q
    }
	
	public void imprimirMov() {
		System.out.println("La cantidad de casillas que la pieza se puede mover es de: " + this.movimientos + "\n");
	}

	public Caballo(int x, int y) {
		super(x, y);
	}
}
