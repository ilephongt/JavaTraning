import java.io.*;
import java.util.*;
public class ToDo{

  static String fileName = "danhsach.txt";

  public ToDo(){
  }
  
  static void showMenu(){
    System.out.println("================================================\nMenu\n1.add job\n2.display job\n3.remove a job\n4.quit program\nEnter your choice:");
  }


  static void addContentFuntion(){
    Scanner input = new Scanner(System.in);
    String item = input.nextLine();
    FileUtils.addContentToAFile(item);
  }

  static void showContentFuntion(){
    if(FileUtils.checkFileEmpty(fileName)!=null)
       FileUtils.showFileContent(fileName); 
  }

  static void removeContentFuntion(){
    Scanner input = new Scanner(System.in);
    if(FileUtils.checkFileEmpty(fileName)!=null){
          FileUtils.showFileContent(fileName);
          System.out.println("which item do u wanna remove?");
          int content = Integer.parseInt(input.nextLine());
          FileUtils.removeAContent(content);
    }
  }

  public static void main(String[] args) throws IOException{
    ToDo td = new ToDo();
    Scanner input = new Scanner(System.in);
  
    int choice = 0;  
    while(choice!=4){
    showMenu();

      try{
        choice = input.nextInt();
        input.nextLine();//ko bi an phim Enter
        switch(choice){

          case 1://Add
              System.out.println("Enter an item:");
              addContentFuntion();                
              break;

          case 2://Display
              showContentFuntion();
              break;
             
          case 3://remove
              try{    
                    removeContentFuntion(); 
              }catch(NumberFormatException ex){
                    System.out.println("please input only number!");
              }
              break;

          case 4://quit
              System.out.println("Goodbye!");
              break;

          default://input error
              System.out.println("Sorry, but " + choice + " is not one of " +
                "the menu choices. Please try again.");
              break;

          }  
        }catch(java.util.InputMismatchException ime){
          System.out.println("u must press number");
          input.nextLine();
        }

      }//end while


    }//end main
   }
