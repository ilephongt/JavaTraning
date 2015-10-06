import java.io.*;
import java.util.*;

class Main13{

  public static void main(String[] args) throws IOException{
  	List<String> list = new ArrayList<String>();
    Work13 w = new Work13();
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
				        String content = input.nextLine();
	             
	              if(w.addContentToList(content)){
		              System.out.println("Successful!");
	                  break;
                  }
          case 2://Display
          		  
		          if (w.showListContent(list)){
		              System.out.println("----------------------------\nReturn to menu...");		          }
		          else{
		          	  System.out.println("File is Empty! Add job first!");
		          }
		          break;
             
          case 3://remove
	           if(w.showListContent(list)==false){
	                System.out.println("File is Empty! Add job first!");
	           }
	           else{
		           try{
				        System.out.println("Enter a index to remove:");
		        	    int index = Integer.parseInt(input.nextLine());
		        	    int dr = w.removeAContent(index);
		                if (dr==1) System.out.println("Cant find index because it's out of size!");
		                else if (dr==0) System.out.println("Done!");
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
        }catch(InputMismatchException ime){
          System.out.println("u must press number");
          input.nextLine();
        }

      }//end while


  }
}//end main

//0 thanh cong
//1 ton tai
//2 ko ghi dc
//3 ko ton tai file
