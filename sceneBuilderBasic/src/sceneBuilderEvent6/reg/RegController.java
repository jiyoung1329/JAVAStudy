package sceneBuilderEvent6.reg;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import sceneBuilderEvent6.common.CommonService;

public class RegController implements Initializable{
	private RegService regSvc;
	private Parent regForm;
	
	public void setRegForm(Parent regForm) {
		this.regForm = regForm;
	}
	
	public void regProc() {
		regSvc.regProc(regForm);
	}
	
	public void regCancelProc() {
		CommonService.windowClose(regForm);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		regSvc = new RegService();
	}
	
}
