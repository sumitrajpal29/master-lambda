package work;

public class Main {
	public static void main(String[] str) {
		System.out.println("Main working!");
		
		//Using sayhello by creating object
		MyInterImp mii=new MyInterImp();
		mii.sayHello();
		
		
		//Using sayhello by anonymous class
		//This will avoid you to make many classes for Implementation of interface
		//Example 1
		MyInter mi1=new MyInter() {
			
			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("Using anonymous class 1.");
				
			}
		};
		mi1.sayHello();
		
		//Example 2nd
		MyInter mi2=new MyInter() {
			
			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("Using anonymous class 2.");
			}
		};
		mi2.sayHello();
		
		
		//Example 3 using lambda expression
		MyInter mi3=()->System.out.println("mi3 --> using lambda expression");
		
		mi3.sayHello();
		
		
//		SumInter lmbd1=(int a, int b)->{
//			return a+b;
//		};
				
//		SumInter lmbd1=(int a, int b)-> a+b;
		
		SumInter lmbd1=(a,b)->a+b;
		
//		int a=lmbd1.sum(3,70);
		
		System.out.println(lmbd1.sum(3,70));
		
	}
}
