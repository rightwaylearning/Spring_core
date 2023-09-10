package rwl.user.information.userrestapiwithexceptionhandling.filecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import rwl.user.information.userrestapiwithexceptionhandling.fileservices.FileInformationService;

@RestController
@RequestMapping("/file")
public class FileController {

	@Autowired
	private FileInformationService service;
	
	@PostMapping("/upload")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) throws Exception{
		
		String message = service.uploadFile(file);
		
		 return ResponseEntity.status(HttpStatus.OK).body(message);
		 //return new ResponseEntity<String>(message, HttpStatus.OK);
	}
	
	@GetMapping( value = "/download/{id}", produces = "video/mp4")
	public ResponseEntity<?> getFile(@PathVariable("id") Integer fileId)throws Exception{
		byte[] fileData =  service.downLoadFile(fileId);
		return ResponseEntity.status(HttpStatus.OK)
				             .body(fileData);
	}
	
	
}
