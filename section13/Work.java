 import java.util.*;
 public class Work{

 	List<String> list = new ArrayList<String>();
 	Scanner sc = new Scanner(System.in);
 	int n;
 	
 	public Work(){
 	}

 	public void solution(int n){
 		switch (n){
 			case 1:	
 				System.out.println("Ten cong viec la gi?");
 				list.add(sc.nextLine());
 				System.out.println("Da bo sung cong viec.");
 				break;
 			case 2:
 				if(list.isEmpty()){
 					System.out.println("Hien tai chua co cong viec nao!");
 					break;
 				}
 				else{
 					System.out.println("Day la danh sach cong viec:");
 					int k=0;
 					for(int i = 0; i < list.size();	i++){
 						k++;
 						System.out.println(k+". "+list.get(i));
 					}
 					break;
 				}
 			
 			case 3:
 					boolean f = false;
 					int k;
 				if(!list.isEmpty()){

 					do{	
 						try{
 							System.out.println("So hieu cong viec muon xoa?");
            				k=Integer.parseInt(sc.nextLine());
            					if(k>0 && k<list.size()){
 									k--;
 									list.remove(k);
 									System.out.println("Da xoa cong viec.");
 									f = true;
 									break;
        						}
        						else{
 									System.out.println("Nhap sai vi tri xoa, ve Menu chinh!");
 									break;
 								}

        				}

       					catch(NumberFormatException ex){
            				System.out.println("Chi nhap so nguyen, ve menu chinh!");
            				f = false;
       					}
        				f = true;
 						
 						 				
					
 						
 					}
 					while(f == false);
 				}

 				else {
 					System.out.println("Hien tai ko co cong viec nao de xoa!");
 					break;
 				}
 				 break;

 			case 4:
 				System.out.println("Thoat chuong trinh...");
 				break;
 		}
 	
 	}
 	public void show(){
 		System.out.println("-----------------------------------------------\nMenu:\n1. Bo sung cong viec moi.\n2. Hien thi danh sach cong viec.\n3. Xoa 1 cong viec.\n4. Thoat.\nHay cho biet lua chon cua ban.\n-----------------------------------------------");
 	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Work w = new Work();
		String input;
		int n; 
		boolean flag = false;

		do{
			w.show();
			input = sc.nextLine();
				switch (input) {
					case "1": w.solution(1);
						flag = false;
						break;
					case "2": w.solution(2);
						flag = false;
						break;
					case "3": w.solution(3);
						flag = false;
						break;
					case "4": w.solution(4);
						flag = true;
						break;
					default: System.out.println("Chi nhap tu 1-4!");
				}	
			}
		while (flag == false);
	}
}

 
