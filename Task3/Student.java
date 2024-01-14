
public class Student {
	private String name;
	private int rollno;
	private String grade;
	public Student(String name, int rollno, String grade) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String toString() {
		return "Name:"+name+"Roll number:"+rollno+"Grade:"+grade;
	}
	
}
