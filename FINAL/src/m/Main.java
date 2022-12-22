package m;

public class Main {

	public static void main(String[] args) {
		Building[] bul = new Building[3];
		bul[0] = new Hotel(1101,5);
		
		bul[2] = new Sportcenter("football sportcenter",true);

		for(Building data : bul) {
			System.out.println(data.getDetail());
		}
	}

}
