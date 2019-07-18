package bean;

public class Feedback {
	private String teachername;
	private String subjectName;
	private int rating;
	public String getTeacherName() {
		return teachername;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		rating = rating;
	}
	public void setTeacherName(String name) {
		this.teachername = name;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	

}
