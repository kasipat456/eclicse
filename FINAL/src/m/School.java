package m;

public class School extends Building {
	private int internet;
	private int meetingRoomnum;
	
	public void school(int internet,int meetingRoomnum) {
		this.internet  = internet;
		this.meetingRoomnum = meetingRoomnum;
		
	}
	public String getDetail() {
		return super.getDetail()+" : "+internet+" : "+meetingRoomnum+" : ";
	}
}
