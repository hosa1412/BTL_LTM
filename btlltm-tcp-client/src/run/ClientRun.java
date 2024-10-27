package run;

import controller.SocketHandler;
import view.ConnectServer;
import view.GameView;
import view.HomeView;
import view.InfoPlayerView;
import view.LoginView;
import view.MessageView;
import view.RankingView;
import view.RegisterView;

public class ClientRun {
    public enum SceneName {
        LOGIN,
        REGISTER,
        HOMEVIEW,
        INFOPLAYER,
        RANKING,
        MESSAGEVIEW,
        GAMEVIEW
    }

    // scenes
    public static LoginView loginView;
    public static RegisterView registerView;
    public static HomeView homeView;
    public static GameView gameView;
    public static InfoPlayerView infoPlayerView;
    public static MessageView messageView;
    public static RankingView rankingView;
    private final String serverAddress = "127.0.0.1";
    private final int port = 2000;
    
    // controller 
    public static SocketHandler socketHandler;

    public ClientRun() {
        socketHandler = new SocketHandler();
        connect(serverAddress, 2000);
        initScene();
        openScene(SceneName.LOGIN);
    }

     private void connect(String ip, int port) {

        // connect to server
        new Thread(() -> {
            // call controller
            String result = this.socketHandler.connect(ip, port);

            // check result
            if (result.equals("success")) {
                System.out.println("Ket noi thanh cong");
            } else {
                System.out.println("Ket noi that bai");
            }
        }).start();
    }
    
    public void initScene() {
        loginView = new LoginView();
        registerView = new RegisterView();
        homeView = new HomeView();
        infoPlayerView = new InfoPlayerView();
        rankingView = new RankingView();
        messageView = new MessageView();
        gameView = new GameView();
    }

    public static void openScene(SceneName sceneName) {
        if (null != sceneName) {
            switch (sceneName) {
                case LOGIN:
                    loginView = new LoginView();
                    loginView.setVisible(true);
                    break;
                case REGISTER:
                    registerView = new RegisterView();
                    registerView.setVisible(true);
                    break;
                case HOMEVIEW:
                    homeView = new HomeView();
                    homeView.setVisible(true);
                    break;
                case INFOPLAYER:
                    infoPlayerView = new InfoPlayerView();
                    infoPlayerView.setVisible(true);
                    break;
                case RANKING:
                    rankingView = new RankingView();
                    rankingView.setVisible(true);
                    break;
                case MESSAGEVIEW:
                    messageView = new MessageView();
                    messageView.setVisible(true);
                    break;
                case GAMEVIEW:
                    gameView = new GameView();
                    gameView.setVisible(true);
                    break;
                default:
                    break;
            }
        }
    }

    public static void closeScene(SceneName sceneName) {
        if (null != sceneName) {
            switch (sceneName) {
                case LOGIN:
                    loginView.dispose();
                    break;
                case REGISTER:
                    registerView.dispose();
                    break;
                case HOMEVIEW:
                    homeView.dispose();
                    break;
                case INFOPLAYER:
                    infoPlayerView.dispose();
                    break;
                case RANKING:
                    rankingView.dispose();
                    break;
                case MESSAGEVIEW:
                    messageView.dispose();
                    break;
                case GAMEVIEW:
                    gameView.dispose();
                    break;
                default:
                    break;
            }
        }
    }

    public static void closeAllScene() {
        loginView.dispose();
        registerView.dispose();
        homeView.dispose();
        infoPlayerView.dispose();
        messageView.dispose();
        gameView.dispose();
    }

    public static void main(String[] args) {
        new ClientRun();
    }
}
