package rwl.user.information.userrestapiwithexceptionhandling.exception.handling;

import org.springframework.stereotype.Controller;

@Controller
public class ApiException {

	private String errorMessage;
	private String errorCode;
	
	public ApiException() {}

	public ApiException(String errorMessage, String errorCode) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	@Override
	public String toString() {
		return "ApiException [errorMessage=" + errorMessage + ", errorCode=" + errorCode + "]";
	}
	
}
