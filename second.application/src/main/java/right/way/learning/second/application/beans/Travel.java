package right.way.learning.second.application.beans;

import java.util.List;import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

public class Travel {

	private String destination;
	private String source;
	private Vehicle vehicle;
    private int[] arr;
    
    
    public void setArr(int[] arr) {
		this.arr = arr;
	}
    
    public int[] getArr() {
		return arr;
	}
    
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
		
}
