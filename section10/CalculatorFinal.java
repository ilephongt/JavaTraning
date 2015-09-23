/*- Co 2 instance variable la  numberOne, numberTwo (float). Default gia tri la 0
- Co 2 construction:  CalculatorFinal() va CalculatorFinal(numberOne, numberTwo)
- numberOne, NumberTwo deu co method getter/setter
- method setOperator(char operator)
+ tra ve true neu operator dung, false neu sai
- method result:  tra ve ket qua*/

import java.util.*;
public class CalculatorFinal{
	private float numberOne;
	private float numberTwo;
	private static char operator;
	private float ketqua;
	public boolean setOperator(char operator){
		
		if((operator=='+')||(operator=='-')||(operator=='*')||(operator=='/')){
			this.operator=operator;
			return true;
		}
		return false;
	}

	public CalculatorFinal(){
		
	} 

	public void setNumberOne(float numberOne){
		this.numberOne=numberOne;
	}
	public float getNumberOne(){
		return this.numberOne;
	}
	public void setNumberTwo(float numberTwo){
		this.numberTwo=numberTwo;
	}
	public float getNumberTwo(){
		return this.numberTwo;
	}

	public void solution(){
			
			switch(operator){
				case '+': 
					ketqua=numberOne+numberTwo;
					break;

				case '-': 
					ketqua=numberOne-numberTwo;
					break;
					
				case '*': 
					ketqua=numberOne*numberTwo;
					break;

				case '/':					
					ketqua=numberOne/numberTwo;
					break;
			}
		}

	public float result(){
		return this.ketqua;
	}

	public static void main(String[] args) {
		CalculatorFinal cal = new CalculatorFinal();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap a:");			

		float a = sc.nextFloat();
		System.out.println("nhap b:");			

		float b = sc.nextFloat();
		cal.setNumberOne(a);
		cal.setNumberTwo(b);
		Scanner sc2 = new Scanner(System.in);
		boolean flag2=false;

		while(flag2==false){
		System.out.println("nhap phep tinh:");			
		char operator = sc2.nextLine().charAt(0);
		cal.setOperator(operator);
			if (cal.setOperator(operator)==true){
				flag2 = true;
			}
		}
		switch(operator){
			case '+': cal.solution();
					  System.out.println("ket qua = "+cal.result());
					  break;
			case '-': cal.solution();
					  System.out.println("ket qua = "+cal.result());
					  break;
			case '*': cal.solution();
					  System.out.println("ket qua = "+cal.result());
					  break;
			case '/': if (b==0){
						System.out.println("ko chia dc");
					  }
					  else{
						  cal.solution();
					 	  System.out.println("ket qua = "+cal.result());
					 	  break;
					}

		}

	}
}
