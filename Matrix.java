import java.util.*;
//import static java.lang.System.out;
class Matrix { 
    public static void main( String[] args ) { 

        List<List<Integer>> array = new ArrayList<List<Integer>>();
         List<List<Integer>> array2 = new ArrayList<List<Integer>>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter cot:");
        int n = input.nextInt();

        System.out.println("Enter hang:");
        int m = input.nextInt();

        System.out.println("Enter the values:");

        for( int i=0;i<m;i++){ 
            // add row:
            List<Integer> list = new ArrayList<Integer>();
            array.add(list);//dua cac bien trong mang 1 chieu sang mang 2 chieu
            for( int j = 0 ; j < n ; j++) {                
                list.add( input.nextInt());
            }
        }

        System.out.println("mang 2 chieu vua nhap");
        System.out.println( array );

        int k;
        k=m*n;
        int[] motchieu = new int[k];
        int l=0;
//duyet tung list cua array 
        for (List<Integer> list : array){
             for (Integer num : list) {
               // doc vao mang 1 chieu
                motchieu[l++]=num;
            }
        }     

//sap xep mang motchieu
         int temp = 0;

    for (int i = 0; i < motchieu.length; i++) {
        for (int j = 1; j < (motchieu.length - i); j++) {

            if (motchieu[j - 1] > motchieu[j]) {
                temp = motchieu[j - 1];
                motchieu[j - 1] = motchieu[j];
                motchieu[j] = temp;
            }

        }
    }
//chuyen du lieu tu motchieu vao list roi vao vao array2
    for(int i=0;i<motchieu.length;i++){
        List<Integer> list = new ArrayList<Integer>();
        list.add(motchieu[i]);
        array2.add(list);
    }

         System.out.println(array2);

    }
