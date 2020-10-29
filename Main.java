import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;


class Main {
   
   public static void main (String[] args) throws IOException {
      FileInputStream fileByteStream = null; // File input stream
      Scanner inFS = null;                   // Scanner object
      String fileNum1;                         // Data value from file
      String fileNum2;                         // Data value from file

      // Try to open file
      System.out.println("\nChukwuemka Elendu's Terriost Watch \n");
      fileByteStream = new FileInputStream("Project 1 2.0.txt");
      inFS = new Scanner(fileByteStream);
      
      // File is open and valid if we got this far (otherwise exception thrown)
      // myfile.txt should contain two integers, else problems
      System.out.println("Decoding terriost language \n ");
      
      String []userNums = new String [76];
      Scanner scnr = new Scanner(System.in);
      int i = 0;
      while (i < userNums.length) {
         userNums[i] = inFS.nextLine();
         i++;
      }
    
    
    
    int z = 0;
    System.out.println("Do you want a list of the words that terriost use?");
    System.out.print("1 for yes and 0 for no: ");
  int y = scnr.nextInt();
  System.out.println("");
  if (y == 1){
      while (z < userNums.length){
         if(z % 2 == 0){
         System.out.println(userNums[z]);
      }
      z++;
      }
   }
   System.out.println("");   
      
      
       
      //System.out.println(userNums[0]);
      //System.out.println(userNums[2]);  
      
      
      System.out.println("Note: Remember to type in _ for space. "); 
      System.out.print("Input word: ");
      String user = scnr.next();
      
      System.out.println("\nLet the decoding begin: \n");
  
       
       
       
       
      int j = 0;
      while (j < userNums.length){
         if (user.equalsIgnoreCase(userNums[j]) == true){
           System.out.println("-" + userNums[j]);
           System.out.println("--Defination: " + userNums[j+1]);
         }
         j++;
       }
          fileByteStream.close(); // close() may throw IOException if fails
   }
}
