package desafioIphone.model_controler;

public class VideoPlayer implements Playable {
	private String video;
	private boolean isPlayed;
	
	private static VideoPlayer instance;
	
	private VideoPlayer() {}
	
	@Override
	public String play() {
		this.isPlayed = true;
		return "O video " + this.video + "esta executando";
	}

	@Override
	public String pause() {
		return isPlayed ? "Video " + this.video + "pausada" : "Nenhuma media executando no momento";
	}

	@Override
	public String selectMedia(String video) {
		this.video = video;
		return "O video " + this.video + "foi selecionado";
	}

	public void setVideo(String video) {
		this.video = video;
	}
	
	public String getVideo() {
		return this.video;
	}
	
	public static VideoPlayer getInstance() {
		if (instance == null)
			instance = new VideoPlayer();
		return instance;
	}

}
