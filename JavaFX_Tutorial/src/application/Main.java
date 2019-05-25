package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {

			// stage > scene > container > node
			Label label = new Label();
			label.setText("0");
			label.setStyle("-fx-font-size: 40");
			
			Button button = new Button();
			button.setText("Add");
			button.setStyle("-fx-font-size: 20");
			button.setOnAction(event->{
				label.setText((Integer.parseInt(label.getText())+1)+"");
			});//���ٽ� ���. �޼ҵ尡 �ϳ����� �������̽��� �����Ҷ� ��ġ �޼ҵ� �ϳ��� �����ϰ� �Ѱ��ִ� ȿ��. �͸� Ŭ���� ����
			
			
			StackPane pane = new StackPane();
			pane.getChildren().addAll(label, button);
			Scene scene = new Scene(pane, 200, 200);
			StackPane.setAlignment(button, Pos.BOTTOM_CENTER);//��� stackpane ���� ��带 ����, Pos ��ü�� ����� �̿��Ͽ� ȭ�� ��ǥ�� ����.

			stage.setScene(scene);
			stage.setTitle("ī���ͱ�");
			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
