package homework;

public class User{
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void save(SaveManager manager){
        Persister persister = new Persister(this);
        persister.save(manager);
    }

//    public void report(){
//        System.out.println("Report for user: " + name);
//    }
}
