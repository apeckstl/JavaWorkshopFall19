public class Person {
	public static int population = 0;
	public int age;
	public String name;

	public static void main(String[] args) {
		population++;
		System.out.println(population);
	}
}
