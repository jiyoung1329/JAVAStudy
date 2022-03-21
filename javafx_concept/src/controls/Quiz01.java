package controls;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz01 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// 전체 레이아웃
		GridPane allLayout = new GridPane();
	
		// 1. 상단바
		FlowPane topPane = new FlowPane();
		
		ArrayList<Label> labels = new ArrayList<Label>();
		labels.add(new Label("홈"));
		labels.add(new Label("사회"));
		labels.add(new Label("경제"));
		labels.add(new Label("국제"));
		labels.add(new Label("문화"));
		
		topPane.getChildren().addAll(labels);
		topPane.setHgap(30);
		topPane.setAlignment(Pos.CENTER);
		topPane.setPadding(new Insets(30));
		
		allLayout.add(topPane, 0, 0, 2, 1);
		
		// 2. 카테고리
		VBox categoryBox = new VBox();
		ArrayList<Label> categories = new ArrayList<Label>();
		categories.add(new Label("카테고리"));
		categories.add(new Label("노트북/PC"));
		categories.add(new Label("자동차용품"));
		categories.add(new Label("휴대폰"));
		categories.add(new Label("캠핑/낚시"));
		categoryBox.getChildren().addAll(categories);
		categoryBox.setSpacing(20);
		categoryBox.setPadding(new Insets(0, 50, 50, 10));
		
		allLayout.add(categoryBox, 0, 1);
		
		// 3. content
		HBox contentBox = new HBox();
		// 3-1. Form
		VBox formBox = new VBox();
		
		// id / pw
		HBox idPwBox = new HBox();

		VBox idPwLabelBox = new VBox();
		VBox idPwTextBox = new VBox();
		
		Label idLabel = new Label("ID");
		Label pwLabel = new Label("PW");
		
		TextField idField = new TextField();
		PasswordField pwField = new PasswordField();

		idPwLabelBox.getChildren().addAll(idLabel, pwLabel);
		idPwTextBox.getChildren().addAll(idField, pwField);
		idPwLabelBox.setPadding(new Insets(5, 20, 0, 0));
		idPwLabelBox.setSpacing(30);
		idPwTextBox.setSpacing(20);
		
		idPwBox.getChildren().addAll(idPwLabelBox, idPwTextBox);
		
		// 라디오박스(성별)
		HBox genderBox = new HBox();
		
		RadioButton manButton = new RadioButton();
		RadioButton womanButton = new RadioButton();
		
		ToggleGroup genderGroup = new ToggleGroup();
		manButton.setToggleGroup(genderGroup);
		womanButton.setToggleGroup(genderGroup);
		
		manButton.setText("남");
		womanButton.setText("여");
		
		manButton.setSelected(true);
		
		genderBox.getChildren().addAll(manButton, womanButton);
		genderBox.setSpacing(20);
		
		// 체크박스(게임, 공부)
		HBox hobbyBox = new HBox();
		
		CheckBox gameCheck = new CheckBox();
		CheckBox studyCheck = new CheckBox();
		
		gameCheck.setText("게임");
		studyCheck.setText("공부");
		
		gameCheck.setSelected(true);
		studyCheck.setSelected(true);
		
		hobbyBox.getChildren().addAll(gameCheck, studyCheck);
		hobbyBox.setSpacing(20);
		
		// 하고싶은말
		Label sayLabel = new Label("하고 싶은 말");
		TextArea sayArea = new TextArea();
		sayArea.setPrefSize(200, 100);
		
		// formBox에 합치기
		formBox.setSpacing(20);
		formBox.getChildren().addAll(idPwBox, genderBox, hobbyBox, sayLabel, sayArea);
		formBox.setPadding(new Insets(0, 0, 30, 0));
		
		
		// 3-1. Login
		HBox loginBox = new HBox();
		VBox loginTextBox = new VBox();
		
		TextField loginIdField = new TextField();
		TextField loginPwField = new TextField();
		Button loginButton = new Button("로그인");
		loginButton.setPrefHeight(60);
		
		loginTextBox.getChildren().addAll(loginIdField, loginPwField);
		loginBox.getChildren().addAll(loginTextBox, loginButton);
		loginTextBox.setSpacing(5);
		loginBox.setSpacing(5);
		loginBox.setPadding(new Insets(0, 30, 0, 0));
		
		// contentBox에 합치기
		contentBox.getChildren().addAll(formBox, loginBox);
		contentBox.setSpacing(30);
		
		allLayout.add(contentBox, 1, 1);
		
		
		primaryStage.setTitle("Quiz01");
		primaryStage.setScene(new Scene(allLayout));
		primaryStage.show();
		
		
		
	}

}
