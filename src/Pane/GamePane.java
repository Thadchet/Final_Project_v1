package Pane;
import Timer.Timer;
import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.HLineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

public class GamePane extends BorderPane{

	private Button backMenu;
	private Button hit ;
	private Timer timer ;
	private HealthRock healthRockBar ;
	
	private PathTransition pt ;
	private Path path ;
	private Button test ;
	private ImageView imageWorm ;
	

	public GamePane() {
		setVisible(false);
		setStyle("-fx-background-color:	DODGERBLUE;");
		setPadding(new Insets(10));
		
		////////// image loader /////////////
		String image_path = ClassLoader.getSystemResource("image/").toString();
		////////////////////////////////////
		
		hit = new Button("Hit");
		hit.setPrefHeight(20);
		hit.setPrefWidth(100);
		backMenu = new Button("Back to Menu");
		timer = new Timer();
		healthRockBar = new HealthRock();
		
		setTop(timer);
		setBottom(healthRockBar);
		
		test = new Button("Test takeDamage");
		test.setPrefWidth(70);
		
		VBox vbox1 = new VBox();
		vbox1.setSpacing(10);
		vbox1.setAlignment(Pos.CENTER);
		
		ImageView imageRock = new ImageView(new Image(image_path+"rock.png"));
		imageRock.setFitHeight(100);
		imageRock.setFitWidth(100);
		vbox1.getChildren().addAll(imageRock,hit,test);
		setCenter(vbox1);
		////////////////// About animation ////////////////////////////
		imageWorm = new ImageView(new Image(image_path+"worm.png"));
		imageWorm.setFitHeight(100);
		imageWorm.setFitWidth(100);
		
		VBox vbox2  = new VBox();
		vbox2.getChildren().addAll(imageWorm,healthRockBar);
		
		setBottom(vbox2);
		path = new Path();
		path.getElements().addAll(new MoveTo(150,50),new HLineTo(550));
		path.setFill(null);
		path.setVisible(false);
		getChildren().add(path);
		
		pt = new PathTransition(Duration.millis(6000),path,imageWorm);
		pt.setCycleCount(Animation.INDEFINITE);
		pt.setAutoReverse(true);
		
		
		
		///////////////////////////////////////////////////////
		
		Label labelScore = new Label("0");
		labelScore.setFont(Font.font("Verdana", FontPosture.ITALIC, 60));
		getChildren().add(labelScore);

		hit.setOnKeyPressed(new EventHandler<KeyEvent>() {
			
			@Override
			public void handle(KeyEvent k) {
				// TODO Auto-generated method stub
				if (k.getCode() == KeyCode.A) {
	                
					Thread t =  new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							hit.setDisable(true);
							try {
								Thread.sleep(3000);
								hit.setDisable(false);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					});
					t.start();
	            }
			}
		});
	}
	
	public ImageView getImageWorm() {
		return imageWorm;
	}

	public Path getPath() {
		return path;
	}

	public PathTransition getPt() {
		return pt;
	}

	public Button getHit() {
		return hit;
	}

	public HealthRock getHealthRockBar() {
		return healthRockBar;
	}

	public Button getTest() {
		return test;
	}

	public Button getBackMenu() {
		return backMenu;
	}

	public Timer getTimer() {
		return timer;
	}

	public void setHealthRockBar(HealthRock healthRockBar) {
		this.healthRockBar = healthRockBar;
	}	
}
