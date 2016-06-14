package decorator.condiments;

import decorator.Beverage;

public class Chocolate implements Beverage{

	public Beverage beverage;
	
	public Chocolate(Beverage beverage) {
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription()+"|"+"Chocolate";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return this.beverage.getCost()+0.50;
	}

}
