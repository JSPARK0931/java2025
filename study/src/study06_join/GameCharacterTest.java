package study06_join;

public class GameCharacterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameCharacter c1 = new Warrior("전사", 100, 200, "장검");
		c1.showInfo();
		c1.attack();
				
		GameCharacter c2 = new Mage("법사", 50, 100, "원거리");
		c2.showInfo();
		c2.attack();
		
		GameCharacter c3 = new Archer("궁수", 60, 120, "불화살");
		c3.showInfo();
		c3.attack();
		
		System.out.println("============================");
		Warrior w1 = (Warrior) c1;
		w1.defend();
		Mage m1 = (Mage) c2;
		m1.teleport();
		Archer a1 = (Archer) c3;
		a1.hide();
	}

}
