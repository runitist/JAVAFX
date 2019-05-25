package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {

			// stage > scene > container > node
			Label text = new Label();
			text.setText("Hello World!");
			// css 사용가능.
			text.setStyle("-fx-font-size: 30;-fx-text-fill: orange;-fx-background-color:yellow;-fx-border-color: red;");

			StackPane pane = new StackPane();
			pane.getChildren().add(text);

			Scene scene = new Scene(pane, 500, 300);

			stage.setScene(scene);
			stage.setTitle("헬로 월드");
			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
