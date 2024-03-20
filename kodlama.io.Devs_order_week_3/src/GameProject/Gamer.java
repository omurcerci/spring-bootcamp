package GameProject;

public class Gamer {
	private int id;
	private String FirstName;
	private String LastName;
	private int BirthYear;
	private long IdentityNumber;
	
	public Gamer() {
		
		
	}

	public Gamer(int id, String firstName, String lastName, int birthYear, long identityNumber) {
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		BirthYear = birthYear;
		IdentityNumber = identityNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getBirthYear() {
		return BirthYear;
	}

	public void setBirthYear(int birthYear) {
		BirthYear = birthYear;
	}

	public long getIdentityNumber() {
		return IdentityNumber;
	}

	public void setIdentityNumber(long identityNumber) {
		IdentityNumber = identityNumber;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
