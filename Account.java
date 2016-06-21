//import ISADemo.Account;
// when we use the keyword abstract with the class then the object for that particular 
//class can not be made 
abstract class Account {
	//public int  hashCode(){
		//return 100;
		//System.out.println("hash code is "+ca.hashCode());
	//}
	public void deposition()
	{
	System.out.println("deposition of  money ");
	}
	public void withdrawl()
	{
	System.out.println("withdrawl of money");
	}
	abstract void roi();
	// if the method is abstract then we can not define that method in the same class
	//but it must be defined further into all its child classes
	//{
		//System.out.println(" its a RateOfInterest method");
	//}
}


 class CurrentAccount extends Account{
	void roi()
		{
		System.out.println("interest has to be given at the rate of 5%");
		
		}
}
 
 
class SavingAccount extends Account{
		 void roi ()
		{
			System.out.println("interest is given by bank at the rate of 1%");
		}
	}
// there is a principle in java that must be follow and 
//and that is open close principle which simply means 
//open for inheritence but close for modification that is 
//overriting (SOLID)
// S- SRP,O-OenClose,D-DRY
/*final*/ class W{
	private final void print(){
	//we use final with method so that the method can't be 
//		overrite further.
		//and final with class is used so that it
		//can't be inherit further , 
// Now if we use private with any method then that means
//	it woud not be avaliable for the further classes we make 
//	under the principle of inheritence. 	
		System.out.println("i am in class W");	
	}
	
}
class W1 extends W{
	
//	@override
	//void print(){
		//System.out.println("i am in class W1");
		
//	}
}
/*abstract*/  final  class P{
// both abstract and final keyword can't be use simultaneously
//beacuse they both oppose each other as abstract says do 
//inheritence and final itself says don't do inheritence
	 final int MAX_AGE;
	int x,y;
	
P(){
	MAX_AGE=100;
// this is the default constructor method for initialising the
//value of any  constant and we also can initialise its
	//value through parameterised constructor , now 	
}
P(int x){
	this();
	//this.x=x;
	//MAX_AGE=this.x;
	 //System.out.println("MAX_AGE is"+MAX_AGE);
	
//so here either we give the value to constant MAX_AGE 
//just by calling the default constructor or equalizing the 
//entered number first with the instance variable and then 
//equalizing it with your constant i.e., MAX_AGE;
}
}
class P1 extends P{
	
}


	 