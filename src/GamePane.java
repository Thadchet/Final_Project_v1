import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;

public class GamePane extends StackPane {
	private Button backMenu;
	private Button hit ;

	public GamePane() {
		setVisible(false);
		setStyle("-fx-background-color:	DODGERBLUE;");
		
		hit = new Button("Hit");
		backMenu = new Button("Back to Menu");
		getChildren().add(hit);
		setAlignment(hit,Pos.TOP_CENTER);
		getChildren().add(backMenu);
		
		Label labelScore = new Label("0");
		getChildren().add(labelScore);
		setAlignment(labelScore,Pos.TOP_RIGHT);
		hit.setOnKeyPressed(new EventHandler<KeyEvent>() {
			
			@Override
			public void handle(KeyEvent k) {
				// TODO Auto-generated method stub
				if (k.getCode() == KeyCode.A) {
	                ////////////
	            }
			}
		});
	}

	public Button getBackMenu() {
		return backMenu;
	}
}
