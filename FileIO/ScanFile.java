import java.util.Scanner;
public class ScanFile {

  public static void main(String args[]) {  
		try {
			Scanner sc = new Scanner(new File("input.txt")); 
			while (sc.hasNext()) { // check this to avoid throwing an exception
				String str = sc.nextLine(); 
				System.out.println(str); 
			} 
			sc.close();  //Just like the other classes, we need to close this 
		} catch (IOException io) {
			System.out.println("Exception occurred while reading the file."); // we know something went wrong reading the file
		}
  }
}
