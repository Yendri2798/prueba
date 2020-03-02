package cr.una.gui.lab2;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author mguzmana
 */
public class Lab2 extends JFrame {
    private JLabel lblFirstName;
    private JLabel lblLastName;
    private JLabel lblFullName;
    private JTextField name;
    private JTextField lastName;
    private JTextField fullName;

    public Lab2(){
        super("Lab2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        lblFirstName = new JLabel("Nombre: ");
        lblLastName = new JLabel("Apellido: ");
        lblFullName = new JLabel("Nombre Completo: ");

        name = new JTextField(15);
        lastName = new JTextField(15);
        fullName = new JTextField(15);

        lblFirstName.setName("lblFirstName");
        lblLastName.setName("lblLastName");
        lblFullName.setName("lblFullName");
        panel.add(lblFirstName);
        panel.add(name);
        panel.add(lblLastName);
        panel.add(lastName);
        panel.add(lblFullName);
        panel.add(fullName);
        add(panel);


        setVisible(true);

    }

    public static void main(String[] arguments) {
        Lab2 l = new Lab2();
        l.setVisible(true);
    }
}