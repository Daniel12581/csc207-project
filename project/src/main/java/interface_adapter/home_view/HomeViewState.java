package main.java.interface_adapter.home_view;

import main.java.entity.User;
import main.java.interface_adapter.project.ProjectState;

public class HomeViewState {
    private User user;

    public HomeViewState(HomeViewState copy) {
        user = copy.user;
    }

    // Because of the previous copy constructor, the default constructor must be explicit.
    public HomeViewState() {
    }

    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }
}
