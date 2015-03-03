import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


public class Task {
	
	private String title;
	//private String description;
	private int id;
	private String startDate;
	private String endDate;
	private String startTime;
	private String endTime;
	private boolean isDone;
	
	private static int ARRAY_INDEX_TITLE=0;
	private static int ARRAY_INDEX_START_DATE=1;
	private static int ARRAY_INDEX_START_TIME=2;
	private static int ARRAY_INDEX_END_DATE=3;
	private static int ARRAY_INDEX_END_TIME=4;
	private static int ARRAY_INDEX_REPEAT=5;
	private static int ARRAY_INDEX_DELAYTYPE=6;
	private static int ARRAY_INDEX_RECUR=7;;
	
	private static DateTimeFormatter dtf=DateTimeFormat.forPattern("dd/MM/yyyy");
	
	public Task(String[] inputArray){
		this.title=inputArray[ARRAY_INDEX_TITLE]);
		//this.description=inputArray[ARRAY_INDEX_TITLE]);
		id=(int) Math.random();
		this.startDate=inputArray[ARRAY_INDEX_START_DATE]);
		this.startTime=inputArray[ARRAY_INDEX_START_TIME]);
		this.endDate=inputArray[ARRAY_INDEX_END_DATE]);
		this.endTime=inputArray[ARRAY_INDEX_END_TIME]);
		isDone=false;
	}
	
	public Task() {
	
	}
	public String getTitle(){
		return title;
	}
	
	public String getDescription(){
		return title;
	}
	
	public int getId(){
		return id;
	}
	
	public String getStartTime(){
		return startTime;
	}
	
	public String getEndTime(){
		return endTime;
	}
	
	public String getStartDate(){
		return startDate;
	}
	
	public String getEndDate(){
		return endDate;
	}
	
	public boolean getIsDone(){
		return isDone;
	}
	
	public void setTitle(String title){
		this.title=title;
	}
	
	/*public void setDescription(String description){
		this.description=description;
	}*/
	
	public void setStartTime(String startTime){
		this.startTime=startTime;
	}
	
	public void setEndTime(String endTime){
		this.endTime=endTime;
	}
	
	public void setStartDate(String startDate){
		this.startDate=startDate;
	}
	
	public void setEndDate(String endDate){
		this.endDate=endDate;
	}
	public void setIsDone(){
		isDone=true;
	}
	
	/*@Override
	public int compare (Object one, Object two){
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy");
		Date startDateOne=sdf.parse(one.getStartDate());
		Date startDateTwo=sdf.parse(two.getStartDate());
		
		/*if(startDateOne.compareTo(startDateOne)>0){
			return 1;
		} 
		else if(startDateOne.compareTo(startDateOne)<0){
			return -1;*/
		}
		return 0;
	}*/
}
