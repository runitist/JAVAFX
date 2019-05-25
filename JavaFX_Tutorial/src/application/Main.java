package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	Label lName = new Label("UserName: ");
	Label lPassword = new Label("Password: ");
	Label lMessage = new Label();
	TextField tfName = new TextField();
	PasswordField tfPassword = new PasswordField();

	Button button = new Button("Login");

	GridPane grid = new GridPane();

	StackPane pane = new StackPane();
	Scene scene = new Scene(pane, 800, 500);

	@Override
	public void start(Stage stage) {
		try {
			button.prefHeightProperty().bind(tfName.heightProperty().add(tfPassword.heightProperty()));
			grid.addRow(0, lName, tfName);
			grid.addRow(1, lPassword, tfPassword);
			grid.add(button, 2, 0, 1, 2);
			grid.add(lMessage, 0, 2, 3, 1);
			grid.setAlignment(Pos.CENTER);
			
			button.setOnAction(e->{
				lMessage.setStyle("-fx-text-fill: red;");
				String name = tfName.getText();
				String password = tfPassword.getText();
				if(name.equals("")) {
					lMessage.setText("Please enter your name");
				}else if(password.equals("")) {
					lMessage.setText("Please enter your password");
				}else if(!name.equals("Rin")||!password.equals("password")) {//로그인 정보 유효성 검증
					lMessage.setText("access denied");
				}else {
					lMessage.setStyle("-fx-text-fill: green;");
					lMessage.setText("access acquired");
				}
			});

			pane.getChildren().add(grid);

			stage.setScene(scene);
			stage.setTitle("로그인");
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
