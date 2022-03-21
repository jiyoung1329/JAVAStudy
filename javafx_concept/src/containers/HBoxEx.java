package containers;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class HBoxEx extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane p1 = new Pane();
		Pane p2 = new Pane();
		Pane p3 = new Pane();

		p1.setMaxHeight(100);
		p2.setMaxHeight(100);
		p3.setMaxHeight(100);
		
		p1.setPrefWidth(120);
		p2.setPrefWidth(120);
		p3.setPrefWidth(120);
		
		p1.setStyle("-fx-background-color: green");
		p2.setStyle("-fx-background-color: red");
		p3.setStyle("-fx-background-color: black");
		
		HBox box = new HBox();
		box.getChildren().addAll(p1, p2, p3);
		box.setSpacing(10);
		box.setPadding(new Insets(10));
		
		Scene scene = new Scene(box, 400, 200);
		primaryStage.setTitle("HBox");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
