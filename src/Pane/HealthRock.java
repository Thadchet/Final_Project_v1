package Pane;

import javafx.geometry.Pos;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class HealthRock extends VBox {
	private HealthProgressBar healthBar ;
	
	public HealthRock() {
		healthBar = new HealthProgressBar();
		setAlignment(Pos.BOTTOM_CENTER);
		getChildren().add(healthBar);
		
	}
	
	private class HealthProgressBar extends ProgressBar{
		public HealthProgressBar() {
			super(1);
			setPrefWidth(300);
			setPrefHeight(30);
			setStyle("-fx-accent: LIMEGREEN");
		}
		
	}

}
