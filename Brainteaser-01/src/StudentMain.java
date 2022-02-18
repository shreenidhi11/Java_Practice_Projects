import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentMain {
	
	//  public List<Students> students = new ArrayList<>();
	  static final Comparator<Students> SCORE_ORDER = new Comparator<Students>() {
		 @Override
		 public int compare(Students s1, Students s2) {
			 if(s1.getStudentScore() > s2.getStudentScore()) {
				 return 1;
			 }
			 else if(s1.getStudentScore() < s2.getStudentScore()) {
				 return -1;
			 }
			 else {
				 return 0;
			 }
		 }
		  
	  }  ;
	
	static Map<Integer,Students> studentDetails ;
	//make a list of the students objects
	static List<Students> studentList  = new ArrayList<>();
	
	public static void main(String[] args) {
		
		studentDetails = new HashMap<>();
		addStudents();
		addStudents();
		addStudents();
	//	printList(studentDetails);
		printStudentList(studentList);
		
	}
	
	
	public static Students studentInput() {
		System.out.println("Enter student details");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		Integer id = sc.nextInt();
		double score = sc.nextDouble();
		sc.nextLine();
		
		return new Students(id,name,score);
			
	}
	public static void addStudents() {
		Students stud = studentInput();
		studentDetails.put(stud.getStudentId(), stud);
		
		studentList.add(stud);
		System.out.println("Added student details successfully");
		
		
	}
	
	public static void printList(Map<Integer,Students> studentDetails) {
		for(Integer  id : studentDetails.keySet()){
			Students s = studentDetails.get(id);
			System.out.println("Student name: " + s.getStudentName() +"\nStudent Id: "+ s.getStudentId() +"\n" +"Student Score: "+ s.getStudentScore() );
		}
	}
	
	public static void printStudentList(List<Students> students) {

		
		Collections.sort(students, SCORE_ORDER);
		
		for(Students s : students) {
		System.out.println("Student name: " + s.getStudentName() +"\nStudent Id: "+ s.getStudentId() +"\n" +"Student Score: "+ s.getStudentScore() );
	}
		
	}
	
	public static void printListComparable(List<Students> students) {
		Collections.sort(students);
		for(Students s : students) {
			System.out.println("Student name: " + s.getStudentName() +"\nStudent Id: "+ s.getStudentId() +"\n" +"Student Score: "+ s.getStudentScore() );
		}
	}
		
	}
	
	

