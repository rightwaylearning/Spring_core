package rwl.user.information.userrestapiwithexceptionhandling.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user")
@JacksonXmlRootElement(localName = "root")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "mine_user")
	@TableGenerator(
			name="mine_user",
			table = "mone_table_pk",
			pkColumnName = "key_name",
			valueColumnName = "key_value",
			pkColumnValue = "user_pk_value",
			initialValue = 0,
			allocationSize = 1
			)
	private Integer userId;
	
	@Column(name = "user_name")
	@Setter
	@Getter
	private String userName;
	
	@Column(name = "user_contact")
	private String userCellNumber;
	
	@Column(name = "user_email")
	private String userEmail;
		
}
