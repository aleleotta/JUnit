package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {
	int num1, num2;
	
	@Test
	void testCalculadora() {
		fail("Not yet implemented");
	}

	@Test
	void testCalculadoraIntInt() {
		fail("Not yet implemented");
	}

	@Test
	void testSuma() {
		Calculadora calc1 = new Calculadora(56, 5);
		int resultado = calc1.suma();
		assertEquals(61, resultado);
	}

	@Test
	void testResta() {
		Calculadora calc1 = new Calculadora(60, 15);
		int resultado = calc1.resta();
		assertEquals(45, resultado);
	}

	@Test
	void testMultiplica() {
		Calculadora calc1 = new Calculadora(0, 5);
		int resultado = calc1.multiplica();
		assertEquals(0, resultado);
	}

	@Test
	void testDivide() {
		Calculadora calc1 = new Calculadora(6, 2);
		int resultado = calc1.divide();
		assertEquals(3, resultado);
	}

}
