package pojo;

public class EmployeePojo {
	
	
///////
	private int employeeId;
	private int employeePassword;
	private String employeeFirstName;
	private String employeeLastName;
	private String employeeContact;
	private String employeeAddress;

	public EmployeePojo(){
	super();
	
	}
	 
	public EmployeePojo(String employeeFirstName,String employeeLastName, String employeeFirstName1,
			String employeeContact,String employeeAddress, int employeeId,int employeePassword) {
	super();
	this.employeeId=employeeId;
	this.employeePassword = employeePassword;
	this.employeeFirstName = employeeFirstName;
	this.employeeLastName = employeeLastName;
	this.employeeContact = employeeContact;
	this.employeeAddress = employeeAddress;
	
	}

	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the employeePassword
	 */
	public int getEmployeePassword() {
		return employeePassword;
	}

	/**
	 * @param employeePassword the employeePassword to set
	 */
	public void setEmployeePassword(int employeePassword) {
		this.employeePassword = employeePassword;
	}

	/**
	 * @return the employeeFirstName
	 */
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	/**
	 * @param employeeFirstName the employeeFirstName to set
	 */
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	/**
	 * @return the employeeLastName
	 */
	public String getEmployeeLastName() {
		return employeeLastName;
	}

	/**
	 * @param employeeLastName the employeeLastName to set
	 */
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	/**
	 * @return the employeeContact
	 */
	public String getEmployeeContact() {
		return employeeContact;
	}

	/**
	 * @param employeeContact the employeeContact to set
	 */
	public void setEmployeeContact(String employeeContact) {
		this.employeeContact = employeeContact;
	}

	/**
	 * @return the employeeAddress
	 */
	public String getEmployeeAddress() {
		return employeeAddress;
	}

	/**
	 * @param employeeAddress the employeeAddress to set
	 */
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

}