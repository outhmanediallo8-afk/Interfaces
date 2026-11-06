package Test;

public class ClassAB  implements AB { 
	public void methodA(){ System.out.println("A"); } 
	public void methodB(){ System.out.println("B"); } 
	public void otherMethod(){ System.out.println("blablah"); } 
	public static void main(String[] args) { 
		ClassAB ab = new ClassAB(); 
		ab.methodA(); 
		ab.methodB(); 
		ab.otherMethod();
		}

}
