/**
 * 
 */
package net._468v_lab.Iterator;

/**
 * @author TakuyaEguchi
 *
 */
public class MyStudentListIterator implements Iterator {
	
	private MyStudentList myStudentList;
	private int index;

	public MyStudentListIterator(MyStudentList list) {
		// TODO Auto-generated constructor stub
		this.myStudentList = list;
		this.index = 0;
		
	}

	/* (non-Javadoc)
	 * @see net._468v_lab.Iterator.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(myStudentList.getLastNum() > index){
			return true;
		}else{
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see net._468v_lab.Iterator.Iterator#next()
	 */
	@Override
	public Student next() {
		// TODO Auto-generated method stub
		Student s = myStudentList.getStudentAt(index);
		index++;
		return s;
	}

}
