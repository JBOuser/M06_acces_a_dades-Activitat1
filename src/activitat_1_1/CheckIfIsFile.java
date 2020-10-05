package activitat_1_1;

import java.io.File;
import java.util.Scanner;

public class CheckIfIsFile
{
  //main function
  public static void main(String[] args) {

    Scanner scanner1 = new Scanner(System.in);

    System.out.println("Enter the path of file: ");
    String path1 = scanner1.next();
    scanner1.close();
  	File dir1 = new File(path1);
    checkIsFile(dir1);

  }

  //check if entered File is a file
  public static void checkIsFile(File file)
  {
    if (file.isFile() == true)
    {
      System.out.println("'"+file+"' is a file :D");
    }
    else
    {
      System.out.println("'"+file+"' is not a file XD");
    }
  }
}

