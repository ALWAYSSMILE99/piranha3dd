package service;

import java.util.HashMap;
import java.util.Random;
import Exceptions.*;
import bean.Feedback;
import dao.*;
public class FeedbackServiceImpl extends Validator implements FeedbackService{
	FeedbackDao dao=new FeedbackDaoImpl();
	Validator v=new Validator();
	@Override
	public String AddFeedbackDao(Feedback user) throws  Exception{
		// TODO Auto-generated method stub
		String AccountNumber=null;
		try 
		{
			v.validator(user);
			dao.AddFeedbackDao(AccountNumber, user);
		}
		catch(Exception e)
		{
			throw e;
		}
		return AccountNumber;
		
	}


	@Override
	public Feedback PrintFeedbackReport(String AccountNumber) throws TeacherNameNotFoundException{

		try
		{
			return dao.PrintFeedbackReport(AccountNumber);
		}
		catch(Exception e)
		{
			throw e;
		}
	}





	@Override
	public HashMap<String, Integer> addFeedbackDetails(String name, int rating, String subject) {
		// TODO Auto-generated method stub
		try {
			return dao.addFeedbackDetails(name, rating, subject);
		}
		catch(Exception e)
		{
			throw e;
		}
	}


	@Override
	public HashMap<String, Integer> getFeedbackReport() {
		// TODO Auto-generated method stub
		try {
			return dao.getFeedbackReport();
		}
		catch(Exception e)
		{
			throw e;
		}
	}

}
