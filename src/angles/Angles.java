package angles;

public class Angles {
	
	private int degrees;
	
	public Angles (int degrees) {
		
//		if (degrees < 0) {
//			while (degrees < 0) degrees += 360;
//		}
//		else if (degrees > 360) {
//			while (degrees > 360) degrees -= 360;
//		}
//		setDegrees(degrees);
		///////////////////////
//		degrees = degrees % 360;
//		if (degrees < 0) degrees += 360;
//		setDegrees(degrees);
		///////////////////////
		setDegrees(degrees);
	}

	public int getDegrees() {
		int d;
		d = degrees % 360;
		if (d < 0)d+=360;
		return d;
	}

	private void setDegrees(int degrees) {
		this.degrees = degrees;
	}
	

}
