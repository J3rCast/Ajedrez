package logica;

public class Peon extends Pieza{
	public int movimientos = 0;

	public Peon(int posicionX, int posicionY) {
		super(posicionX, posicionY);
	}
	
	
	public void calcularMovimiento(int x, int y) {
		if (x == 2) {
        	this.movimientos = this.movimientos + 2;
        } else if (super.esValida(super.getPosicionX() + 1, y)) {
            this.movimientos = this.movimientos + 1;
        }
        
	}
	
	public void imprimirMov() {
		System.out.println("La cantidad de casillas que la pieza se puede mover es de: " + this.movimientos + "\n");
	}
}
