 
import java.util.*;
import java.lang.*;
import java.io.*;

 
public class Work13 implements Work15 {
  List<String> list = new ArrayList<String>();
  public Work13(){

  }

	public boolean showListContent(List list){
		list = this.list;
	    if(list.isEmpty()){
	      return false;//empty
	    }
	    else{
	      System.out.println("Job List now:");
	      int j=1;
	      for (int i=0;i<list.size();i++){
	        System.out.println(j+". "+list.get(i));
	        j++;
	      }
	      return true;//success
	    }
  }


  public boolean addContentToList(String content){    
    
      list.add(content);
      return  true;//success
  }



  public int removeAContent(int index){
    boolean flag = false;  	
        do{
            if(index>0&&index<=list.size()){
                index--;
                list.remove(index);                      
                flag=true;
                return 0;//success
            }
            else{
                return 1;//wrong index
            }
              
        }while(flag==false);
    }
  }
