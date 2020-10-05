package activitat_1_1;

import java.io.File;
import java.util.Scanner;

public class ManageFile
{
  //main function
  public static void main(String[] args) {

    Scanner scanner1 = new Scanner(System.in);

    System.out.println("Enter the path of file: ");
    String path1 = scanner1.next();
    scanner1.close();
    
	try
    {
		File pathFile = new File(path1);
        if (pathFile.createNewFile())
        {
          System.out.println("'"+pathFile+"' file created");
        }
        else
        {
          System.out.println("File not created");
        }
    }
    catch (Exception e) {
        System.err.println(e);
    }    	
  }
}
