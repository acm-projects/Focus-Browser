package focusbrowser;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import java.io.*;

public class Notes 
{

	// Variables
	private ArrayList<String> notes; // Holds a list of user information
	private FileReader in = null;    // Holds access to input file
	private FileWriter out = null;   // Holds access to output file
	
	public Notes()
	{
		notes = new ArrayList<String>();
	}
	
	public Notes(String fileName)
	{
		notes = new ArrayList<String>();
	}

	/*************************************************************************************************************************
	 * @author Stuart Little
	 * @param String note | The note to be added to the notepad
	 *************************************************************************************************************************/
	public void addNotepad(String note)
	{ notes.add(note); }
	
	/*************************************************************************************************************************
	 * @author Stuart Little
	 * @param int index | The index at which we are attempting to obtain a note
	 * @return The string found at the index, or returns a blank string if nothing was found. 
	 *************************************************************************************************************************/
	public String getNote(int index)
	{ return (index < notes.size()) ? notes.get(index) : ""; }
	
	/*************************************************************************************************************************
	 * @author Stuart Little
	 * @param int index | The index at which we are attempting to delete a note
	 * @return boolean specifying whether or not note was deleted 
	 *************************************************************************************************************************/
	public boolean deleteNote(int index)
	{ 
		// Variables
		boolean noteDeleted = false;
		
		if (index < notes.size())
		{
			notes.remove(index);
			noteDeleted = true;
		}
		
		return noteDeleted;
	}
	
}
