package ui;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Thread.ProgressBarThread;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import model.*;

public class NaisuShoppingUI implements Initializable{
	
	private LoadingBar loadBar;
	private Market market;
	private Seller seller;
	private Buyer buyer;
	
	//Loading Interface attributes
	 @FXML
	    private BorderPane mainBorderPane;

	    @FXML
	    private Rectangle loadBarShape;

	    @FXML
	    private Label txtPercent;

	    
	    //AddSellerAttributes
	    @FXML
	    private TextField txtSellername;

	    @FXML
	    private TextField txtSellerLastname;

	    @FXML
	    private TextField txtSellerDocument;

	    @FXML
	    private TextField txtSellerEmail;

	    @FXML
	    private TextField txtSellerPassword;

	    @FXML
	    private TextField txtSellerRePassword;

	    @FXML
	    private TextField txtSellerUsername;
	    
	    @FXML
	    private TextField txtPathImageSeller;
	    
	    //AddBuyerAttributes
	    @FXML
	    private TextField txtBuyerName;

	    @FXML
	    private TextField txtBuyerLastname;

	    @FXML
	    private TextField txtBuyerDocument;

	    @FXML
	    private TextField txtBuyerEmail;

	    @FXML
	    private TextField txtBuyerPassword;

	    @FXML
	    private TextField txtBuyerRePassword;

	    @FXML
	    private TextField txtBuyerUser;
	    
	    @FXML
	    private TextField txtPathImageBuyer;

	    //LoginWithPasswordSeller Attributes
	    @FXML
	    private TextField txtSellerUsernameLogin;

	    @FXML
	    private TextField txtSellerPasswordLogin;

	    //LoginWithPasswordBuyer Attributes
	    @FXML
	    private TextField txtBuyerUserLogin;

	    @FXML
	    private TextField txtBuyerPasswordLogin;
	    
	    //addClothes interface
	    
	    @FXML
	    private TextField txtClothesName;

	    @FXML
	    private TextField txtClothesCode;

	    @FXML
	    private TextField txtClothesMark;

	    @FXML
	    private TextField txtClothesPrice;

	    @FXML
	    private TextField txtClothesSize;

	    @FXML
	    private TextField txtClothesQuantity;

	    @FXML
	    private TextField txtClothesGender;

	    @FXML
	    private TextField txtClothePathImage;

	    @FXML
	    private TextField txtClothesDescription;

	    @FXML
	    private TextField txtClothesType;
	    
	    @FXML
	    private TextField txtClothesColor;
	    
	    //Clothes foot wear Attributes
	    @FXML
	    private TextField txtFootwearFabricType;

	    @FXML
	    private TextField txtFootwearType;

	    @FXML
	    private TextField txtFootwearDescription;
	    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

	public NaisuShoppingUI(Market mr) {
		market = mr;
		loadBar = new LoadingBar();
		
	}	

	public void addSeller(ActionEvent event) {
		if(!txtSellername.getText().equals("") && !txtSellerLastname.getText().equals("") && !txtSellerDocument.getText().equals("") && !txtSellerEmail.getText().equals("") && !txtSellerPassword.getText().equals("") && !txtSellerRePassword.getText().equals("") && !txtSellerUsername.getText().equals("") && !txtPathImageSeller.getText().equals("")) {
			if(txtSellerPassword.getText().equalsIgnoreCase(txtSellerRePassword.getText())) {
				seller = new Seller(txtSellername.getText(),txtSellerLastname.getText(),txtSellerDocument.getText(),txtSellerEmail.getText(),txtSellerPassword.getText(),txtSellerUsername.getText(),txtPathImageSeller.getText());
				market.addSeller(seller);
				userSuccesfullyRegistered(event);
			}else {
				areTheSamePassword(event);
			}
		}else {
			youNeedToFillTextFields(event);
		}
		
	}
	
