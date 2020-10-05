package activitat_1_1;

import java.io.File;
import java.util.Scanner;

public class CheckIfFileExists
{

  public static void main(String[] args) {

    Scanner scanner1 = new Scanner(System.in);

    System.out.println("Enter a path of folder/file: ");
    String path1 = scanner1.next();
    scanner1.close();
  	File dir1 = new File(path1);

    if (dir1.exists() == true)
    {
      System.out.println("'"+dir1+"' found :D");
    }
    else
    {
      System.out.println("'"+dir1+"' not found XD");
    }

  }
}

