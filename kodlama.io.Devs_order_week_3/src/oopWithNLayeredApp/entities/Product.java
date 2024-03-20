 package oopWithNLayeredApp.entities;

public class Product {
	private int id;
	private String name;
	private double unitPrice;
	
	// Null Consturcor
	public Product() {
		
	}
	
	// Parameters Constructor
	public Product(int id, String name, double unitPrice) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
	}
	
	// Getter & Setter ethods 
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

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
		
	
	
	
	
	
}
