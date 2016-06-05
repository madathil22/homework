package command.concreatecommands;

import command.ETLCommandInterface;
import command.concrete.Reviews;

public class ReviewsCommand implements ETLCommandInterface{

	Reviews reviewconc;
	
	public ReviewsCommand(Reviews reviewconc) {
		this.reviewconc=reviewconc;
	}
	@Override
	public void executeLoad() {
		this.reviewconc.loadOnboarding();
		this.reviewconc.loadRemoteLogs();
		
	}

}
