/**
 * 
 */
package net._468v_lab.Intro;

/**
 * @author TakuyaEguchi
 *
 */
public class PoisonMatango extends Matango {

	private int poisonCount = 5;
	
	/**
	 * @param suffix
	 */
	public PoisonMatango(char suffix) {
		super(suffix);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void attack(Hero h){
		super.attack(h);
		if(0 < poisonCount){
			System.out.println("さらに毒の胞子をばらまいた！");
			int damage = h.getHp() / 5;
			h.setHp(h.getHp() - damage);
			System.out.println(damage + "のダメージ");
			this.poisonCount--;
		}
	}
	
	

}
