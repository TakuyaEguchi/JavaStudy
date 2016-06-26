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
		
		// 大剣を作成
		Sword bigSword = new Sword();
		bigSword.name = "大剣";
		bigSword.damage = 15;
		
		// 勇者ミナトを作成
		Hero minato = new Hero("ミナト");
		minato.sword = sword;
		
		Hero.setRandomMoney();

		System.out.println("勇者" + minato.name + "が誕生した");
		System.out.println("現在の武器は" + minato.sword.name);
		System.out.println("ヒーロの所持金は" + Hero.money);
		
		System.out.println("ミナトの所持金でも表示はされる" + minato.money);
		
		
		// 勇者アサカを作成
		Hero asaka = new Hero("アサカ");
		asaka.sword = bigSword;
		
		// 魔法使いスガワラを作成
		Wizard sugawara = new Wizard();
		sugawara.hp = 50;
		sugawara.heal(minato);
		sugawara.heal(asaka);
		
		// 聖職者ラキを作成
		Cleric Raki = new Cleric("ラキ");
		System.out.println("聖職者" + Raki.name +"が誕生した");
		System.out.println("HP" + Raki.hp);
		System.out.println("MP" + Raki.mp);		
		
		
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
