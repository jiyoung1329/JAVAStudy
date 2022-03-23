package events;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class EventEx4 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button1 = new Button();
		button1.setText("클릭");
		button1.setPrefSize(50, 50);
		
		Button button2 = new Button();
		ImageView image = new ImageView("img/smilerere.png");
		image.setFitHeight(40);
		image.setFitWidth(40);
		button2.setGraphic(image);
		button1.setStyle("-fx-padding: 10");
		button2.setStyle("-fx-padding: 10");
		
		button1.setOnMousePressed(e -> {
			button1.setStyle("-fx-padding: 15 10 10 10");
		});
		button1.setOnMouseReleased(e -> {
			button1.setStyle("-fx-padding: 10 10 10 10");
			
		});
		
		button2.setOnMousePressed(e -> {
			button2.setStyle("-fx-padding: 15 10 10 10");
		});
		button2.setOnMouseReleased(e -> {
			button2.setStyle("-fx-padding: 10 10 10 10");
			
		});
		
		HBox box = new HBox();
		box.getChildren().addAll(button1, button2);
		box.setAlignment(Pos.CENTER);
		box.setSpacing(40);
		primaryStage.setTitle("event");
		primaryStage.setScene(new Scene(box, 300, 200));
		primaryStage.show();
		
	}
}
