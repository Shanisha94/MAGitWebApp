package engine.users;
import application.logic.manager.Repository;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Repository> repositories;

    public User(String username){
        this.username = username;
        this.repositories = new ArrayList<>();
    }

    public List<Repository> getRepositories() {
        return repositories;
    }
}
