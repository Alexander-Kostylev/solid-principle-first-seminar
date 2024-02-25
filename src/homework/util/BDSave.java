package homework.util;

import homework.SaveManager;
import homework.User;

public class BDSave implements SaveManager {
    @Override
    public void save(User user) {
        System.out.println("Save user from BD: " + user.getName());
    }
}
