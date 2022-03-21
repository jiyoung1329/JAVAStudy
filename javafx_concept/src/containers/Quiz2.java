package containers;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz2 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane p1 = new Pane();
		Pane p2 = new Pane();
		Pane p3 = new Pane();
		Pane p4 = new Pane();
		Pane p5 = new Pane();
		Pane p6 = new Pane();
		
		
		p1.setPrefHeight(100);
		p1.setPrefWidth(100);
		p1.setStyle("-fx-background-color : blue");


		p2.setPrefWidth(100);
		p2.setMaxHeight(120);
		p2.setStyle("-fx-background-color : red");
		
		p3.setPrefWidth(150);
		p3.setMaxHeight(120);
		p3.setStyle("-fx-background-color : black");		

		HBox hbox1 = new HBox();
		hbox1.getChildren().addAll(p1, p2, p3);
		hbox1.setSpacing(10);
		
		p4.setPrefWidth(100);
		p4.setPrefHeight(100);
		p4.setStyle("-fx-background-color : blue");

		p5.setPrefWidth(100);
		p5.setMaxHeight(120);
		p5.setStyle("-fx-background-color : red");
		
		p6.setPrefWidth(150);
		p6.setMaxHeight(120);
		p6.setStyle("-fx-background-color : black");		
		
		HBox hbox2 = new HBox();
		hbox2.getChildren().addAll(p4, p5, p6);
		hbox2.setSpacing(10);

		VBox box = new VBox();
		box.getChildren().addAll(hbox1, hbox2);
		box.setSpacing(10);
		box.setPadding(new Insets(10));
		
		Scene scene1 = new Scene(box, 400, 300);
		primaryStage.setTitle("Quiz02");
		primaryStage.setScene(scene1);
		primaryStage.show();
		
	}

}
