package net._468v_lab.Iterator;

/**
 * Student Class
 * @author http://www.techscore.com/tech/DesignPattern/Iterator/Iterator1.html/
 *
 */
public class Student {
	private String name;
	private int sex;	// 0:男 1:女
	
	public Student(String name,int sex){
		this.name = name;
		this.sex = sex;
	}
	
	public String getName(){
		return name;
	}
	
	public int getSex(){
		return sex;
	}

}
