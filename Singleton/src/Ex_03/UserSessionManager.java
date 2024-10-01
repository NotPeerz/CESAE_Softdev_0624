package Ex_03;

import java.util.Random;

public class UserSessionManager {
    private static UserSessionManager instance;
    private int sessionToken;
    private long lastAcessTime;

    private UserSessionManager() {
        this.sessionToken = new Random().nextInt(50);
        this.lastAcessTime = System.currentTimeMillis();
    }

    public static UserSessionManager getInstance() {
        if (instance == null) {
            instance = new UserSessionManager ();
        }
        return instance;
    }

    public int getSessionToken() {
        return sessionToken;
    }

    public long getLastAcessTime() {
        return lastAcessTime;
    }

    //falta terminar o update
    public void updateAccessTime(){
        this.lastAcessTime =  System.currentTimeMillis();
    }

}