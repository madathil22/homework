package decorator;

import decorator.coffee.DarkRoast;
import decorator.condiments.Chocolate;
import decorator.condiments.Mocha;

public class DecoratorMain {
   public static void main (String[] args) {
	   Beverage drt=new DarkRoast();
	   Beverage mochadrt=new Mocha(drt);
	   Beverage chocolatemochadrt=new Chocolate(mochadrt);
	   
	   System.out.println("Your Order:"+chocolatemochadrt.getDescription()+", your price today:"+chocolatemochadrt.getCost());
   }
}
