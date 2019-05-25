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
			});//람다식 사용. 메소드가 하나뿐인 인터페이스를 구현할때 마치 메소드 하나만 구현하고 넘겨주는 효과. 익명 클래스 생성
			
			
			StackPane pane = new StackPane();
			pane.getChildren().addAll(label, button);
			Scene scene = new Scene(pane, 200, 200);
			StackPane.setAlignment(button, Pos.BOTTOM_CENTER);//모든 stackpane 내부 노드를 정렬, Pos 객체의 상수를 이용하여 화면 좌표계 설정.

			stage.setScene(scene);
			stage.setTitle("카운터기");
			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