	public void addBuyer(ActionEvent event) {
		if(!txtBuyerName.getText().equals("") && !txtBuyerLastname.getText().equals("") && !txtBuyerDocument.getText().equals("") && !txtBuyerEmail.getText().equals("") && !txtBuyerPassword.getText().equals("") && !txtBuyerRePassword.getText().equals("") && !txtBuyerUser.getText().equals("") && !txtPathImageBuyer.getText().equals("")) {
			if(txtBuyerPassword.getText().equalsIgnoreCase(txtBuyerRePassword.getText())) {
				buyer = new Buyer(txtBuyerName.getText(),txtBuyerLastname.getText(),txtBuyerDocument.getText(),txtBuyerEmail.getText(),txtBuyerPassword.getText(),txtBuyerUser.getText(),txtPathImageBuyer.getText());
				market.addBuyer(buyer);
				userSuccesfullyRegistered(event);
			}else {
				areTheSamePassword(event);
			}
		}else {
			youNeedToFillTextFields(event);
		}
	}
	
	public void addClothe(ActionEvent event) throws IOException {
		if(!txtClothesName.getText().equals("") && !txtClothesCode.getText().equals("") && !txtClothesMark.getText().equals("") && !txtClothesPrice.getText().equals("") && !txtClothesSize.getText().equals("") && !txtClothesQuantity.getText().equals("") && !txtClothesColor.getText().equals("") && !txtClothesGender.getText().equals("") && !txtClothesType.getText().equals("") && !txtClothesDescription.getText().equals("") && !txtClothePathImage.getText().equals("")) {
			if(txtClothesType.getText().equalsIgnoreCase("footwear") || txtClothesType.getText().equalsIgnoreCase("shirt") || txtClothesType.getText().equalsIgnoreCase("trousers")) {
				if(txtClothesType.getText().equalsIgnoreCase("footwear")) {
					betaVersionAlert(event);
					loadAddClothesFootwear(event);
				}else if(txtClothesType.getText().equalsIgnoreCase("shirt")) {
					betaVersionAlert(event);
					loadAddClothesShirt(event);
				}else if(txtClothesType.getText().equalsIgnoreCase("trousers")) {
					betaVersionAlert(event);
					loadAddClothesShirt(event);
				}
			}else {
				selectCorrectClotheType(event);
			}
		}else {
			youNeedToFillTextFields(event);
		}
	}
	
	public void loginSeller(ActionEvent event) throws IOException {
		if(!txtSellerUsernameLogin.getText().equals("") && !txtSellerPasswordLogin.getText().equals("")) {
			betaVersionAlert(event);
			loadWhatDoYouWantToDo(event);
		}else {
			youNeedToFillTextFields(event);
		}
	}
	
