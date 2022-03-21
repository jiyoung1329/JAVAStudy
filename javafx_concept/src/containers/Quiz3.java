package containers;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz3 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane p1 = new Pane();
		Pane p2 = new Pane();
		Pane p3 = new Pane();

		p1.setPrefHeight(100);
		p2.setPrefHeight(100);
		p3.setPrefHeight(210);
		
		p1.setPrefWidth(300);
		p2.setPrefWidth(300);
		p3.setPrefWidth(200);
		
		p1.setStyle("-fx-background-color: red");
		p2.setStyle("-fx-background-color: black");
		p3.setStyle("-fx-background-color: blue");
		
		
		VBox vbox1 = new VBox();
		vbox1.getChildren().addAll(p1, p2);
		vbox1.setSpacing(10);

		VBox vbox2 = new VBox();
		vbox2.getChildren().add(p3);
		vbox2.setSpacing(10);
		
		HBox box = new HBox();
		box.getChildren().addAll(vbox1, vbox2);
		box.setSpacing(10);
		box.setPadding(new Insets(10));

		
		Scene scene1 = new Scene(box, 600, 300);
		primaryStage.setTitle("Quiz03");
		primaryStage.setScene(scene1);
		primaryStage.show();

		
		
		
	}

}
