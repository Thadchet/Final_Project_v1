package Pane;
import Timer.Timer;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;

public class GamePane extends BorderPane {

	private Button backMenu;
	private Button hit ;
	private Timer timer ;
	private HealthRock healthRockBar ;
	
	private Button test ;

	public GamePane() {
		setVisible(false);
		setStyle("-fx-background-color:	DODGERBLUE;");
		setPadding(new Insets(10));
		hit = new Button("Hit");
		hit.setPrefHeight(20);
		hit.setPrefWidth(100);
		backMenu = new Button("Back to Menu");
		timer = new Timer();
		healthRockBar = new HealthRock();
		setTop(timer);
		setBottom(backMenu);
		
		test = new Button("Test takeDamage");
		test.setPrefWidth(70);
		
		VBox vbox = new VBox();
		vbox.setSpacing(10);
		vbox.setAlignment(Pos.CENTER);
		vbox.getChildren().addAll(hit,healthRockBar,test);
		
		setCenter(vbox);

		
		
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
