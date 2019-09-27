public class ExampleArray {
	public static void main(String[] args) {
		int[] intArray;
		intArray = new int[] {1,4,1,2,3,2};

		int[] newArray = intArray;
		// Not truly copying!!!
		// Notice what happens:

		intArray[4] = 97;
		System.out.println(newArray[4]);
		//Changing one array changed the other!

		//Instead we should:
		int[] trueNewArray = new int[6];

		//Copy each element individually
		for (int i = 0; i < intArray.length; i++) {
			trueNewArray[i] = intArray[i];
		}

		//now we can do this:
		
		intArray[1] = 1000;
		System.out.println(trueNewArray[1]);

	}
}
