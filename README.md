## [DIO](www.dio.me) - Trilha Java

### Desafio: Modelagem e Diagramação de um Componente iPhone

Neste desafio, foi modelado e diagramado a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.
Segue abaixo as funcionalidades propostas e o diagrama de classes do protótipo.

#### Funcionalidades modeladas
1. **Reprodutor Musical**
   	- Métodos: `play()`, `pause()`, `selectMedia(String media)`
2. **Aparelho Telefônico**
   - Métodos: `call(String phoneNumber)`, `answer()`, `voiceMail()`
3. **Navegador de Internet**
   - Métodos: `openUrl(String url)`, `addNewTab()`, `refreshSite()`
   
#### Diagrama de Classes
```mermaid
classDiagram
class Browser {
    <<Java Class>>
    -String url
    +openUrl(java::lang::String url) String
    +addNewTab() String
    +refreshSite() String
}
class MusicPlayer {
    <<Java Class>>
    -String music
    -boolean isPlayed
    +MusicPlayer instance$
    -MusicPlayer() 
    +play() String
    +pause() String
    +selectMedia(java::lang::String music) String
    +getInstance() MusicPlayer$
}
class Phone {
    <<Java Class>>
    -String phoneNumber
    +call(java::lang::String phoneNumber) String
    +answer() String
    +voiceMail() String
}
class Playable {
    <<interface>>
    <<Java Class>>
    +play() String*
    +pause() String*
    +selectMedia(java::lang::String media) String*
}
class Smartphone {
    <<Java Class>>
    +main(java::lang::String[] args) void$
}
class VideoPlayer {
    <<Java Class>>
    -String video
    -boolean isPlayed
    -VideoPlayer instance$
    -VideoPlayer() 
    +play() String
    +pause() String
    +selectMedia(java::lang::String video) String
    +setVideo(java::lang::String video) void
    +getVideo() String
    +getInstance() VideoPlayer$
}
class BrowserView {
    <<Java Class>>
    +BrowserMenu() void$
}
class PhoneView {
    <<Java Class>>
    +phoneMenu() void$
}
class MainView {
    <<Java Class>>
    #Scanner scanner$
    +mainView() void$
}
class PlayerView {
    <<Java Class>>
    +playerMenu() void$
}
Browser <-- BrowserView
Phone <-- PhoneView
Playable -- Playable
MainView <-- Smartphone
VideoPlayer <-- PlayerView
BrowserView <-- MainView
PhoneView <-- MainView
PlayerView <-- MainView
Playable ..> VideoPlayer
PlayerView ..> PlayerView
MusicPlayer ..|> Playable
VideoPlayer ..|> Playable
```