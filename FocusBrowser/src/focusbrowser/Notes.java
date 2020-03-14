package focusbrowser;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import java.io.*;

public class Notes 
{

	// Variables
	private ArrayList<String> notes;
	private FileReader in = null;    // 
	private FileWriter out = null;   //
	
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
	 * @param int index | The index at which we are attempting ot obtain a note
	 * @return The string found at the index, or returns a blank string if nothing was found. 
	 *************************************************************************************************************************/
	public String getNote(int index)
	{ return (index < notes.size()) ? notes.get(index) : ""; }
	
}
