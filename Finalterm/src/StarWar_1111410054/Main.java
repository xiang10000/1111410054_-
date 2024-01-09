package StarWar_1111410054;

public class Main {

	public static void main(String[] args) {
		AirCraft Tie01   = new AirCraft("Twin IonEngine LineStarfighter",6.3,1200,"4100G","SFS P-s4 雙離子引擎",1);
		AirCraft XWing01 = new AirCraft("Incom Corporation T-65B X-Wing SpaceSuperiority Fighter"
				,12.5,1050,"100MGL","80MGLT",2);
		
		
		Tie01.toString();
		System.out.printf("%s%n", Tie01);
		XWing01.toString(); 
		System.out.printf("%s%n", XWing01);
	}

}
