package n1e2;

public class TreballadorOnline extends Treballador {
	
	private static final int internet = 30;
	
	public TreballadorOnline(String name, String surname, int incomeHour) {
		super(name, surname, incomeHour);
	}
	
	@Override
	public int calcularSalari(int hores) {
		return (hores * super.getIncomeHour() + internet);
	}
	
	@Deprecated
	public String name() {
		return super.getName();
	}
	
	

}
