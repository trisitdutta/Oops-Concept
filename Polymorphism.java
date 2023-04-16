

    abstract class Animal {              //abstract class(We cannot achieve 100% of abstraction because there is one method which is not abstract)
    int time;
    int speed;
    
	abstract public void run();              //abstract method
	abstract public void eat();              //abstract method
	abstract public void sleep();            //abstract method
	
	public void hunt()                        //Inherited method
	{
	  System.out.println("Animal can hunt");
	}
 }
 
  class Dog extends Animal
  {
	 Dog(int time,int speed)         //Constructor of class Dog
	 {
		 this.time = time;
		 this.speed = speed;
	 }
	  
	public void run()                //override method
	 {
	   System.out.println("Dog can run at the speed of " + speed + " km/hr");
	 }
	public void eat()                //override method
	{
	  System.out.println("Dog eats meat and rice");
	}
	public void sleep()              //override method
	{
	  System.out.println("Dog can sleep upto " + time + " hours");
	}
	

	public void bark()                 //Specialized method
	{
	  System.out.println("The sound of dog's barking is Vow Vow");
	}
  }
  
  class Cat extends Animal
  {
	 Cat(int time,int speed)          //Constructor of class Cat
	 {
		this.time = time;
		this.speed = speed;
	 }
	 
	public void run()                 //override method
	 {
	   System.out.println("Cat can run at the speed of " + speed + " km/hr");
	 }
	public void eat()                 //override method
	{
	  System.out.println("Cat eats fish and milk");
	}
	public void sleep()               //override method
	{
	  System.out.println("Cat can sleep upto " + time + " hours");
	}
	
	public void bark()                 //Specialized method
	{
	  System.out.println("The sound of cat's barking is Mew Mew");
	}
  
}

// class Poly {                              /* By doing this we can achieve Polymorphism and
//	                                            we can reduce the code also. */
//	 public void polymorphism(Animal ref)
//	 {
//		 ref.eat();
//		 ref.sleep();
//		 ref.run();
//		 ref.hunt();  // We can call Inherited methods using Parent type reference.
//  	 ref.bark();  // can't call Specialized methods using Parent type reference.It shows Compile Time Error.
//	 }
// }
  
  public class Polymorphism {

	public static void main(String[] args) {
      
	  Animal d = new Dog(10,40);
	  Animal c = new Cat(14,25);
	  
//	    Poly p = new Poly();
//      p.polymorphism(d);
//      p.polymorphism(c);
	  
	   d.eat();
	   c.eat();
	   d.sleep();
	   c.sleep();
	   d.run();
	   c.run();
//	   d.hunt();             // calling inherited method hunt() using Parent type reference.
//	   c.hunt();             // calling Inherited method hunt() using Parent type reference.
	   
       ((Dog) d).bark();    // We can call Specialized methods using Parent type reference by doing Type-Cast.
       ((Cat) c).bark();
 }
}
