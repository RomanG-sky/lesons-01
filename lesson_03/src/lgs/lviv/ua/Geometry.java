package lgs.lviv.ua;

public class Geometry {

	public static void main(String[] args) {

		Rectangle R1 = new Rectangle();
		R1.setLenght(5);
		R1.setWight(8);
		System.out.println("����������� ��� ��������� ");
		System.out.println("����� ������������ = " + R1.Area());
		System.out.println("�������� ������������ = " + R1.Perimeter());

		System.out.println();

		Rectangle R2 = new Rectangle();
		System.out.println("����������� � ����������� ");
		System.out.println("����� ������������ = " + R2.Area());
		System.out.println("�������� ������������ = " + R2.Perimeter());

		System.out.println();

		Circle O = new Circle();
		O.setRadius(8);
		O.setDiametr(16);
		System.out.println("���� ��� ��������� ");
		System.out.println("����� ���� = " + O.Cirlce_area());
		O.Circle_lenght();
		System.out.println("������� ���� = " + O.Circle_lenght());

		System.out.println();

		Circle P = new Circle();
		System.out.println("���� �� ����������� ");
		System.out.println("����� ���� = " + P.Cirlce_area());
		P.Circle_lenght();
		System.out.println("������� ���� = " + P.Circle_lenght());

	}

}
