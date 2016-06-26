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
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	public int getHp(){
		return this.hp;
	}
	
	public void setHp(int hp){
		if(hp < 0){
			hp = 0;
		}
		this.hp = hp;
	}
	
	public int getMp(){
		return this.mp;
	}
	
	public void setMp(int mp){
		if(mp < 0){
			mp = 0;
		}
		this.mp = mp;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		if(name == null){
			throw new IllegalArgumentException("名前がnullである。処理を中断");
		}
		
		if(name.length() < 3){
			throw new IllegalArgumentException("名前は3文字以上で設定しなければならない。処理を中断");
		}
		this.name = name;
	}
	
	public Wand getWand(){
		return this.wand;
	}
	
	public void setWand(Wand wand){
		if(wand == null){
			throw new IllegalArgumentException("杖がnullは不可");
		}
		this.wand = wand;
	}
	
	public 
	
	void heal (Hero hero){
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.wand.getPower());
		hero.setHp(hero.getHp() + recovPoint);
		System.out.println(hero.getName() + "のHPを"+ recovPoint + "回復した！");
	}
}
