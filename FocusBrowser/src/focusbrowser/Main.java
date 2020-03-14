package focusbrowser;

import java.awt.Button;
import java.awt.Label;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        
    	BorderPane bPane = new BorderPane();
        
    	WebView tab = new WebView();
    	WebEngine url = tab.getEngine();
    	url.load("https://www.google.com");
    	
    	
    	
    	//Placeholder for Tabs and URL
    	Text tabAndUrl = new Text("Tabs and Url bar here");
    	
    	tabAndUrl.setFont(new Font(30.0));
    	tabAndUrl.setTextAlignment(TextAlignment.CENTER);
    	//
    	
    	
    	//Placeholder for Notes
    	Text notes = new Text("NOTES TAB");
    	
    	notes.setFont(new Font(30.0));
    	notes.setTextAlignment(TextAlignment.CENTER);
    	//
    	
    	bPane.setTop(tabAndUrl);
    	bPane.setLeft(notes);
        bPane.setCenter(tab);
        
        Scene scene = new Scene(bPane,750,500);
        
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.setFullScreen(true);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
} 	