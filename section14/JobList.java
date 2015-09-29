import java.io.*;
import java.util.*;
public class JobList{
  static String fileName = "danhsach.txt";
 

  static String menu(){
    String choice;    
    Scanner input = new Scanner(System.in);
    System.out.println("================================================\nMenu\n1.add job\n2.display job\n3.remove a job\n4.quit program\nenter your choice:");
      choice =input.nextLine();  
      return choice;
  }



  static void show(){
   
    try{
      System.out.println("Job List:");
      Scanner inFile = new Scanner(new FileReader(fileName));
      BufferedReader br = new BufferedReader(new FileReader(fileName));     
      if (br.readLine() == null) {
          System.out.println("File is empty now!");
      }else{

      String line;
      int number = 1;
      while(inFile.hasNextLine()){
        line = inFile.nextLine();
        System.out.print(number+" ");
        System.out.println(line);
        ++number;
      }
      System.out.println();
      inFile.close();
    }
  }
    catch (IOException ioe){
      System.out.println("cant access file.");
    }

  }



  static void add(){
    try{
      Scanner input = new Scanner(System.in);
      PrintWriter outFile = new PrintWriter(new FileWriter(fileName, true));
      System.out.println("Enter an item:");
      String item = input.nextLine();
      outFile.println(item);
      outFile.close();
    }catch(IOException ioe){
      System.out.println("cant access file");
    }
    
  }



  static void remove(){
    int choice;
    show();
    Scanner input = new Scanner(System.in); 
    ArrayList<String> items = new ArrayList<String>();
    int number = 1;
    boolean flag2= false;

    try{
      Scanner inFile = new Scanner(new FileReader(fileName));
      BufferedReader br = new BufferedReader(new FileReader(fileName));   
      PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
  
      if(br.readLine()==null){
        System.out.println("please add new job first!");
      }else{
            do{
              try{
                 System.out.println("which item do u wanna remove?");
                 String item;
                 choice = Integer.parseInt(input.nextLine());
                 while(inFile.hasNextLine()){
                   item = inFile.nextLine();
                   items.add(item);        
                 }
                     if(choice>0&&choice<=items.size()){
                        choice--;
                        items.remove(choice);
                        System.out.println("done!");
                        flag2=true;
                        for(int i = 0; i<items.size(); i++){
                            outFile.println(items.get(i));
                        }
                            outFile.close();
                     }else{System.out.println("wrong input number, out of size!");}
              }catch(NumberFormatException ex){
                System.out.println("please input only number!");
                flag2 = false;
              }
              flag2=true;
            }
           while(flag2==false);
          }

    }catch(IOException ioe){
      System.out.println("cant access file");
    }
        
  }

 public static void main(String[] args) throws IOException{
    boolean flag = false;
    String menuItem ;
    do{
     menuItem = menu();
      switch(menuItem){
        case "1": 
           add();
           flag =false;
           break;
        case "2": 
            show();
            flag =false;
            break;
        case "3": 
            remove();
            flag =false;
            break;
         case "4": 
            flag = true;
            break;
            default: 
           System.out.println("error! please press number 1-4:");
      }
    } 
    while(flag == false);
  }

}
