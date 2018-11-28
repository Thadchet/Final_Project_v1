package Logic;

import Pane.ControlPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	private ControlPane stackallpane;

	@Override
	public void start(Stage primaryStage) {
		StackPane root = new StackPane();
		Scene scene = new Scene(root, 900, 700);
		stackallpane = new ControlPane();
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
