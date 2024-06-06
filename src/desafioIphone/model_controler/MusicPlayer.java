package desafioIphone.model_controler;

public class MusicPlayer implements Playable {
	private String music;
	private boolean isPlayed;
	
	public static MusicPlayer instance;
	
	private MusicPlayer() {}
	
	@Override
	public String play() {
		isPlayed = true;
		return music != null ? String.format("A musica \"%s\" esta tocando", this.music) : "Nenhuma musica selecionada";
	}

	@Override
	public String pause() {
		if (isPlayed) {
			isPlayed = false;
			return String.format("A musica \"%s\" foi pausada", this.music);
		}
		return "Nenhuma musica tocando no momento";
	}

	@Override
	public String selectMedia(String music) {
		this.music = music;
		return String.format("A musica \"%s\" foi selecionada", this.music);
	}
	
	public static MusicPlayer getInstance() {
		if (instance == null) 
			instance = new MusicPlayer();
		return instance;
	}
}
