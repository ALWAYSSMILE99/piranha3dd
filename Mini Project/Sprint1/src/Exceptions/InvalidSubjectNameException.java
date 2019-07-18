package Exceptions;

public class InvalidSubjectNameException extends Exception{
	public InvalidSubjectNameException()
	{
		super("The Subject Name is not found");
	}

}
