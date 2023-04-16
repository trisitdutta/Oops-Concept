
class Animals {              // Parent/Super/Base class
	
	int time;
	int speed;
	Animals(int time,int speed)    // constructor of animals class
	{
		this.time = time;
		this.speed = speed;
	  System.out.println("Animals can run at "+speed +" km/hr");
	}
	public void sleep()           // Inherited method
	{
	  System.out.println("Animals cans sleep upto "+time+" hours");
	}
	
}

class Tiger extends Animals{       // Child/Sub/Derived class
   
	String sound;              //Tiger class inherits all the properties & behaviours of Animals class by using extends keyword
	
	Tiger(String sound)         // constructor of Tiger class
	{
	   super(12,60);
	   this.sound = sound;
	}
	
	public void bark()          // Specialized method
	{
	  System.out.println("Tigers are barking like "+ sound);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
      Tiger t = new Tiger("Halum Halum");
      
      t.sleep();  //  We can access methods of Animals class without creating its object.We can access by creating object of its child class Tiger.
      t.bark();
	}

}
