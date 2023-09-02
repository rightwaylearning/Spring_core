package rwl.user.information.userrestapiwithexceptionhandling.exception.handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlingController {

	@ExceptionHandler(value = ArithmeticException.class)
	public ResponseEntity<ApiException> getArithmaticException(ArithmeticException error){
		ApiException exception= new ApiException();
		exception.setErrorCode("EX-01 (AE)");
		exception.setErrorMessage(error.getMessage());
		return new ResponseEntity<ApiException>(exception,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = NullPointerException.class)
	public ResponseEntity<ApiException> getNullPointerException(NullPointerException error){
		ApiException exception= new ApiException();
		exception.setErrorCode("EX-02 (AE)");
		exception.setErrorMessage(error.getMessage());
		return new ResponseEntity<ApiException>(exception,HttpStatus.OK);
	}
	
	@ExceptionHandler(value = InvalidUserId.class)
	public ResponseEntity<ApiException> getNullPointerException(InvalidUserId error){
		ApiException exception= new ApiException();
		exception.setErrorCode("EX-03 (IIC)");
		exception.setErrorMessage(error.getMessage());
		return new ResponseEntity<ApiException>(exception,HttpStatus.BAD_REQUEST);
	}
}
