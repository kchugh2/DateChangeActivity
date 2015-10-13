package newpackage;

import java.text.DateFormat;
import java.util.*;

public class DateChangeActivity {
	public static void main(String[] args) {
		Date now = new Date();
		DateFormat shortdate =DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat longtime =DateFormat.getTimeInstance(DateFormat.LONG);
		System.out.println(shortdate.format(now));
		System.out.println(longtime.format(now));
		}

}
