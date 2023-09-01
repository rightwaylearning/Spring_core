package rwl.com.in.applicationhibenareproperties.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;

@Entity
@Table(name="movie")
public class Movie {

	@Id
	@Column(name = "movie_id")
	@GeneratedValue(
			strategy = GenerationType.TABLE,
			generator = "mytable"
	)
	
	@TableGenerator(
			name = "mytable",
			table = "minedb_sequence_table",
			pkColumnName = "seq_name",
			valueColumnName = "seq_value",
			pkColumnValue = "movie_seq_id",
			initialValue = 1,
			allocationSize = 1
	)
	Integer movieId;
	
	@Column(name = "movie_name")
	String movieName;
	
	@Column(name = "directed_by")
	String directedBy;
	
	
	@Column(name = "produced_by")
	String producedBy;
	
	@Column(name = "lead_actor")
	String leadActor;
	
	@Column(name="box_office_collection")
	Double boxOfficeCollection;
	
	public Movie() {
		
	}

	public Movie(Integer movieId, String movieName, String directedBy, String producedBy, String leadActor,Double boxOfficeCollection) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.directedBy = directedBy;
		this.producedBy = producedBy;
		this.leadActor = leadActor;
		this.boxOfficeCollection = boxOfficeCollection;
	}
	
	public Movie(String movieName, String directedBy, String producedBy, String leadActor,Double boxOfficeCollection) {
		super();
		this.movieName = movieName;
		this.directedBy = directedBy;
		this.producedBy = producedBy;
		this.leadActor = leadActor;
		this.boxOfficeCollection = boxOfficeCollection;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDirectedBy() {
		return directedBy;
	}

	public void setDirectedBy(String directedBy) {
		this.directedBy = directedBy;
	}

	public String getProducedBy() {
		return producedBy;
	}

	public void setProducedBy(String producedBy) {
		this.producedBy = producedBy;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}

	public Double getBoxOfficeCollection() {
		return boxOfficeCollection;
	}

	public void setBoxOfficeCollection(Double boxOfficeCollection) {
		this.boxOfficeCollection = boxOfficeCollection;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", directedBy=" + directedBy + ", producedBy="
				+ producedBy + ", leadActor=" + leadActor + ", boxOfficeCollection=" + boxOfficeCollection + "]";
	}

	
	
		
}
