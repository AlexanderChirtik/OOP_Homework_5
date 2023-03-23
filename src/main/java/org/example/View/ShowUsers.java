package org.example.View;

import org.example.User;

import java.util.List;

public interface ShowUsers {
    public String userView(List<User> students);
    public String userView(User user);
}
