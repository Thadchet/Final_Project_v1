package Pane;

import javafx.geometry.Pos;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;

public class HealthRock extends VBox {
	private HealthProgressBar healthBar ;
	
	public HealthRock() {
		healthBar = new HealthProgressBar();
		setAlignment(Pos.BOTTOM_CENTER);
		getChildren().add(healthBar);
		
	}
	
	public HealthProgressBar getHealthBar() {
		return healthBar;
	}

	class HealthProgressBar extends ProgressBar{
		public HealthProgressBar() {
			super(1);
			setPrefWidth(1000);
			setPrefHeight(30);
			setStyle("-fx-accent: LIMEGREEN");
		}
		
	}
	
	public void setHealth(double i) {
		healthBar.setProgress(i);
	}

}
