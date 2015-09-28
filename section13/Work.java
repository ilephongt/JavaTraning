
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
 				System.out.println("Day la danh sach cong viec:");
 				int k=0;
 				for(int i = 0; i < list.size();	i++){
 					k++;
 					System.out.println(k+". "+list.get(i));
 				}
 				break;
 			case 3:
 				System.out.println("So hieu cong viec muon xoa?");
 				int j = Integer.parseInt(sc.nextLine());
 				j--;
 				list.remove(j);
 				 System.out.println("Da xoa cong viec.");
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
					default: System.out.println("ban nhap gia tri khong dung!");
				}	
			}
		while (flag == false);
	}
}

 
