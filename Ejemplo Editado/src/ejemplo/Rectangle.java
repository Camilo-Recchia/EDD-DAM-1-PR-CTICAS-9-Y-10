package ejemplo;

public class Rectangle {

	private static final int _2 = 2;
	private int ancho;
	private int alto;

	public Rectangle(int ancho, int alto) {
		super();
		this.ancho = ancho;
		this.alto = alto;
	}

	public int superface() {
		comprobar(ancho, alto);
		return alto * ancho;
	}

	public int perimeter() {
		comprobar(ancho, alto);
		return alto * _2 + ancho * _2;
	}

	private void comprobar(int ancho, int alto) throws IllegalArgumentException {
		if (ancho < 0 || ancho == 0) {
			throw new IllegalArgumentException("El ancho debe ser positivo");
		} else if (alto < 0 || alto == 0) {
			throw new IllegalArgumentException("El alto debe ser positivo");
		}
	}

}
