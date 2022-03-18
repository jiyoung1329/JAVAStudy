package containers;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Quiz01 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane grid = new GridPane();
		
		// 메뉴 홈 로그인
		BorderPane topPane = new BorderPane();
		topPane.setStyle("-fx-background-color:pink");
		topPane.setPadding(new Insets(10, 50, 10, 0));
		Label label = new Label("메뉴 홈 로그인");
		label.setPrefSize(120, 20);
		topPane.setRight(label);
		
		// 메뉴 나열
		BorderPane leftPane = new BorderPane();
		leftPane.setStyle("-fx-background-color:skyblue");
		leftPane.setPadding(new Insets(0, 30, 0, 0));
		Button Menu = new Button("메뉴 나열");
		leftPane.setLeft(Menu);

		// 내용 들어가는 곳
		BorderPane centerPane = new BorderPane();
		centerPane.setStyle("-fx-background-color:yellowGreen");
		Button content = new Button("내용 들어가는 곳");
		content.setPrefSize(150, 25);
		centerPane.setTop(content);

		// 로그인
		GridPane rightPane = new GridPane();
		rightPane.setStyle("-fx-background-color:lightYellow");
		Button id = new Button("아이디 입력");
		Button pw = new Button("비밀번호 입력");
		Button login = new Button("로그인");
		id.setPrefSize(130, 25);
		pw.setPrefSize(130, 25);
		login.setPrefSize(70, 60);
		rightPane.add(id, 0, 0, 1, 1);
		rightPane.add(pw, 0, 1, 1, 1);
		rightPane.add(login, 1, 0, 1, 2);
		rightPane.setPadding(new Insets(20, 10, 80, 20));
		
		// 바닥글 나열
		BorderPane bottomPane = new BorderPane();
		bottomPane.setStyle("-fx-background-color:#bc5e00");
		Button bottomContent = new Button("바닥글 들어가는 곳");
		bottomPane.setCenter(bottomContent);

		grid.add(topPane, 0, 0, 3, 1); 
		grid.add(leftPane, 0, 1, 1, 1); 
		grid.add(centerPane, 1, 1, 1, 1); 
		grid.add(rightPane, 2, 1, 1, 1); 
		grid.add(bottomPane, 0, 2, 3, 1); 
		
		Scene scene = new Scene(grid);
		primaryStage.setTitle("Quiz");
		primaryStage.setScene(scene);
		primaryStage.show();
				
		
	
	}
	

}
