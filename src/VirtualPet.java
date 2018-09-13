
public class VirtualPet extends Animal {
	
	String type;
	double priceOfVirtualPet;
	int happiness;
	int thirst;
	
	
	// This constructor requires the new parameters from VirtualPet class and the inherited parameters from the extended  Animal class
	public VirtualPet(int structure, int hunger, String name, String type, double priceOfVirtualPet, int happiness,
			int thirst) {
		super(structure, hunger, name);
		this.type = type;
		this.priceOfVirtualPet = priceOfVirtualPet;
		this.happiness = happiness;
		this.thirst = thirst;
	}

	

	// This constructor requires only the inherited parameters
	public VirtualPet(int structure, int hunger, String name) {
		super(structure, hunger, name);
		// TODO Auto-generated constructor stub
	}



	//default constructor 
	public VirtualPet() {
		
	}
	
	
	

}
