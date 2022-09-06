package question6;



public class Child extends parrent{
	
	public static void main(String[] args) {
		Child p=new Child();
		
		try {
			p.Parrent();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		p.fun1();
	}

}
