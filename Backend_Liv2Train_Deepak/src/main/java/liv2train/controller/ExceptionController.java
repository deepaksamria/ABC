package liv2train.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import liv2train.model.ErrorDetail;

@RestControllerAdvice
public class ExceptionController {
	
	
	// Handling validation exception while new Center registering.
	@ExceptionHandler
	public ResponseEntity<?> validationErrorHandler(MethodArgumentNotValidException exception){
		ErrorDetail error=new ErrorDetail("Validation Error", exception.getBindingResult().getFieldError().getDefaultMessage());
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	// Handling all exception except validation exception in entire application execution
	@ExceptionHandler
	public ResponseEntity<?> allExceptionHandler(Exception exception){
		ErrorDetail error=new ErrorDetail("Error occured", exception.getCause().toString());
		return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
