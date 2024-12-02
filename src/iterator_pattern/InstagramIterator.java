package iterator_pattern;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class InstagramIterator implements ProfileIterator {
    private final Map<String, Profile> profiles;
    private String profileId;
    private String type;
    private Iterator<String> iterator;

    public InstagramIterator(Map<String, Profile> profiles, String profileId, String type) {
        this.profiles = profiles;
        this.profileId = profileId;
        this.type = type;
        reset();
    }

    @Override
    public boolean hasNext() {
        return iterator != null && iterator.hasNext();
    }

    @Override
    public Profile getNext() {
        if (!hasNext()) {
            return null;
        }
        String nextId = iterator.next();
        return profiles.get(nextId);
    }

    @Override
    public void reset() {
        Profile profile = profiles.get(profileId);
        if (profile != null) {
            List<String> connections = type.equals("friends") ? profile.getFriends() : profile.getCloseFriends();
            iterator = connections.iterator();
        } else {
            iterator = null;
        }
    }
}
