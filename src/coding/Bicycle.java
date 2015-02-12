package coding;

public class Bicycle {
	int cadence = 0;
	int speed = 0;
	int gear = 1;
	int time;
	String bicycle = "Three wheels";
	public void changeCadence(int newValue){
		cadence = newValue;
	}
	public void changeGear(int newValue){
		gear = newValue;
	}
	public void speedUp(int increment){
		speed = speed + increment;
		//speed+= increment;
	}
	public void applyBreaks(int decrement){
		speed = speed - decrement;
		//speed -= decrement;
	}
	public void wait(int seconds){
		time = seconds;
	}
	public String toString(String bike){
		bicycle = bike;
		return bicycle;
	}
	public void printStatements(){
		System.out.println("The cadence is: " + cadence + " The speed is: " + speed
				 + " The gear is: " + gear + " The wait time is: " + time
				  + " The bike is: " + bicycle);
	}

}
