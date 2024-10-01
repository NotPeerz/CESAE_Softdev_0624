package Ex_04;

import Ex_03.UserSessionManager;

public class FileManager {
    private static FileManager instance;


    private FileManager() {

    }

    public static FileManager getInstance() {
        if (instance == null) {
            instance = new FileManager ();
        }
        return instance;
    }

    public void setRootDirectory() {


    }




}