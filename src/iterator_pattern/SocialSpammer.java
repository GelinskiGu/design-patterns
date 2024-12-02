package iterator_pattern;

public class SocialSpammer {
    public void sendSpam(ProfileIterator iterator, String message) {
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            System.out.println("Enviando mensagem para " + profile.getName() + ": " + message);
        }
    }
}
