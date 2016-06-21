package com.tcs.cms.students;
import com.tcs.cms.teachers.Teacher;

public class Student1  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Teacher qwerty =new Teacher();
		qwerty.show2();
		
	//	B obj =new B();
		
		//qwerty.computeMarks();
//in here we make the compute marks method as private so that it can't be acces
//	in other folder or packages but we still made it we call the method compute marks 
// with the help of result method which was made as public ;
	//	qwerty.result();
//and we also can say that it would result in abstraction as it is hiding the process 
//of calling the method of computing marks by making it private, thus we get only result
//not the internal process of marks were computed / this is how abstraction can  be done !		
			
	}

}
