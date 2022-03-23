package events;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz2_ans extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ImageView iv1 = new ImageView("/img/warrior.png");
		iv1.setFitHeight(45);
		iv1.setFitWidth(45);
		ToggleButton tb1 = new ToggleButton();
		tb1.setGraphic(iv1);

		ImageView iv2 = new ImageView("/img/magi.png");
		iv2.setFitHeight(45);
		iv2.setFitWidth(45);
		ToggleButton tb2 = new ToggleButton();
		tb2.setGraphic(iv2);

		ImageView iv3 = new ImageView("/img/rogue.png");
		iv3.setFitHeight(45);
		iv3.setFitWidth(45);
		ToggleButton tb3 = new ToggleButton();
		tb3.setGraphic(iv3);

		HBox jobBox = new HBox();
		jobBox.getChildren().addAll(tb1, tb2, tb3);
		jobBox.setSpacing(-8);

		ImageView iv4 = new ImageView("/img/warrior.png");
		iv4.setFitHeight(45);
		iv4.setFitWidth(45);
		ToggleButton tb4 = new ToggleButton();
		tb4.setGraphic(iv4);

		HBox hairBox = new HBox();
		hairBox.getChildren().addAll(tb4);

		ImageView iv5 = new ImageView("/img/warrior.png");
		iv5.setFitHeight(45);
		iv5.setFitWidth(45);
		ToggleButton tb5 = new ToggleButton();
		tb5.setGraphic(iv5);

		HBox motionBox = new HBox();
		motionBox.getChildren().addAll(tb5);

		tb1.setStyle("-fx-background-color: transparent; -fx-padding: 5 5 5 5;");
		tb2.setStyle("-fx-background-color: transparent; -fx-padding: 5 5 5 5;");
		tb3.setStyle("-fx-background-color: transparent; -fx-padding: 5 5 5 5;");
		tb4.setStyle("-fx-background-color: transparent; -fx-padding: 5 5 5 5;");
		tb5.setStyle("-fx-background-color: transparent; -fx-padding: 5 5 5 5;");

		tb1.setOnMousePressed(event -> {
			tb1.setStyle("-fx-background-color: transparent; -fx-padding: 6 4 4 6;");
		});
		tb1.setOnMouseReleased(event -> {
			tb1.setStyle("-fx-background-color: transparent; -fx-padding: 5 5 5 5;");
		});

		tb2.setOnMousePressed(event -> {
			tb2.setStyle("-fx-background-color: transparent; -fx-padding: 6 4 4 6;");

		});
		tb2.setOnMouseReleased(event -> {
			tb2.setStyle("-fx-background-color: transparent; -fx-padding: 5 5 5 5;");
		});

		tb3.setOnMousePressed(event -> {
			tb3.setStyle("-fx-background-color: transparent; -fx-padding: 6 4 4 6;");

		});
		tb3.setOnMouseReleased(event -> {
			tb3.setStyle("-fx-background-color: transparent; -fx-padding: 5 5 5 5;");
		});

		tb4.setOnMousePressed(event -> {
			tb4.setStyle("-fx-background-color: transparent; -fx-padding: 6 4 4 6;");

		});
		tb4.setOnMouseReleased(event -> {
			tb4.setStyle("-fx-background-color: transparent; -fx-padding: 5 5 5 5;");
		});

		tb5.setOnMousePressed(event -> {
			tb5.setStyle("-fx-background-color: transparent; -fx-padding: 7 5 5 5;");

		});
		tb5.setOnMouseReleased(event -> {
			tb5.setStyle("-fx-background-color: transparent; -fx-padding: 5 5 5 5;");
		});

		Pane p1 = new Pane();
		Pane p2 = new Pane();
		Pane p3 = new Pane();
		Pane p4 = new Pane();
		p1.setPrefHeight(27);
		p2.setPrefHeight(32);
		p3.setPrefHeight(25);
		p4.setPrefHeight(30);
		VBox vBox = new VBox();
		vBox.getChildren().add(p1);
		vBox.getChildren().add(jobBox);
		vBox.getChildren().add(p2);
		vBox.getChildren().add(hairBox);
		vBox.getChildren().add(p3);
		vBox.getChildren().add(motionBox);
		vBox.getChildren().add(p4);

		Pane topPane = new Pane();
		topPane.setPrefHeight(50);
		Pane leftPane = new Pane();
		leftPane.setPrefWidth(15);

		BorderPane leftborder = new BorderPane();
		leftborder.setTop(topPane);
		leftborder.setLeft(leftPane);
		leftborder.setCenter(vBox);

		BorderPane border = new BorderPane();
		border.setLeft(leftborder);
		StackPane stack = new StackPane();
		stack.getChildren().addAll(new ImageView("img/l2char.png"), border);
		primaryStage.setTitle("Quiz2");
		primaryStage.setScene(new Scene(stack));
		primaryStage.show();
	}

}
