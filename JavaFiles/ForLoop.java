package assignmentJava;

public class ForLoop {
	// prints 1-25
	void print25() {
		for (int i = 1; i <= 25; i++) {
			System.out.println(i);
		}
	}

	// prints 25 -1
	void print25to1() {
		for (int i = 25; i >= 1; i--) {
			System.out.println(i);
		}
	}

	// prints 1- 100 odd nos
	void printOdd() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

	// print 1-100 even nos
	void printEven() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	// print 1-50 odd nos
	void printOddTill50() {
		for (int i = 1; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

	// print 1-50 even nos
	void printEvenTill50() {
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	// print -45 to +45 nos
	void printRandom90() {
		for (int i = -45; i <= 45; i++) {
			System.out.println(i);
		}
	}

	// print 50 to 100 nos
	void printFrom50() {
		for (int i = 50; i <= 100; i++) {
			System.out.println(i);
		}
	}

	// print sum of odd and even no
	void printSum() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println((i + (i + 1)));
			} else {
				System.out.println(i + (i + 1));
			}
		}
	}

	// print odd and even nos is in the up
	// print 1- 100
	void print100() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}

	// prints 100 -1
	void printRev100() {
		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
		}
	}

	// print 30-50
	void print30To50() {
		for (int i = 30; i <= 50; i++) {
			System.out.println(i);
		}
	}

	// prints the count of even num from 1-25
	void printCountOfEven() {
		int count = 0;
		for (int i = 1; i <= 25; i++) {
			if (i % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

	// prints the count of odd num from 1-25
	void printCountOfOdd() {
		int count = 0;
		for (int i = 1; i <= 25; i++) {
			if (i % 2 != 0) {
				count++;
			}
		}
		System.out.println(count);
	}

	// Generate the Series... 2 4 6 8 10 12 14 16 18 20
	void generateSeries1() {
		for (int i = 2; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	// Generate the Series... 9 18 27 36 45 54 63 72 81 90
	void generateSeries2() {
		for (int i = 1; i <= 90; i++) {
			if (i % 9 == 0) {
				System.out.println(i);
			}
		}
	}

	// Generate the Series... 1 -2 3 -4 5 -6 7 -8 9 -10
	void generateSeries3() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(-i);
			} else {
				System.out.println(i);
			}
		}
	}

	// Generate the Series... 5 10 15 20 25 30 35 40 45 50
	void generateSeries4() {
		for (int i = 5; i <= 50; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
	}

	// Generate the Series... 1 10 100 1000
	void generateSeries5() {
		for (int i = 1; i <= 4; i++) {
			int num = (int) Math.pow(10, i);
			System.out.println(num);
		}
	}

	// Generate the Series... 1 3 6 10 15 21 28 36 45.
	void generateSeries6() {
		int num1 = 1, num2 = 1;
		for (int i = 1; i <= 9; i++) {
			System.out.println(num2);
			num1++;
			num2 += num1;
		}
	}

	// Generate the Series... 8 16 24 32 40 48 56 64 72 80
	void generateSeries7() {
		for (int i = 1; i <= 80; i++) {
			if (i % 8 == 0) {
				System.out.println(i);
			}
		}
	}

	// Generate the Series... 0 1 1 2 3 5 8 13 21.
	void generateFib() {
		int num1 = 0, num2 = 1;
		System.out.println(num1);
		System.out.println(num2);
		for (int i = 0; i <= 10; i++) {
			int num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}
	}

	// Generate the series... 1 4 9 16 25 36 49 64 81 100.
	void generateSeries8() {
		for (int i = 1; i <= 10; i++) {
			int num = (int) Math.pow(i, 2);
			System.out.println(num);
		}
	}

	// Generate the series... 3 6 9 12 15 18 21 24 27 30.
	void generateSeries9() {
		for (int i = 3; i <= 30; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

	// Generate the Series... 7 14 21 28 35 42 49 56 63 70.
	void generateSeries10() {
		for (int i = 7; i <= 70; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
	}

	// Generate the Series... 4 8 12 16 20 24 28 32 36 40.
	void generateSeries11() {
		for (int i = 4; i <= 40; i++) {
			if (i % 4 == 0) {
				System.out.println(i);
			}
		}
	}

	// Generate the Series... 10 20 30 40 50 60 70 80 90 100
	void generateSeries12() {
		for (int i = 10; i <= 100; i++) {
			if (i % 10 == 0) {
				System.out.println(i);
			}
		}
	}

	// Generate the Series... 1 2 3 4 5 4 3 2 1
	void generateSeries13() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			if (i == 5) {
				for (int j = 4; j >= 1; j--) {
					System.out.println(j);
				}
			}
		}
	}

	// Generate the Series... 6 12 18 24 30 36 42 48 54 60
	void generateSeries14() {
		for (int i = 6; i <= 60; i++) {
			if (i % 6 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String args[]) {
		ForLoop fr = new ForLoop();
		fr.generateSeries13();
	}
}
