package rwl.user.information.userrestapiwithxmlrequestresponse.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  
@AllArgsConstructor
@NoArgsConstructor
@JacksonXmlRootElement(localName = "user")
public class User {
	private Integer userId;
	private String userName;
	private String userEmailId;
	private Long contatNumber;
	
}
