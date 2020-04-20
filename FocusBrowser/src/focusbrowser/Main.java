package focusbrowser;

import javafx.application.Application;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.effect.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.scene.image.*;
import javafx.geometry.*;
import javafx.scene.text.*;

public class Main extends Application
{
	
	// Global Variables
	WebView tab = new WebView();
	WebEngine url = tab.getEngine();
	TextField textField = new TextField();
	



    @Override
    public void start(Stage primaryStage) throws Exception{
    	
    	
    	
    	BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 1920, 1080);
        
        Scene newScene = blockedScreen(scene);
        
    	//popup handler
//    	url.getEngine().setCreatePopupHandler(new Callback<PopupFeatures, WebEngine>() {
//
//            @Override
//            public WebEngine call(PopupFeatures p) {
//                Stage stage = new Stage(StageStyle.UTILITY);
//                WebView wv2 = new WebView();
//                stage.setScene(new Scene(wv2));
//                stage.show();
//                return wv2.getEngine();
//            }
//        });
//    	
//        textField.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
//    	    public void handle(ActionEvent event) {
//    	            url.load(textField.getText());
//    	    }
//    	});
        
//    	BorderPane bPane = new BorderPane();
//    	
//    	url.load("https://docs.google.com/presentation/d/1TnlGMzQuFsi_JeOKAtMBG_VMLqq2IQbBap790P3NGdw/edit?usp=sharing");
        
