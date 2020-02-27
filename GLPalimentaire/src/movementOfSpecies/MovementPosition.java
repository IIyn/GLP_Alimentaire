package movementOfSpecies;

import data.Position;
import data.Species;

public class MovementPosition {

	public MovementPosition(int size) {
	}

	public void moveleft(Position position) {
		int x=position.getX();
		x--;
		position.setX(x);
	}
	
	public void moveright(Position position) {
		int x=position.getX();
		x++;
		position.setX(x);
	}
	
	public void movetop(Position position) {
		int y=position.getY();
		y++;
		position.setY(y);
	}
	
	public void movebot(Position position) {
		int y=position.getY();
		y--;
		position.setY(y);
	}
	
	public Species getAssociatedBeing(Position position, Species being) {		
		return being;
	}
	
	public void seeking() {
		//double fort de -size � size
		// formule (x - center_x)^2 + (y - center_y)^2 < radius^2
	}
}
