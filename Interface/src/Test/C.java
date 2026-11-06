package Test;

public class C  implements  A, B  {
	public void methodA(){ System.out.println("viens on mange"); } 
	public void methodB(){ System.out.println("lathiri"); } 
	public void otherMethod(){ System.out.println("haako"); } 
	public static void main(String[] args) { 
		C ab = new C(); 
		ab.methodA(); 
		ab.methodB(); 
		ab.otherMethod();
		}


}
