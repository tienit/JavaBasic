package vn.giabao;

public class StudentInfo {

	private int StudentID;
	
	private String StudentName;

	public int getStudentID() {
		return StudentID;
	}

	public void setStudentID(int studentID) {
		StudentID = studentID;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	
	public StudentInfo() {
		
	}
	
	public StudentInfo(int _StudentID, String _StudentName) {
		this.StudentID = _StudentID;
		this.StudentName = _StudentName;
	}
	
}
