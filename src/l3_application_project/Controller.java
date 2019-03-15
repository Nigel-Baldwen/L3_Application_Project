package l3_application_project;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.control.Button;
import javafx.event.*;
import javafx.scene.paint.Color;

public class Controller {

    @FXML
    private Label label;
    @FXML
    private Button button;
    
    private Model model;
    
    EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
		@Override 
        public void handle(MouseEvent e) { 
           button.setBackground(new Background(new BackgroundFill(model.getColor(), new CornerRadii(1), null)));
        } 
	};

    public void initialize() {
    	model = new Model();
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        label.setText("Hello, JavaFX " + javafxVersion + "\nRunning on Java " + javaVersion + ".");
        button.setOnMouseClicked(eventHandler);
    }

	
    
    
}
