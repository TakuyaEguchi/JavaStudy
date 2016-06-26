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
	
	String name;		// 名前の宣言
	int hp;				// HPの宣言
	Sword sword;		// 剣を装備
	static int money;	// Heroで共有する.Staticはクラス1つに用意される
	
	Hero(String name){
		this.hp = 100;
		this.name = name;
	}
	
	Hero(){
		this.hp = 100;
		this.name = "Dammy";
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
	void run(){
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
	/**
	 * 転ぶ
	 * HPを-5する
	 */
	void slip(){
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ！");
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
