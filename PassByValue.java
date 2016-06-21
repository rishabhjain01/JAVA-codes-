
public class PassByValue {
	
// int x,y ;
 
 
 void show (int x, int y){
	 int a =++x;
	 int b=++y;
	 System.out.println("x is "+a +   "y is "+b);
	 
 }
 
 

	public static void main(String args []){
		PassByValue obj =new PassByValue();
		obj.show(12,133);
		
		
	
}}
