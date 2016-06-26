/**
 * 
 */
package net._468v_lab.Intro;

/**
 * @author TakuyaEguchi
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.勇者を作成
		Hero minato = new Hero();
		
		// 2.フィールドに初期値を設定
		minato.name = "ミナト";
		minato.hp = 100;
		System.out.println("勇者" + minato.name + "が誕生した");
		
		// 3.勇者メソッドを呼び出し
		minato.sit(5);
		minato.slip();
		minato.sit(25);
		minato.run();

	}

}
