package activitat_1_1;

import java.io.File;
import java.util.Scanner;

public class CheckCanWrite
{
  //main function
  public static void main(String[] args) {

    Scanner scanner1 = new Scanner(System.in);

    System.out.println("Enter the path of file: ");
    String path1 = scanner1.next();
    scanner1.close();
  	File dir1 = new File(path1);
    checkCanWrite(dir1);

  }

  //check if entered File is a file
  public static void checkCanWrite(File file)
  {
    if (file.canWrite() == true)
    {
      System.out.println("'"+file+"' has write permissions :D");
    }
    else
    {
      System.out.println("'"+file+"' has no write permissions XD");
    }
  }
}
