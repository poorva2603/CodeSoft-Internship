import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		int ch=0;
		StudentManagementFunction obj=new StudentManagementFunction();
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1-Add\n2-Remove\n3-Search\n4-Display\n5-File write\n6-File read");
			System.out.println("\nEnter your choice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the name:");
				String name=sc.next();
				System.out.println("Enter roll no:");
				int rollno=sc.nextInt();
				System.out.println("Enter grade:");
				String grade=sc.next();
				
				Student sobj=new Student(name, rollno, grade);
				obj.add(sobj);
				break;
				
			case 2:
				System.out.println("Enter roll number to remove:");
				int rno=sc.nextInt();
				obj.remove(rno);
				break;
				
			case 3:
				System.out.println("Enter the roll number to be search:");
				int sroll=sc.nextInt();
				Student stud=obj.search(sroll);
				if(stud!=null) {
					System.out.println("Student found:"+stud);
				}
				else {
					System.out.println("Student not found");
				}
				break;
				
			case 4:
				obj.display();
				break;
				
			case 5:
				System.out.println("Enter file name(Write):");
				String filenamew=sc.next();
				obj.writefile(filenamew);
				System.out.println("Data written successfully!");
				break;
				
			case 6:
				System.out.println("Enter file name(read):");
				String filenamer=sc.next();
				obj.readfile(filenamer);
				break;
			
			default:
				System.out.println();
			}
			System.out.println("Continue? Press 1->");
			ch=sc.nextInt();
		}while(ch==1);
	}

}
