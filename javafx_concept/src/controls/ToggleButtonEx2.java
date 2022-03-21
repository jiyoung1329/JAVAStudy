package controls;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ToggleButtonEx2 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		PasswordField text1 = new PasswordField();
		PasswordField text2 = new PasswordField();
		text1.setMaxSize(180, 60);
		text2.setMaxSize(180, 60);
		
		VBox box = new VBox();
		box.getChildren().addAll(text1, text2);
		box.setAlignment(Pos.CENTER);
		box.setSpacing(10);
		
		primaryStage.setTitle("PasswordFieldEx");
		primaryStage.setScene(new Scene(box, 400, 150));
		primaryStage.show();
		
		
		
		
	}
	

}
