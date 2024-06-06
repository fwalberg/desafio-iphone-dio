package desafioIphone.view;

import desafioIphone.model_controler.Browser;

public class BrowserView {
public static void BrowserMenu() {
		
		int option = 0;
		do {
			System.out.println(" 1. Acessar URL");
			System.out.println(" 2. Nova aba");
			System.out.println(" 3. Atualizar pagina");
			System.out.println(" 4. Menu Principal");
			
			option = MainView.scanner.nextInt();
			Browser browser = new Browser();
			
			switch (option) {
				case 1 -> {
					System.out.println("Informe a URL: ");
					String url = MainView.scanner.nextLine();
					url = MainView.scanner.nextLine();
					System.out.println(browser.openUrl(url));
				}
				
				case 2 -> {
					System.out.println(browser.addNewTab());
				}
				
				case 3 -> {
					System.out.println(browser.refreshSite());
				}
				
				case 4 -> option = 4;
				
				default -> System.out.println("Opção invalida");
			}
		} while (option != 4);
	}
}
