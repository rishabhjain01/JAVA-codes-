
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emplyee saurabh = new Emplyee(25, "saurabh" ,25000, "vaishali","yoyosaurabh@"
				,54321,"Vivek","IT",6);
		saurabh.print();
		saurabh.setMobileno(811611);
		saurabh.getMobileno();
//		System.out.println(saurabh.getMobileno());
		
		System.out.println("*********************************");
		Emplyee nikhil =new Emplyee(54,"nikhil",40000,"barakhamba","yoyonikhil@",
				65432,"vivek","cse",3);
		nikhil.print();
		nikhil.setMobileno(9897);
		
	}

}
