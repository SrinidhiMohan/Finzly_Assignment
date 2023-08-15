package assignmentJava;

public class DoWhile {
		// prints 1-25
		void print25() {
			int i=1;
			 do {
				System.out.println(i);
				i++;
			}while(i<=25);
		}
		// prints 25 -1
		void print25to1() {
			int i=25;
			 do{
				System.out.println(i);	
				i--;
				}while(i>=1);
		}
		//prints 1- 100 odd nos
		void printOdd() {
			int i=1;
			 do {
				if(i%2 !=0) {
					System.out.println(i);
				}
				i++;
			}while(i<=100);
		}
		// print 1-100 even nos
		void printEven() {
			int i=1;
			do {
				if(i%2 ==0) {
					System.out.println(i);
				}
				i++;
			}while(i<=100);
		}
		//print 1-50 odd nos
		void printOddTill50() {
			int i=1;
			do{
				if(i%2 !=0) {
					System.out.println(i);
				}
				i++;
			}while(i<=50);
		}
		// print 1-50 even nos
		void printEvenTill50() {
				int i=1;
				do{
					if(i%2 ==0) {
						System.out.println(i);
					}
					i++;
				}while(i<=50);
		}
		//print -45 to +45 nos
		void printRandom90() {
			int i =-45;
			do{
				System.out.println(i);
				i++;
			}while(i<=45);
		}
		// print 50 to 100 nos
		void printFrom50() {
			int i =50;
			 do{
				System.out.println(i);
				i++;
			}while(i<=100);
		}
		// print sum of odd and even no
		void printSum() {
			int i=1;
			do {
				if(i%2 != 0) {
					System.out.println((i + (i+1)));
				}else {
					System.out.println(i+(i+1));
				}
				i++;
			}while(i<=50);
		}
		// print odd and even nos is in the up
		// print 1- 100
		void print100() {
			int i =1;
			do{
				System.out.println(i);
				i++;
			}while(i<=100) ;
		}
		// prints 100 -1 
		void printRev100() {
			int i=100;
			do{
				System.out.println(i);
				i--;
			}while(i>=1);
		}
		// print 30-50
		void print30To50() {
			int i=30;
			do{
				System.out.println(i);
				i++;
			}while(i<=50);
		}
		// prints the count of even num from 1-25
		void printCountOfEven() {
			int count = 0;
			int i =1;
			do{
				if(i%2==0) {
					count++;
				}
				i++;
			}while(i<=25);
			System.out.println(count);
		}
		// prints the count of odd num from 1-25
		void printCountOfOdd() {
			int count = 0;
			int i =1;
			do {
				if(i%2!=0) {
					count++;
				}
				i++;
			}while(i<=25);
			System.out.println(count);
		}
		//Generate the Series... 2 4 6 8 10 12 14 16 18 20
		void generateSeries1() {
			int i=2;
			do{
				if(i%2 == 0) {
					System.out.println(i);
				}
				i++;
			}while(i<=20) ;
		}
		// Generate the Series... 9 18 27 36 45 54 63 72 81 90
		void generateSeries2() {
			int i=9;
			do{
				if(i%9==0) {
					System.out.println(i);
				}
				i++;
			}while(i<=90);
		}
		
		//Generate the Series... 1 -2 3 -4 5 -6 7 -8 9 -10
		void generateSeries3() {
			int i =1;
			do{
				if(i%2==0) {
					System.out.println(-i);
				}else {
					System.out.println(i);
				}
				i++;
			}while(i<=10);
		}
		//Generate the Series... 5 10 15 20 25 30 35 40 45 50
		void generateSeries4() {
			int i=5;
			do{
				if(i%5==0) {
					System.out.println(i);
				}
				i++;
			}while(i<=50);
		}
		//Generate the Series... 1 10 100 1000
		void generateSeries5() {
			int i=1;
		 do{
			int num = (int) Math.pow(10,i);
			System.out.println(num);
			i++;
		}while(i<=4);
		}
		// Generate the Series... 1  3  6  10  15  21  28  36  45.
		void generateSeries6() {
			int num1=1, num2=1;
			int i =1;
			do{
				System.out.println(num2);
				num1++;
				num2+=num1; 
				i++;
			}while(i<=9);
		}
		// Generate the Series... 8 16 24 32 40 48 56 64 72 80
		void generateSeries7() {
			int i =8;
			do{
				if(i%8==0) {
				System.out.println(i);
				}
				i++;
			}while(i<=80) ;
		}
		//Generate the Series... 0 1 1 2 3 5 8 13 21.
		void generateFib() {
			int num1=0,num2=1;
			System.out.println(num1);
			System.out.println(num2);
			int i =1;
			while(i<=10) {
				int num3 = num1+num2;
				System.out.println(num3);
				num1=num2;
				num2=num3;
				i++;
			}
		}
		//Generate the series... 1 4 9 16 25 36 49 64 81 100.
		void generateSeries8() {
			int i =1;
			do {
				int num = (int) Math.pow(i, 2);
				System.out.println(num);
				i++;
			}while(i<=10);
		}
		//Generate the series... 3 6 9 12 15 18 21 24 27 30.
		void generateSeries9() {
			int i =3;
			do {
				if(i%3==0) {
					System.out.println(i);
				}
				i++;
			}while(i<=30);
		}
		//Generate the Series... 7 14 21 28 35 42 49 56 63 70. 
		void generateSeries10() {
			int i = 7;
			 do{
				if(i%7==0) {
					System.out.println(i);
				}
				i++;
			}while(i<=70);
		}
		// Generate the Series... 4 8 12 16 20 24 28 32 36 40.
		void generateSeries11() {
			int i =4;
			do{
				if(i%4==0) {
					System.out.println(i);
				}
				i++;
			}while(i<=40);
		}
		//Generate the Series... 10 20 30 40 50 60 70 80 90 100
		void generateSeries12() {
			int i =1;
			 do{
			System.out.println(i*10);
			i++;
			}while(i<=10);
		}
		//Generate the Series... 1 2 3 4 5 4 3 2 1
		void generateSeries13() {
			int i =1;
			do{
				System.out.println(i);
				if(i==5) {
					int j =4;
				do{
					System.out.println(j);
					j--;
				}while(j>=1);
				}
				i++;
			}while(i<=5) ;
		}
		// Generate the Series... 6 12 18 24 30 36 42 48 54 60
		void generateSeries14() {
			int i =1;
			 do{
				System.out.println(i*6);
				i++;
			}while(i<=10);
		}
		public static void main(String args[]) {
			DoWhile dw = new DoWhile();
			dw.generateSeries14();
	}
	}


