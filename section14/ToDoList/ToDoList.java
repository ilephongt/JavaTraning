import java.io.*;
import java.util.*;
public  class ToDoList implements Work15{
  String fileName = "danhsach.txt";
  public ToDoList(){}

  public int add(String content) {
        if(FileUtils.addContentToAFile(content)==0){
          return 0;
        }
        else return 1;
  }

  public int tasks() {
    if(FileUtils.checkFileEmpty(fileName)==0){
       FileUtils.showFileContent(fileName);
       return 0;
    }
    else if (FileUtils.checkFileEmpty(fileName)==1){ 
      return 1;
    }
    else if (FileUtils.checkFileEmpty(fileName)==2){
      return 2;
    }
    return 3;
    
  }


  public int delete(int index) {
    if(FileUtils.checkFileEmpty(fileName)==0){
      if(FileUtils.removeAContent(index)==0){
         return 0;
      }
      else {//FileUtils.removeAContent(index);
         return 1;
      }
    }
    else if (FileUtils.checkFileEmpty(fileName)==1){ 
      return 1;
    }
    else if (FileUtils.checkFileEmpty(fileName)==2){
      return 2;
    }
    return 3;
  }
  

}
