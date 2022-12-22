package m;

public class Sportcenter extends Building {
	private String type;
	private boolean bathroom;
	
	public Sportcenter(String type,boolean bathroom) {
		this.type = type;
		this.bathroom  = bathroom;
	}
	public String getDetail() {
		return super.getDetail()+" : "+ type+" : "+bathroom+" : ";
	}
}
