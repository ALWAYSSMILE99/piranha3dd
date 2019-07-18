package UserInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import bean.Feedback;
import service.FeedbackServiceImpl;

public class Start {
	static FeedbackServiceImpl service=new FeedbackServiceImpl();
	public static void showMenu() {
		System.out.println("01. Add Feedback");
		System.out.println("02. Print Feedback Report");
		System.out.println("03. Exit");
		System.out.print("Enter Your Choice : ");
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int choice;
		while(true)
		{
			showMenu();
			choice = scanner.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Addition of Feedback");
				try
				{
					Feedback user=new Feedback();
					System.out.println("Enter Teacher name:");
					user.setTeacherName(scanner.next());
					System.out.println("Enter subject name:");
					user.setSubjectName(scanner.next());
					System.out.println("Enter Rating:");
					user.setRating(scanner.nextInt());
					/*String AccountNumber=service.AddFeedbackDao(user);
					System.out.println("Your Account Number is : "+AccountNumber);*/
					
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				break;
			case 2:
				System.out.println("Printing Feedback Report");
				try {
					System.out.println("Enter the teacher name to get details:");
					String AccountNumber=scanner.next();
					service.PrintFeedbackReport(AccountNumber);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				break;
			case 3:
				System.exit(0);
			default:
				break;
			}
		}
	}

}
