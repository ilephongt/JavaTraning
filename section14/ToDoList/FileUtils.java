 
import java.util.*;
import java.lang.*;
import java.io.*;
 
class FileUtils{
  static String fileName = "danhsach.txt";


	public static void showFileContent(String fileName){
    try{
      Scanner inFile = new Scanner(new FileReader(fileName));  
        String result;
        int number = 1;
        System.out.println("Job List now:\n----------------------------");
        while(inFile.hasNextLine()){
          result = inFile.nextLine();
          System.out.print(number+" ");
          System.out.println(result);
          ++number;
        }
        inFile.close();

    }
    catch (IOException ioe){
      System.out.println("Cant access file.");
    }
  }


  public static int addContentToAFile(String item){

    try{
      Scanner input = new Scanner(System.in);
      PrintWriter outFile = new PrintWriter(new FileWriter(fileName,true));
      outFile.println(item);
      outFile.close();
      return  0;

    }catch(IOException ioe){
      System.out.println("Cant access file");
      return 2;
    }
  }



  public static int removeAContent(int content){
    Scanner input = new Scanner(System.in); 
    ArrayList<String> items = new ArrayList<String>();
    int number = 1;
    boolean flag= false;

    try{
      Scanner inFile = new Scanner(new FileReader(fileName));
            do{
                 String item;
                 while(inFile.hasNextLine()){
                   item = inFile.nextLine();
                   items.add(item);        
                 }
                     if(content>0&&content<=items.size()){
                        content--;
                        items.remove(content);
                       
                        PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
                        for(int i = 0; i<items.size(); i++){
                            outFile.println(items.get(i));
                        }
                            outFile.close();
                            flag=true;
                            return 0;
                     }else{
                      return 1;
                      }
             
              
            //  flag=true;
            }
           while(flag=false);
          

    }catch(IOException ioe){
      return 2;
    }
    //return 1;      
  }



  public static int checkFileEmpty(String fileName){
    try{
        BufferedReader br = new BufferedReader(new FileReader(fileName));     
        if (br.readLine()==null){ 
        return 1;
      }
    }catch(IOException ioe){
        return 2;
    } 
    return 0;
  }
}
