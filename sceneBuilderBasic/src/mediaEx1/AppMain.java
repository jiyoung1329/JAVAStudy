package mediaEx1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain  extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
		Parent mainForm = loader.load();
		
		primaryStage.setTitle("media");
		primaryStage.setScene(new Scene(mainForm));
		primaryStage.show();
		
		
		
	}
}
