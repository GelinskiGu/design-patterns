package iterator_pattern;

import java.util.List;

public class Profile {
    private final String id;
    private final String name;
    private final List<String> friends;
    private final List<String> closeFriends;

    public Profile(String id, String name, List<String> friends, List<String> closeFriends) {
        this.id = id;
        this.name = name;
        this.friends = friends;
        this.closeFriends = closeFriends;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getFriends() {
        return friends;
    }

    public List<String> getCloseFriends() {
        return closeFriends;
    }
}
