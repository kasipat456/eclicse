package m;

public class Hotel extends Building {
	private int  sweetRoomNum;
	private int  starRating;
	
	public Hotel(int sweetRoomNum, int  starRating) {
		this.sweetRoomNum = sweetRoomNum;
		this.starRating = starRating;
}
	public String getDetail() {
		return super.getDetail()+" : "+ sweetRoomNum+": "+starRating+" : ";
		
	}
}
