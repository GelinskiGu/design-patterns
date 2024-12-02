package command_pattern;

public class Editor {
    private String clipboard = "";
    private String text = "";

    public void copy(String selection) {
        clipboard = selection;
    }

    public String getClipboard() {
        return clipboard;
    }

    public void cut(String selection) {
        clipboard = selection;
        text = text.replace(selection, "");
    }

    public void paste(int position) {
        text = text.substring(0, position) + clipboard + text.substring(position);
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
