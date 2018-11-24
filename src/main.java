
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class main extends Application {

	@Override
	public void start(Stage primaryStage) {
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root,800,600);
		
		primaryStage.setTitle("Battle Simulation");
		primaryStage.setOnCloseRequest(e -> {
			primaryStage.close();
			System.exit(0);
		});
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
