package rwl.user.information.userrestapiwithexceptionhandling.fileservices;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import rwl.user.information.userrestapiwithexceptionhandling.filerepository.FileInformation;
import rwl.user.information.userrestapiwithexceptionhandling.filerepository.FileInformationDao;

@Service
public class FileInformationServiceImpl implements FileInformationService {

	@Autowired
	private FileInformationDao repo;
	
	@Override
	public String uploadFile(MultipartFile file) throws Exception {
		
		FileInformation info = new FileInformation();
		
		info.setFileName(file.getOriginalFilename());
		info.setFileType(file.getContentType());
		info.setFileData(file.getBytes());
		
		FileInformation saved  = repo.save(info);
		
		if(saved != null) {
			return "File is Successfully Save!!!";
		}
		return "Sorry boss I can'y saved it!!!!";
	}


	
	@Override
	public byte[] downLoadFile(Integer fileId) throws Exception {
		
		Optional<FileInformation>  file = repo.findById(fileId);
		
		if(file.isPresent()) {
			FileInformation actualFile = file.get();
			return actualFile.getFileData();
		}
		return null;
	}

}
