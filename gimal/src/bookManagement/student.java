package bookManagement;

public class student {
	String name;
	String number;
	Double grade;
	
	public student(String name, String number, Double grade) {
		super();
		this.name=name;
		this.number=number;
		this.grade=grade;
	}
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public Double getGrade() {
		return grade;
	}
	
	@Override
	public String toString() {
		return "이름: "+ name+",학번: "+ number+",점수: " +grade;
	}
}
