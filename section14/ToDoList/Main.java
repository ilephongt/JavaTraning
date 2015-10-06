import java.io.*;
import java.util.*;

class Main{

  public static void main(String[] args) throws IOException{
  	String fileName = "danhsach.txt";
    ToDoList td = new ToDoList();
    Scanner input = new Scanner(System.in);
    int choice = 0;  
    while(choice!=4){
    System.out.println("============================\nMenu\n1.add job\n2.display job\n3.remove a job\n4.quit program\nEnter your choice:");

      try{
        choice = input.nextInt();
        input.nextLine();//ko bi an phim Enter
        switch(choice){

          case 1://Add
              System.out.println("Enter an content:");
              String item = input.nextLine();
              
              if(td.add(item)==0){
                System.out.println("Successful!");
              }
              else{
                System.out.println("Cant add new content!");
              }                
                break;

          case 2://Display
              if (td.tasks() == 0){
                System.out.println("----------------------------\nReturn to menu...");
              }
              else{
                System.out.println("File is Empty! Add new job!");
              }

              break;
             
          case 3://remove

            
                  if  (td.tasks()==1){
                      System.out.println("File is Empty! Add job first!");
                  }
                  else{
                    try{
                      System.out.println("Which item do u wanna remove?");
                      int content = Integer.parseInt(input.nextLine());
                      int dr = td.delete(content); 
                      if (dr==2) System.out.println("Cant access file!");
                      else if (dr==1) System.out.println("Cant find index because it's out of size!");
                      else if(dr==0){ System.out.println("Done!");}

                  
                    }catch(NumberFormatException ex){
                      System.out.println("Please input only number!");
                    }
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

//0 thanh cong
//1 ton tai
//2 ko ghi dc
//3 ko ton tai file
}
