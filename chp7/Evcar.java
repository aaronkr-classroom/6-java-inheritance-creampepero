
public class Evcar extends Car {
	int charge = 100;
	
	Evcar() {
		super(2024, "Tesla", "Model X"); // S, 3, X, Y 
	

	}
	int getCharge() {
		return this.charge;
	}
	void charge() {
		this.charge = 100;
		System.out.println("You charged your car.");
	}
	//Car 함수 오버라이딩
	void drive() {
		this.charge -= 10;
		this.km +=100;
		
		System.out.println("You drove " + this.km + "km, and have " + this.charge + "% battery.");
	}
}
