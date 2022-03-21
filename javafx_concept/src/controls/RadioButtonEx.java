package controls;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RadioButtonEx extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		RadioButton check1 = new RadioButton("체크1");
		RadioButton check2 = new RadioButton("체크2");
		
		ToggleGroup group = new ToggleGroup();
		check1.setToggleGroup(group);
		check2.setToggleGroup(group);
		
		check1.setText("멍때리기");
		check2.setText("침대와 혼연일채");

		check1.setSelected(true);
		
		System.out.println("check1 : " + check1.isSelected());
		System.out.println("check2 : " + check2.isSelected());
		
		HBox box = new HBox();
		box.getChildren().addAll(check1, check2);
		box.setAlignment(Pos.CENTER);
		box.setSpacing(10);
		
		primaryStage.setTitle("CheckBoxEx");
		primaryStage.setScene(new Scene(box, 300, 100));
		primaryStage.show();
		
	}

}
