import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontSmoothingType;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class RegisterPane extends BorderPane {
	private Button quit;
	private Button enterBtn;
	private Button how;
	private HowtoplayPane howtoplaypane;
	private TextField nametext ;

	public RegisterPane() {
		setVisible(true);
		Text gamename = new Text("Hit Rock");
		setPadding(new Insets(40, 40, 40, 40));
		gamename.setFill(Color.DARKTURQUOISE);
		gamename.setFont(Font.font("Verdana", FontPosture.ITALIC, 60));

		setStyle("-fx-background-color:lightgray;");
		// gamename.setStyle("-fx-font-size: 32px; -fx-font-family:\"Arial
		// Black\";-fx-fill: #555;");

		Label name = new Label("Name");
		nametext = new TextField();
		nametext.setPromptText("Enter your name");
		enterBtn = new Button("Enter");
		enterBtn.setStyle(
				"-fx-text-fill: white; -fx-font-weight: bold; -fx-font-family: \"Arial Narrow\"; -fx-background-color: darkgreen;");

		how = new Button("How to play");
		quit = new Button("Quit");
		how.setStyle(
				"-fx-text-fill: white; -fx-font-weight: bold; -fx-font-family: \"Arial Narrow\"; -fx-background-color: darkgreen;");
		quit.setStyle(
				"-fx-text-fill: white; -fx-font-weight: bold; -fx-font-family: \"Arial Narrow\"; -fx-background-color: darkred;");

		HBox hbox1 = new HBox();
		hbox1.setSpacing(10);
		hbox1.getChildren().addAll(how, quit);
		hbox1.setAlignment(Pos.CENTER_RIGHT);

		HBox hbox2 = new HBox();
		hbox2.setSpacing(10);
		hbox2.getChildren().addAll(name, nametext, enterBtn);
		hbox2.setAlignment(Pos.CENTER);

		setBottom(hbox1);
		setCenter(hbox2);
		setTop(gamename);
		setAlignment(gamename, Pos.CENTER);
		
		
		quit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}

	public HowtoplayPane getHowtoplaypane() {
		return howtoplaypane;
	}

	public TextField getNametext() {
		return nametext;
	}

	public Button getQuit() {
		return quit;
	}

	public Button getEnterBtn() {
		return enterBtn;
	}

	public Button getHow() {
		return how;
	}
}
