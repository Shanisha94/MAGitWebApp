package engine.users;
import java.util.*;

/*
Adding and retrieving users is synchronized and in that manner - these actions are thread safe
Note that asking if a user exists (isUserExists) does not participate in the synchronization and it is the responsibility
of the user of this class to handle the synchronization of isUserExists with other methods here on it's own
 */
public class UserManager {

    private final Map<String, User> users;
    private String activeUser;

    public UserManager() {
        users = new HashMap<>();
    }

    public synchronized void addUser(String username) {
        activeUser = username;
        users.put(username, new User(username));
    }

    public synchronized void removeUser(String username) {
        users.remove(username);
    }

    public boolean isUserExists(String username) {
        return users.containsKey(username);
    }

    public String getActiveUser(){
        return activeUser;
    }

    public void setActiveUser(String user){
        activeUser = user;
    }

    public Map<String, User> getUsers(){
        return users;
    }
}
