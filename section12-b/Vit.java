class Vit extends GiaCam implements Flyable, Swimmable, Walkable{
	public Vit(String name){
		super(name);
	}
	public void fly(){
		System.out.println(name +" bay duoc");
	}
	public void walk(){
		System.out.println(name +" di duoc");
	}
	public void swim(){
		System.out.println(name +" boi duoc");
	}

}
