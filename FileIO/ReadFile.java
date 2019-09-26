import java.io.*; // We must import this package every time we use the IO methods
public class ReadFile {

   public static void main(String args[]) {  
      try {
        FileInputStream in = new FileInputStream("input.txt");
				FileOutputStream out = new FileOutputStream("output.txt");
         
        int c;
        while ((c = in.read()) != -1) { //reads *1* byte of data from the string and stores it in an int
          out.write(c); //writes the byte to the output stream
        }
        in.close(); // release all the resources associated with reading the file 
        out.close(); // release the resources associated with writing to a file
      } catch (IOException io) {
				System.out.println("Exception occurred while reading the file."); // we know something went wrong reading the file
			}
   }
}
