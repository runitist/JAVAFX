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
	Scene scene = new Scene(grid, 400, 400);
	
	@Override
	public void start(Stage stage) {
		try {

			// stage > scene > container > node
			Label label1 = new Label("Hello");
			Label label2 = new Label("World");

			grid.setAlignment(Pos.CENTER);
			grid.setHgap(10);
			grid.setVgap(10);
			
			grid.addColumn(0, label1, label2);
//			grid.addRow(1,label1, label2);
			
			stage.setScene(scene);
			stage.setTitle("¹ÙµÏÆÇ Á¤·Ä");
			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
