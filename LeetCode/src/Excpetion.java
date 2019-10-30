
public class Excpetion{

	
	/*public Excpetion(int balance) {
		try {
			int c = balance/2;
			
		}catch(Exception e)
		{
			System.out.println("Dividing by 0..!!");
		}
		finally{
			System.out.println("Executed anyways");
		}
	}*/
	
	class InsufficientBalance{
		void InsufficientBalance(String x) {
			System.out.println(x);
		}
		
	}
	
	public static void main(String args[]) {
	
		
		//new Excpetion(100);
		
		try {
			checkBalance(-5);
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
		
	}
	

	public static void checkBalance(int balance) throws Exception {
		//int[6]
		if(balance<0)
			throw new Exception("Insufficient balance");
	}
}
