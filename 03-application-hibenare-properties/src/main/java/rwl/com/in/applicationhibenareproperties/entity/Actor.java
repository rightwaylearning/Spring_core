package rwl.com.in.applicationhibenareproperties.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;

@Entity
@Table(name = "actor")
public class Actor {
	
	@Id
	@Column(name = "actor_reg")
	@GeneratedValue(
			strategy = GenerationType.TABLE,
			generator = "mytable"
	)
	
	@TableGenerator(
			name = "mytable",
			table = "minedb_sequence_table",
			pkColumnName = "seq_name",
			valueColumnName = "seq_value",
			pkColumnValue = "actor_seq_id",
			initialValue = 1,
			allocationSize = 1
	)
	Integer actorRegistrationNumber;
	
	String actorName;
	
	@Column(name = "fisrt_movie")
	String firstMovieName;
	
	public Actor() {}

	public Actor(Integer actorRegistrationNumber, String actorName, String firstMovieName) {
		super();
		this.actorRegistrationNumber = actorRegistrationNumber;
		this.actorName = actorName;
		this.firstMovieName = firstMovieName;
	}
	
	public Actor(String actorName, String firstMovieName) {
		super();
		this.actorName = actorName;
		this.firstMovieName = firstMovieName;
	}

	public Integer getActorRegistrationNumber() {
		return actorRegistrationNumber;
	}

	public void setActorRegistrationNumber(Integer actorRegistrationNumber) {
		this.actorRegistrationNumber = actorRegistrationNumber;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String getFirstMovieName() {
		return firstMovieName;
	}

	public void setFirstMovieName(String firstMovieName) {
		this.firstMovieName = firstMovieName;
	}
	
	

}
