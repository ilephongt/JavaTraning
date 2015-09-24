public class Main{

   public static void main(String args[]){

      Animal test = new ChoPhuQuoc();
      test.gioiThieu();
      test.di();
      test.boi();
      test.bay();
      System.out.println("-------------------------------------------");
      GiaCam test2 = new Vit();
	  test2.gioiThieu();
      test2.di();
      test2.boi();
      test2.bay();
      System.out.println("-------------------------------------------");

      Animal test3 = new GiaSuc();
      test3.gioiThieu();
      test3.di();
      test3.boi();
      test3.bay();
      System.out.println("-------------------------------------------");

    }
}
