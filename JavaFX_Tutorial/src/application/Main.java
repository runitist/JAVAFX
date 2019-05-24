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
			
			Pane pane = new Pane();//�����̳�
			
			Scene scene = new Scene(pane, 800, 500);//��
			
			primaryStage.setScene(scene);//��������
			
			primaryStage.show();
			primaryStage.setTitle("������ GUI");
			primaryStage.setResizable(false);//�������� â ������ ���� �Ұ�.
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
