package service;

import java.util.HashMap;

import Exceptions.*;
import bean.Feedback;

public interface FeedbackService {
	public String AddFeedbackDao(Feedback user) throws Exception;
	public Feedback PrintFeedbackReport(String AccountNumber) throws TeacherNameNotFoundException, InvalidSubjectNameException;
	public HashMap<String, Integer> addFeedbackDetails(String name, int rating, String subject);
	public HashMap<String, Integer>getFeedbackReport();
}
