package driver;

import java.text.DateFormat;
import java.util.Date;

public class MainDr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Git");
		System.out.println("CurentTime : " + getTime());
		System.out.println("Factorial 4(4!) = " + calculateFactorial(4));
		
		drawDiamond();
	}
	public static String getTime() {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		
		String formattedDate = dateFormat.format(date);
		
		return formattedDate;
	}
	public static int calculateFactorial(int factorial) {
		if(factorial ==1)
			return factorial;
		return factorial*calculateFactorial(--factorial);
	}
	public static void drawDiamond()
	{
		 System.out.println("  *  ");
		 System.out.println(" *** ");
		 System.out.println("*****");
		 System.out.println(" *** ");
		 System.out.println("  * ");


	}


}
