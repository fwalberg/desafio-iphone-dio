package desafioIphone.view;

import java.util.Scanner;

public class MainView {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void mainView() {
		
		int option = 0;
		do {
			System.out.println("Menu Principal");
			System.out.println("1. Telefone");
			System.out.println("2. Navegador");
			System.out.println("3. Reprodutor Musical");
			System.out.println("4. Bloquear telefone");
			
			option = scanner.nextInt();
			
			switch (option) {
				case 1 -> {
					System.out.println("Telefone selecionado");
					PhoneView.phoneMenu();
				}
				
				case 2 -> {
					System.out.println("Navegador selecionado");
					BrowserView.BrowserMenu();
				}
				
				case 3 -> {
					System.out.println("Player selecionado");
					PlayerView.playerMenu();
				}
				
				case 4 -> option = 4;
				
				default -> System.out.println("Opção invalida!");
				}
			
		} while (option != 4);
		
		scanner.close();
	}
}
