import javax.swing.JOptionPane;
public class Greeter {
    public void sayHello() {
        JOptionPane.showMessageDialog(null,
                "Hello, Sasha!", "Greeter",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
