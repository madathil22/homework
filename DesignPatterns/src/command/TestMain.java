package command;

public class TestMain {
	public static void main(String[] args){
		ETLCommandExecutor executor=new ETLCommandExecutor();
		executor.setupCommandMap();
		
		executor.load("reviews");
	}
}
