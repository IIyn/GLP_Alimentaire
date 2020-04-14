package data.primaryConsumerdata;

import java.util.ArrayList;

import data.Position;
import data.PrimaryConsumer;

public class Crustacean extends PrimaryConsumer{

	public Crustacean(String name, int hp, int organicMass, boolean isAlive, int populationDensity,
			int numberBirths, int timeBreeding, int calories, int timeExcreta, boolean sickness, Position cordinates) {
		super();
		setName(name);
		setHp(hp);
		setOrganicMass(organicMass);
		setIsAlive(isAlive);
		setPopulationDensity(populationDensity);
		setCaloriesAssimilation(numberBirths);
		setTimeBreeding(timeBreeding);
		setCalories(calories);
		setTimeExcreta(timeExcreta);
		setSickness(sickness);
		setCordinates(cordinates);
		initializeEatenBy();
		initializeDiet();
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
	public void initializeDiet() {
		ArrayList <String> al = new ArrayList <String> ();
		al.add("phytoplanckton");
		setDiet(al);
	}
	
	public void initializeEatenBy() {
		ArrayList <String> al = new ArrayList <String> ();
		al.add("cyprinid");
		setEatenBy(al);
	}

}
