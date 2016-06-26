/**
 * 
 */
package net._468v_lab.Intro;

/**
 * 魔法使いクラス
 * @author TakuyaEguchi
 *
 */
public class Wizard {
	String name;
	int hp;
	void heal (Hero hero){
		hero.hp += 10;
		System.out.println(hero.name + "のHPを10回復した！");
	}
}
