package events;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Quiz2 extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	public static Button makeButton(ImageView image) {
		Button button = new Button();
		image.setFitHeight(54);
		image.setFitWidth(55);
		button.setGraphic(image);
		button.setStyle("-fx-background-color: transparent; -fx-padding: 0");
		button.setPrefSize(55, 54);
		
		return button;
	}
	public static void press(Button button) {
		button.setStyle("-fx-background-color: transparent; -fx-padding: 1 0 0 0");
	}
	public static void release(Button button) {
		button.setStyle("-fx-background-color: transparent; -fx-padding: 0");
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// 버튼 생성
		Button warriorButton1 = makeButton(new ImageView("/img/warrior.png"));
		Button warriorButton2 = makeButton(new ImageView("/img/warrior.png"));
		Button warriorButton3 = makeButton(new ImageView("/img/warrior.png"));
		Button rogueButton = makeButton(new ImageView("/img/Rogue.png"));
		Button magiButton = makeButton(new ImageView("/img/magi.png"));
		
		
		// 레이아웃 배치
		StackPane allLayout = new StackPane();
		ImageView backImage = new ImageView("/img/L2Char.png");
		AnchorPane buttonLayout = new AnchorPane();
		
		HBox careerBox = new HBox();
		HBox hairBox = new HBox();
		HBox moveBox = new HBox();
		
		// 배경 이미지 설정
		backImage.setScaleX(1.2);
		backImage.setScaleY(1.2);
		
		// 각 박스에 버튼 추가
		careerBox.getChildren().addAll(warriorButton1, rogueButton, magiButton);
		careerBox.setLayoutX(22);
		careerBox.setLayoutY(97);
		careerBox.setSpacing(2);
		
		hairBox.getChildren().add(warriorButton2);
		hairBox.setLayoutX(21);
		hairBox.setLayoutY(203);

		moveBox.getChildren().add(warriorButton3);
		moveBox.setLayoutX(21);
		moveBox.setLayoutY(300);
		
		
		// 전체 레이아웃
		buttonLayout.getChildren().addAll(careerBox, hairBox, moveBox);
		allLayout.getChildren().addAll(backImage, buttonLayout);
		
		// 이벤트 설정
		warriorButton1.setOnMousePressed(e -> press(warriorButton1));
		warriorButton1.setOnMouseReleased(e -> release(warriorButton1));
		
		warriorButton2.setOnMousePressed(e -> press(warriorButton2));
		warriorButton2.setOnMouseReleased(e -> release(warriorButton2));
		
		warriorButton3.setOnMousePressed(e -> press(warriorButton3));
		warriorButton3.setOnMouseReleased(e -> release(warriorButton3));
		
		rogueButton.setOnMousePressed(e -> press(rogueButton));
		rogueButton.setOnMouseReleased(e -> release(rogueButton));
		
		magiButton.setOnMousePressed(e -> press(magiButton));
		magiButton.setOnMouseReleased(e -> release(magiButton));
		
		
		primaryStage.setTitle("event");
		primaryStage.setScene(new Scene(allLayout, 800, 450));
		primaryStage.show();

	}
}
