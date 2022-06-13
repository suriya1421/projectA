package com.chainsys.springproject.commonutil;

import java.sql.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	public static boolean checkForNull(String data)	{
		boolean result = false;
		
		return result;
	}
	public static boolean checkStringForParse(String data) throws InvalidInputDataException {
		boolean result = false;
		int len = data.length();
		for (int index = 0; index < len; index++) {
			int asc = (int) data.charAt(index);
			if (asc > 47 && asc < 58)
				result = true;
			else
				throw new InvalidInputDataException("The value in String must contain only numbers");
		}

		// if data is invalid throw new InvalidInputDataException ("The value in String
		// must contain only numbers")
		return result;
	}
	public static boolean checkStringForParseFloat(String data) throws InvalidInputDataException {
		boolean result = false;
		int len = data.length();
		for (int index = 0; index < len; index++) {
			int asc = (int) data.charAt(index);
			
			if ((asc > 47 && asc < 58)||(asc==46))
				result = true;
			else
				throw new InvalidInputDataException("The value in String must contain only numbers");
		}

		// if data is invalid throw new InvalidInputDataException ("The value in String
		// must contain only numbers")
		return result;
	}

	public static boolean CheckNumberForGreaterThanZero(int data) throws InvalidInputDataException {
		boolean result = false;
		if (data > 0) {
			result = true;
		} else
			throw new InvalidInputDataException("The value must not contain negative values");
		return result;
	}

	public static boolean checklengthOfString(String data) throws InvalidInputDataException {
		boolean result = false;
		int len = data.length();

		if (len < 3)
			throw new InvalidInputDataException("the value must contain three characters");
		else if (len > 15)
			throw new InvalidInputDataException("the value must not exceed fifteen  characters");
		else
			result = true;
		return result;
	}

	public static boolean checkStringOnly(String data) throws InvalidInputDataException {
		boolean result = false;
		int len = data.length();
		for (int index = 0; index < len; index++) {
			int asc = (int) data.toUpperCase().charAt(index);
			if ((asc < 91) && (asc > 64)|| (asc == 32))
					result = true;
			else
				throw new InvalidInputDataException("the value only have Alphabets and Spaces");
		}
		return result;
	}

	public static boolean checkMail(String email) throws InvalidInputDataException {
		// TODO
		boolean result = false;
		String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
				+ "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		if (email == null)
			throw new InvalidInputDataException("the value for email not given ");
		else if (Pattern.compile(regexPattern).matcher(email).matches()) {
			result = true;
		} else {
			throw new InvalidInputDataException("the valueemail id ");
		}
		return result;
	}

	public static boolean checkDateFormat(String data) throws InvalidInputDataException {
		boolean result = false;
		int len = data.length();
		String[] data1 = data.split("/");
		//for (int i = 0; i < data1.length; i++)
			//System.out.println(data1[i]);
		int date = Integer.parseInt(data1[0]);
		int mon = Integer.parseInt(data1[1]);
		int yrs = Integer.parseInt(data1[2]);
		for (int index = 0; index < len; index++) {
			int asc = (int) data.charAt(index);
			if ((asc < 46) || (asc > 58))// || (asc != 47))
				throw new InvalidInputDataException("Enter date in correct format ");
		}

		// TODO
		// date before 1/1/1985

		if (yrs > 1984 && yrs <= 2022) {
			if (mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12)
				if (date > 0 && date <= 31)
					result = true;
				else
					throw new InvalidInputDataException("enter valid date");
			else if (mon == 2 || mon == 4 || mon == 6 || mon == 9 || mon == 11)
				if (date > 0 && date <= 30)
					result = true;
				else
					throw new InvalidInputDataException("enter valid date");
			else
				throw new InvalidInputDataException("enter valid month");
		} else
			throw new InvalidInputDataException("enter valid year");
//		if(date.before(calender.getI);

		return result;

	}

	public static boolean CheckNofutureDate(java.util.Date newDate) throws InvalidInputDataException {
//		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date dateA = new Date(0, 0, 0);
		boolean result = false;
	if( newDate.compareTo(dateA)<0 )
		result=true;
	else
		throw new InvalidInputDataException("enter valid date");
		return result;
//		String testDate = formatter.format(date);
	}

	public static boolean checkjob(String data) throws InvalidInputDataException {
		// TODO Auto-generated method stub
		boolean result = false;
		int len = data.length();
		for (int index = 0; index < len; index++) {
			int asc = (int) data.toUpperCase().charAt(index);
			
			if (((asc > 64) && (asc < 91)) ||(asc == 95))
					  result = true;
			 	
			 	
			else
				throw new InvalidInputDataException("Enter Alphabets(A-Z) and underscore(_) only");
		}
		return result;


	}}
	