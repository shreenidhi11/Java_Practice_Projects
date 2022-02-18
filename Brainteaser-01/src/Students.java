
public class Students implements Comparable<Students> {
	private final Integer studentId;
	private final String studentName;
	private final double studentScore;
	public Students(Integer studentId, String studentName, double studentScore) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentScore = studentScore;
	}
	
	public Integer getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public double getStudentScore() {
		return studentScore;
	}

	@Override
	public int compareTo(Students student) {
		if(this.studentScore > student.studentScore) {
			return 1;
		}
		else if(this.studentScore < student.studentScore) {
			return -1;
		}
		else {
			return 0;
	}
	}
	
	
	
	

}

