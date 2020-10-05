package activitat_1_3;

import java.io.File;
import java.util.Scanner;

public class ComparatorFiles
{
  //main function
  public static void main(String[] args) {

    Scanner scanner1 = new Scanner(System.in);

//    System.out.println("Enter the path of folder 1: ");
//    String path1 = scanner1.next();
//    System.out.println("Enter the path of folder 2: ");
//    String path2 = scanner1.next();
//    scanner1.close();
    
    String path1 = "/media/jbdragon/KINGSTON/EscolaDelTreball/2n/M06_acces_a_dades/target_dir_1";
    String path2 = "/media/jbdragon/KINGSTON/EscolaDelTreball/2n/M06_acces_a_dades/target_dir_2";
    
    File pathFolder1 = new File(path1);
    File pathFolder2 = new File(path2);
   
    checkIfEnteredFilesExist(pathFolder1, pathFolder2);

  } 

  //check which files from path1 exists in path2 too
  public static void checkIfEnteredFilesExist(File pathFolder1, File pathFolder2)
  {
	    if(pathFolder1.exists() && pathFolder2.exists())
	    {
	    	for(File f1 : pathFolder1.listFiles())
	    	{
	        	String f2_path = pathFolder2.toString()+"/"+f1.getName();
	    		File f2 = new File(f2_path);
	    		
	    		if (f2.exists())
	    		{
	    			System.out.println(f1.getName()+" and "+f2.getName()+" exist in both directories");
	    			System.out.println("path1: "+f1.getAbsolutePath());
	    			System.out.println("path2: "+f2.getAbsolutePath());
	    			compareSizeBetween2Files(f1, f2);
		        }
		        else
		        {
		        	System.out.println(f1.getName()+" exists only in "+f1.getAbsolutePath());
		        }
	        	System.out.println("\n");
	    	}
	    }

	    else
	    {
	    	notExistingFilesOutput(pathFolder1, pathFolder2);
	    }
  }
  
  
  //show if one or both of entered files do not exist
  public static void notExistingFilesOutput(File pathFolder1, File pathFolder2)
  {
  	if(!pathFolder1.exists() && !pathFolder2.exists())
  	{
  		System.out.println("None of folders exist");
  	}
  	else if(!pathFolder1.exists())
  	{
  		System.out.println("Folder "+pathFolder1+" does not exists");    		
  	}
  	else
  	{
  		System.out.println("Folder "+pathFolder2+" does not exists");    		    		
  	}
  }
  
  
  //compare the size of 2 Files 
  public static void compareSizeBetween2Files(File f1, File f2)
  {
	  if(f1.canRead() && f2.canRead())
	  {
		  if(f1.length() < f2.length())
		  {
			  System.out.println(f2.getName()+" is bigger than " +f1.getName());
		  }
		  else if(f1.length() > f2.length())
		  {
			  System.out.println(f1.getName()+" is bigger than " +f2.getName());
		  }
		  else
		  {
			  System.out.println(f1.getName()+" and " +f2.getName()+" have the same size");		  
		  }		  
	  }
	  else
	  {
		  System.out.println("At least one of the file has not read permissions");
	  }
  }
  
}


