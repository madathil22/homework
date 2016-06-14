package decorator.coffee;

import decorator.Beverage;

public class DarkRoast implements Beverage{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Dark Roast";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 1.50;
	}

}
