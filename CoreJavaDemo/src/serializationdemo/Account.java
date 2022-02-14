package serializationdemo;

import java.io.Serializable;

public class Account implements Serializable{
	
	private int accNumber;
	private String accName;
	transient private int atmPin;
	
	public Account() {
		super();
	}	
		public Account(int accNumber, String accName, int atmPin) {
			super();
			this.accNumber = accNumber;
			this.accName = accName;
			this.atmPin = atmPin;
		}
		/**
		 * @return the accNumber
		 */
		public int getAccNumber() {
			return accNumber;
		}
		/**
		 * @param accNumber the accNumber to set
		 */
		public void setAccNumber(int accNumber) {
			this.accNumber = accNumber;
		}
		/**
		 * @return the accName
		 */
		public String getAccName() {
			return accName;
		}
		/**
		 * @param accName the accName to set
		 */
		public void setAccName(String accName) {
			this.accName = accName;
		}
		/**
		 * @return the atmPin
		 */
		public int getAtmPin() {
			return atmPin;
		}
		/**
		 * @param atmPin the atmPin to set
		 */
		public void setAtmPin(int atmPin) {
			this.atmPin = atmPin;
		}
		
}
     