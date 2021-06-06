package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Market;

public class Main extends Application{
	
	private NaisuShoppingUI naisu;
	private Market market;
	
	public Main() {
		market = new Market();
		naisu = new NaisuShoppingUI(market);
	}
	
	public static void main(String []args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainPanel.fxml"));
		fxmlLoader.setController(naisu);
		
		Parent root = fxmlLoader.load();
		naisu.loadInterface();
		Scene scene = new Scene(root,450,620);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Naisu Shopping");
		primaryStage.setResizable(false);
		
		primaryStage.show();
		
	}
	

}
