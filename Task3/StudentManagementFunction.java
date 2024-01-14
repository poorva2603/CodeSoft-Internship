import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.ArrayList;

public class StudentManagementFunction {
	private List<Student> students;

	public StudentManagementFunction() {
		this.students=new ArrayList<>();
	}
	
	public void add(Student student) {
		students.add(student);
	}
	public void remove(int rollno) {
		students.removeIf(student->student.getRollno()==rollno);
	}
	public Student search(int rollno) {
		for(Student student:students) {
			if(student.getRollno()==rollno) {
				return student;
			}
		}
		return null;
	}
	public void display() {
		for(Student student:students) {
			System.out.println(student);
		}
	}
	//file operations
	public void writefile(String filename) {
		try(ObjectOutputStream outputstream=new ObjectOutputStream(new FileOutputStream(filename))){
			outputstream.writeObject(students);
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
	}
	public void readfile(String filename) {
		try(ObjectInputStream inputstream=new ObjectInputStream(new FileInputStream(filename))){
			students=(List<Student>)inputstream.readObject();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
