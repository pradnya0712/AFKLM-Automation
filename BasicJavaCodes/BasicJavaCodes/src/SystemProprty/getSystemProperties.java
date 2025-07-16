package SystemProprty;

import java.text.SimpleDateFormat;
import java.util.Date;

public class getSystemProperties {

	
	public static void main(String[] args) {
		
		//1). get java version
		
		String javaVersion=System.getProperty("java.version");
		System.out.println("Java version installed in machine is: "+javaVersion);
		
		//2). current data and time
		
		Date date=new Date();
		String GMTFormat=date.toGMTString();
		String localFormat=date.toLocaleString();
		System.out.println("Date in local format: "+localFormat);
		System.out.println("Date in GMT format: "+GMTFormat);
		String stringFormat=date.toString();
		System.out.println("Date in String format: "+stringFormat);
		
		int currentDate=date.getDate();
		int currentMonth=date.getMonth();
		
		int currentDay=date.getDay();
		int currentHours=date.getHours();
		int currentMinutes=date.getMinutes();
		int currentSceonds=date.getSeconds();
	
		
		System.out.println("Current date: "+currentDate);
		System.out.println("Current month: "+currentMonth);
		System.out.println("Current day: "+currentDay);
		System.out.println("Current hours: "+currentHours);
		System.out.println("Current minutes: "+currentMinutes);
		System.out.println("Current seconds: "+currentSceonds);
		
		
		//3)  Print Date in different format
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-dd-MM hh:mm:ss");
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy/dd/MM hh:mm:ss");
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy/dd/MM");
		SimpleDateFormat sdf3=new SimpleDateFormat("hh:mm:ss");
		System.out.println(sdf.format(date));
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
		System.out.println(sdf3.format(date));
		
		
		
		
		
		
		
		
	}
}
