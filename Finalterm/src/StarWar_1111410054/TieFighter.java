package StarWar_1111410054;

public class TieFighter extends AirCraft {
	private String Manufacturer;
	static final String [] Weapon={"SFS L-s1 型雷射加農炮","SFS L-s1 型雷射加農炮"};
	static final double[]Weapon_power={1000,1000};
	
	protected TieFighter(String Manufacturer){		
		this.setManufacturer(Manufacturer);
	}	
	
	
	@Override
	public String toString() {
		return "TieFighter [Manufacturer=" + Manufacturer + "]";
	}

	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	public static String[] getWeapon() {
		return Weapon;
	}
	public static double[] getWeaponPower() {
		return Weapon_power;
	}
}
