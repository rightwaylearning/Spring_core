package rwl.user.information.userrestapiwithexceptionhandling.filerepository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "file_information")
public class FileInformation {

	@Id
	@Column(name = "file_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer fileId;
	
	private String fileName;
	
	private String fileType;
	
	@Column(length = 980000)
	private byte[] fileData;
	
	public FileInformation() {}

	public FileInformation(Integer fileId, String fileName, String fileType, byte[] fileData) {
		super();
		this.fileId = fileId;
		this.fileName = fileName;
		this.fileType = fileType;
		this.fileData = fileData;
	}

	public Integer getFileId() {
		return fileId;
	}

	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public byte[] getFileData() {
		return fileData;
	}

	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}
	
	
}
