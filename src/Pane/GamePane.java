package Pane;
import Timer.Timer;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;

public class GamePane extends StackPane {
	private Button backMenu;
	private Button hit ;
	private Timer timer ;
	private HealthRock healthRockBar ;

	public GamePane() {
		setVisible(false);
		setStyle("-fx-background-color:	DODGERBLUE;");
		setPadding(new Insets(10));
		hit = new Button("Hit");
		hit.setPrefHeight(20);
		hit.setPrefWidth(100);
		backMenu = new Button("Back to Menu");
		getChildren().add(hit);
		setAlignment(hit,Pos.TOP_CENTER);
		getChildren().add(backMenu);
		
		timer = new Timer();
		getChildren().add(timer);
		setAlignment(timer,Pos.TOP_LEFT);
		
		healthRockBar = new HealthRock();
		getChildren().add(healthRockBar);
		setAlignment(healthRockBar,Pos.BOTTOM_CENTER);
		
		Label labelScore = new Label("0");
		labelScore.setFont(Font.font("Verdana", FontPosture.ITALIC, 60));
		getChildren().add(labelScore);
		setAlignment(labelScore,Pos.TOP_RIGHT);
		hit.setOnKeyPressed(new EventHandler<KeyEvent>() {
			
			@Override
			public void handle(KeyEvent k) {
				// TODO Auto-generated method stub
				if (k.getCode() == KeyCode.A) {
	                ////////////
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

	public Button getBackMenu() {
		return backMenu;
	}

	public Timer getTimer() {
		return timer;
	}
	
}
