
class Father
{
	 int age;
	 int income;
	 public void gym()
	 {
	   System.out.println("He is "+ age + " years old");
	   System.out.println("He Workout for 1 hour daily");
	 }
	 
	 public Father()
	 {
	    System.out.println("Default constructor of Father class");
	 }
	 
	 public Father(int x , int y)
	 {
		 this();
		System.out.println("Parameterized constructor of Father class");
		age = x;
		income = y;
		System.out.println("Father- age="+ age + "  income=" + income);
	 }
}



class Son1 extends Father
{
	 
	 Son1()
	 {
	   super(50,50000);
	   System.out.println("Default constructor of Son1 class");
	 }
	 
	 Son1(int x , int y)
	 {
		 this();
		 System.out.println("Parameterized constructor of Son1 class");
		 age = x;
		 income=y;
	 }
}


public class ConstructorInheritance {

	public static void main(String[] args) {
		
		Son1 s1 = new Son1(25,25000);
	    System.out.println("Son1- age=" + s1.age + "  income=" + s1.income);

	}

}

