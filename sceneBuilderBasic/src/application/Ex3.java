package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ex3 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Ex3.fxml"));
		
		Parent form = loader.load();
		
		primaryStage.setScene(new Scene(form));
		primaryStage.setTitle("Ex3");
		primaryStage.show();
		
		
	}

}
