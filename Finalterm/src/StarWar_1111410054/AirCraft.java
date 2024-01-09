package StarWar_1111410054;

public class AirCraft {
	private String Model;
	private double Length;
	private double AirSpeed;
	private String SpaceSpeed;
	private String StdandardEngine;
	private int Passenger;
	
	AirCraft (){		
	}

	protected AirCraft(String Model,double Length,double AirSpeed,String SpaceSpeed,String StdandardEngine,
			int Passenger) {
		this.setModel(Model);
		this.setLength(Length);
		this.setAirSpeed(AirSpeed);
		this.setSpaceSpeed(SpaceSpeed);
		this.setStdandardEngine(StdandardEngine);
		this.setPassenger(Passenger);
	}

	
	@Override
	public String toString() {
		return "AirCraft [Model=" + Model + ", Length=" + Length + ", AirSpeed=" + AirSpeed + ", SpaceSpeed="
				+ SpaceSpeed + ", StdandardEngine=" + StdandardEngine + ", Passenger=" + Passenger + "]";
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public double getLength() {
		return Length;
	}

	public void setLength(double length) {
		Length = length;
	}

	public double getAirSpeed() {
		return AirSpeed;
	}

	public void setAirSpeed(double airSpeed) {
		AirSpeed = airSpeed;
	}

	public String getSpaceSpeed() {
		return SpaceSpeed;
	}

	public void setSpaceSpeed(String spaceSpeed) {
		SpaceSpeed = spaceSpeed;
	}

	public String getStdandardEngine() {
		return StdandardEngine;
	}

	public void setStdandardEngine(String stdandardEngine) {
		StdandardEngine = stdandardEngine;
	}

	public int getPassenger() {
		return Passenger;
	}

	public void setPassenger(int passenger) {
		Passenger = passenger;
	}


	

}
