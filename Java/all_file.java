import java.util.*;
import java.io.*;

public class CodesCracker
{
   public static void main(String[] args)
   {
      String directory;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the Directory: ");
      directory = scan.nextLine();
      
      File fileObject = new File(directory);
      
      String[] filesFolders = fileObject.list();
      
      System.out.println("\n---List of all Files and Folders---");
      for(String ff: filesFolders)
         System.out.println(ff);
   } 
}
