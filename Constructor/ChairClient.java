public class ChairClient {
	public static void main(String[] args) {
		Chair defaultChair = new Chair();
		System.out.println(defaultChair.getColor());
		System.out.println(defaultChair.getWheels());

		Chair specificChair = new Chair("Blue", 4);
		System.out.println(specificChair.getColor());
		System.out.println(specificChair.getWheels());
	}
}
