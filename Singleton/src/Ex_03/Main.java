package Ex_03;


public class Main {
    public static void main(String[] args) {

    UserSessionManager sessionManager = UserSessionManager.getInstance();

    System.out.println("Token de Acesso:" + sessionManager.getSessionToken());
    System.out.println("Último Acesso: " + sessionManager.getLastAcessTime());

    sessionManager.updateAccessTime();

    System.out.println("Token de Acesso:" + sessionManager.getSessionToken());
    System.out.println("Último Acesso: " + sessionManager.getLastAcessTime());

}

}
