package events;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Quiz01 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// 전체 레이아웃
		BorderPane allLayout = new BorderPane();

		// 1. search image
		Label imageLabel = new Label("", new ImageView("/img/search.png"));

		// event
		imageLabel.setOnMouseEntered(e -> {
			imageLabel.setScaleX(1.5);
			imageLabel.setScaleY(1.5);
		});

		imageLabel.setOnMouseExited(e -> {
			imageLabel.setScaleX(1);
			imageLabel.setScaleY(1);
		});

		imageLabel.setPadding(new Insets(100, 0, 0, 50));
		allLayout.setLeft(imageLabel);

		// 2. value label
		Label valueLabel = new Label("Values");
		valueLabel.setFont(new Font("Cambria", 50));
		valueLabel.setRotate(90);

		valueLabel.setOnMouseEntered(e -> {
			valueLabel.setScaleX(1.5);
			valueLabel.setScaleY(1.5);
		});

		valueLabel.setOnMouseExited(e -> {
			valueLabel.setScaleX(1);
			valueLabel.setScaleY(1);
		});

		allLayout.setCenter(valueLabel);

		// 3. "A label that needs to be wrapped" label
		Label contentLabel = new Label("A label that\nneeds to be\nwrapped");

		contentLabel.setOnMouseEntered(e -> {
			contentLabel.setScaleX(1.5);
			contentLabel.setScaleY(1.5);
		});

		contentLabel.setOnMouseExited(e -> {
			contentLabel.setScaleX(1);
			contentLabel.setScaleY(1);
		});

		contentLabel.setPadding(new Insets(100, 50, 0, 0));
		allLayout.setRight(contentLabel);

		primaryStage.setTitle("event");
		primaryStage.setScene(new Scene(allLayout, 700, 300));
		primaryStage.show();

	}
}
