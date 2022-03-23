package events;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class EventEx5 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button1 = new Button();
		button1.setText("클릭");
		button1.setPrefSize(50, 50);

		Button button2 = new Button();
		ImageView image = new ImageView("/img/smilerere.png");
		image.setFitHeight(40);
		image.setFitWidth(40);
		button2.setGraphic(image);

		button1.setOnAction(event -> {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("정보");
			alert.setHeaderText("머리글");
			alert.setContentText("버튼을 클릭했어요.");
			alert.show();
		});
		button2.setOnAction(event -> {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("정보");
			alert.setHeaderText("머리글");
			alert.setContentText("이미지를 클릭했어요.");
			alert.show();
		});
		HBox box = new HBox();
		box.getChildren().addAll(button1, button2);
		box.setAlignment(Pos.CENTER);
		box.setSpacing(40);

		primaryStage.setTitle("EventEx5");
		primaryStage.setScene(new Scene(box, 300, 200));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
