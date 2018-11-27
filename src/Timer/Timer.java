package Timer;

import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Timer extends Group{
	private Canvas canvas;
	private int currentTime;
	private AnimationTimer animationTimer;
	private long lastTimeTriggered;
	
	public Timer() {
		
		this.canvas = new Canvas(100, 100);
		getChildren().add(canvas);
		
		this.currentTime = 0;
		this.lastTimeTriggered = -1;
		GraphicsContext gc = canvas.getGraphicsContext2D();
		this.animationTimer = new AnimationTimer() {
			
			@Override
			public void handle(long now) {
	
				// TODO Auto-generated method stub
				
				lastTimeTriggered = (lastTimeTriggered < 0 ? now : lastTimeTriggered);
				
				if (now - lastTimeTriggered >= 1000000000)
				{
					currentTime++;
					drawCurrentTimeString(gc);
					lastTimeTriggered = now;
				}
			}
		};
		
	}
	
	public AnimationTimer getAnimationTimer() {
		return animationTimer;
	}

	public void drawCurrentTimeString(GraphicsContext gc){
		gc.setFill(Color.BLACK);
		gc.setFont(new Font(40));
		gc.clearRect(0, 0, this.canvas.getWidth(), this.canvas.getHeight());
		gc.fillText("" + this.currentTime, this.canvas.getWidth() / 2, this.canvas.getWidth() / 2 + 10);
	}

	
}
