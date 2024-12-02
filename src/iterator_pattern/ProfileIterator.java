package iterator_pattern;

public interface ProfileIterator {
    boolean hasNext();
    Profile getNext();
    void reset();
}
