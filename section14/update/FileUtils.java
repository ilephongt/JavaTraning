 
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
        System.out.println("Job List now:");
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


  public static void addContentToAFile(String item){

    try{
      Scanner input = new Scanner(System.in);
      PrintWriter outFile = new PrintWriter(new FileWriter(fileName,true));
      outFile.println(item);
      outFile.close();

    }catch(IOException ioe){
      System.out.println("Cant access file");
    }
  }



  public static void removeAContent(int content){
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
                        System.out.println("Done!");
                        flag=true;
                        PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
                        for(int i = 0; i<items.size(); i++){
                            outFile.println(items.get(i));
                        }
                            outFile.close();
                     }else{
                      System.out.println("It's out of size!");
                      }
             
              
              flag=true;
            }
           while(flag=false);
          

    }catch(IOException ioe){
      System.out.println("Cant access file");
    }
        
  }



  public static String checkFileEmpty(String fileName){
    try{
        BufferedReader br = new BufferedReader(new FileReader(fileName));     
        if (br.readLine()==null){ 
        System.out.println("File is empty now!\nPlease add new job!");
        return null;
      }
    }catch(IOException ioe){
        System.out.println("Cant access file.");
    } 
    return fileName;
  }
}
