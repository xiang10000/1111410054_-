package StarWar_1111410054;

public class XWing extends AirCraft  {
	private String HyperSpaceEngine;
	static final String[] Weapon= {"Taim & Bak KX9 雷射加農炮","Taim & Bak KX9 雷射加農炮",
			"Taim & Bak KX9 雷射加農炮","Taim & Bak KX9 雷射加農炮",
			"Krupx MG7 質子魚雷發射器","Krupx MG7 質子魚雷發射器"}; 
	static final double[] Weapon_power={1000,1000,1000,1000,5,5};
	static final String[] Shield= {"DefenderDeflector-ScreenProjector","DeflectorShield Projector",
			"鈦合金加勁外殼"};	
	static final double[] ShieldPower = {2000,3000,1000};
			
	protected XWing(String HyperSpaceEngine){
		this.setHyperSpaceEngine(HyperSpaceEngine);
	}			


	
	@Override
	public String toString() {
		return "XWing [HyperSpaceEngine=" + HyperSpaceEngine + "]";
	}
	
	public String getHyperSpaceEngine() {
		return HyperSpaceEngine;
	}
	public void setHyperSpaceEngine(String hyperSpaceEngine) {
		HyperSpaceEngine = hyperSpaceEngine;
	}
	public static String[] getWeapon() {
		return Weapon;
	}
	
	public static double[] getWeaponPower() {
		return Weapon_power;
	}
	

	public static String[] getShield() {
		return Shield;
	}


	public static double[] getShieldpower() {
		return ShieldPower;
	}
	
	
	
	
	
}
