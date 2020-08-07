package Assignment_Constructor;

public class Test {

	public static void main(String[] args) {
		
		Floor floor = new Floor(12, 10);
		Carpet carpet = new Carpet(9);
		Calculator calc = new Calculator(floor, carpet);
		System.out.println(calc.getTotalCost());

	}

}
