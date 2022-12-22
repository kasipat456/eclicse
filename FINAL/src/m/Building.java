package m;

public class Building {
	private double height;
	private String color;
	
	public void Hotel(double height, String color) {
		this.color = color;
		this.height = height;
	}
	public String getDetail() {
		return color+" : "+height+": ";
		
	}
}
