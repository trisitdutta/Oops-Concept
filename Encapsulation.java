class Student {
	
	private String name;
	private int rollNo;
	private double marks;
	
	Student(String name,int rollNo,double marks)      // Constructor of Student class
	{
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		
	}
	
	public String getName()             // Getter method
	{
	   return name;
	}
	
	public void setName(String name)    // Setter method
	{
		this.name = name;
	}
	
	public int getRollNo()             // Getter method   
	{
		return rollNo;
	}
	
	public void setRollNo(int rollNo)    // Setter method
	{
		this.rollNo = rollNo;
	}
	
	public double getMarks()            // Getter method
	{
		return marks;
	}
	
	public void setMarks(double marks)     //Setter method
	{
		this.marks = marks;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		
	   Student s1 = new Student("Purnima",14,82.43);
	   Student s2 = new Student("Rakhi",24,58.75);
	   System.out.println(s1.getName() +" "+ s1.getRollNo() +" "+ s1.getMarks());
	   System.out.println(s2.getName() +" "+ s2.getRollNo() +" "+ s2.getMarks());
	   
	   s1.setMarks(95.65);
	   s2.setMarks(84.23);
	   
	   System.out.println("Marks of Purnima = " + s1.getMarks());
	   System.out.println("Marks of Rakhi = " + s2.getMarks());
	   
	}

}
