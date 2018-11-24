
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;

public class StackAllPane extends StackPane{
	private RegisterPane registerpane ;
	private HowtoplayPane howtoplaypane ;
	private GamePane gamepane ;
	
	public StackAllPane() {
		registerpane = new RegisterPane();
		howtoplaypane = new HowtoplayPane();
		gamepane = new GamePane();
		
		getChildren().addAll(gamepane,howtoplaypane,registerpane);
		
		registerpane.getHow().setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				changePane();
			}
		});
		
		registerpane.getEnterBtn().setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				changePane();
			}
		});
		
		howtoplaypane.getBack().setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				changePane();
			}
		});
		
		gamepane.getBackMenu().setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				changePane();
			}
		});
	}
	
	public void changePane() {
		ObservableList<Node> childs = getChildren();
		if(childs.size() > 0 ) {
			Node topNode = childs.get(childs.size()-1);
			Node newtopNode = childs.get(childs.size()-2);
			
			topNode.setVisible(false);
            topNode.toBack();
            newtopNode.setVisible(true);
		}
	}
}
