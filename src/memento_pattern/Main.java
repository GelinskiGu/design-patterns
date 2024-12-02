package memento_pattern;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Command command = new Command(editor);

        editor.setText("Primeira versão do texto");
        editor.setCursorPosition("10");
        command.save();

        editor.setText("Segunda versão do texto");
        editor.setCursorPosition("20");
        command.save();

        editor.setText("Terceira versão do texto");
        System.out.println("Estado atual: " + editor.getText());

        command.undo();
        System.out.println("Estado após desfazer: " + editor.getText());

        command.undo();
        System.out.println("Estado após desfazer novamente: " + editor.getText());

        command.undo();
    }
}
