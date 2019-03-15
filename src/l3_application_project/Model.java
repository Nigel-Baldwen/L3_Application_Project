package l3_application_project;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class Model {
	
	private int field = 0;
	
	public Paint getColor() {
		field+=1;
		return (field % 2 == 0) ? Color.DARKCYAN : Color.GREEN;
	}

}
