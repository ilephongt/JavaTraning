class Ga extends GiaCam implements Flyable,Walkable{
	public Ga(String name){
		super(name);
	}
	public void fly(){
		System.out.println(name +" bay duoc");
	}
	public void walk(){
		System.out.println(name +" di duoc");
	}
	

}
