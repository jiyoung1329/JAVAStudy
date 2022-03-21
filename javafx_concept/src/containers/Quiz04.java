package containers;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Quiz04 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// 전체 레이아웃
		BorderPane border = new BorderPane();
		
		// 상단바
		FlowPane flow = new FlowPane();
		
		ArrayList<Label> labels = new ArrayList<Label>();
		labels.add(new Label("메뉴"));
		labels.add(new Label("홈"));
		labels.add(new Label("로그인"));
		
		flow.getChildren().addAll(labels);
		flow.setStyle("-fx-background-color: pink");
		flow.setAlignment(Pos.TOP_RIGHT);
		flow.setHgap(10);
		flow.setPadding(new Insets(10, 100, 10, 10));
		
		// Content(list, 내용, 로그인, 바닥글)
		GridPane grid = new GridPane();
		
		// List
		FlowPane listFlow = new FlowPane();
		ListView<String> list = new ListView<>();
		list.getItems().addAll("item1", "item2", "item3");
		list.setPrefSize(100, 150);
		listFlow.getChildren().add(list);
		listFlow.setPrefSize(100, 180);
		
		grid.add(listFlow, 0, 0);
		
		
		// 내용들어가는곳
		FlowPane buttonFlow = new FlowPane();
		Button contentButton = new Button("내용 들어가는 곳");
		contentButton.setPrefSize(150, 20);
		buttonFlow.getChildren().add(contentButton);
		buttonFlow.setPrefWidth(150);
		
		grid.add(buttonFlow, 1, 0);
		
		// 로그인
		GridPane loginGrid = new GridPane();
		
		Button idButton = new Button("아이디 입력");
		idButton.setPrefSize(150, 20);

		Button pwButton = new Button("비밀번호 입력");
		pwButton.setPrefSize(150, 20);
		
		Button loginButton = new Button("로그인");
		loginButton.setPrefSize(100, 60);
		
		loginGrid.add(idButton, 0, 0);
		loginGrid.add(pwButton, 0, 1);
		loginGrid.add(loginButton, 1, 0, 1, 2);
		
		loginGrid.setPrefWidth(200);
		loginGrid.setPadding(new Insets(10));
		
		grid.add(loginGrid, 2, 0);
		
		// 바닥글
		FlowPane bottomFlow = new FlowPane();
		Button bottomButton = new Button("바닥글 들어가는 곳");
		bottomButton.setPrefSize(200, 20);
		bottomFlow.getChildren().add(bottomButton);
		bottomFlow.setAlignment(Pos.CENTER);
		bottomFlow.setPrefHeight(20);
		
		grid.add(bottomFlow, 0, 1, 3, 1);
		
		
		
		// Content에 이미지 삽입
		ImageView iv = new ImageView("/img/quiz.jpg");
		StackPane stack = new StackPane();
		stack.getChildren().addAll(iv, grid);

		// 전체레이아웃 합치기
		border.setTop(flow);
		border.setBottom(stack);
		
		primaryStage.setTitle("Quiz04");
		primaryStage.setScene(new Scene(border, 450, 250));
		primaryStage.show();
	}

}
