package jehad1;

import java.util.Calendar;

public class DateServer {
	
	private Calendar cal;
	
	public DateServer(){
		this.cal = Calendar.getInstance();
	}
	
	public void advanceDateByDays(int days) {
		cal.add(Calendar.DAY_OF_YEAR, days);
	}
	
	public Calendar getDate() {
		return cal;
	}
	
}
