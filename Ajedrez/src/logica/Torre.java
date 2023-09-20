package logica;

public class Torre extends Pieza{
	private int movimientos = 0;

	public Torre(int x, int y) {
		super(x, y);
	}
	
	public void calcularMovimiento(int posicionX, int posicionY) {
		for (int y = posicionY + 1; y <= 7; y++) {
            this.movimientos++;
        }
		for (int y = posicionY - 1; y >= 0; y--) {
            this.movimientos++;
        }
		for (int x = posicionX - 1; x >= 0; x--) {
            this.movimientos++;
        }
		for (int x = posicionX + 1; x <= 7; x++) {
            this.movimientos++;
        }
	}
	
	public void imprimirMov() {
		System.out.println("La cantidad de casillas que la pieza se puede mover es de: " + this.movimientos + "\n");
	}
}
