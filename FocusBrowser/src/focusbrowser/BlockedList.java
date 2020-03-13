package focusbrowser;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import java.io.*;

public class BlockedList
{
	// Variables
	List<String> blockedURL; // Contains a complete list of all blocked URLs
	FileReader in = null;    // 
	FileWriter out = null;   //
	
	public BlockedList()
	{
		blockedURL = new ArrayList<String>();
	}
	
	public BlockedList(String fileName)
	{
		blockedURL = new ArrayList<String>();
	}

	/*************************************************************************************************************************
	 * @author Stuart Little
	 * @param webEngine |WebEngine| Contains the access to the WebEngine object
	 * @return Returns whether or not the URL was successfully added to the list 
	 *************************************************************************************************************************/
	public boolean addWebsite(WebEngine webEngine)
	{
		// Variables
		boolean urlAdded = true; 							   // Contains whether or not the URL was added to the list
		String 	url = webEngine.locationProperty().getValue(); // Contains the string of the url
		
		// If the URL is already contained within the list
		if (blockedURL.contains(url)) 
			urlAdded = false;
		else			
			blockedURL.add(url);
		return urlAdded;
	}
	
	/*************************************************************************************************************************
	 * @author Stuart Little
	 * @param webEngine |WebEngine| Contains the access to the WebEngine object
	 * @return Returns whether or not the URL was successfully found in the list 
	 *************************************************************************************************************************/
	public boolean isBlocked(WebEngine webEngine)
	{
		// Variables
		String 	url = webEngine.locationProperty().getValue(); // Contains the string of the url
		
		return blockedURL.contains(url);
	}
	
	private boolean saveToFile()
	{
		return false;
	}
}