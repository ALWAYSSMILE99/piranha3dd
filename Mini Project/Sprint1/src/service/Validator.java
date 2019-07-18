package service;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Exceptions.*;
import bean.Feedback;
public class Validator {
	boolean result=false;
	boolean result1=false;
	boolean result2=false;
	String str1 = "Math";
	String str2 = "English";
	public void validator(Feedback user) throws InvalidSubjectNameException
	{
		try {
			validateSubjectName(user.getSubjectName());
			
		} catch (InvalidSubjectNameException e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}
	private void validateSubjectName(String subjectName) throws InvalidSubjectNameException {
		// TODO Auto-generated method stub
		try {
			
			if(!(subjectName.equals(str1) || !(subjectName.equals(str2))))
				throw new InvalidSubjectNameException();
		}
		catch(Exception e)
		{
			throw e;
		}
		
		
	}

	}
	

