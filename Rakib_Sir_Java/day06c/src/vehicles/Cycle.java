package vehicles;

public class Cycle {
	private String type;
	private boolean horn;
	private String cyclebrand;
	
	Cycle() {
		setType("Mountain Bike");
	}
	
	void setCycleBrand(String cyclebrand) {
		this.cyclebrand = cyclebrand;
	}
	
	String getCycleBrand() {
		return cyclebrand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
	
	
}

