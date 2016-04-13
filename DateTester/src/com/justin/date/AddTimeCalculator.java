/*
 *************************************************
File name:		AddTimeCalculator.java
Author:			Justin
Date Created:	07-Apr-2016
Purpose:		



 *************************************************
 */

package com.justin.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddTimeCalculator
{

	public static void main(String[] args)
	{
 AddTimeCalculator myobj = new AddTimeCalculator();
 String myReturn = myobj.sum("12:50:03", "2:00:50");
 System.out.println(myReturn);
	}
//this is not working need to check it
	public String sum(String a, String b)
	{
		String myReturn = null;
		Calendar aCal = Calendar.getInstance();
		Calendar bCal = Calendar.getInstance();

		SimpleDateFormat mySdf = new SimpleDateFormat("HH:mm:ss");
		try
		{
			Date aDate = mySdf.parse(a);
			Date bDate = mySdf.parse(b);
			System.out.println(aDate);
			System.out.println(bDate);
			aCal.setTime(aDate);
			bCal.setTime(bDate);
			aCal.add(Calendar.HOUR_OF_DAY, aCal.get(Calendar.HOUR_OF_DAY));
			aCal.add(Calendar.MINUTE, aCal.get(Calendar.MINUTE));
			aCal.add(Calendar.SECOND, aCal.get(Calendar.SECOND));
			myReturn = mySdf.format(aCal.getTime());
		}
		catch (ParseException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myReturn;
	}

}
