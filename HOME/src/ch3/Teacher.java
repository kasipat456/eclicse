package ch3;

public class Teacher extends Person {
	private String researchField;
	private int workStartYear;
	public String getResearchField() {
		return researchField;
	}
	public void setResearchField(String researchField) {
		this.researchField = researchField;
	}
	public int getWorkStartYear() {
		return workStartYear;
	}
	public void setWorkStartYear(int workStartYear) {
		this.workStartYear = workStartYear;
	}
	
}
