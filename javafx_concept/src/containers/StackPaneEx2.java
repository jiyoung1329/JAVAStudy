package containers;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class StackPaneEx2 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label = new Label("스마일 이미지");
		BorderPane border = new BorderPane();
		border.setBottom(label);
		
		ImageView iv = new ImageView("/img/smilerere.png");
		StackPane stack = new StackPane();
		stack.getChildren().addAll(iv, border);
		
		Scene scene = new Scene(stack, 300, 200);
		primaryStage.setTitle("BorderPane");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
