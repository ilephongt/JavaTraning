/*- có các thuộc tính:  name (String),  age (int)
- hàm khởi tạo có 2 tham số là name và age
- có method getter/setter gán giá trị cho name và age (getName, setName, getAge, setAge)
- method toString() sẽ in ra như sau “My name is <name>. I’m <age> years old”
*/

public class Person{
	private	String name;
	private int age;

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;

	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}




	public String toString(){
		System.out.println("My name is "+this.name+".I'm " +this.age+" years old!" );
		return this.name+ this.age;

	}



public static void main(String[] args) {
	Person pr = new Person();
	pr.setAge(20);
	pr.setName("Penaldo");
	pr.toString();
	
	}

}
