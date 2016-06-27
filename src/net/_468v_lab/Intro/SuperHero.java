/**
 * 
 */
package net._468v_lab.Intro;

/**
 * @author TakuyaEguchi
 *
 */
public class SuperHero extends Hero {
	
	private boolean flying;
	
	public void fly(){
		this.flying = true;
		System.out.println("飛び上がった");
	}
	
	public void land(){
		this.flying = false;
		System.out.println("着地した");
	}
	
	@Override
	public void run(){
		System.out.println("撤退した");
	}
	
	@Override
	public void attack(Matango m){
		System.out.println(this.getName() + "の攻撃");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた");
	}

	/**
	 * @param name
	 */
	public SuperHero(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public SuperHero() {
		// TODO Auto-generated constructor stub
	}

}
