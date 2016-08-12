package rabbitandturtle;

public class RabbitAndTurtleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalRunner runner=new AnimalRunner();
		Thread rabbit=new Thread(runner, "Rabbit");
		Thread turtle=new Thread(runner, "Turtle");
		rabbit.start();
		turtle.start();

	}

}
