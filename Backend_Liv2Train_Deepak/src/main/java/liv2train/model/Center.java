package liv2train.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Center {
	
	// Center instance variables declaration and their validation 
	 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long center_id;
	
	@Pattern(regexp = "[a-zA-Z][a-zA-Z\\s]+", message = "Please enter a valid Center name")
	@Size(max = 40, message = "Please enter Center name in less than 40 characters")
	private String center_name;
	
	@Pattern(regexp = "[0-9A-Z]{12}" , message = "Please enter a valid Center Code i.e. exactly 12 alphanumeric characters")
	private String center_code;
	
	private Address address;
	
	@Min(value = 10, message= "Please enter Center Capacity greater than or equal to 10")
	private int student_capacity;
	
	@OneToMany(mappedBy = "center" , fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Text> course_offered = new ArrayList<>();
	
	private Date date;
	
	@Email(message = "Please enter a valid email")
	private String email;
	
	@Pattern(regexp = "[6789][0-9]{9}", message = "Please enter valid contact number")
	private String contact_no;
	
	// Constructor from Super class
	public Center() {
		super();
	}
	
	// Construction using fields
	public Center(long center_id, @Pattern(regexp = "[a-zA-Z][a-zA-Z\\s]+") String center_name,
			@Pattern(regexp = "[0-9A-Z]{12}") String center_code, Address address, @Min(1) int student_capacity,
			List<Text> course_offered, Date date,
			@Pattern(regexp = "[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+") String email,
			@Pattern(regexp = "[6789][0-9]{9}") String contact_no) {
		super();
		this.center_id = center_id;
		this.center_name = center_name;
		this.center_code = center_code;
		this.address = address;
		this.student_capacity = student_capacity;
		this.course_offered = course_offered;
		this.date = date;
		this.email = email;
		this.contact_no = contact_no;
	}
	
	// All getters and setters
	public long getCenter_id() {
		return center_id;
	}

	public void setCenter_id(long center_id) {
		this.center_id = center_id;
	}

	public String getCenter_name() {
		return center_name;
	}

	public void setCenter_name(String center_name) {
		this.center_name = center_name;
	}

	public String getCenter_code() {
		return center_code;
	}

	public void setCenter_code(String center_code) {
		this.center_code = center_code;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getStudent_capacity() {
		return student_capacity;
	}

	public void setStudent_capacity(int student_capacity) {
		this.student_capacity = student_capacity;
	}

	public List<Text> getCourse_offered() {
		return course_offered;
	}

	public void setCourse_offered(List<Text> course_offered) {
		this.course_offered = course_offered;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	// toString method to print Center Object in case of requirement.
	@Override
	public String toString() {
		return "Center [center_id=" + center_id + ", center_name=" + center_name + ", center_code=" + center_code
				+ ", address=" + address + ", student_capacity=" + student_capacity + ", course_offered="
				+ course_offered + ", date=" + date + ", email=" + email + ", contact_no=" + contact_no + "]";
	}
	
}
