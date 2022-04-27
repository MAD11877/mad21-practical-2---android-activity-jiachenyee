package sg.edu.np.mad.madpractical;

public class User {
    public String name;
    public String description;
    public Integer id;
    public Boolean followed;

    public User(String name, String description, Integer id, Boolean followed) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.followed = followed;
    }
}
