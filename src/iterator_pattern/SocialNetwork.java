package iterator_pattern;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileId);
    ProfileIterator createCloseFriendsIterator(String profileId);
}
