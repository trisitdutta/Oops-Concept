
abstract class Aeroplane {          //Abstract class(We achieve 100% of of Abstraction because all the methods inside this class are Abstract)
	
	abstract public void fly();         //Abstract method( The method which has no body or implementation is called Abstract methods)
	abstract protected void carry();    //Abstract method
	
}

class Cargoplane extends Aeroplane {
	
	public void fly()          //Overridden method
	{
		System.out.println("Cargoplane flies at medium height");
	}
	
	protected void carry()       //Overridden method
	{
		System.out.println("Cargoplane carries goods");
	}
}

class Passengerplane extends Aeroplane {
	
	public void fly()           //Overridden method
	{
		System.out.println("Passengerplane flies at very high height");
	}
	
	public void carry()        //Overridden method
	{
	   System.out.println("Passengerplane carries passengers");
	}
}

public class Abstraction {

	public static void main(String[] args) {
	  
        Cargoplane cp = new Cargoplane();
        Passengerplane pp = new Passengerplane();
        
        cp.fly();
        pp.fly();
        
        cp.carry();
        pp.carry();
        
	}

}
