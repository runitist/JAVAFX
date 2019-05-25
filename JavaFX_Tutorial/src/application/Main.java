package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	StackPane pane = new StackPane();
	GridPane grid = new GridPane();
	Scene scene = new Scene(pane, 100, 100);

	@Override
	public void start(Stage stage) {
		try {

			// stage > scene > container > node
			Button button1 = new Button("Button1");
			Button button2 = new Button("Button1");
			button1.prefWidthProperty().bind(pane.widthProperty());;
			button1.prefHeightProperty().bind(pane.heightProperty());;
			button2.prefWidthProperty().bind(pane.widthProperty());;
			button2.prefHeightProperty().bind(pane.heightProperty());;
//			button2.setMinHeight(20);
//			button2.setMinWidth(75);
			button2.setMaxHeight(200);
			button2.setMaxWidth(200);
//			button2.setMinSize(minWidth, minHeight);
			
			grid.addRow(0, button1, button2);
			
			pane.getChildren().add(grid);
			pane.setStyle("-fx-border-color: black;");

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
