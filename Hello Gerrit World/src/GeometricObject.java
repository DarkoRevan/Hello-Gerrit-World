import java.util.Date;


class GeometricObject {
	private String color = "white";
	private boolean filled = false;
	private Date dateCreated = new Date();
	
	GeometricObject() {
	}
	
	GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
	boolean isFilled() {
		return filled;
	}
	void setFilled(boolean filled) {
		this.filled = filled;
	}
	Date getDateCreated() {
		return dateCreated;
	}
	
	
}
