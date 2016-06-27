/**
 * 
 */
package net._468v_lab.Intro;

/**
 * お化けキノコクラス
 * @author TakuyaEguchi
 *
 */
public class Matango {
	int hp = 50;
	private char suffix;
	
	public Matango(char suffix){
		this.suffix = suffix;
	}
	
	public void attack(Hero h){
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.setHp(10);
	}
	
	public void run(){
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した");
	}
	

}
