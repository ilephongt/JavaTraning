import java.util.Scanner;
public class CalculatorUpdate{

	float a,b,ketqua;

	public float add(float a,float b){
		ketqua=a+b;
		System.out.println("tong 2 so = "+ketqua);
		return ketqua;
	}
	public float minus(float a,float b){
		ketqua=a-b;
		System.out.println("hieu 2 so = "+ketqua);
		return ketqua;
	}

	public float div(float a,float b){
		System.out.println("thuong 2 so = "+ketqua);
		ketqua=a/b;
		return ketqua;
		
	}

	public float multiple(float a,float b){
		ketqua=a*b;
		System.out.println("tich 2 so = "+ketqua);
		return ketqua;

	}

	public static void main(String[] args) {
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		CalculatorUpdate cu = new CalculatorUpdate();
		System.out.println("nhap a ");
		float a = sc.nextFloat();
		System.out.println("nhap b ");
		float b = sc.nextFloat();

		System.out.println("nhap phep tinh: (+,-,*,/)");
		String c = sc.nextLine();

		while(flag == false){
			System.out.println("nhap lai phep tinh: (+,-,*,/)");
			c = sc.nextLine();
			switch(c){

				case "+": cu.add(a,b);
				flag = true;
				break;

				case "-": cu.minus(a,b);
				flag = true;
				break;

				case "/": if (b!=0){
					cu.div(a,b);
				}
						  else System.out.println("b = 0 nen khong the chia duoc!");

				flag = true;
				break;

				case "*": cu.multiple(a,b);
				flag = true;
				break;

				default: System.out.println("ban nhap sai phep tinh roi!");
				break;
			}


		}
	}
	

}
