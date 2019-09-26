import java.io.*; // We must import this package every time we use the IO methods
public class ReadFile {

   public static void main(String args[]) {  
      FileInputStream in = null; // We instantiate the two objects with null so we can use them in both the try block and the finally block
      FileOutputStream out = null; 

      try {
         in = new FileInputStream("../input.txt");
         out = new FileOutputStream("output.txt");
         
         int c;
         while ((c = in.read()) != -1) { //reads *1* byte of data from the string and stores it in an int
            out.write(c); //writes the byte to the output stream
         }

				 if (in != null) { //the file input stream has no more characters
            in.close(); // release all the resources associated with reading the file 
         }
         if (out != null) { // make sure we opened the output stream in the first place
            out.close(); // release the resources associated with writing to a file
         }
      } catch (IOException io) {
				System.out.println("Exception occurred while reading the file."); // we know something went wrong reading the file
			}	finally {
     		System.out.println("End of program");          
			}
   }
}
