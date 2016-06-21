package com.tcs.cms.teachers;
import java.util.Scanner;


// pass by reference ---> passing the reference of the created object i.e., course
/*public  class  Teacher{
	public  void show2(){
	Scanner scanner = new Scanner (System.in);
	System.out.println("enter the course Name");
	String courseName = scanner.next();
	System.out.println("enter the id ");
	String id = scanner.next();
	System.out.println("enter the description");		
	String desc = scanner.next();
	Course course = new Course();
	course.setCourseName(courseName);
	course.setId(id);
	course.setDesc(desc);
	Logic logic = new Logic();
	logic.storeCourseInDb(course);
	 }
 }	
	

 class Logic{
	 void storeCourseInDb(Course course){
		System.out.println("course name is " +course.getCourseName() + " id is " +course.getId() + "description is "
	 + course.getDesc() ); 
		 
	 }
	 
 }
 
 class Course{
	 String courseName ;
	 String id ;
	 String desc;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	 
	*/ 
 



/*public class Teacher {

	
		
		public void attendance(){
			System.out.println("attendance is ");
			
		}
		//private  has a scope within the class
		//default has a scope within the package 
		//protected has a scope within package and outside the package through inheritence
		//public has a scope even outside the package; 
		void computeMarks(){
			System.out.println("computing marks ....");
		}
		public void result(){
			computeMarks();
			System.out.println("printing the final result ");
		}
		
}
 class A{
	 protected void show(){
		  System.out.println("i am in class A");
	  }
	 
 }
  class B extends A{
	 @Override
	 public void show(){
//while doing method overriding we can only increase the scope of method wrt order
//		 private->default->protected->public / now signature has been changed!
		 System.out.println("public was used in my method ");
		 
	 }*/
	
 }
 

	


