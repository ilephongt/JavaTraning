/*
Thay đổi code Animal ở trên sử dụng Interface. Cụ thể
- class nào có khả năng nào đó mới có method tương ứng.
Ví dụ:   Cattle chỉ có hàm walk(), ko gọi được fly() và swim
- tạo 3 interface:  Flyable, Walkable và Swimmable
+  Flyable co method void fly()
+  Walkable   co method void walk()
+  Swimmable co method void swim()

Mỗi class cần implement ít nhất một trong các interface phía trên trừ class Animal
*/
class Main{
	public static void main(String[] args) {
		GiaSuc a = new ChoNhat("Cho Nhat");
		System.out.println(a.gioiThieu());
		a.walk();	
		//a.swim();
		//a.fly();
		System.out.println("------------------------------------------------------");

		GiaCam b = new GaTa("Ga Tay");
		System.out.println(b.gioiThieu());
		b.walk();		
		b.fly();
		System.out.println("------------------------------------------------------");

		Bo c = new Bo("Bo");
		System.out.println(c.gioiThieu());
		c.walk();	
		//c.swim();
		//c.fly();
		System.out.println("------------------------------------------------------");

		GiaCam d = new Chim("Chim");
		System.out.println(d.gioiThieu());
		d.fly();
		System.out.println("------------------------------------------------------");
		
		GiaCam e = new Vit("Vit");
		System.out.println(e.gioiThieu());
		e.walk();
		e.fly();
		e.swim();
		System.out.println("------------------------------------------------------");


	}
}
