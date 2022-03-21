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

public class StackPaneEx1 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Rectangle rec = new Rectangle(100, 100, Color.WHITE);
		Label label = new Label("사각형 안의 텍스스트");
		
		StackPane stack = new StackPane();
		stack.getChildren().addAll(rec, label);
		
		Scene scene = new Scene(stack, 300, 200);
		primaryStage.setTitle("BorderPane");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		
	}

}
