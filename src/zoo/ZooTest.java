package zoo;

public class ZooTest {
	public static void main(String[] args) {
		Gorilla jeff = new Gorilla("Jimmy", 550, "siverback");
		jeff.toString();
		System.out.println(jeff);
		jeff.throwSomething();
		System.out.println(jeff);
		jeff.toString();
		System.out.println(jeff);
		jeff.eatBananas();
		System.out.println(jeff);
		jeff.hasClimed();
		System.out.println(jeff);
		jeff.fullDay();
		System.out.println(jeff);
	}
}