package application;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) {
		try {

			StackPane pane = new StackPane();
			Scene scene = new Scene(pane, 500, 500);
			
			Image image1 = new Image(new FileInputStream(this.getClass().getResource("").getPath()+"../../image/benjamin.jpg"));
			Image image2 = new Image(new FileInputStream(this.getClass().getResource("").getPath()+"../../image/benjamin-suter-1618674-unsplash.jpg"));
			Image image3 = new Image(new FileInputStream(this.getClass().getResource("").getPath()+"../../image/benjamin-suter-1618675-unsplash.jpg"));
			Image image4 = new Image(new FileInputStream(this.getClass().getResource("").getPath()+"../../image/ethan-dow-1617301-unsplash.jpg"));
			Image image5 = new Image(new FileInputStream(this.getClass().getResource("").getPath()+"../../image/jonathan-borba-1618090-unsplash.jpg"));
			Image def = new Image(new FileInputStream(this.getClass().getResource("").getPath()+"../../image/rawkkim-1612965-unsplash.jpg"));
			
			ImageView iv = new ImageView();
			iv.setFitWidth(pane.getWidth());
			iv.setPreserveRatio(true);
			
			Label label1 = new Label(" 1 ");
			Label label2 = new Label(" 2 ");
			Label label3 = new Label(" 3 ");
			Label label4 = new Label(" 4 ");
			Label label5 = new Label(" 5 ");
			
			GridPane grid = new GridPane();
			grid.addRow(0, label1, label2, label3, label4, label5);
			grid.setAlignment(Pos.BOTTOM_CENTER);
			
			Map<Label, Image> map = new LinkedHashMap<Label, Image>();
			map.put(label1, image1);
			map.put(label2, image2);
			map.put(label3, image3);
			map.put(label4, image4);
			map.put(label5, image5);
			
			iv.setImage(def);
			
			pane.getChildren().add(iv);
			pane.getChildren().add(grid);
			
			for (Label label : map.keySet()) {
				label.setStyle("-fx-border-color: black; -fx-font-size: 20;");
				label.setOnMouseEntered(e->{
					iv.setImage(map.get(label));
				});
				label.setOnMouseExited(e->{
					iv.setImage(def);
				});
			}
			
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
