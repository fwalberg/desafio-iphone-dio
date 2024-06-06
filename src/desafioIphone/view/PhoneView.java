package desafioIphone.view;

import desafioIphone.model_controler.Phone;

public class PhoneView {
	
	public static void phoneMenu() {
		
		int option = 0;
		do {
			System.out.println(" 1. Digitar numero");
			System.out.println(" 2. Atender Ligacao");
			System.out.println(" 3. Correio de voz");
			System.out.println(" 4. Menu Principal");
			
			option = MainView.scanner.nextInt();
			
			Phone phone = new Phone();
			
			switch (option) {
				case 1 -> {
					System.out.println("Digite o número: ");
					String phoneNumber = MainView.scanner.nextLine();
					phoneNumber = MainView.scanner.nextLine();
					System.out.println(phone.call(phoneNumber));
				}
				
				case 2 -> {
					System.out.println(phone.answer());
				}
				
				case 3 -> {
					System.out.println(phone.voiceMail());
				}
				
				case 4 -> option = 4;
				
				default -> System.out.println("Opção invalida");
			}
		} while (option != 4);
	}
}
