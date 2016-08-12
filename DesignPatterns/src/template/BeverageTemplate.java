package template;

public abstract class BeverageTemplate {
    public void makeBeverage(){
    	this.boilWater();
    	this.prepareReceipe();
    	this.addCondiments();
    	this.pourIntoCup();
    }
    
    public void boilWater(){
    	
    }
    
    public abstract void prepareReceipe();
    public abstract void addCondiments();
    public void pourIntoCup(){
    	
    }
}
