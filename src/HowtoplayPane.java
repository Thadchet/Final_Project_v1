import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class HowtoplayPane extends VBox {
	private Button back ;
	
	public HowtoplayPane() {
		 setVisible(false);
		 setPadding(new Insets(10));
		 setSpacing(10);
		 
		 Text topic = new Text("How to play");
		 topic.setFont(Font.font("Verdana",FontWeight.BOLD,40));
		 //topic.setStrokeWidth(2);
		 topic.setUnderline(true);
		 
		 
		 
		 back = new Button("Back");
		 setAlignment(Pos.TOP_CENTER);
		 getChildren().add(topic);
		 
		 String image_path = ClassLoader.getSystemResource("image/").toString();
		 ImageView imageRock = new ImageView(new Image(image_path+"rock.jpg"));
		 imageRock.setPreserveRatio(true);
		 imageRock.setFitHeight(100);
		 imageRock.setFitWidth(100);
		 getChildren().add(imageRock);
		 
		 ImageView imageHammer = new ImageView(new Image(image_path+"hammer.jpg"));
		 imageHammer.setPreserveRatio(true);
		 imageHammer.setFitHeight(100);
		 imageHammer.setFitWidth(100);
		 getChildren().add(imageHammer);
		 getChildren().add(back);
		 
		 setStyle("-fx-background-color:LIGHTSALMON;");
	}

	public Button getBack() {
		return back;
	}
	
}
