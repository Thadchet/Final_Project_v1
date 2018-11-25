
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	private StackAllPane stackallpane;
	private StackPane stackpane;

	@Override
	public void start(Stage primaryStage) {
		StackPane root = new StackPane();
		Scene scene = new Scene(root, 700, 500);
		stackallpane = new StackAllPane();
		root.getChildren().add(stackallpane);

		primaryStage.setTitle("Hit Rock");
		primaryStage.setOnCloseRequest(e -> {
			primaryStage.close();
			System.exit(0);
		});

		// primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
