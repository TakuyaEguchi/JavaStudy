/**
 * 
 */
package net._468v_lab.Intro;

import java.util.Random;

/**
 * 聖職者クラス
 * @author TakuyaEguchi
 *
 */
public class Cleric {
	String name;
	
	/**最大HP*/
	final int MAXHP = 50;
	/**最大MP*/
	final int MAXMP = 10;
	
	int hp = 10;
	int mp = 10;
	
	/**
	 * セルフエイド
	 * MPを5消費し、HPを最大値まで回復する
	 */
	void selfAid(){
		if(this.mp < 5){
			System.out.println("MPが足りません！");
		}else{
			this.mp -= 5;
			this.hp = MAXHP;
			
			System.out.println(this.name + "はセルフエイドを使った！");
			System.out.println("HP:" + this.hp);
			System.out.println("MP:" + this.mp);
		}
	}
	

	/**
	 * 祈る
	 * 秒数に応じてランダムでMPを回復
	 * @param praySec 祈った時間
	 * @return　実際に回復したMPの量
	 */
	int pray(int praySec){
		int recoveryMp = new Random().nextInt(3) + praySec;	// 補正0~2 + 秒数
		
		int recoverActual = Math.min(MAXMP, recoveryMp);
		
		this.mp += recoverActual; 
		
		System.out.println(this.name + "は祈った！");
		System.out.println("MPが" + recoverActual + "回復した");
		
		return recoverActual;
	}

}
