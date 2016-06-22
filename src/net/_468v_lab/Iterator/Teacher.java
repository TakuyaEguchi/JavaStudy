package net._468v_lab.Iterator;

/**
 * Teacher's abstract class
 * @author http://www.techscore.com/tech/DesignPattern/Iterator/Iterator1.html/
 *
 */
public abstract class Teacher {
	protected StudentList studentList;
	
	public abstract void createStudentList();
	public abstract void callStudents();

}
