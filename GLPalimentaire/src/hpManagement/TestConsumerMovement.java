package hpManagement;

public class TestConsumerMovement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsumerMovement consumermv = new ConsumerMovement();
		System.out.println(consumermv.toString());
		
		System.out.println("Affichage des caract�ristiques de l'animal apr�s s'�tre faite mang�");
		consumermv.EatIfPossible();
		System.out.println(consumermv.toString());
		
	}

}
