public class Add {
	public static void main(String[] args) {
		int a = 4;
		int b = 5;

		int c = add(a,b);

		System.out.println(c);
	}

	public int add(int first, int second) {
		int result = first + second;
		return result;
	}

	public void shout(String words) {
		System.out.println(words + "!");
	}
}
