import java.util.*;
public class RandomNumber{
    public static void main(String[] args){
    
        List<Float> array = new ArrayList<Float>();
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        float tam;
        float tam2 = 0;

//sinh so random                
        System.out.println("A.ban muon random bao nhieu so?");
        int kiemtra=sc.nextInt();

        while(kiemtra<=0){
            System.out.println("nhap lai, chi nhap so nguyen >0");
            kiemtra=sc.nextInt();
        }        
        for(int i =0; i<kiemtra;i++){
            tam=rd.nextFloat();
            array.add(tam);
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
        int dem =0;
        int a = array.size();
        float[] motchieu= new float[a];
        for(Float num : array){
            motchieu[dem] = num;
            ++dem;
        }//chuyen du lieu sang motchieu

        for (int i = 0; i < motchieu.length; i++) {
            for (int j = 1; j < (motchieu.length - i); j++) {

                if (motchieu[j - 1] < motchieu[j]) {
                tam2 = motchieu[j - 1];
                motchieu[j - 1] = motchieu[j];
                motchieu[j] = tam2;
                }

            }
        }
       
        ///sap xep motchieu giam dan


        System.out.println("\n\nC.thu tu giam dan cua day la:\n");
        for (int i=0;i<motchieu.length;i++){
            System.out.print(motchieu[i]+", ");
        }

          
 //nhap vao gia tri x va xoa cac so x co trong array

        System.out.println("\nD.nhap vao 1 so bat ky de xoa");
        float b = sc.nextFloat();
            for (int i=0; i<array.size();i++){
                if(array.get(i)==b){
                    array.remove(i);
                }
            }    
        System.out.println("\n\ndanh sach cac so sau khi xoa: "+array);

    }

}
