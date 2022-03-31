package sceneBuilderEvent5;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginService {
	
	@FXML private TextField id;
	@FXML private PasswordField pw;
	
	
	public void loginProc(String id, String pw) {
		System.out.println(id);
		System.out.println(pw);
	}
	
	public void cancelProc(TextField id, PasswordField pw) {
		id.clear();
		pw.clear();
		id.requestFocus();
	}
	
	public void registerProc() throws Exception{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("regForm.fxml"));
		Parent regForm = loader.load();
		Controller con = loader.getController();
		con.setRegForm(regForm);
		
		ComboBox<String> combo = (ComboBox<String>) regForm.lookup("#ageCombo");
		combo.getItems().addAll("10대", "20대", "30대", "40대");
		
		Scene scene = new Scene(regForm);
		Stage stage = new Stage();
		stage.setTitle("register");
		stage.setScene(scene);
		stage.show();
		
	}

	public void regCancelProc(Parent regForm) {
		CommonService commonSvc = new CommonService();
		commonSvc.windowClose(regForm);
	}
	
	
}
