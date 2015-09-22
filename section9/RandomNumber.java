import java.util.*;
public class RandomNumber{
    public static void main(String[] args){
    
        List<Integer> array = new ArrayList<Integer>();
        List<Integer> array2 = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int tam1;


//sinh so random                
        System.out.println("A.ban muon random bao nhieu so?");
        int n = sc.nextInt();
        for(int i =0; i<n;i++){
            tam1=rd.nextInt(100);
            array.add(tam1);
        }
        System.out.println("danh sach cac so duoc tao:"+array);
        

//In ra so lon nhat cua day so        
        int max = array.get(0);
        for(int i=0;i<array.size();i++){
            if(array.get(i)>max){
                max = array.get(i);

            }
        }
        System.out.println("B.so lon nhat cua day: "+max);
        

//in ra thu tu giam dan
        Collections.sort(array);
         
        int a=array.size();
        int[] motchieu= new int[a];


//truyen cac phan tu vao mang 1 chieu
        for(Integer num : array){
        	motchieu[a-1]=num;
       		a--;
        }


//chuyen motchieu vao array2
        for (int i=0;i<motchieu.length;i++){
            array2.add(motchieu[i]);    
        }         
        System.out.println("C.thu tu giam dan cua day la: "+array2);

          
 //nhap vao gia tri x va xoa cac so x co trong array
        System.out.println("nhap vao 1 so bat ky de xoa");
        int b = sc.nextInt();
        List<Integer> toRemove = new ArrayList<Integer>();
            for (int i=0; i<array.size();i++){
                if(array.get(i)==b){
                    array.remove(i);
                }
            }    
        System.out.println("D.danh sach cac so sau khi xoa: "+array);

    }

}
