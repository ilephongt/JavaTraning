class GaTa extends Ga implements Flyable,Walkable{
	public GaTa(String name){
		super(name);
	}
	public void fly(){
		System.out.println(name +" bay duoc");
	}
	public void walk(){
		System.out.println(name +" di duoc");
	}
	

}
