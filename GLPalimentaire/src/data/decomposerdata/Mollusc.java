package data.decomposerdata;

import java.util.ArrayList;

import data.Decomposer;

public class Mollusc extends Decomposer{

	public Mollusc(ArrayList<String> diet, int organicmass, int populationdensity) {
		super();
		setDiet(diet);
		setOrganicMass(organicmass);
		setPopulationDensity(populationdensity);
		initializeDiet();
	}
	
	@Override
	public void initializeDiet() {
		// TODO Auto-generated method stub
		
	}
}