package Study;

// Выполнил Игорь Рогачев, урок 1, Java. Уровень 1

public class Main {

	// метод из задания №3

	static int calculation(int a, int b, int c, int d) {
		return a*(b + (c / d));
	}

	// метод из задания №4

	static boolean checkFrom10_to_20 (int a) {
		return ((a >= 10) & (a <= 20) ? true : false);
	}

	// метод из задания №5

	static String positiveORnegative (int a) {
		return ((a >= 0) ? "Положительное число" : "Отрицательное число");
	}

	// метод из задания №6

	static String negativeTrue (int a) {
		return ((a < 0) ? "true" : "");
	}

	// метод из задания №7

	static String helloName (String helloName) {
		return ("Привет, " + helloName + "!");
	}

	// метод из задания №8

	static String leapYear (int year) {
		return ((year % 4 != 0) | (year % 100 == 0 & year % 400 != 0) ? "Невисокосный год" : "Високосный год");
	}

	// задание №2

    public static void main(String[] args) {
		byte aa = 120;
		short b = 32000;
		int c = 2000000000;
		long d = 400000000000L;
		float e = 77.77F;
		double f = 454.544;
		char g = 1055;
		boolean h = true;
		String i = "Igor";

		System.out.println(calculation(2, 10, 20, 5));		// вывод метода из задания №3
		System.out.println(checkFrom10_to_20(9));					// вывод метода из задания №4
		System.out.println(positiveORnegative(0));					// вывод метода из задания №5
		System.out.println(negativeTrue(-10));						// вывод метода из задания №6
		System.out.println(helloName ("Игорь"));						// вывод метода из задания №7

		System.out.println(leapYear(1600));								// вывод метода из задания №8
		System.out.println(leapYear(1900));								// вывод метода из задания №8
		System.out.println(leapYear(2019));								// вывод метода из задания №8
		System.out.println(leapYear(2020));								// вывод метода из задания №8
    }
}
