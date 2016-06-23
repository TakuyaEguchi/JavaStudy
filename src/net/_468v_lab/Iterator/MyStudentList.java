package net._468v_lab.Iterator;

public class MyStudentList extends StudentList implements Aggregate{

	public MyStudentList() {
		// TODO Auto-generated constructor stub
		super();
	}

	public MyStudentList(int studentCount) {
		super(studentCount);
		// TODO Auto-generated constructor stub
	}
	
	public Iterator iterator(){
		return new MyStudentListIterator(this);
	}

}
