package kodlama.io.entities;

public class Course {
	private String instructor;
	private String courseName;
	private String category;
	private double unitPrice;
	
	public Course() {
		
	}

	public Course(String instructor, String courseName, String category, double unitPrice) {
		super();
		this.instructor = instructor;
		this.courseName = courseName;
		this.category = category;
		this.unitPrice = unitPrice;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
}
