package liv2train.model;

// Creating a POJO to store Errors in Validation

public class ErrorDetail {
	
	// ErrorDetails instance variables declaration and their validation 
	
	private String Error;
	private String Errordetails;
	
	// Constructor using fileds
	public ErrorDetail(String error, String errordetails) {
		super();
		Error = error;
		Errordetails = errordetails;
	}
	
	// All getters and setter
	public String getError() {
		return Error;
	}

	public void setError(String error) {
		Error = error;
	}

	public String getErrordetails() {
		return Errordetails;
	}

	public void setErrordetails(String errordetails) {
		Errordetails = errordetails;
	}
	
	
}
