package command.concreatecommands;

import command.ETLCommandInterface;
import command.concrete.Space;

public class SpaceCommand implements ETLCommandInterface{

	Space spaceconc;
	public SpaceCommand(Space spaceconc) {
		this.spaceconc=spaceconc;
	}
	@Override
	public void executeLoad() {
		this.spaceconc.loadArchibus();
	}

}
