package Pane;

import com.sun.deploy.ref.AppModel.Type;

import Logic.Hammer;
import Timer.Timer;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.StackPane;

public class ControlPane extends StackPane {
	private RegisterPane registerpane;
	private HowtoplayPane howtoplaypane;
	private GamePane gamepane;
	private Hammer hammer ;

	public ControlPane() {
		registerpane = new RegisterPane();
		howtoplaypane = new HowtoplayPane();
		gamepane = new GamePane();
		hammer = new Hammer();

		getChildren().addAll(gamepane, howtoplaypane, registerpane);
		
		gamepane.getTest().setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				hammer.setHealth(hammer.getHealth() - 1);
				gamepane.getHealthRockBar().setHealth(hammer.getHealth()*0.1);
				update();
			}
		});

		registerpane.getHow().setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				changePane(0);
			}
		});

		registerpane.getEnterBtn().setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				if(registerpane.getNametext().getText().equals("")){
					Alert alert = new Alert(AlertType.WARNING);
					alert.setTitle("Please Insert Name");
					alert.setContentText("Please Insert Name");
					alert.showAndWait();}
					else {
				gamepane.getTimer().getAnimationTimer().start();
				changePane(1);}
				
			}
		});

		howtoplaypane.getBack().setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				changePane(1);
			}
		});

		gamepane.getBackMenu().setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				changePane(0);
			}
		});
	}

	public void changePane(int i) {
		ObservableList<Node> childs = getChildren();
		if (childs.size() > 0) {
			if (i == 0) {
				Node topNode = childs.get(childs.size() - 1);
				Node newtopNode = childs.get(childs.size() - 2);

				topNode.setVisible(false);
				topNode.toBack();
				newtopNode.setVisible(true);
			} else {
				for (int k = 0; k != 2; k++) {
					Node topNode = childs.get(childs.size() - 1);
					Node newtopNode = childs.get(childs.size() - 2);

					topNode.setVisible(false);
					topNode.toBack();
					newtopNode.setVisible(true);
				}

			}
		}
	}
	public void update() {
		if(gamepane.getHealthRockBar().getHealthBar().getProgress() == 0.0) {
			Alert popUpGameOver =  new Alert(AlertType.INFORMATION);
			popUpGameOver.setTitle("Game Over");
			popUpGameOver.setHeaderText("Game Over");
			popUpGameOver.setContentText("Name : \n" + "Your Score : ");
			
			popUpGameOver.showAndWait();
		}
	}
}
