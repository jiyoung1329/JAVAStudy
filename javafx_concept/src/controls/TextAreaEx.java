package controls;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextAreaEx extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		TextArea area = new TextArea();
		
		HBox box = new HBox();
		box.getChildren().add(area);
		box.setAlignment(Pos.CENTER);
		
		primaryStage.setTitle("comboBoxEx");
		primaryStage.setScene(new Scene(box, 200, 100));
		primaryStage.show();
		
	}
	

}
