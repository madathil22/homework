package decorator.coffee;

import decorator.Beverage;

public class Decaf implements Beverage{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Chocolate";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0.30;
	}

}
