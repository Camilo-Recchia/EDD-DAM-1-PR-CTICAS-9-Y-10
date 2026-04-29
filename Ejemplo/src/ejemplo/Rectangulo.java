package ejemplo;

public class Rectangulo {

	private int ancho;
	private int alto;

	public Rectangulo(int ancho, int alto) {
		super();
		this.ancho = ancho;
		this.alto = alto;
	}

	public int area() {
		return alto * ancho;
	}

	public int perimetro() {
		return alto * 2 + ancho * 2;
	}
}
