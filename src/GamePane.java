import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class GamePane extends StackPane {
	private Button backMenu ;

	public GamePane() {
		setVisible(false);
		setStyle("-fx-background-color:blue;");
		
		backMenu = new Button("Back to Menu");
		getChildren().add(backMenu);
	}

	public Button getBackMenu() {
		return backMenu;
	}
}
