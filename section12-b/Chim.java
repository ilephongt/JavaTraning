class Chim extends GiaCam implements Flyable{
	
	public Chim(String name){
		super(name);
	}
	
	public void fly(){
		System.out.println(name +" bay duoc");
	}
}
