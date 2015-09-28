 import java.util.*;
 import java.io.File;
 import java.io.IOException;
 public class Job{
 	static final String fileName = "danhsach.txt";
 	ArrayList<String> list = new ArrayList<String>();
 	Scanner sc = new Scanner(System.in);
 	int n;
 	
 	public Job(){
 	}

 	public void add(){
 		System.out.println("Ten cong viec la gi?");
 		list.add(sc.nextLine());
 		System.out.println("Da bo sung cong viec.");
 	}

 	public void show(){
 		if(list.isEmpty()){
 			System.out.println("Danh sach dang rong~.");
 		}else{
 			System.out.println("Day la danh sach cong viec:");
 			int k=0;
 			for(int i =0; i<list.size(); i++){
 				k++;
 				System.out.println(k+". "+list.get(i));
 			}
 		}
 	}

 	public void delete(){
 			boolean f = false;
 			int k;
 				if(!list.isEmpty()){

 					do{	
 						try{
 							System.out.println("So hieu cong viec muon xoa?");
            				k=Integer.parseInt(sc.nextLine());
            					if(k>0 && k<=list.size()){
 									k--;
 									list.remove(k);
 									System.out.println("Da xoa cong viec.");
 									f = true;			
        						}else{
 									System.out.println("Nhap sai vi tri xoa, tro ve Menu chinh!");
 								}
        				}catch(NumberFormatException ex){
            				System.out.println("Chi nhap so nguyen, tro ve menu chinh!");
            				f = false;
       					}
        				f = true;
 					}while(f == false);
 				}else{
 					System.out.println("Danh sach hien tai dang rong~.");
 				}
 	}

 	public void out(){
 		System.out.println("Thoat chuong trinh...");
 	}


 	
 	public void menu(){
 		System.out.println("-----------------------------------------------
 							\nMenu:
 							\n1. Bo sung cong viec moi.
 							\n2. Hien thi danh sach cong viec.
 							\n3. Xoa 1 cong viec.\n4. Thoat.
 							\nHay cho biet lua chon cua ban.
 							\n-----------------------------------------------");
 	}

	public static void main(String[] args) {
		try{
 			File file = new File("danhsach.txt");
 			if(file.createNewFile()){
 				System.out.println("Tao file thanh cong!");
 			}else{
 				System.out.println("Da ton tai file nay truoc do!");
 			}
 		}catch (IOException e){
 			e.printStackTrace();
 		}


		Scanner sc = new Scanner(System.in);
		Job w = new Job();
		boolean flag = false;
		do{
			w.menu();
			String input = sc.nextLine();
				switch (input) {
					case "1": w.add();
						flag = false;
						break;
					case "2": w.show();
						flag = false;
						break;
					case "3": w.delete();
						flag = false;
						break;
					case "4": w.out();
						flag = true;
						break;
					default: System.out.println("Chi nhap tu 1-4!");
				}	
			}while (flag == false);
	}
}

