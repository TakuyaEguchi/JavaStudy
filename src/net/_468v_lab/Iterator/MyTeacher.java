package net._468v_lab.Iterator;

/**
 * My teacher class
 * @author http://www.techscore.com/tech/DesignPattern/Iterator/Iterator2.html/
 *
 */
public class MyTeacher extends Teacher {

	private StudentList studentList;
	
	@Override
	public void createStudentList() {
		// TODO Auto-generated method stub
		studentList = new StudentList(3);
		studentList.add(new Student("Taro",Const.BOY));
		studentList.add(new Student("Jiro",Const.BOY));
		studentList.add(new Student("Hanako",Const.GIRL));
	}

	@Override
	public void callStudents() {
		// TODO Auto-generated method stub
		int size = studentList.getLastNum();
		for(int i = 0; i < size; i++){
			System.out.println(studentList.getStudentAt(i).getName());
		}

	}

}
