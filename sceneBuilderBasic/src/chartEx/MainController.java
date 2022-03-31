package chartEx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

public class MainController implements Initializable{
	@FXML private AreaChart areaChart;
	@FXML private BarChart barChart;
	@FXML private PieChart pieChart;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		XYChart.Series series1 = new XYChart.Series();
		
		series1.setName("평균 온도");
		series1.setData(FXCollections.observableArrayList(
				new XYChart.Data<String, Integer>("2022-01", 5),
				new XYChart.Data<String, Integer>("2022-02", 10),
				new XYChart.Data<String, Integer>("2022-03", 13),
				new XYChart.Data<String, Integer>("2022-04", 19)
		));
		areaChart.getData().add(series1);
		
		XYChart.Series series2 = new XYChart.Series();
		series2.setName("확진자");
		series2.setData(FXCollections.observableArrayList(
				new XYChart.Data<String, Integer>("2022-01", 12345),
				new XYChart.Data<String, Integer>("2022-02", 23456),
				new XYChart.Data<String, Integer>("2022-03", 34567),
				new XYChart.Data<String, Integer>("2022-04", 1234)
		));
		
		XYChart.Series series3 = new XYChart.Series();
		
		series3.setName("중증환자");
		series3.setData(FXCollections.observableArrayList(
				new XYChart.Data<String, Integer>("2022-01", 1233),
				new XYChart.Data<String, Integer>("2022-02", 2344),
				new XYChart.Data<String, Integer>("2022-03", 3455),
				new XYChart.Data<String, Integer>("2022-04", 5666)
		));
		
		barChart.getData().add(series2);
		barChart.getData().add(series3);
		
		pieChart.setData(FXCollections.observableArrayList(
				new PieChart.Data("AWT", 10),
				new PieChart.Data("SWT", 25),
				new PieChart.Data("Swing", 30),
				new PieChart.Data("JavaFX", 35)
			));
	}

	

}
