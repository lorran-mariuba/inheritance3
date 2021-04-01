package entities;

public class Employee {

	private String name;
	private Integer hours;
	private Double valuePersHours;
	
	public Employee() {
	}

	public Employee(String name, Integer hours, Double valuePersHours) {
		this.name = name;
		this.hours = hours;
		this.valuePersHours = valuePersHours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePersHours() {
		return valuePersHours;
	}

	public void setValuePersHours(Double valuePersHours) {
		this.valuePersHours = valuePersHours;
	}
	
	public double payment() {
		return hours * valuePersHours;
	}
}
