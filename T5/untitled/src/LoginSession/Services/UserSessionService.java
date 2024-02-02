package LoginSession.Services;

import LoginSession.Clases.Session;
import LoginSession.Clases.User;

import java.util.ArrayList;

public class UserSessionService {

    public static ArrayList<User> userRegistered;
    public static ArrayList<Session> activeSessions;


    public static boolean checklfUserExists(User user) {

        return true;
    }

    public static boolean checklfUserlsDuplicate(String user) {

        return true;
    }

    public static boolean checkIfSessionExists(String user){
    for (int i= 0; i < activeSessions.size(); i++){

        // movernos para encontrar el usuario, si encuentra el usuario
    }
        return true;
    }

    public static boolean addUser (User user){
        return true;

    }

    public static boolean addSession(User user){
        return true;
    }

}
