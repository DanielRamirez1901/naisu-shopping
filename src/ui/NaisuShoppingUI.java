package ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Thread.ProgressBarThread;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import model.NaisuShopping;
import model.LoadingBar;

public class NaisuShoppingUI implements Initializable{
	
	private LoadingBar loadBar;
	private NaisuShopping ns;
	//Loading Interface attributes
	 @FXML
	    private BorderPane mainBorderPane;

	    @FXML
	    private Rectangle loadBarShape;

	    @FXML
	    private Label txtPercent;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

	public NaisuShoppingUI(NaisuShopping nsh) {
		ns = nsh;
		loadBar = new LoadingBar();
	}



	public void loadInterface () throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("loadingInterface.fxml"));
		
		fxmlLoader.setController(this);
		
		Parent progressPane = fxmlLoader.load();
		
		mainBorderPane.getChildren().clear();
    	mainBorderPane.setCenter(progressPane); 	
    	 loadBar.setActive(true);
		 new ProgressBarThread(loadBar,this).start();
		 
	}
	public void updateBar() {
		txtPercent.setText((int)(loadBar.getProgressLevel()/(2.12))+"%");
		 loadBarShape.setWidth(loadBar.getProgressLevel());
		 if(loadBar.isActive()==false) {
			 try {
				loadCreateAccountInterface();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		
	}
	
	private void loadCreateAccountInterface() throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("createAccountInterface.fxml"));
		
		fxmlLoader.setController(this);
		
		Parent loginPane = fxmlLoader.load();
		
		mainBorderPane.getChildren().clear();
    	mainBorderPane.setCenter(loginPane);
    	Stage st = (Stage)
    	loginPane.getScene().getWindow();
    	st.setHeight(650);
    	st.setWidth(460);
		
	}
		
	}
	


