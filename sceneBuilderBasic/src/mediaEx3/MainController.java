package mediaEx3;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class MainController implements Initializable{
	
	@FXML private MediaView mediaView;
	@FXML private Button playButton;
	@FXML private Button pauseButton;
	@FXML private Button stopButton;
	@FXML private ProgressBar progressBar;
	@FXML private ProgressIndicator progressIndicator;
	@FXML private Label labelTime;
	
	private MediaPlayer mediaPlayer;
	private boolean endOfMedia;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Media media = new Media(getClass().getResource("/media/video.m4v").toString());
		mediaPlayer = new MediaPlayer(media); 
		mediaView.setMediaPlayer(mediaPlayer);
		
		mediaPlayer.setOnEndOfMedia(() -> {
			endOfMedia = true;
			playButton.setDisable(false);
			
		});
		
		mediaPlayer.setOnPlaying(() ->{
			playButton.setDisable(true);
			pauseButton.setDisable(false);
			stopButton.setDisable(false);
			
		});
		mediaPlayer.setOnPaused(() ->{
			playButton.setDisable(false);
			pauseButton.setDisable(true);
			stopButton.setDisable(false);
			
		});
		mediaPlayer.setOnStopped(() ->{
			playButton.setDisable(false);
			pauseButton.setDisable(true);
			stopButton.setDisable(true);
			
		});
		mediaPlayer.currentTimeProperty().addListener((property, before, after) ->{
			double value = mediaPlayer.getCurrentTime().toSeconds() / mediaPlayer.getTotalDuration().toSeconds();
			progressBar.setProgress(value);
			progressIndicator.setProgress(value);
			String time = (int)(mediaPlayer.getCurrentTime().toSeconds()) + " / "
					+ (int) (mediaPlayer.getTotalDuration().toSeconds()) + "sec";
			labelTime.setText(time);
		});
	}

	public void play() {
		if (endOfMedia) {
			stop();
		}
		
		mediaPlayer.play();
		endOfMedia = false;
	}
	
	public void pause() {
		mediaPlayer.pause();
		
	}
	
	public void stop() {
		mediaPlayer.stop();
		mediaPlayer.seek(mediaPlayer.getStartTime());
		
	}

	
}
