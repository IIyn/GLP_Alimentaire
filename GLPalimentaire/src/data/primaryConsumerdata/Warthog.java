package data.primaryConsumerdata;

import java.util.ArrayList;

import data.PrimaryConsumer;

public class Warthog extends PrimaryConsumer{

	public Warthog(int hp, ArrayList<String> eatenBy, ArrayList<String> diet, int organicMass, boolean isAlive, int populationDensity, int numberBirths, int timeBreeding, int calories, int timeExcreta, boolean sickness) {
		super();
		setHp(hp);
		setEatenBy(eatenBy);
		setDiet(diet);
		setOrganicMass(organicMass);
		setIsAlive(isAlive);
		setPopulationDensity(populationDensity);
		setNumberBirths(numberBirths);
		setTimeBreeding(timeBreeding);
		setCalories(calories);
		setTimeExcreta(timeExcreta);
		setSickness(sickness);
		initializeEatenBy();
		initializeDiet();
	}
	@Override
	public void initializeEatenBy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initializeDiet() {
		// TODO Auto-generated method stub
		
	}

}