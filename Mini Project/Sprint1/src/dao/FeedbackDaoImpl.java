package dao;

import java.util.HashMap;
import java.util.Map;
import Exceptions.*;
import bean.Feedback;

public class FeedbackDaoImpl implements FeedbackDao{
	Map<String, Feedback> userList=new HashMap<String, Feedback>();

	@Override
	public void AddFeedbackDao(String teacherName, Feedback user) {
		// TODO Auto-generated method stub
		try {
			userList.put(teacherName, user);
		}
		catch(Exception e)
		{
			throw e;
		}
		
	}

	@Override
	public Feedback PrintFeedbackReport(String teacherName) throws TeacherNameNotFoundException {
		// TODO Auto-generated method stub
		try {
			validateAccount(teacherName);
			Feedback user=new Feedback();
			user=userList.get(teacherName);
			return user;
		}
		catch(Exception e) {
			throw e;
		}
	}

	

	@Override
	public void validateAccount(String accountNumber) throws TeacherNameNotFoundException {
		// TODO Auto-generated method stub
		try
		{
			if(!userList.containsKey(accountNumber))
			{
				throw new TeacherNameNotFoundException();
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	

	@Override
	public HashMap<String, Integer> getFeedbackReport() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<String, Integer> addFeedbackDetails(String name, int rating, String subject) {
		// TODO Auto-generated method stub
		return null;
	}


}
