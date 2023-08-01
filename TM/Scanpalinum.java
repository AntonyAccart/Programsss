package TM;

import java.util.Scanner;

public class Scanpalinum {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the input");
		int nextInt = scan.nextInt();

		int originalnumber = nextInt;
		int sum = 0;

		while (nextInt > 0) {
			int remainder = nextInt % 10;
			sum = sum * 10 + remainder;
			nextInt = nextInt / 10;
			System.out.println(sum);
		}
		if (sum == originalnumber) {
			System.out.println("yes");
		} else {
			System.out.println("no");

		}

	}
}
