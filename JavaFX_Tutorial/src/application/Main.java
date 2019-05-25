package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	GridPane grid = new GridPane();
	Scene scene = new Scene(grid, 550, 400);

	@Override
	public void start(Stage stage) {
		try {

			// stage > scene > container > node

			Label label1 = new Label("AA");
			Label label2 = new Label("B");
			Label label3 = new Label("C");
			
			label1.setStyle("-fx-border-color:black; -fx-font-size:30;");
			label2.setStyle("-fx-border-color:black; -fx-font-size:30;");
			label3.setStyle("-fx-border-color:black; -fx-font-size:30;");
			
			grid.add(label1, 0, 0, 2, 1);
			grid.add(label2, 0, 1, 1, 1);
			grid.add(label3, 1, 1, 1, 1);
			
			grid.setAlignment(Pos.CENTER);
			
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
