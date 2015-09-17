import java.util.Scanner;
public class PrimeNumber{
	public static boolean checkPrimeNumber(int a){
		if ((a == 1)||(a == 0)){
			return false;
		}	
		else{

				for (int i = 2; i<a; i++){
			//	if(a==2) continue;
				if(a%i == 0){
				return false;

				}

		}
	}

		return true;

	}


public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("nhap so nguyen a:");
	int a = scanner.nextInt();
	PrimeNumber check = new PrimeNumber();
	if (check.checkPrimeNumber(a) == true){

		System.out.println(a+" la so nguyen to!");
	}
	else System.out.println(a+" khong phai la so nguyen to!");
}
}
