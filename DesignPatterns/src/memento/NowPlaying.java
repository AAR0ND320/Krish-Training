package memento;

public class NowPlaying {
	
	private String currentSong;
	
	public void play(String song) {
		this.currentSong = song;
	}
	
	private String getCurrentSong() {
		return currentSong;
	}

	public NowPlayingMemento save() {
		return new NowPlayingMemento(getCurrentSong());
	}
	
	public void previous(NowPlayingMemento nowPlayingMemento) {
		this.currentSong = nowPlayingMemento.getSong();
	}
	
	@Override
	public String toString() {
		return "Now playing: " + currentSong;
	}
	
	static class NowPlayingMemento {
		
		private String song;

		public NowPlayingMemento(String song) {
			this.song = song;
		}

		private String getSong() {
			return song;
		}
		
	}

}
