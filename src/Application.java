
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat1 = new Cat();
		cat1.setName("Petra");
		cat1.setColour("Purple");
		cat1.setMammal(true);
		cat1.setNumberOfLegs(4);
		cat1.setAge(23);
		
		Dog dog1 = new Dog();
		dog1.setAge(12);
		dog1.setColour("Yellow");
		dog1.setMammal(true);
		dog1.setName("Roderick");
		dog1.setNumberOfLegs(4);
		
		Elephant elephant1 = new Elephant();
		elephant1.setAge(55);
		elephant1.setColour("Grey");
		elephant1.setMammal(true);
		elephant1.setName("Tina");
		elephant1.setNumberOfLegs(4);
		
		Spider spider1 = new Spider();
		spider1.setAge(2);
		spider1.setColour("Black");
		spider1.setMammal(false);
		spider1.setName("Patricia");
		spider1.setNumberOfLegs(8);
		
		Lion lion1 = new Lion ();
		lion1.setAge(7);
		lion1.setColour("White");
		lion1.setMammal(true);
		lion1.setName("Mufassa");
		lion1.setNumberOfLegs(6);
		
		AnimalShop animalshop1 = new AnimalShop ();
		animalshop1.addAnimal(lion1);
		animalshop1.addAnimal(spider1);
		animalshop1.addAnimal(elephant1);
		animalshop1.addAnimal(cat1);
		animalshop1.addAnimal(dog1);
		
		animalshop1.makeSoundsForAllAnimals(); 
		
	}

}
