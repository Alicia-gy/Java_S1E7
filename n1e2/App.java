package n1e2;

public class App {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		TreballadorPresencial obj1 = new TreballadorPresencial("persona", "apellido", 10, 20);
		TreballadorOnline obj2 = new TreballadorOnline("persona", "apellido", 10);
		
		obj1.printMessage("Aquests metodes son deprecated");
		System.out.println(obj2.name());
	}
}
