/**
 * 
 */
package net._468v_lab.Intro;

/**
 * ヒーロクラス
 * @author TakuyaEguchi
 *
 */
public class Hero {
	
	private String name;		// 名前の宣言
	private int hp;				// HPの宣言
	private Sword sword;		// 剣を装備
	static int money;	// Heroで共有する.Staticはクラス1つに用意される
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		if(name == null){
			throw new IllegalArgumentException("名前がnullである。処理を中断");
		}
		if(name.length() <= 1){
			throw new IllegalArgumentException("名前が短すぎる。処理を中断");
		}
		if(name.length() >= 8){
			throw new IllegalArgumentException("名前が長過ぎる。処理を中断");
		}
		this.name = name;
	}
	
	public int getHp(){
		return this.hp;
	}
	
	public void setHp(int hp){
		this.hp = hp;
	}
	
	public Sword getSword(){
		return this.sword;
	}
	
	public void setSword(Sword sword){
		this.sword = sword;
	}
	
	public int getMoney(){
		return Hero.money;
	}
	
	public void setMoney(int money){
		Hero.money = money;
	}
	
	
	
	
	Hero(String name){
		this.hp = 100;
		this.name = name;
	}
	
	Hero(){
		this.hp = 100;
		this.name = "Dammy";
	}
	
	/**
	 * 死亡
	 * GAME OVERを表示
	 */
	private void die(){
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAME OVER");
	}
	
	/**
	 * 攻撃
	 * 敵に5ポイントのダメージを与える
	 */
	void atack(){
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた！");
	}
	
	/**
	 * 逃げる
	 * 逃げて最終HPを表示する
	 */
	public void run(){
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAME OVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
	
	/**
	 * 座る
	 * 座った秒数HPを回復する
	 * @param sec 座った秒数
	 */
	void sit(int sec){
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った");
		System.out.println("HPが" + sec + "ポイント回復した");
	}
	
	public void attack(Matango m){
		
	}
	
	/**
	 * 転ぶ
	 * HPを-5する
	 */
	public final void slip(){
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ！");
		
		if(this.hp <= 0){
			this.die();
		}
		
	}
	
	/**
	 * 眠る
	 * 眠った後はHPが100回復する
	 */
	void sleep(){
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	
	/**
	 * 勇者所持金設定
	 * 
	 */
	static void setRandomMoney(){
		Hero.money = (int)(Math.random() * 1000);
	}

}
