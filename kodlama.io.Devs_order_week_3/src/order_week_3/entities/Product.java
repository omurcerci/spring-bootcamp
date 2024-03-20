package order_week_3.entities;

public class Product {
	private int id;
	private String name;
	private String category;
	private String instructor;
	private int coursePrice;
	
	public Product() {
		
	}

	public Product(int id, String name, String category, String instructor, int coursePrice) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.instructor = instructor;
		this.coursePrice = coursePrice;
	}

	// Getter & Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public int getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}
	
	
	
	
	
}
