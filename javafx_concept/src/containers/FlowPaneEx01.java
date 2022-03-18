package containers;


import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneEx01 extends Application{
	public static void main(String[] args) {
		launch(args);
		
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		FlowPane flow = new FlowPane();
		
		ArrayList<Button> buttons = new ArrayList<Button>();
		for (int i=0; i<15; i++) {
			buttons.add(new Button("버튼 " + i));
			flow.getChildren().add(buttons.get(i));
		}
//		Button button1 = new Button("버튼1");
//		Button button2 = new Button("버튼2");
//		Button button3 = new Button("버튼3");
		
		
		
		
//		flow.getChildren().add(button1);
//		flow.getChildren().addAll(button2, button3);

		flow.setHgap(30); // 가로
		flow.setVgap(50); //세로
		primaryStage.setScene(new Scene(flow, 200, 500));
		primaryStage.show();
		
	}

}
