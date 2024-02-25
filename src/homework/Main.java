package homework;

import homework.util.BDSave;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Reported reported = new Reported();
//        user.report();
        reported.report(user);
        user.save(new BDSave());
    }
}