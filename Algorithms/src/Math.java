import java.util.Arrays;
import java.util.Random;

public class Math {

	private int a = 5;
	private int b = 7;
	private int c = 4;
	private int d = 13;
	private int e = 17;
	private int f = 10;
	private int g = 15;
	private Random r;
	// private int[] pole;

	public Math() {
		System.out.println("Hello World!");
		init();
	}

	private void init() {
		// System.out.println("Hello World!");
		System.out.println(secti(a, c));
		System.out.println(odecti(c, a));
		System.out.println(odecti(a, c));
		System.out.println(zbytekPoDeleni(d, b));
		System.out.println(Arrays.toString(poleNahodnychCisel(5)));
		System.out.println(faktorialRekurze(c));
		System.out.println(faktorial(c));
	}

	public int secti(int a, int b) {
		int c;
		c = a + b;
		return c;
	}

	public int odecti(int a, int b) {
		int c;
		c = a - b;
		return c;
	}

	public int vynasob(int a, int b) {
		int c;
		c = a * b;
		return c;
	}

	public int vydel(int a, int b) {
		int c;
		c = a / b;
		return c;
	}

	public int zbytekPoDeleni(int a, int b) {
		int c;
		c = a % b;
		return c;
	}

	/**
	 * @param a
	 *            pocet cisel v poli
	 * @return pole nahodnych cisel
	 */
	public int[] poleNahodnychCisel(int a) {
		if (a <= 0) {
			throw new IndexOutOfBoundsException("Index " + a + " is out of bounds!");
		}
		r = new Random();
		int[] pole = new int[a];
		for (int i = 0; i < pole.length; i++) {
			pole[i] = r.nextInt(); // uklada nahodny prvek v poli
			// System.out.println(pole[i]); // vypise kazdy prvek v poli
		}
		return pole;
	}

	public long faktorialRekurze(int n) {
		if (n < 0)
			throw new ArithmeticException("n < 0");
		if (n == 0) {
			return n = 1;
		} else {
			return n * faktorialRekurze(n - 1);
		}
	}

	public long faktorial(int n) {
		if (n < 0) {
			throw new ArithmeticException("n < 0");
		}
		long faktorial = 1;
		for (int i = 1; i <= n; ++i) {
			faktorial *= i;
		}
		return faktorial;

	}
}
