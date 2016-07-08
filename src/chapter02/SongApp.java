package chapter02;

public class SongApp {

	public static void main(String[] args){
		Song song = new Song();
		song.setTitle("좋은날");
		song.setArtist("아이유");
		song.setAlbum("Real");
		song.setComposer("이민수");
		song.setYear(2010);
		song.setTrack(3);
		
		song.show();
		
		Song song1 = new Song("아이유", "좋은날", "Real", "이민수", 2010, 3);
		song1.show();
		
		Song song2 = new Song("원더걸스", "Why so Lonely");
		song2.show();
		
		Song song3 = new Song("비와이", "Forever");
		song3.show();
	}
	
}
