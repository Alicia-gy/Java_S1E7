package n1e2;

public class TreballadorPresencial extends Treballador {
	
	private static int benzina;
	
	public TreballadorPresencial(String name, String surname, int incomeHour, int benzina) {
		super(name, surname, incomeHour);
		TreballadorPresencial.benzina = benzina;
	}
	
	@Override
	public int calcularSalari(int hores) {
		return (hores * super.getIncomeHour() + benzina);
	}
	
	@Deprecated
	public void printMessage(String message) {
		System.out.println(message);
	}

}
