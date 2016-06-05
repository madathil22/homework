package command.concreatecommands;

import command.ETLCommandInterface;
import command.concrete.Chat;

public class ChatCommand implements ETLCommandInterface{
	Chat chatconc;
	public ChatCommand(Chat chatconc){
		this.chatconc=chatconc;
	}
	@Override
	public void executeLoad() {
		// TODO Auto-generated method stub
		this.chatconc.loadGDW();
		this.chatconc.loadPearl();
	}

}
