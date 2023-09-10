package rwl.user.information.userrestapiwithexceptionhandling.fileservices;

import org.springframework.web.multipart.MultipartFile;

public interface FileInformationService {

	public String uploadFile(MultipartFile file) throws Exception;
	public byte[] downLoadFile(Integer fileId) throws Exception;
}
