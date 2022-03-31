package sceneBuilderEvent5;

import javafx.scene.Parent;
import javafx.stage.Stage;

public class CommonService {
	
	public void windowClose(Parent form) {
		Stage stage = (Stage) form.getScene().getWindow();
		stage.close();
	}

}
