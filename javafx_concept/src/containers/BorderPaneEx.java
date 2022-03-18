package containers;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneEx extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button[] buttons = new Button[5];
		String[] texts = {"TOP", "LEFT", "CENTER", "RIGHT", "BOTTOM"};
		
		for (int i=0; i<buttons.length; i++) {
			buttons[i] = new Button(texts[i]);
		}
		
		BorderPane border = new BorderPane();
		border.setTop(buttons[0]);
		border.setLeft(buttons[1]);
		border.setCenter(buttons[2]);
		border.setRight(buttons[3]);
		border.setBottom(buttons[4]);
		
		Scene scene = new Scene(border, 300, 200);
		primaryStage.setTitle("BorderPane");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
