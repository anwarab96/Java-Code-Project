package coding;

public class BicycleDemo {

	public static void main(String[] args) {
		//Create two different Bicycle objects
		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();
		//invoke methods on those objects
		bike1.changeCadence(50);
		bike1.speedUp(15);
		bike1.changeGear(2);
		bike1.applyBreaks(5);
		bike1.wait(10);
		bike1.toString();
		bike1.printStatements();
		
		bike2.changeCadence(45);
		bike2.changeGear(3);
		bike2.speedUp(20);
		bike2.applyBreaks(0);
		bike2.toString();
		bike2.wait(5);
		bike2.printStatements();
		
		

	}

}
