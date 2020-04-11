package focusbrowser;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

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
        
        Scene newScene = homeScreen(scene);
        
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
        vbox.setAlignment(Pos.TOP_LEFT);
        vbox.setStyle("-fx-background-color: #000003;");
        Rectangle base = new Rectangle(20, 20, 200, 200);
        base.setStroke(Color.BLACK);
        base.heightProperty().bind(scene.heightProperty());
        base.widthProperty().bind(scene.widthProperty());

        
        
    	// creating WebView for website to load
    	WebView tab = new WebView();
    	WebEngine url = tab.getEngine();
    	url.load("https://docs.google.com/presentation/d/1TnlGMzQuFsi_JeOKAtMBG_VMLqq2IQbBap790P3NGdw/edit?usp=sharing");
    	
    	//creating buttons
    	Button back = new Button("<-");
    	Button forward = new Button("->");
    	Button addTab = new Button("+");
    	
    	//creating tabs
    	TabPane tabPane = new TabPane();
    	Tab main = new Tab("                      ");
    	Tab newTab = new Tab("                      ");
    	main.setStyle("-fx-background-color: #474646;");
    	newTab.setStyle("-fx-background-color: #474646;");
    	tabPane.getTabs().addAll(main, newTab);
    	tabPane.setStyle("-fx-background-color: #000003;");
    	tabPane.setStyle("-fx-opacity: 25;");
    	
    	// creating search bar for URL
    	TextField searchBar = new TextField("Search");
    	searchBar.setPrefWidth(750);
    	VBox searchBox = new VBox();
    	searchBox.setAlignment(Pos.CENTER);
    	
    	// creating boundaries for searchBar
    	Text leftBorder = new Text("           ");
    	leftBorder.setFont(new Font(50.0));
    	leftBorder.setTextAlignment(TextAlignment.CENTER);
    	
    	Text rightBorder = new Text("           ");
    	leftBorder.setFont(new Font(50.0));
    	leftBorder.setTextAlignment(TextAlignment.CENTER);
    	
    	// creating menu area
    	HBox menuBox = new HBox();
    	StackPane sPane = new StackPane();
    	menuBox.setAlignment(Pos.TOP_LEFT);
    	Rectangle menu = new Rectangle();
    	menu.setFill(Color.web("#474646"));
    	Button menuButton = new Button("->");
    	
    	//closed menu
    	menu.setHeight(900);
    	menu.setWidth(50);
    	
    	//open menu
    	menu.setHeight(900);
    	menu.setWidth(400);
    	
    	sPane.setAlignment(menuButton, Pos.CENTER_RIGHT);
    	sPane.getChildren().addAll(menu, menuButton);
    	menuBox.getChildren().add(sPane);

    	
    	// creating scroll bar
    	HBox hbox2 = new HBox();
    	hbox2.setAlignment(Pos.TOP_RIGHT);
    	
    	ScrollBar sc = new ScrollBar();
    	sc.setOrientation(Orientation.VERTICAL);
    	sc.setStyle("-fx-background-color: #474646;" );
    	hbox2.getChildren().add(rightBorder);
    	hbox2.getChildren().add(sc);
    	
    	// importing logo image
        Image image = new Image("file:///Users/vamikachatlani/Downloads/887e1800-6722-4e55-b77d-222759c86081_200x200.png");
        ImageView iv = new ImageView(image);
    	HBox imageBox = new HBox();
    	imageBox.setAlignment(Pos.CENTER);
    	
    	searchBox.setSpacing(50.0);
    	searchBox.getChildren().add(iv);
    	searchBox.getChildren().add(searchBar);
    	iv.setManaged(false);
    	iv.setLayoutX(250);
    	iv.setLayoutY(290);
    	searchBox.setAlignment(Pos.CENTER);

    	
    	
    	// putting each component in correct spots
    	hbox.getChildren().addAll(back, forward);
    	vbox.getChildren().add(tabPane);
    	vbox.getChildren().addAll(hbox, hbox2, menuBox);
    	imageBox.getChildren().add(searchBox);
    	    	
        bPane.setCenter(imageBox);
//        bPane.setCenter(searchBar);
        bPane.setLeft(vbox);
        bPane.setRight(sc);
        bPane.setCenter(tab);

    	
      
    	Scene scene2 = new Scene(bPane, 1920, 1080);
    	
    	return scene2;
    }
    
    

    public static void main(String[] args)
    {
        launch(args);
    }
 
}


