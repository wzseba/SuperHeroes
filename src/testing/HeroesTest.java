package testing;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import figurasheroes.Coleccion;
import figurasheroes.Dimension;
import figurasheroes.Figura;
import figurasheroes.SuperHeroe;

class HeroesTest {

	private Coleccion coleccion = new Coleccion("Marvel");

	@BeforeEach
	void setUp() {

		coleccion.addFigura(new Figura("lolo123", 200, new Dimension(2, 4, 2), new SuperHeroe("Hulk")));
		coleccion.addFigura(new Figura("pepe202", 400, new Dimension(6, 3, 6), new SuperHeroe("Roca")));
		coleccion.addFigura(new Figura("kiko400", 600, new Dimension(8, 6, 4), new SuperHeroe("Pepito")));
	}

	@Test
	void testHeroeSinCapa() {
		SuperHeroe superMan = new SuperHeroe("super man");

		assertFalse(superMan.isCapa());
	}

	@Test
	void testDimensionSinParametros() {
		Dimension dime = new Dimension();

		assertEquals(0, dime.getAlto());
	}

	@Test
	void testDimensionConParametros() {
		Dimension dime = new Dimension(4.2, 2, 3.1);

		assertEquals(26.04, dime.getVolumen());
	}

	@Test
	void testCrearFigura() {
		Figura fig = new Figura("1582lol", 205.59, new Dimension(4, 8, 2), new SuperHeroe("batman"));

		assertNotNull(fig);
	}

	@Test
	void testSubirPrecioFigura() {
		Figura fig = new Figura("1582lol", 200, new Dimension(4, 8, 2), new SuperHeroe("batman"));
		fig.subirPrecio(100);

		assertEquals(300, fig.getPrecio());
	}

	@Test
	void testValorTotalColeccion() {
		assertEquals(1200, coleccion.getValorColeccion());
	}

	@Test
	void testVolumenColeccion() {
		assertEquals(516, coleccion.getVolumenColeccion());
	}

	@Test
	void testMasValiso() {
		assertEquals(600, coleccion.masValioso().getPrecio());
	}

	@Test
	void testConCapa() {
		SuperHeroe superman = new SuperHeroe("superman");
		superman.setCapa(true);
		SuperHeroe batman = new SuperHeroe("batman");
		batman.setCapa(true);
		SuperHeroe pepito = new SuperHeroe("pepito");

		Figura f1 = new Figura("sup556", 50, new Dimension(4, 2, 1), superman);
		Figura f2 = new Figura("bat458", 50, new Dimension(4, 2, 1), batman);
		Figura f3 = new Figura("pep638", 40, new Dimension(4, 2, 1), pepito);

		coleccion.addFigura(f1);
		coleccion.addFigura(f2);
		coleccion.addFigura(f3);

		assertEquals(2, coleccion.listaConCapa().size());

	}
}
