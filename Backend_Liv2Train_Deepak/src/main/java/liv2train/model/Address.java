package liv2train.model;


import javax.persistence.Embeddable;

// Address entity which is embedded into Center Entity.

@Embeddable
public class Address {
	
	// Address instance variables declaration and their validation 
	
	private String address_line;
	private String city;
	private String state;
	private String pin_code;
	
	// Constructor from Super class
	public Address() {
		super();
	}

	// Constructor using fields
	public Address(String address_line, String city, String state, String pin_code) {
		super();
		this.address_line = address_line;
		this.city = city;
		this.state = state;
		this.pin_code = pin_code;
	}
	
	// All getters and setters
	public String getAddress_line() {
		return address_line;
	}

	public void setAddress_line(String address_line) {
		this.address_line = address_line;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin_code() {
		return pin_code;
	}

	public void setPin_code(String pin_code) {
		this.pin_code = pin_code;
	}
	
	// toString method to print Address Object in case of requirement.
	@Override
	public String toString() {
		return "Address [address_line=" + address_line + ", city=" + city + ", state=" + state + ", pin_code="
				+ pin_code + "]";
	}

	
}
