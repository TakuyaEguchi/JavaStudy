/**
 * 
 */
package net._468v_lab.Intro;

/**
 * 杖クラス
 * @author TakuyaEguchi
 *
 */
public class Wand {
	private String name;
	private double power;
	static final double MAXPOWER = 100;
	
	Wand(String name,double power){
		this.name = name;
		this.power = power;
	}
	
	Wand(String name){
		this(name,MAXPOWER);
	}
	
	Wand(){
		this("ダミー",MAXPOWER);
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
	
	public double getPower(){
		return this.power;
	}
	
	public void setPower(double power){
		if(power < 0.5){
			throw new IllegalArgumentException("増幅率は0.5以上100以下です");
		}
		
		if(100.0 < power){
			throw new IllegalArgumentException("増幅率は0.5以上100以下です");
		}

		this.power = power;
	}
	
	

}
