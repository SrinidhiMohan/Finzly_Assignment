package assignmentJava;

public class WhileLoop {
	// prints 1-25
	void print25() {
		int i = 1;
		while (i <= 25) {
			System.out.println(i);
			i++;
		}
	}

	// prints 25 -1
	void print25to1() {
		int i = 25;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
	}

	// prints 1- 100 odd nos
	void printOdd() {
		int i = 1;
		while (i <= 100) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	// print 1-100 even nos
	void printEven() {
		int i = 1;
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	// print 1-50 odd nos
	void printOddTill50() {
		int i = 1;
		while (i <= 50) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	// print 1-50 even nos
	void printEvenTill50() {
		int i = 1;
		while (i <= 50) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	// print -45 to +45 nos
	void printRandom90() {
		int i = -45;
		while (i <= 45) {
			System.out.println(i);
			i++;
		}
	}

	// print 50 to 100 nos
	void printFrom50() {
		int i = 50;
		while (i <= 100) {
			System.out.println(i);
			i++;
		}
	}

	// print sum of odd and even no
	void printSum() {
		int i = 1;
		while (i <= 50) {
			if (i % 2 != 0) {
				System.out.println((i + (i + 1)));
			} else {
				System.out.println(i + (i + 1));
			}
			i++;
		}
	}

	// print odd and even nos is in the up
	// print 1- 100
	void print100() {
		int i = 1;
		while (i <= 100) {
			System.out.println(i);
			i++;
		}
	}

	// prints 100 -1
	void printRev100() {
		int i = 100;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
	}

	// print 30-50
	void print30To50() {
		int i = 30;
		while (i <= 50) {
			System.out.println(i);
			i++;
		}
	}

	// prints the count of even num from 1-25
	void printCountOfEven() {
		int count = 0;
		int i = 1;
		while (i <= 25) {
			if (i % 2 == 0) {
				count++;
			}
			i++;
		}
		System.out.println(count);
	}

	// prints the count of odd num from 1-25
	void printCountOfOdd() {
		int count = 0;
		int i = 1;
		while (i <= 25) {
			if (i % 2 != 0) {
				count++;
			}
			i++;
		}
		System.out.println(count);
	}

	// Generate the Series... 2 4 6 8 10 12 14 16 18 20
	void generateSeries1() {
		int i = 2;
		while (i <= 20) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	// Generate the Series... 9 18 27 36 45 54 63 72 81 90
	void generateSeries2() {
		int i = 9;
		while (i <= 90) {
			if (i % 9 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	// Generate the Series... 1 -2 3 -4 5 -6 7 -8 9 -10
	void generateSeries3() {
		int i = 1;
		while (i <= 10) {
			if (i % 2 == 0) {
				System.out.println(-i);
			} else {
				System.out.println(i);
			}
			i++;
		}
	}

	// Generate the Series... 5 10 15 20 25 30 35 40 45 50
	void generateSeries4() {
		int i = 5;
		while (i <= 50) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	// Generate the Series... 1 10 100 1000
	void generateSeries5() {
		int i = 1;
		while (i <= 4) {
			int num = (int) Math.pow(10, i);
			System.out.println(num);
			i++;
		}
	}

	// Generate the Series... 1 3 6 10 15 21 28 36 45.
	void generateSeries6() {
		int num1 = 1, num2 = 1;
		int i = 1;
		while (i <= 9) {
			System.out.println(num2);
			num1++;
			num2 += num1;
			i++;
		}
	}

	// Generate the Series... 8 16 24 32 40 48 56 64 72 80
	void generateSeries7() {
		int i = 8;
		while (i <= 80) {
			if (i % 8 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	// Generate the Series... 0 1 1 2 3 5 8 13 21.
	void generateFib() {
		int num1 = 0, num2 = 1;
		System.out.println(num1);
		System.out.println(num2);
		int i = 1;
		while (i <= 10) {
			int num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
			i++;
		}
	}

	// Generate the series... 1 4 9 16 25 36 49 64 81 100.
	void generateSeries8() {
		int i = 1;
		while (i <= 10) {
			int num = (int) Math.pow(i, 2);
			System.out.println(num);
			i++;
		}
	}

	// Generate the series... 3 6 9 12 15 18 21 24 27 30.
	void generateSeries9() {
		int i = 3;
		while (i <= 30) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	// Generate the Series... 7 14 21 28 35 42 49 56 63 70.
	void generateSeries10() {
		int i = 7;
		while (i <= 70) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	// Generate the Series... 4 8 12 16 20 24 28 32 36 40.
	void generateSeries11() {
		int i = 4;
		while (i <= 40) {
			if (i % 4 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	// Generate the Series... 10 20 30 40 50 60 70 80 90 100
	void generateSeries12() {
		int i = 1;
		while (i <= 10) {
			System.out.println(i * 10);
			i++;
		}
	}

	// Generate the Series... 1 2 3 4 5 4 3 2 1
	void generateSeries13() {
		int i = 1;
		while (i <= 5) {
			System.out.println(i);
			if (i == 5) {
				int j = 4;
				while (j >= 1) {
					System.out.println(j);
					j--;
				}
			}
			i++;
		}
	}

	// Generate the Series... 6 12 18 24 30 36 42 48 54 60
	void generateSeries14() {
		int i = 1;
		while (i <= 10) {
			System.out.println(i * 6);
			i++;
		}
	}

	public static void main(String args[]) {
		WhileLoop wh = new WhileLoop();
		wh.generateSeries14();
	}
}
