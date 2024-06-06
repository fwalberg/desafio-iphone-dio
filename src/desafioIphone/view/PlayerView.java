package desafioIphone.view;

import desafioIphone.model_controler.MusicPlayer;

public class PlayerView {
	public static void playerMenu() {
		
		int option = 0;
		do {
			System.out.println(" 1. Selecionar musica");
			System.out.println(" 2. Tocar");
			System.out.println(" 3. Pausar");
			System.out.println(" 4. Menu Principal");
			
			option = MainView.scanner.nextInt();
			
			switch (option) {
				case 1 -> {
					System.out.println("Informe o nome da musica: ");
					String music = MainView.scanner.nextLine();
					music = MainView.scanner.nextLine();
					System.out.println(MusicPlayer.getInstance().selectMedia(music));
				}
				
				case 2 -> {
					System.out.println(MusicPlayer.getInstance().play());
					
				}
				
				case 3 -> {
					System.out.println(MusicPlayer.getInstance().pause());
				}
				
				case 4 -> option = 4;
				
				default -> System.out.println("Opção invalida");
			}
		} while (option != 4);
	}
}
