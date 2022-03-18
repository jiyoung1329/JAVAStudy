package basic;

import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Quiz01 extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		
		int width = 1000;
		int height = 700;
		Label label = new Label("Quiz");
		Scene scene = new Scene(label, width, height);
		
		primaryStage.setX((screenSize.getWidth()/2) - (width/2));
		primaryStage.setY((screenSize.getHeight()/2) - (height/2));
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	
}
