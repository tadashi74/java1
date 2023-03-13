import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;
import javax.swing.JOptionPane;

public class OkJavaGoInHomeInput {
	
	// args 라는 변수에 String으로만 이루어진 배열이 담겨짐
	public static void main(String[] args) {
		
//		String id = JOptionPane.showInputDialog("Enter a ID");
//		String bright = JOptionPane.showInputDialog("Enter a Bright");
		String id = args[0];
		String bright = args[1];
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(id + " / Hall Lamp");
		hallLamp.on();

		Lighting floorLamp = new Lighting(id + " / Floor Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id + " moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
	}

}
