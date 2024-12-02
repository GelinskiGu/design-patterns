package memento_pattern;

public class Editor {
    private String text;
    private String cursorPosition;

    public Editor() {
        this.text = "";
        this.cursorPosition = "0";
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCursorPosition(String cursorPosition) {
        this.cursorPosition = cursorPosition;
    }

    public String getText() {
        return text;
    }

    public String getCursorPosition() {
        return cursorPosition;
    }

    public Snapshot createSnapshot() {
        return new Snapshot(this.text, this.cursorPosition);
    }

    public void restore(Snapshot snapshot) {
        this.text = snapshot.getText();
        this.cursorPosition = snapshot.getCursorPosition();
    }

    public static class Snapshot {
        private final String text;
        private final String cursorPosition;

        private Snapshot(String text, String cursorPosition) {
            this.text = text;
            this.cursorPosition = cursorPosition;
        }

        private String getText() {
            return text;
        }

        private String getCursorPosition() {
            return cursorPosition;
        }
    }
}
