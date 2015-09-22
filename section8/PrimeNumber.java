import java.util.Scanner;
public class PrimeNumber{
	public static boolean checkPrimeNumber(int a){
		
 
    if((a==0)||(a==1)) return false;
    for(int i=2;i<a;i++) {
        if(a%i==0)
            return false;
    }
    return true;
}
	

	


public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	PrimeNumber check = new PrimeNumber();
	System.out.println("nhap so nguyen a:");
	int a = scanner.nextInt();
	
	if (check.checkPrimeNumber(a)&&(a>0)){

		System.out.println(a+" la so nguyen to!");
	}
	else System.out.println(a+" khong phai la so nguyen to!");

}
}