	public void loginBuyer(ActionEvent event) throws IOException {
		if(!txtBuyerUserLogin.getText().equals("") && !txtBuyerPasswordLogin.getText().equals("")) {
			betaVersionAlert(event);
			loadWhatDoYouWantToDoBuyer(event);
		}else {
			youNeedToFillTextFields(event);
		}
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
	
	public void loadSecondaryCreateAccountInterface() throws IOException {
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
	
	public void loadSelectClientType(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SelectClientType.fxml"));
		
		fxmlLoader.setController(this);
		
		Parent loginPane = fxmlLoader.load();
		
		mainBorderPane.getChildren().clear();
    	mainBorderPane.setCenter(loginPane);
    	Stage st = (Stage)
    	loginPane.getScene().getWindow();
    	st.setHeight(490);
    	st.setWidth(810);
	}
	
	public void loadAddAccessories(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addAccessories_1.fxml"));
		
		fxmlLoader.setController(this);
		
		Parent loginPane = fxmlLoader.load();
		
		mainBorderPane.getChildren().clear();
    	mainBorderPane.setCenter(loginPane);
    	Stage st = (Stage)
    	loginPane.getScene().getWindow();
    	st.setHeight(640);
    	st.setWidth(760);
	}
	
	public void loadAddAccessoriesGlasses(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addAccessories_glasses.fxml"));
		
		fxmlLoader.setController(this);
		
		Parent loginPane = fxmlLoader.load();
		
		mainBorderPane.getChildren().clear();
    	mainBorderPane.setCenter(loginPane);
    	Stage st = (Stage)
    	loginPane.getScene().getWindow();
    	st.setHeight(640);
    	st.setWidth(760);
	}
	
	public void loadAddAccessoriesJewels(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addAccessories_jewels.fxml"));
		
		fxmlLoader.setController(this);
		
		Parent loginPane = fxmlLoader.load();
		
		mainBorderPane.getChildren().clear();
    	mainBorderPane.setCenter(loginPane);
    	Stage st = (Stage)
    	loginPane.getScene().getWindow();
    	st.setHeight(640);
    	st.setWidth(760);
	}
	
	public void loadAddClothes(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addClothes_1.fxml"));
		
		fxmlLoader.setController(this);
		
		Parent loginPane = fxmlLoader.load();
		
		mainBorderPane.getChildren().clear();
    	mainBorderPane.setCenter(loginPane);
    	Stage st = (Stage)
    	loginPane.getScene().getWindow();
    	st.setHeight(640);
    	st.setWidth(756);
	}
	
	public void loadAddClothesFootwear(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addClothes_footwear.fxml"));
		
		fxmlLoader.setController(this);
		
		Parent loginPane = fxmlLoader.load();
		
		mainBorderPane.getChildren().clear();
    	mainBorderPane.setCenter(loginPane);
    	Stage st = (Stage)
    	loginPane.getScene().getWindow();
    	st.setHeight(640);
    	st.setWidth(756);
	}
	
	public void loadAddClothesShirt(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addClothes_shirt.fxml"));
		
		fxmlLoader.setController(this);
		
		Parent loginPane = fxmlLoader.load();
		
		mainBorderPane.getChildren().clear();
    	mainBorderPane.setCenter(loginPane);
    	Stage st = (Stage)
    	loginPane.getScene().getWindow();
    	st.setHeight(640);
    	st.setWidth(756);
	}
	
	public void loadAddClothesTrousers(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addClothes_trousers.fxml"));
		
		fxmlLoader.setController(this);
		
		Parent loginPane = fxmlLoader.load();
		
		mainBorderPane.getChildren().clear();
    	mainBorderPane.setCenter(loginPane);
    	Stage st = (Stage)
    	loginPane.getScene().getWindow();
    	st.setHeight(640);
    	st.setWidth(756);
	}
	
	public void loadSeeProductsOffered(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("seeProductsOffered.fxml"));
		
		fxmlLoader.setController(this);
		
		Parent loginPane = fxmlLoader.load();
		
		mainBorderPane.getChildren().clear();
    	mainBorderPane.setCenter(loginPane);
    	Stage st = (Stage)
    	loginPane.getScene().getWindow();
    	st.setHeight(450);
    	st.setWidth(640);
	}
	
	public void loadSeeProductsToSale(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("seeProductsToSale.fxml"));
		
		fxmlLoader.setController(this);
		
		Parent loginPane = fxmlLoader.load();
		
		mainBorderPane.getChildren().clear();
    	mainBorderPane.setCenter(loginPane);
    	Stage st = (Stage)
    	loginPane.getScene().getWindow();
    	st.setHeight(450);
    	st.setWidth(640);
	}
	
	public void loadSeeShoppingCart(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("seeShoppingCart.fxml"));
		
		fxmlLoader.setController(this);
		
		Parent loginPane = fxmlLoader.load();
		
