package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			//stage > scene > container > node
			
			Pane pane = new Pane();//컨테이너
			
			Scene scene = new Scene(pane, 800, 500);//씬
			
			primaryStage.setScene(scene);//스테이지
			
			primaryStage.show();
			primaryStage.setTitle("이현우 GUI");
			primaryStage.setResizable(false);//스테이지 창 사이즈 변경 불가.
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
