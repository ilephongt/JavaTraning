public class Main{
	public static void main(String[] args) {

		

		Animal test = new Meo("Meo");
		System.out.println(test.gioiThieu());
		System.out.println(test.di());
		System.out.println(test.bay());
		System.out.println(test.boi());
		System.out.println("--------------------------------------------------");

		GiaCam test2 = new GaTa("Ga Ta");
		System.out.println(test2.gioiThieu());
		System.out.println(test2.di());
		System.out.println(test2.bay());
		System.out.println(test2.boi());
		System.out.println("--------------------------------------------------");

		GiaSuc test3 = new ChoPhuQuoc("Cho Phu Quoc");
		System.out.println(test3.gioiThieu());
		System.out.println(test3.di());
		System.out.println(test3.bay());
		System.out.println(test3.boi());
		System.out.println("--------------------------------------------------");
		

		Animal test4 = new Bo("Bo");
		System.out.println(test4.gioiThieu());
		System.out.println(test4.di());
		System.out.println(test4.bay());
		System.out.println(test4.boi());
		System.out.println("--------------------------------------------------");
		
		
	}

}
