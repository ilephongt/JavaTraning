import java.util.Scanner;
public class Calculator{
	public static void main(String[] agrs){
		float a,b;
		String c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap a");
		a = scanner.nextFloat();
		System.out.println("nhap b");
		b = scanner.nextFloat();
		System.out.println("nhap phep tinh (+,-,*,/)");
		c = scanner.nextLine();
		
		boolean check = false;
		while(check == false){
			c = scanner.nextLine();
		  switch(c){
			case "+" : 
				System.out.println("tong cua 2 so: "+(a+b) ); 
				check = true;
				break;
			case "-" : 
				System.out.println("hieu cua 2 so: "+(a-b));
				check = true;
				break;
			case "*" : 
				System.out.println("tich cua 2 so: "+(a*b) ); 
				check = true;
				break ;
			case "/" :  if (b!=0) 
						System.out.println("thuong cua 2 so: "+(a/b));
						else System.out.println("khong chia dc");
				check = true;
				break;
			default: System.out.println("nhap phep tinh ko dung, nhap lai");
			break;
							
						}


			}

			
		}
	}
