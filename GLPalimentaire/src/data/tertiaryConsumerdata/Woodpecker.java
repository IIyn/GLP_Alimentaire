/**
 * 
 */
package data.tertiaryConsumerdata;

import java.util.ArrayList;

import data.Point;
import data.TertiaryConsumer;

/**
 * @author yassin
 *
 */
public class Woodpecker extends TertiaryConsumer {

	/**
	 * 
	 */
	public Woodpecker(int hp, int organicMass, boolean isAlive, int populationDensity, int numberBirths,
			int timeBreeding, int calories, int timeExcreta, boolean sickness, Point point) {
		super();
		setHp(hp);
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
	public String toString() {
		return "Woodpecker [getHp()=" + getHp() + ", getEatenBy()=" + getEatenBy()
				+ ", getDiet()=" + getDiet() + ", getCordinates()=" + getCordinates() + ", getOrganicMass()="
				+ getOrganicMass() + ", getIsAlive()=" + getIsAlive() + ", getPopulationDensity()="
				+ getPopulationDensity() + ", getNumberBirths()=" + getNumberBirths() + ", getTimeBreeding()="
				+ getTimeBreeding() + ", getCalories()=" + getCalories() + ", getTimeExcreta()=" + getTimeExcreta()
				+ ", isSickness()=" + isSickness() + "]";
	}

	@Override
	public void initializeDiet() {
		ArrayList <String> al = new ArrayList <String> ();
		al.add("AsianLadyBug");
		setDiet(al);
		
	}

}
