package containers;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneEx2 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label1 = new Label("아이디 : ");
		Label label2 = new Label("비밀번호 : ");
		
		TextField id = new TextField();
		PasswordField pw = new PasswordField();
		
//		GridPane.setColumnIndex(label1, 0);
//		GridPane.setRowIndex(label1, 0);
		//
//		GridPane.setColumnIndex(id, 1);
//		GridPane.setRowIndex(id, 0);
//		
//		GridPane.setColumnIndex(label2, 0);
//		GridPane.setRowIndex(label2, 1);
//
//		GridPane.setColumnIndex(pw, 1);
//		GridPane.setRowIndex(pw, 1);
		GridPane.setConstraints(label1, 0, 0);
		GridPane.setConstraints(label2, 0, 1);
		GridPane.setConstraints(id, 1, 0);
		GridPane.setConstraints(pw, 1, 1);
		
		GridPane grid = new GridPane();
		grid.setHgap(40);
		grid.setVgap(20);
		grid.setPadding(new Insets(50, 0, 0, 30));
		grid.getChildren().addAll(label1, label2, id, pw);
		primaryStage.setScene(new Scene(grid, 300, 200));
		primaryStage.show();
	}

}
