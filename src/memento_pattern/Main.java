package memento_pattern;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Command command = new Command(editor);

        editor.setText("Primeira versão do texto");
        editor.setCursorPosition("10");
        command.save(); // Salva o estado atual

        editor.setText("Segunda versão do texto");
        editor.setCursorPosition("20");
        command.save(); // Salva o estado atual

        editor.setText("Terceira versão do texto");
        System.out.println("Estado atual: " + editor.getText());

        command.undo(); // Restaura para o estado anterior
        System.out.println("Estado após desfazer: " + editor.getText());

        command.undo(); // Restaura para o primeiro estado
        System.out.println("Estado após desfazer novamente: " + editor.getText());

        command.undo(); // Tenta restaurar além do limite
    }
}
