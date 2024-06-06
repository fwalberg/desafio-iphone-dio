package desafioIphone.model_controler;

public class Phone {
	private String phoneNumber;
	
	public String call(String phoneNumber) {
		if(phoneNumber.isBlank() || !(phoneNumber.length() > 9 && phoneNumber.length() < 12))
			return "Numero invalido";
		this.phoneNumber = phoneNumber;
		return "ligando para " + this.phoneNumber;
	}
	
	public String answer() {
		return "Ligação atendida";
	}
	
	public String voiceMail() {
		return "Correio de voz iniciado";
	}
}
