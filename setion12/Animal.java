/*Ở bài tập trước, các em thường viết code (print ra màn hình) 
cho các class ông, cha như Animal, Cattle.  
Hãy thay đổi các class này thành abstract class.
Ngoài ra anh muốn chốt chắc chắn
- gia cầm có thể bay
- gia súc có thể đi
(động vật
- gia súc, gia cầm
- chó, mèo, gà, vịt, chim, bò
- chó Nhật, chó Phú Quốc
- Gà Ta, Gà Tây)
*/
abstract class Animal{
	String name;
	public Animal(String name){
		this.name = name;
	}
	public String gioiThieu(){
		 return "ta la "+name;

	}
	public abstract String di();
	public abstract String bay();
	public abstract String boi();

}
