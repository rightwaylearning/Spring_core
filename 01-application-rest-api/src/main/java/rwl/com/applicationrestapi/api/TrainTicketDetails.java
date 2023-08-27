package rwl.com.applicationrestapi.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainTicketDetails {

	// http://localhost:8080/ticket?ticketId=12313&trainNo=PUHYD56666
	@GetMapping("/ticket")
	ResponseEntity<String> getTicketDetails(@RequestParam("ticketId") Integer ticketId,@RequestParam("trainNo") String trainNo) {
		
		System.out.println("ticketId"+ticketId +" trainNo"+trainNo);
		
		ResponseEntity<String> response  = new ResponseEntity<>("your tarin "+trainNo+" ticket "+ticketId+" status is booked ",HttpStatus.OK);
		return response;
	}
	
	@GetMapping("/busticket/{ticketId}/{bustNo}")
	ResponseEntity<String> getBusTicketDetaisl(@PathVariable Integer ticketId, @PathVariable String bustNo){
		System.out.println("ticketId = " + ticketId + "   bustNo = "+ bustNo);
		return new ResponseEntity<>("ticketId = " + ticketId + "   bustNo = "+ bustNo,HttpStatus.OK);
	}
	
	
	
	
}
