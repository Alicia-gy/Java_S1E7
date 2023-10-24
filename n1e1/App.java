package n1e1;

public class App {
	
	public static void main(String[] args) {
		
		TreballadorPresencial obj1 = new TreballadorPresencial("persona", "apellido", 10, 20);
		System.out.println(obj1.calcularSalari(100)); //se multiplica el 10*100 y debido al override se suman los otros 20 dados en el constructor
		
		TreballadorOnline obj2 = new TreballadorOnline("persona", "apellido", 10);
		System.out.println(obj2.calcularSalari(100)); //se hace el mismo calculo pero en su lugar se suman los 30 de la constante

	}
}
