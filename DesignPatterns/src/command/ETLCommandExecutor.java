package command;

import java.util.HashMap;

import command.concreatecommands.ChatCommand;
import command.concreatecommands.ReviewsCommand;
import command.concreatecommands.SpaceCommand;
import command.concrete.Chat;
import command.concrete.Reviews;
import command.concrete.Space;

/*
 * This central class will have pointers to other command impl, the commands internally could be calling specific
 * concrete class impl.
 * The command pattern in a way makes the main command executor class only to worry about the base level task to be done
 * The individual command implementations will deal with concreate classes by calling underlying multiple implementations that 
 * make up the base impl defined in the main executor or the command interface.
 * */


public class ETLCommandExecutor {

	HashMap<String, ETLCommandInterface> commandMap;
	public void setupCommandMap(){
		this.commandMap=new HashMap<>();
		this.commandMap.put("reviews", new ReviewsCommand(new Reviews()));
		this.commandMap.put("space", new SpaceCommand(new Space()));
		this.commandMap.put("chat", new ChatCommand(new Chat()));
	}
	
	public void load(String modulename){
		this.commandMap.get(modulename).executeLoad();
	}
	
	public void transform(String modulename){
		
	}
}
