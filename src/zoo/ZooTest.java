package zoo;

public class ZooTest {
	public static void main(String[] args) {
		Gorilla gorilla1 = new Gorilla("Jimmy", 550, "siverback");
		gorilla1.toString();
		
		Bat bat1 = new Bat("David", 120, "Vampire bat");
		bat1.toString();
		System.out.println(bat1);
		bat1.fullDay(bat1);
	}
}