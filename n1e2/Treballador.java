package n1e2;

public class Treballador {
	
	private String name;
	private String surname;
	private int incomeHour;
	
	public Treballador(String name, String surname, int incomeHour) {
		this.name = name;
		this.surname = surname;
		this.incomeHour = incomeHour;
	}
	
	public int calcularSalari(int hores) {
		return (hores * incomeHour);
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public int getIncomeHour() {
		return incomeHour;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void setIncomeHour(int incomeHour) {
		this.incomeHour = incomeHour;
	}

}
