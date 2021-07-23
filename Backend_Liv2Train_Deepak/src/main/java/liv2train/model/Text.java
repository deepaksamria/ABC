package liv2train.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Pattern;

// Entity to store List of Course offered by Center

@Entity
public class Text {
	
	// Text instance variables declaration and their validation 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long course_id;
	
	@Pattern(regexp = "[a-zA-Z][a-zA-Z\\s]+")
	private String course_name;
	
	@ManyToOne
	private Center center;
	
	// Constructor fro Super class
	public Text() {
		super();
	}
	
	// Constructor using fields
	public Text(long course_id, @Pattern(regexp = "[a-zA-Z][a-zA-Z\\s]+") String course_name, Center center) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.center = center;
	}
	
	// All getters and setters
	public long getCourse_id() {
		return course_id;
	}

	public void setCourse_id(long course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public Center getCenter() {
		return center;
	}

	public void setCenter(Center center) {
		this.center = center;
	}
	// toString method to print Text Object in case of requirement.
	@Override
	public String toString() {
		return "Text [course_id=" + course_id + ", course_name=" + course_name + ", center=" + center + "]";
	}

	
	
}
