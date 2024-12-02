package iterator_pattern;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Instagram instagram = getInstagram();

        SocialSpammer spammer = new SocialSpammer();

        System.out.println("Iterando amigos de Pedro:");
        ProfileIterator friendsIterator = instagram.createFriendsIterator("1");
        spammer.sendSpam(friendsIterator, "Oi, amigo!");

        System.out.println("\nIterando amigos próximos de Pedro:");
        ProfileIterator closeFriendsIterator = instagram.createCloseFriendsIterator("1");
        spammer.sendSpam(closeFriendsIterator, "Oi, amigo próximo!");
    }

    private static Instagram getInstagram() {
        Instagram instagram = new Instagram();

        Profile profile1 = new Profile("1", "Pedro",
                Arrays.asList("2", "3"),
                Arrays.asList("2"));
        Profile profile2 = new Profile("2", "Bob",
                Arrays.asList("1", "3"),
                Arrays.asList("1", "3"));
        Profile profile3 = new Profile("3", "Charlie",
                Arrays.asList("1", "2"),
                Arrays.asList("2"));

        instagram.addProfile(profile1);
        instagram.addProfile(profile2);
        instagram.addProfile(profile3);
        return instagram;
    }
}
