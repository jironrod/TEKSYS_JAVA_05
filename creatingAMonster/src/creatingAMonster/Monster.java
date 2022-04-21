package creatingAMonster;

// super class
public class Monster {

//	member variables
	private String name;

//	methods
	public String attack() {
		return "Oh no! I don't know how to attack!";
	}

//	public String fireAttack() {
//		return attack() + " " + "with fire";
//	}

//	constructor
	public void setName(String name) {
		this.name = name;
	}

//	getters and setters
	public String getName() {
		return name;
	}

	public Monster(String name) {
		super();
		this.name = name;
	}

}
