package rabbitandturtle;

public class AnimalRunner implements Runnable{

	public static boolean raceWon=false;
	@Override
	public void run() {
		for(int i=1;i<=100;i++){
			if(AnimalRunner.raceWon){
				break;
			}
			System.out.println(Thread.currentThread().getName()+" Running "+i+"mt");
			if(this.raceWon(i)){
				break;
			}
		}
	}
	public boolean raceWon(int inpmt){
		if(inpmt==100){
			AnimalRunner.raceWon=true;
			System.out.println("Race won by:"+Thread.currentThread().getName());
			return true;
		}
		return false;
	}
}
