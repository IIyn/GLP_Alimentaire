package data.secondaryConsumerdata;

import java.util.ArrayList;

import data.Position;
import data.SecondaryConsumer;

public class Hyena extends SecondaryConsumer{

	public Hyena(String name, int hp, int organicMass, boolean isAlive, int populationDensity,
			int caloriesAssimilation, int timeBreeding, int calories, int timeExcreta, boolean sickness, Position cordinates) {
		super();
		setName(name);
		sethp(hp);
		setOrganicMass(organicMass);
		setIsAlive(isAlive);
		setPopulationDensity(populationDensity);
		setCaloriesAssimilation(caloriesAssimilation);
		setTimeBreeding(timeBreeding);
		setCalories(calories);
		setTimeExcreta(timeExcreta);
		setSickness(sickness);
		setCordinates(cordinates);
		initializeEatenBy();
		initializeDiet();
	}
	public Hyena() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String Prey() {
		ArrayList<String> animals=getEatenBy();
		return ""+animals;
	}
	public String Predator() {
		ArrayList<String> animals=getDiet();
		return ""+animals;
	}
	@Override
	public void initializeEatenBy() {
		ArrayList <String> eatenBy = new ArrayList <String> ();
		eatenBy.add("lion");
		setEatenBy(eatenBy);
	}

	@Override
	public void initializeDiet() {
		ArrayList <String> diet = new ArrayList <String> ();
		diet.add("gazelle");
		diet.add("warthog");
		diet.add("buffalo");
		diet.add("zebra");
		setDiet(diet);
	}
}
