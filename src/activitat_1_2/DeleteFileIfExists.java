package activitat_1_2;

import java.io.File;
import java.util.Scanner;

public class DeleteFileIfExists
{
  //main function
  public static void main(String[] args) {

    Scanner scanner1 = new Scanner(System.in);

    System.out.println("Enter the path of file: ");
    String path1 = scanner1.next();
    scanner1.close();
    
    File pathFile = new File(path1);

    if(pathFile.exists())
    {
        for(File file : pathFile.listFiles())
        {
        	deleteFile(file);
        }
        deleteFile(pathFile);
    }
    else
    {
    	System.out.println("Path not found");
    }
  }
  
  
  public static void deleteFile(File file)
  {
  	try
    {
        if (file.delete())
        {
          System.out.println("'"+file+"' folder deleted");
        }
        else
        {
          System.out.println("Folder not deleted");
        }
    }
    catch (Exception e) {
        System.err.println(e);
    }    	
  }  
}

