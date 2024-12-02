package iterator_pattern;

import java.util.HashMap;
import java.util.Map;

public class Instagram implements SocialNetwork {
    private Map<String, Profile> profiles = new HashMap<>();

    public void addProfile(Profile profile) {
        profiles.put(profile.getId(), profile);
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileId) {
        return new InstagramIterator(profiles, profileId, "friends");
    }

    @Override
    public ProfileIterator createCloseFriendsIterator(String profileId) {
        return new InstagramIterator(profiles, profileId, "closeFriends");
    }
}
