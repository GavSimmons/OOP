
public abstract class Animal {
	protected String name;
	protected int age;
	protected String colour;
	protected boolean mammal;
	protected int numberOfLegs;
	
	
	public abstract void makeSound(); 
	
		
	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name = name;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public boolean isMammal() {
		return mammal;
	}
	public void setMammal(boolean mammal) {
		this.mammal = mammal;
	}
	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
	
}
