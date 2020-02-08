package data.tertiaryConsumerdata;

import java.util.ArrayList;

import data.TertiaryConsumer;

public class SaltCrocodile extends TertiaryConsumer{

	public SaltCrocodile(int hp, ArrayList<String> eatenBy, ArrayList<String> diet, int organicMass, boolean isAlive, int populationDensity, int numberBirths, int timeBreeding, int calories, int timeExcreta, boolean sickness) {
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