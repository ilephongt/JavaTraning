import java.util.Scanner;
import java.lang.Math;
public class ToaDo{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap toa do diem A: x1= ");
		float a = scanner.nextFloat();

		System.out.println("x2= ");
		float b = scanner.nextFloat();

		System.out.println("nhap toa do diem B, y1= ");
		float c = scanner.nextFloat();

		System.out.println("y2= ");
		float d = scanner.nextFloat();

		System.out.println("khoang cach 2 diem A va B = "+(Math.sqrt((a-c)*(a-c)+(b-d)*(b-d))));
	}
}
