package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	private NaisuShoppingUI naisu;
	
	public Main() {
		naisu = new NaisuShoppingUI();
	}
	
	public static void main(String []args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("loadingInterface.fxml"));
		fxmlLoader.setController(this);
		
		Parent root = fxmlLoader.load();
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Naisu Shopping");
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	

}
