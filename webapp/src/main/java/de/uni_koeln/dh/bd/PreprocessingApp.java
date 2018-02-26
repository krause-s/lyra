package de.uni_koeln.dh.bd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import de.uni_koeln.dh.bd.data.Song;
import de.uni_koeln.dh.bd.model.place.Place;
import de.uni_koeln.dh.bd.processing.SongPreprocessor;
import de.uni_koeln.dh.bd.util.IO;

public class PreprocessingApp {
	

	
	private static String dataPath = "src/main/resources/data/lyrics_database.xlsx";
	private static List<Song> songs = new ArrayList<Song>();
	
	public static void main(String[] args) {
		
		IO io = new IO();
		try {
			songs = io.getSongs(dataPath);
			SongPreprocessor prep = new SongPreprocessor();
			Map<Place, List<Song>>	foundPlaces = prep.detectNamedEntities(songs);
			
			//TODO evaluate found places
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
