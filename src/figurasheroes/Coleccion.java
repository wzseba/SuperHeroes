package figurasheroes;

import java.util.ArrayList;

public class Coleccion {

	private String nombreColeccion;
	private ArrayList<Figura> listaFiguras;
	private static final int VALOR_VOLUMEN_COLECCION = 200;

	public Coleccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
		this.listaFiguras = new ArrayList<>();
	}

	public String getNombreColeccion() {
		return nombreColeccion;
	}

	public void setNombreColeccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
	}

	public void addFigura(Figura fig) {
		listaFiguras.add(fig);
	}

	public void subirPrecio(double cantidad, String id) {
		for (Figura figura : listaFiguras) {
			if (figura.getCodigo().equals(id)) {
				figura.subirPrecio(cantidad);
			}
		}
	}

	public void listadoFiguras() {
		for (Figura figura : listaFiguras) {
			figura.toString();
		}
	}

	public ArrayList<Figura> listaConCapa() {
		ArrayList<Figura> listaCapa = new ArrayList<>();

		for (Figura figura : listaFiguras) {
			if (figura.getSuperHeroe().isCapa()) {
				listaCapa.add(figura);
			}
		}

		return listaCapa;
	}

	public Figura masValioso() {

		Figura figuraMasValiosa = listaFiguras.get(0);

		for (Figura figura : listaFiguras) {
			if (figura.getPrecio() > figuraMasValiosa.getPrecio()) {
				figuraMasValiosa = figura;
			}
		}

		return figuraMasValiosa;
	}

	public double getValorColeccion() {
		double valorTotal = 0;

		for (Figura figura : listaFiguras) {
			valorTotal += figura.getPrecio();
		}

		return valorTotal;
	}

	public double getVolumenColeccion() {

		double volumenTotal = 0;

		for (Figura figura : listaFiguras) {
			volumenTotal += figura.getDimension().getVolumen();
		}
		return volumenTotal + VALOR_VOLUMEN_COLECCION;
	}

	@Override
	public String toString() {
		String cadenaFiguras = "";

		for (Figura figura : listaFiguras) {
			cadenaFiguras += figura.toString() + "\n";
		}
		return cadenaFiguras;
	}

}
