package memento;

import java.util.Stack;

public class PlayedHistory {
	
	Stack<NowPlaying.NowPlayingMemento> history = new Stack<>();
	
	public void save(NowPlaying nowPlaying) {
		history.push(nowPlaying.save());
	}
	
	public void previous(NowPlaying nowPlaying) {
		if(!history.isEmpty()) {
			nowPlaying.previous(history.pop());
		}
	}

}
