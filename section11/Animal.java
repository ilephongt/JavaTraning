/*Hãy tự xây dựng class cho các loại động vật với các gợi ý dưới đây
- động vật
- gia súc, gia cầm
- chó, mèo, gà, vịt, chim, bò
- chó Nhật, chó Phú Quốc
- Gà Ta, Gà Tây
- khả năng: đi, bay, bơi
- nếu loại động vật nào ko có khả năng làm việc gì đó thì in ra “<X> không <Y> được”.  Nếu có khả năng thì in ra “<X> có thể <Y>”
Ví dụ:  “cho co the di"
- method gioiThieu: “Ta la <X>"
*/

class Animal{


	
private String name = "DONG VAT";
	
	public void di(){
		System.out.println(name+" co the di");
	}
	public void bay(){
		System.out.println(name+" khong bay duoc");
	}
	public void boi(){
		System.out.println(name+" co the boi");
	}
 	public void gioiThieu(){
 		System.out.println("Ta la "+name);
 	}
}


 
