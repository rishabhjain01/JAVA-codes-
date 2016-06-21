
public class Emplyee {

	
	private int employeeno;
	private String name;
	private int salary;
	private String address;
	private String email;
	private int mobileno;
	private String managerName;
	private String departmentName;
	private int experience;
	//private int HRA;
	//private int DA;
	//private int TA;
 private  int providentFund;

	Emplyee(){
	//	int providentFund = 5000;
		
	//	System.out.println("the provident fund of this employee is" +providentFund);
		 
	/*	int HRA = (salary*30)/100;
		int DA = (salary*20)/100;
		int TA= (salary*10)/100;
		System.out.println("the HRA is " +HRA);
		System.out.println("the DA is " +DA);
		System.out.println("the TA is " +TA);
		int totalSalary = salary + HRA +DA+TA-providentFund;
		System.out.println("the total salary is " +totalSalary);*/
	}
	
	Emplyee(int employeeno, String name , int salary, String address, 
			String email,int mobileno, String managerName,String departmentName, 
			int experience/*,int HRA,int DA,int TA*/ ){
		this();
		this.employeeno=employeeno;
		this.name=name;
		this.salary=salary;
		this.address=address;
		this.email=email;
		this.mobileno=mobileno;
		this.managerName=managerName;
		this.departmentName=departmentName;
		this.experience=experience;
		//this.HRA=HRA;
		//this.DA=DA;
		//this.TA=TA;

		 	int HRA = (salary*30)/100;
			int DA = (salary*20)/100;
			int TA= (salary*10)/100;
			int providentFund = 5000;
			System.out.println("->the provident fund of this employee is" +providentFund);
			int totalSalary = salary + HRA +DA+TA- providentFund;
			System.out.println("-->the total salary is " +totalSalary);
			System.out.println("-->the HRA is " +HRA);
			System.out.println("-->the DA is " +DA);
			System.out.println("-->the TA is " +TA);
		
	}
	public int getMobileno() {
		return mobileno;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}


	void print(){
		System.out.println("->the employee no. is "+employeeno);
		System.out.println("->the employee name is "+name);
		System.out.println("->the employee salary is "+salary);
		System.out.println("->the employee address is "+address);
		System.out.println("->the employee email is "+email);
		System.out.println("->the employee mobile no. is "+mobileno);
		System.out.println("->the manager name of employee is is "+managerName);
		System.out.println("->the department name of employee is  "+departmentName);
		System.out.println("->the experience of employee is "+experience);
		
		//System.out.println("the HRA of employee is "+HRA);
		//System.out.println("the DA of employee is "+DA);
		//System.out.println("the TA of emloyee  is "+TA);
		
		//System.out.println("the total salary of employee is   "+totalSalary);
	
	
	
	
	
}
	}