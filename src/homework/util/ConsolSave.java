package homework.util;

import homework.SaveManager;
import homework.User;

public class ConsolSave implements SaveManager {
    @Override
    public void save(User user) {
        System.out.println("Save user from CONSOL: " + user.getName());
    }
}
