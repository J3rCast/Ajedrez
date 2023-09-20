package logica;

public class Pieza {
	private int posicionX;
	private int posicionY;

	public int getPosicionX() {
		return posicionX;
	}
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}
	public int getPosicionY() {
		return posicionY;
	}
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}
	public Pieza(int x, int y) {
		this.posicionX = x;
		this.posicionY = y;
	}
	
	public static boolean esValida(int x, int y) {
        return x >= 1 && x <= 8 && y >= 1 && y <= 8;
    }
}
