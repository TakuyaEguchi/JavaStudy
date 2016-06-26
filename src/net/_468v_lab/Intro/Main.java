/**
 * 
 */
package net._468v_lab.Intro;

/**
 * @author TakuyaEguchi
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 勇者を作成
		Hero minato = new Hero();
		minato.name = "ミナト";
		minato.hp = 100;
		System.out.println("勇者" + minato.name + "が誕生した");
		
		// お化けキノコを作成
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		
		// 冒険の始まり
		minato.sit(5);
		minato.slip();
		minato.sit(25);
		m1.run();
		m2.run();
		minato.run();

	}

}
