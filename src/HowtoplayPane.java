import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class HowtoplayPane extends VBox {
	private Button back ;
	
	public HowtoplayPane() {
		 setVisible(false);
		 back = new Button("Back");
		 getChildren().add(back);
		 
		 setStyle("-fx-background-color:blue;");
	}

	public Button getBack() {
		return back;
	}
	
}
