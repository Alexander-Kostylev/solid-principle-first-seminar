package homework;

public class Persister{
    private final User user;

    public Persister(User user){
        this.user = user;
    }

    public void save(SaveManager manager){
        manager.save(user);
    }
}
