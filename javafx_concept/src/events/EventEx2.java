package events;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class EventEx2 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label = new Label("Values");
		label.setFont(new Font("Cambria",30));
		label.setRotate(48);
		label.setLayoutX(100);
		label.setLayoutY(70);
		
		label.setOnMouseEntered((event)-> {
			label.setScaleX(1.5);
			label.setScaleY(1.5);
			label.setRotate(0);
		});
		
		label.setOnMouseExited((event) -> {
			label.setScaleX(1);
			label.setScaleY(1);
			label.setRotate(48);
		});
		
		AnchorPane anchor = new AnchorPane();
		anchor.getChildren().add(label);
		primaryStage.setTitle("event");
		primaryStage.setScene(new Scene(anchor, 300, 200));
		primaryStage.show();
		
	}
}
