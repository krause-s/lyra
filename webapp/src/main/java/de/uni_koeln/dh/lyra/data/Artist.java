package de.uni_koeln.dh.lyra.data;

import java.util.ArrayList;
import java.util.List;

import de.uni_koeln.dh.lyra.model.place.Place;

public class Artist {

	private String name;
	private List<Place> bioPlaces;
	private List<Place> lyricsPlaces;
	private List<Song> songs;
	
	public Artist(String name) {
		this.name = name;
		this.bioPlaces = new ArrayList<Place>();
		this.lyricsPlaces = new ArrayList<Place>();
		this.songs = new ArrayList<Song>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Place> getBioPlaces() {
		return bioPlaces;
	}

	public void setBioPlaces(List<Place> bioPlaces) {
		this.bioPlaces = bioPlaces;
	}
	
	public void addBioPlace(Place bioPlace) {
		bioPlaces.add(bioPlace);
	}

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
	
	public void addSong(Song song) {
		songs.add(song);
	}
	
	public List<Place> getLyricsPlaces(){
		return lyricsPlaces;
	}
	
	public void setLyricsPlaces(List<Place> lyricsPlaces) {
		this.lyricsPlaces = lyricsPlaces;
	}
	
	public void addLyricsPlace(Place lyricsPlace) {
		lyricsPlaces.add(lyricsPlace);
	}
	
	@Override
	public boolean equals(Object obj) {
		Artist artist = (Artist) obj;
		return artist.getName().equals(this.getName());
	}

}