		mainBorderPane.getChildren().clear();
    	mainBorderPane.setCenter(loginPane);
    	Stage st = (Stage)
    	loginPane.getScene().getWindow();
    	st.setHeight(450);
    	st.setWidth(640);
	}
	
	public void loadSeeShoppingHistory(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("seeShoppingHistory.fxml"));
		
		fxmlLoader.setController(this);
		
		Parent loginPane = fxmlLoader.load();
		
		mainBorderPane.getChildren().clear();
    	mainBorderPane.setCenter(loginPane);
    	Stage st = (Stage)
    	loginPane.getScene().getWindow();
    	st.setHeight(450);
    	st.setWidth(640);
	}
	
	public void loadSeeSoldProducts(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("seeSoldProducts.fxml"));
		
		fxmlLoader.setController(this);
		
		Parent loginPane = fxmlLoader.load();
		
		mainBorderPane.getChildren().clear();
    	mainBorderPane.setCenter(loginPane);
    	Stage st = (Stage)
    	loginPane.getScene().getWindow();
    	st.setHeight(450);
    	st.setWidth(640);
	}
	
	public void loadSelectProductType(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SelectProductType.fxml"));
		
		fxmlLoader.setController(this);
		
		Parent loginPane = fxmlLoader.load();
		
		mainBorderPane.getChildren().clear();
    	mainBorderPane.setCenter(loginPane);
    	Stage st = (Stage)
    	loginPane.getScene().getWindow();
    	st.setHeight(525);
    	st.setWidth(755);
	}
	
	public void loadUserInformation(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("userInformation.fxml"));
		
		fxmlLoader.setController(this);
		
		Parent loginPane = fxmlLoader.load();
		
		mainBorderPane.getChildren().clear();
    	mainBorderPane.setCenter(loginPane);
    	Stage st = (Stage)
    	loginPane.getScene().getWindow();
    	st.setHeight(420);
    	st.setWidth(575);
	}
	
	public void loadUserInformationBuyer(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("userInformationBuyer.fxml"));
		
		fxmlLoader.setController(this);
		
		Parent loginPane = fxmlLoader.load();
		
		mainBorderPane.getChildren().clear();
    	mainBorderPane.setCenter(loginPane);
    	Stage st = (Stage)
    	loginPane.getScene().getWindow();
    	st.setHeight(420);
    	st.setWidth(575);
	}
	
	public void loadWhatDoYouWantToDo(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("whatDoYouWantToDo.fxml"));
		
		fxmlLoader.setController(this);
		
		Parent loginPane = fxmlLoader.load();
		
		mainBorderPane.getChildren().clear();
    	mainBorderPane.setCenter(loginPane);
    	Stage st = (Stage)
    	loginPane.getScene().getWindow();
    	st.setHeight(500);
    	st.setWidth(805);
	}
	
	public void loadWhatDoYouWantToDoBuyer(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("whatDoYouWantToDoBuyer.fxml"));
		
		fxmlLoader.setController(this);
		
		Parent loginPane = fxmlLoader.load();
		
		mainBorderPane.getChildren().clear();
    	mainBorderPane.setCenter(loginPane);
    	Stage st = (Stage)
    	loginPane.getScene().getWindow();
    	st.setHeight(500);
    	st.setWidth(805);
	}
	
	public void loadAddSeller(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addSeller.fxml"));
		
		fxmlLoader.setController(this);
		
		Parent loginPane = fxmlLoader.load();
		
		mainBorderPane.getChildren().clear();
    	mainBorderPane.setCenter(loginPane);
    	Stage st = (Stage)
    	loginPane.getScene().getWindow();
    	st.setHeight(580);
    	st.setWidth(455);
	}
	
	public void loadAddBuyer(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addBuyer.fxml"));
		
		fxmlLoader.setController(this);
		
		Parent loginPane = fxmlLoader.load();
		
		mainBorderPane.getChildren().clear();
    	mainBorderPane.setCenter(loginPane);
    	Stage st = (Stage)
    	loginPane.getScene().getWindow();
    	st.setHeight(580);
    	st.setWidth(455);
	}
	
	public void loadLoginWithPasswordBuyer(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("loginWithPasswordBuyer.fxml"));
		
		fxmlLoader.setController(this);
		
		Parent loginPane = fxmlLoader.load();
		
		mainBorderPane.getChildren().clear();
    	mainBorderPane.setCenter(loginPane);
    	Stage st = (Stage)
    	loginPane.getScene().getWindow();
    	st.setHeight(580);
    	st.setWidth(455);
	}
	
	public void loadLoginWithPasswordSeller(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("loginWithPasswordSeller.fxml"));
		
		fxmlLoader.setController(this);
		
		Parent loginPane = fxmlLoader.load();
		
		mainBorderPane.getChildren().clear();
    	mainBorderPane.setCenter(loginPane);
    	Stage st = (Stage)
    	loginPane.getScene().getWindow();
    	st.setHeight(580);
    	st.setWidth(455);
	}
	
	public void loadAlreadyHaveAccount(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("alreadyHaveAccount.fxml"));
		
		fxmlLoader.setController(this);
		
		Parent loginPane = fxmlLoader.load();
		
		mainBorderPane.getChildren().clear();
    	mainBorderPane.setCenter(loginPane);
    	Stage st = (Stage)
    	loginPane.getScene().getWindow();
    	st.setHeight(620);
    	st.setWidth(455);
	}
	
	@FXML
    public void betaVersionAlert(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Beta version 1.0");
        alert.setHeaderText(null);
        alert.setContentText("This functionality has not yet been implemented since the project is in beta version.");
        alert.showAndWait();
    }
	
	@FXML
    public void userSuccesfullyRegistered(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText("User successfully registered");
        alert.showAndWait();
    }
	
	@FXML
    public void youNeedToFillTextFields(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Alert");
        alert.setHeaderText(null);
        alert.setContentText("Please fill in all the corresponding fields");
        alert.showAndWait();
    }
	
	@FXML
    public void areTheSamePassword(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Alert");
        alert.setHeaderText(null);
        alert.setContentText("Passwords do not match");
        alert.showAndWait();
    }
	
	@FXML
    public void selectCorrectClotheType(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Alert");
        alert.setHeaderText(null);
        alert.setContentText("You must write only the three types of clothing allowed, these are:\n"
        		+ "-footwear\r\n"
        		+ "-shirt\n"
        		+ "-trousers");
        alert.showAndWait();
    }
	
	@FXML
    public void browsePathProfilePictureBuyer(ActionEvent event) {
		FileChooser fileChooser = new FileChooser();
    	fileChooser.setTitle("Buscar imagen");
 
    	File theDirectory = new File("images/UsersImage");
    	
    	fileChooser.setInitialDirectory(theDirectory);
    	try {
    		txtPathImageBuyer.setText(fileChooser.showOpenDialog(null).getName());
    	}catch(NullPointerException npe) {
    		txtPathImageBuyer.setText("images/icons/people.PNG");
    	}
	}
	
	@FXML
    public void browsePathProfilePictureSeller(ActionEvent event) {
		FileChooser fileChooser = new FileChooser();
    	fileChooser.setTitle("Buscar imagen");
 
    	File theDirectory = new File("images/UsersImage");
    	
    	fileChooser.setInitialDirectory(theDirectory);
    	try {
    		txtPathImageSeller.setText(fileChooser.showOpenDialog(null).getName());
    	}catch(NullPointerException npe) {
    		txtPathImageSeller.setText("images/icons/people.PNG");
    	}
	}
	
	@FXML
    public void browsePathClothesImage(ActionEvent event) {
		FileChooser fileChooser = new FileChooser();
    	fileChooser.setTitle("Buscar imagen");
 
    	File theDirectory = new File("images/ClothesImage");
    	
    	fileChooser.setInitialDirectory(theDirectory);
    	try {
    		txtClothePathImage.setText(fileChooser.showOpenDialog(null).getName());
    	}catch(NullPointerException npe) {
    		txtClothePathImage.setText("images/icons/clothe.PNG");
    	}
	}
}
	


