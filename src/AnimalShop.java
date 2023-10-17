import java.util.ArrayList;
import java.util.List;

public class AnimalShop {

	private List<Animal> animals = new ArrayList<>();

	public void addAnimal(Animal animal) {
		animals.add(animal);

	}

	public void makeSoundsForAllAnimals() {
		for (Animal animal : animals) {
			animal.makeSound();
		}
	}
}
