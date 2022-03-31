package sceneBuilderEvent2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main2 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("form2.fxml"));
		Parent root = loader.load();

		Controller2 con = loader.getController();
		con.setRoot(root);
		System.out.println(con);
		Scene scene = new Scene(root);

		primaryStage.setTitle("form");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
