package lgs.lviv.ua;
import java.util.Random;

public class hw_01 {

	public static void main(String[] args) {
		
		boolean a = true;
		byte b = -100;
		char c = 'c';
		double d = 3.14;
		float e = 8.88f;
		int f = -1_147_483648;
		long g = -12_322_036_854_775808L;
		short h = -22768;
		
		System.out.println("\t \t \t \t\t\t\t\t\t min. �������� \t\t  max ��������");
		System.out.println("����a � ���� boolean = " + a + " \t\t\t                         " + Boolean.FALSE
				+ "                    " + Boolean.TRUE);
		System.out.println("����a b ���� byte = " + b + " \t\t\t                         " + Byte.MIN_VALUE
				+ "                     " + Byte.MAX_VALUE);
		System.out.println("����a c ���� char = " + c + " \t\t\t                                 " + c
				+ "                        " + c);
		System.out.println("����a d ���� double = " + d + " \t\t\t                         " + Double.MIN_VALUE
				+ "                 " + Double.MAX_VALUE);
		System.out.println("����a e ���� float = " + e + " \t\t\t                         " + Float.MIN_VALUE
				+ "                  " + Float.MAX_VALUE);
		System.out.println("����a f ���� int = " + f + " \t\t\t                 " + Integer.MIN_VALUE
				+ "              " + Integer.MAX_VALUE);
		System.out
				.println("����a g ���� long = " + g + " \t\t\t         " + Long.MIN_VALUE + "     " + Long.MAX_VALUE);
		System.out.println("����a h ���� short = " + h + " \t\t\t                         " + Short.MIN_VALUE
				+ "                   " + Short.MAX_VALUE);
		System.out.println();
		int[] array = new int[10];
		Random rnd = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt();
			System.out.println("array[" + i + "]=" + array[i]);
		}
		int min = array[0];
		int max = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min)
				min = array[i];
		}
		for (int i = 1; i < array.length; i++) {
			if (max < array[i])
				max = array[i];
		}
		System.out.println();
		System.out.println("̳������� �������� ������ " + min);
		System.out.println("����������� �������� ������ " + max);
	}

}
