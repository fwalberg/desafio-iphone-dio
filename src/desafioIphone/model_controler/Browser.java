package desafioIphone.model_controler;

public class Browser {
	private String url;
	
	public String openUrl(String url) {
		this.url = url;
		return "Acessando url " + this.url;
	}
	
	public String addNewTab() {
		return "Nova aba adicionada";
	}
	
	public String refreshSite() {
		return "Pagina atualizada";
	}
}
