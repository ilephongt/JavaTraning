import java.util.Scanner;
public class City{
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("thanh pho ban dang song");
		String a = scanner.nextLine();
		int b = 0;
		while(!a.equals("Da Nang")){
			if(b == 2){
				System.out.println("Dap an: Da Nang");
				return;
			}
				System.out.println("nhap lai");
				a = scanner.nextLine();
				b++;
			
		}
		System.out.println("dung roi");


	}
}
