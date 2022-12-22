package ch3;

public class Alumni extends Student {
	private String career;
	private boolean singleStatus;
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public boolean isSingleStratus() {
		return singleStatus;
	}
	public void setSingleStratus(boolean singleStratus) {
		this.singleStatus = singleStratus;
	}
	
}
