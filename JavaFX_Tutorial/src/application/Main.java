package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

	Canvas canvas = new Canvas(800, 500);
	GraphicsContext gc;
	ColorPicker cp = new ColorPicker();
	Slider slider = new Slider();
	Label label = new Label();
	GridPane grid = new GridPane();

	StackPane pane = new StackPane();
	Scene scene = new Scene(pane, 800, 500);

	@Override
	public void start(Stage stage) {
		try {
			gc = canvas.getGraphicsContext2D();
			gc.setLineWidth(1);

			pane.getChildren().addAll(canvas, grid);
			grid.addRow(0, cp, slider, label);
			
			slider.setMin(1);
			slider.setMax(100);
			slider.setShowTickLabels(true);
			slider.setShowTickMarks(true);
			slider.valueProperty().addListener(e->{
				double value = slider.getValue();
				String str = String.format("%.1f", value);
				label.setText(str);
				gc.setLineWidth(value);
			});
			
			
			cp.setValue(Color.BLACK);
			cp.setOnAction(e->{
				gc.setStroke(cp.getValue());
			});

			scene.setOnMousePressed(e -> {
				gc.beginPath();
				gc.lineTo(e.getSceneX(), e.getSceneY());
				gc.stroke();
			});

			scene.setOnMouseDragged(e -> {
				gc.lineTo(e.getSceneX(), e.getSceneY());
				gc.stroke();
			});

			stage.setScene(scene);
			stage.setTitle("±×¸²ÆÇ");
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
