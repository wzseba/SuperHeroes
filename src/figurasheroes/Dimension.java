package figurasheroes;

public class Dimension {

	private double alto;
	private double ancho;
	private double profundidad;

	public Dimension() {
		this.alto = 0;
		this.ancho = 0;
		this.profundidad = 0;
	}

	public Dimension(double alto, double ancho, double profundidad) {
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
	}

	public double getAlto() {
		return alto;
	}

	public double getAncho() {
		return ancho;
	}

	public double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(double profundidad) {
		this.profundidad = profundidad;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getVolumen() {
		return getAlto() * getAncho() * getProfundidad();
	}

	@Override
	public String toString() {
		return "Dimension alto: " + alto + ", ancho: " + ancho + ", profundidad: " + profundidad + ", volumen: "
				+ getVolumen();
	}

}
