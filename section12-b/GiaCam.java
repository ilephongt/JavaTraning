class GiaCam extends Animal implements Walkable, Flyable, Swimmable{
	public GiaCam(String name){
		super(name);
	}

	public void fly(){
		System.out.println(name+"co the bay");
	}	
	public void swim(){
		System.out.println(name+"co the boi");
	}
	public void walk(){
		System.out.println(name+"co the di");
	}
}
