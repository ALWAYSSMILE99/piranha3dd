package dao;

import java.util.HashMap;

import Exceptions.TeacherNameNotFoundException;
import bean.Feedback;

public interface FeedbackDao {
	public void AddFeedbackDao(String AccountNumber, Feedback user);
	public Feedback PrintFeedbackReport(String AccountNumber) throws TeacherNameNotFoundException;
	public HashMap<String, Integer>getFeedbackReport();
	void validateAccount(String subjectName) throws TeacherNameNotFoundException;
	public HashMap<String, Integer> addFeedbackDetails(String name, int rating, String subject);
	

}