        primaryStage.setScene(newScene);
        primaryStage.setMaximized(true);
        primaryStage.setFullScreen(true);
        primaryStage.show();
    }

    public Scene homeScreen(Scene scene) {
    	// creating base
    	BorderPane bPane = new BorderPane();
    	bPane.setStyle("-fx-background-color: #000003;");
        VBox vbox = new VBox();
        HBox hbox = new HBox();
        vbox.setAlignment(Pos.CENTER_LEFT);
        vbox.setStyle("-fx-background-color: #000003;");
        vbox.setSpacing(10.0);
        hbox.setSpacing(10.0);

        
    	// creating WebView for website to load
    	WebView tab = new WebView();
    	WebEngine url = tab.getEngine();
    	url.load("https://docs.google.com/presentation/d/1TnlGMzQuFsi_JeOKAtMBG_VMLqq2IQbBap790P3NGdw/edit?usp=sharing");
    	
    	//creating buttons
    	Image backImage = new Image("file:///Users/vamikachatlani/Downloads/previous.png");
    	ImageView ivBack = new ImageView(backImage);
    	ivBack.setFitHeight(30);
    	ivBack.setFitWidth(30);
    	Button back = new Button();
    	back.setPadding(Insets.EMPTY);
    	back.setGraphic(ivBack);
    	back.setStyle("-fx-background-color: transparent;");
    	
    	Image forwardImage = new Image("file:///Users/vamikachatlani/Downloads/next.png");
    	ImageView ivForward = new ImageView(forwardImage);
    	ivForward.setFitHeight(30);
    	ivForward.setFitWidth(30);
    	Button forward = new Button();
    	forward.setPadding(Insets.EMPTY);
    	forward.setGraphic(ivForward);
    	forward.setStyle("-fx-background-color: transparent;");
    	
    	Image refreshImage = new Image("file:///Users/vamikachatlani/Downloads/reload.png");
    	ImageView ivRefresh = new ImageView(refreshImage);
    	ivRefresh.setFitHeight(30);
    	ivRefresh.setFitWidth(30);
    	Button refresh = new Button();
    	refresh.setPadding(Insets.EMPTY);
    	refresh.setGraphic(ivRefresh);
    	refresh.setStyle("-fx-background-color: transparent;");
    	
    	Image forebiddenImage = new Image("file:///Users/vamikachatlani/Downloads/forbidden.png");
    	ImageView ivForebidden = new ImageView(forebiddenImage);
    	ivForebidden.setFitHeight(30);
    	ivForebidden.setFitWidth(30);
    	Button forebidden = new Button();
    	forebidden.setPadding(Insets.EMPTY);
    	forebidden.setGraphic(ivForebidden);
    	forebidden.setStyle("-fx-background-color: transparent;");
    	
    	//creating tabs
    	TabPane tabPane = new TabPane();
    	Tab main = new Tab("                      ");
    	Tab newTab = new Tab("                      ");
    	main.setStyle("-fx-background-color: #474646;");
    	newTab.setStyle("-fx-background-color: #474646;");
    	tabPane.getTabs().addAll(main, newTab);

    	
    	// creating search bar for URL
    	TextField searchBar = new TextField("Search");
    	searchBar.setPrefWidth(750);
    	VBox searchBox = new VBox();
    	searchBox.setAlignment(Pos.CENTER);
   
    	
    	// creating menu area
    	HBox menuBox = new HBox();
    	StackPane sPane = new StackPane();
    	menuBox.setAlignment(Pos.TOP_LEFT);
    	Rectangle menu = new Rectangle();
    	menu.setFill(Color.web("#474646"));
    	Button menuButton = new Button("");
    	menuButton.setStyle("-fx-background-color: transparent;");
    	Image menuImage = new Image("file:///Users/vamikachatlani/Downloads/open-menu.png");
    	ImageView ivMenu = new ImageView(menuImage);
    	ivMenu.setFitHeight(30);
    	ivMenu.setFitWidth(30);
    	menuButton.setPadding(Insets.EMPTY);
    	menuButton.setGraphic(ivMenu);
    	
    	//closed menu
    	menu.setHeight(900);
    	menu.setWidth(40);
    	
    	//open menu
//    	menu.setHeight(900);
//    	menu.setWidth(400);

    	
    	sPane.setAlignment(menuButton, Pos.CENTER_RIGHT);
    	sPane.getChildren().addAll(menu, menuButton);
    	menuBox.getChildren().add(sPane);

    	
    	// importing logo image
        Image image = new Image("file:///Users/vamikachatlani/Downloads/887e1800-6722-4e55-b77d-222759c86081_200x200.png");
        ImageView iv = new ImageView(image);
    	HBox imageBox = new HBox();
    	imageBox.setAlignment(Pos.CENTER);
    	imageBox.getChildren().add(searchBox);
    	
    	searchBox.setSpacing(50.0);
    	searchBox.getChildren().add(iv);
    	searchBox.getChildren().add(searchBar);
    	iv.setManaged(false);
    	iv.setLayoutX(250);
    	iv.setLayoutY(290);
    	searchBox.setAlignment(Pos.CENTER);
    	
    	//creating url bar
    	HBox urlBox = new HBox();
    	urlBox.setAlignment(Pos.TOP_CENTER);
    	TextField urlBar = new TextField();
    	urlBar.setPrefWidth(1400);
    	urlBar.setPrefHeight(30);
    	urlBox.getChildren().add(urlBar);
    	
    	
    	
    	// putting each component in correct spots
    	hbox.getChildren().addAll(back, forward, refresh, urlBar, forebidden);
    	vbox.getChildren().addAll(tabPane, hbox, menuBox);
    	
    	StackPane mainStack = new StackPane();
    	mainStack.getChildren().addAll(vbox, imageBox);
    	    	
        bPane.setCenter(mainStack);

        
    	Scene scene2 = new Scene(bPane, 1920, 1080);
    	
    	return scene2;
    }
    
    public Scene blockedScreen(Scene scene) {
    	// creating base
    	BorderPane bPane = new BorderPane();
    	bPane.setStyle("-fx-background-color: #000003;");
        VBox vbox = new VBox();
        HBox hbox = new HBox();
        vbox.setAlignment(Pos.CENTER_LEFT);
        vbox.setStyle("-fx-background-color: #000003;");
        vbox.setSpacing(10.0);
        hbox.setSpacing(10.0);

        
    	// creating WebView for website to load
    	WebView tab = new WebView();
    	WebEngine url = tab.getEngine();
    	url.load("https://docs.google.com/presentation/d/1TnlGMzQuFsi_JeOKAtMBG_VMLqq2IQbBap790P3NGdw/edit?usp=sharing");
    	
    	//creating buttons
    	Image backImage = new Image("file:///Users/vamikachatlani/Downloads/previous.png");
    	ImageView ivBack = new ImageView(backImage);
    	ivBack.setFitHeight(30);
    	ivBack.setFitWidth(30);
    	Button back = new Button();
    	back.setPadding(Insets.EMPTY);
    	back.setGraphic(ivBack);
    	back.setStyle("-fx-background-color: transparent;");
    	
    	Image forwardImage = new Image("file:///Users/vamikachatlani/Downloads/next.png");
    	ImageView ivForward = new ImageView(forwardImage);
    	ivForward.setFitHeight(30);
    	ivForward.setFitWidth(30);
    	Button forward = new Button();
    	forward.setPadding(Insets.EMPTY);
    	forward.setGraphic(ivForward);
    	forward.setStyle("-fx-background-color: transparent;");
    	
    	Image refreshImage = new Image("file:///Users/vamikachatlani/Downloads/reload.png");
    	ImageView ivRefresh = new ImageView(refreshImage);
    	ivRefresh.setFitHeight(30);
    	ivRefresh.setFitWidth(30);
    	Button refresh = new Button();
    	refresh.setPadding(Insets.EMPTY);
    	refresh.setGraphic(ivRefresh);
    	refresh.setStyle("-fx-background-color: transparent;");
    	
    	Image forebiddenImage = new Image("file:///Users/vamikachatlani/Downloads/forbidden.png");
    	ImageView ivForebidden = new ImageView(forebiddenImage);
    	ivForebidden.setFitHeight(30);
    	ivForebidden.setFitWidth(30);
    	Button forebidden = new Button();
    	forebidden.setPadding(Insets.EMPTY);
    	forebidden.setGraphic(ivForebidden);
    	forebidden.setStyle("-fx-background-color: transparent;");
    	
    	//creating tabs
    	TabPane tabPane = new TabPane();
    	Tab main = new Tab("                      ");
    	Tab newTab = new Tab("                      ");
    	main.setStyle("-fx-background-color: #474646;");
    	newTab.setStyle("-fx-background-color: #474646;");
    	tabPane.getTabs().addAll(main, newTab);

    	
    	// creating search bar for URL
    	TextField searchBar = new TextField("Search");
    	searchBar.setPrefWidth(750);
    	VBox searchBox = new VBox();
    	searchBox.setAlignment(Pos.CENTER);
   
    	
    	// creating menu area
    	HBox menuBox = new HBox();
    	StackPane sPane = new StackPane();
    	menuBox.setAlignment(Pos.TOP_LEFT);
    	Rectangle menu = new Rectangle();
    	menu.setFill(Color.web("#474646"));
    	Button menuButton = new Button("");
    	menuButton.setStyle("-fx-background-color: transparent;");
    	Image menuImage = new Image("file:///Users/vamikachatlani/Downloads/open-menu.png");
    	ImageView ivMenu = new ImageView(menuImage);
    	ivMenu.setFitHeight(30);
    	ivMenu.setFitWidth(30);
    	menuButton.setPadding(Insets.EMPTY);
    	menuButton.setGraphic(ivMenu);
    	
    	//closed menu
    	menu.setHeight(900);
    	menu.setWidth(40);
    	
    	//open menu
//    	menu.setHeight(900);
//    	menu.setWidth(400);

    	
    	sPane.setAlignment(menuButton, Pos.CENTER_RIGHT);
    	sPane.getChildren().addAll(menu, menuButton);
    	menuBox.getChildren().add(sPane);

    	
    	// importing error image
        Image image = new Image("file:///Users/vamikachatlani/Downloads/close.png");
        ImageView iv = new ImageView(image);
        iv.setFitHeight(300);
        iv.setFitWidth(300);
        
        // creating error message
        Text error = new Text();
        error.setText("This site has been blocked.");
        error.setFill(Color.WHITE);
        error.setFont(Font.font("nunito", FontWeight.BOLD, FontPosture.REGULAR, 30)); 
    	HBox imageBox = new HBox();
    	imageBox.setAlignment(Pos.CENTER);
    	imageBox.getChildren().add(searchBox);
    	
    	searchBox.setSpacing(15.0);
    	searchBox.getChildren().add(iv);
    	searchBox.getChildren().add(error);
//    	iv.setManaged(false);
//    	iv.setLayoutX(250);
//    	iv.setLayoutY(290);
    	searchBox.setAlignment(Pos.CENTER);
    	
    	//creating url bar
    	HBox urlBox = new HBox();
    	urlBox.setAlignment(Pos.TOP_CENTER);
    	TextField urlBar = new TextField();
    	urlBar.setPrefWidth(1400);
    	urlBar.setPrefHeight(30);
    	urlBox.getChildren().add(urlBar);

    	
    	
    	// putting each component in correct spots
    	hbox.getChildren().addAll(back, forward, refresh, urlBar, forebidden);
    	vbox.getChildren().addAll(tabPane, hbox, menuBox);
    	
    	StackPane mainStack = new StackPane();
    	mainStack.getChildren().addAll(vbox, imageBox);
    	    	
        bPane.setCenter(mainStack);

        
    	Scene scene2 = new Scene(bPane, 1920, 1080);
    	
    	return scene2;
    }
    
    

    public static void main(String[] args)
    {
        launch(args);
    }
 
}


