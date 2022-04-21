package creatingAMonster;

public class TestMonster {

	public static void main(String[] args) {
//		TESTING
//		Monster m = new Monster("Fire");
//		System.out.println(m);
//		String fire = m.getName();
//		System.out.println(fire + " Monster");
//		Monster m = new Monster("fire");
//		String fireMonster = m.attack();
		
//		instantiate Fire, Water, Stone Monster subclasses 
		Monster m1 = new FireMonster("Ragnaros");
		Monster m2 = new WaterMonster("Water Elemental");
		Monster m3 = new StoneMonster("Malphite");
	
//		somewhat correct
//		String fire = m1.attack();
//		String water = m2.attack();
//		String stone = m3.attack();
		
//		Print attack methods of each Monster
		System.out.println(m1.attack());
		System.out.println(m2.attack());
		System.out.println(m3.attack());
		
//		m1 dies, replace with new Stone Monster
		m1 = new StoneMonster("Petrificus");
		System.out.println(m3.attack());
		
		Monster m4 = new Monster("Uknown");
		System.out.println(m4.attack());
	}

}
