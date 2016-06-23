package net._468v_lab.Iterator;

/**
 * My teacher class
 * @author http://www.techscore.com/tech/DesignPattern/Iterator/Iterator2.html/
 *
 */
public class MyTeacher extends Teacher {

	private MyStudentList myStudentList;
	
	@Override
	public void createStudentList() {
		// TODO Auto-generated method stub
		myStudentList = new MyStudentList(3);
		myStudentList.add(new Student("Taro",Const.BOY));
		myStudentList.add(new Student("Jiro",Const.BOY));
		myStudentList.add(new Student("Hanako",Const.GIRL));
	}

	@Override
	public void callStudents() {
		// TODO Auto-generated method stub
		Iterator itr = myStudentList.iterator();
		while(itr.hasNext()){
			System.out.println(((Student)itr.next()).getName());
		}

	}

}
