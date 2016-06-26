/**
 * 
 */
package net._468v_lab.Intro;

/**
 * @author TakuyaEguchi
 *
 */
public class Hero {
	
	String name;	// 名前の宣言
	int hp;			// HPの宣言
	void atack(){}
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

}
