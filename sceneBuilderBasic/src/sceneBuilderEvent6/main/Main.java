package sceneBuilderEvent6.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sceneBuilderEvent6.login.LoginController;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/sceneBuilderEvent6/login/loginForm.fxml"));
		
		Parent loginForm = loader.load();
		
		LoginController loginController = loader.getController();
		loginController.setLoginForm(loginForm);
		
		Controller controller = new Controller();
		controller.setLoginController(loginController);
		
		Scene scene = new Scene(loginForm);
		
		primaryStage.setTitle("loginForm");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
