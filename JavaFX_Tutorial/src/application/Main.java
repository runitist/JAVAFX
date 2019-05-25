package application;

import java.io.File;
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) {
		try {

			FileInputStream ips = new FileInputStream(this.getClass().getResource("").getPath()+"benjamin.jpg");
			Image image = new Image(ips);
			StackPane pane = new StackPane();
			Scene scene = new Scene(pane, 500, 500);
			ImageView iv = new ImageView();
			iv.setImage(image);
			iv.setRotate(-90);
			iv.setFitWidth(pane.getWidth());
			iv.setPreserveRatio(true);
			
			pane.getChildren().add(iv);
			
			stage.setScene(scene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
