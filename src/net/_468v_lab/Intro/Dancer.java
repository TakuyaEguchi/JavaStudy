/**
 * 
 */
package net._468v_lab.Intro;

/**
 * @author TakuyaEguchi
 *
 */
public class Dancer extends Character {

	public void dance(){
		System.out.println(this.name + "は情熱的に踊った");
	}
	
	/* (non-Javadoc)
	 * @see net._468v_lab.Intro.Character#attack(net._468v_lab.Intro.Matango)
	 */
	@Override
	public void attack(Matango m) {
		// TODO Auto-generated method stub
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;

	}

}
