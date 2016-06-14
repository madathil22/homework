package decorator.condiments;

import decorator.Beverage;

public class Mocha implements Beverage{

	public Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription()+"|"+"Mocha";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return this.beverage.getCost()+0.30;
	}

}
