package logica;

public class Reina extends Pieza{
	private int movimientos = 0;

	public Reina(int x, int y) {
		super(x, y);
	}
	
	public void calcularMovimiento(int posicionX, int posicionY) {
		posicionX--;
		posicionY--;
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

		int x = posicionX - 1;
        int y = posicionY + 1;
        while (x >= 0 && y <= 7) {
            this.movimientos++;
            x--;
            y++;
        }

        x = posicionX + 1;
        y = posicionY + 1;
        while (x <= 7 && y <= 7) {
            this.movimientos++;
            x++;
            y++;
        }

        x = posicionX - 1;
        y = posicionY - 1;
        while (x >= 0 && y >= 0) {
            this.movimientos++;
            x--;
            y--;
        }

        x = posicionX + 1;
        y = posicionY - 1;
        while (x <= 7 && y >= 0) {
            this.movimientos++;
            x++;
            y--;
        }
	}
	
	public void imprimirMov() {
		System.out.println("La cantidad de casillas que la pieza se puede mover es de: " + this.movimientos + "\n");
	}
}
