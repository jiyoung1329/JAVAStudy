package controls;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LabelEx1 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label = new Label("레이블");
		
		label.setPrefSize(200, 30);
		label.setAlignment(Pos.CENTER);
		label.setText("메소드로 입력한 텍스트 aaaaa");
		label.setGraphic(new ImageView("/img/search.png"));
		label.setTextFill(Color.web("#ff0000"));
		label.setWrapText(true);
		
		HBox box = new HBox();
		box.getChildren().add(label);
		box.setPrefSize(300, 200);
		box.setPadding(new Insets(50, 10, 10, 50));
		
		primaryStage.setTitle("comboBoxEx");
		primaryStage.setScene(new Scene(box));
		primaryStage.show();
		
	}
	

}
