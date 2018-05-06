package test;

public abstract class Staff {
	private static int NEXT_ID = 1;
	
	private int id;
	private String name;
	private String lastname;
	
	public Staff(String pName, String pLastname) {
		name = pName;
		lastname = pLastname;
		id = NEXT_ID;
		NEXT_ID += 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getId() {
		return id;
	}
	
	
	
	
}
