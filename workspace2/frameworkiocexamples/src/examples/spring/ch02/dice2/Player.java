package examples.spring.ch02.dice2;

public class Player {

	Dice dice;
	int totalValue = 0;

	public Player() {
		System.out.println("Player 积己 肯丰");
	}

	/*public Player(Dice dice) {
		this.dice = dice;
		System.out.println("Player 积己 肯丰.");
	}*/

	public void setDice(Dice dice) {
		this.dice = dice;
	}

	public void play() {
		for (int i = 0; i < 3; i++) {
			totalValue += dice.getDiceValue();
		}
	}

	public int getTotalValue() {
		return totalValue;
	}

}
