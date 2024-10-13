package figurasheroes;

public class Figura {

	private String codigo;
	private double precio;
	private Dimension dimension;
	private SuperHeroe superHeroe;

	public Figura(String codigo, double precio, Dimension dimension, SuperHeroe superHeroe) {

		this.codigo = codigo;
		this.precio = precio;
		this.dimension = dimension;
		this.superHeroe = superHeroe;
	}

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public SuperHeroe getSuperHeroe() {
		return superHeroe;
	}

	public void setSuperHeroe(SuperHeroe superHeroe) {
		this.superHeroe = superHeroe;
	}

	public void subirPrecio(double cantidad) {
		this.precio += cantidad;
	}

	@Override
	public String toString() {
		return "Figura codigo: " + codigo + ", precio: " + precio + ", dimension: " + dimension + ", superHeroe: "
				+ superHeroe;
	}

}
