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
		// 剣を作成
		Sword sword = new Sword();
		sword.name = "炎の剣";
		sword.damage = 10;
		
		// 勇者を作成
		Hero minato = new Hero();
		minato.name = "ミナト";
		minato.hp = 100;
		minato.sword = sword;

		System.out.println("勇者" + minato.name + "が誕生した");
		System.out.println("現在の武器は" + minato.sword.name);
		
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
