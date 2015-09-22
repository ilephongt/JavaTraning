import java.util.*;
public class RandomNumber{
    public static void main(String[] args){
    
        List<Float> array = new ArrayList<Float>();
        List<Float> array2 = new ArrayList<Float>();
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        float tam1;


//sinh so random                
        System.out.println("A.ban muon random bao nhieu so?");
        float n = sc.nextFloat();
        for(int i =0; i<n;i++){
            tam1=rd.nextFloat();
            array.add(tam1);
        }
        System.out.println("\n\ndanh sach cac so duoc tao:\n"+array);
        

//In ra so lon nhat cua day so        
        float max = array.get(0);
        for(int i=0;i<array.size();i++){
            if(array.get(i)>max){
                max = array.get(i);

            }
        }
        System.out.println("\n\nB.so lon nhat cua day:\n "+max);
        

//in ra thu tu giam dan
        Collections.sort(array);
         
        int a=array.size();
        float[] motchieu= new float[a];


//truyen cac phan tu vao mang 1 chieu
        for(Float num : array){
        	motchieu[a-1]=num;
       		a--;
        }


//chuyen motchieu vao array2
        for (int i=0;i<motchieu.length;i++){
            array2.add(motchieu[i]);    
        }         
        System.out.println("\n\nC.thu tu giam dan cua day la:\n "+array2);

          
 //nhap vao gia tri x va xoa cac so x co trong array
        System.out.println("\nnhap vao 1 so bat ky de xoa");
        float b = sc.nextFloat();
        List<Float> toRemove = new ArrayList<Float>();
            for (int i=0; i<array.size();i++){
                if(array.get(i)==b){
                    array.remove(i);
                }
            }    
        System.out.println("\n\nD.danh sach cac so sau khi xoa: "+array);

    }

}
