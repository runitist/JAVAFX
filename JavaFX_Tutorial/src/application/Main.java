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

			for (int y = 0; y < 10; y++) {
				for (int x = 0; x < 10; x++) {
					Label label = new Label();
					label.setStyle("-fx-border-color:black;-fx-font-size:15");
					label.setText(" (" + x + ", " + y + ") ");
					grid.addRow(y, label);
				}
			}
			
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
