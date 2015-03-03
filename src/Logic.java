
import java.util.*;


public class Logic {
	
	
	//can use string split intstead of stringtokenizer? 

	
	public static String executeCommands(Commands.Available_COMMAND userCommand, StringTokenizer st) {
		String output="";
		switch (userCommand){
		case ADD:
			output=AddTask.add(st);
			break;
		case DELETE:
			output=deleteTask(st);
			break;
		case EDIT:
			output=editTask(st);
			break;
		case LIST:
			output=list();
			break;
		default:
			output=Message.MSG_INPUT_FAILED;
			break;
		}
		return output;
	}
	
	//

	
}
