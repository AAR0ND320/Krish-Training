package memento;

public class Application {

	public static void main(String[] args) {
		
		PlayedHistory history = new PlayedHistory();
		
		NowPlaying nowPlaying = new NowPlaying();
		
		nowPlaying.play("Sweet Child o' Mine");
		history.save(nowPlaying);
		System.out.println(nowPlaying);
		
		nowPlaying.play("Back In Black");
		history.save(nowPlaying);
		System.out.println(nowPlaying);
		
		nowPlaying.play("Disenchanted");
		history.save(nowPlaying);
		System.out.println(nowPlaying);
		
		nowPlaying.play("Say Amen");
		history.save(nowPlaying);
		System.out.println(nowPlaying);
		
		nowPlaying.play("House of Wolves");
		history.save(nowPlaying);
		System.out.println(nowPlaying);
		
		// Going back to previous songs
		history.previous(nowPlaying);
		System.out.println(nowPlaying);

		history.previous(nowPlaying);
		System.out.println(nowPlaying);

		history.previous(nowPlaying);
		System.out.println(nowPlaying);
		
	}
	
}
