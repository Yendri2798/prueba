package cr.una.gui.lab2;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author mguzmana
 */
public class Lab2 extends JFrame {
    JLabel lblFirstName;
    JLabel lblLastName;
    JLabel lblFullName;
    JLabel lblPhone;
    JLabel lblGender;
    JLabel lblResult;

    JComboBox<String> gender;

    JTextField name;
    JTextField lastName;
    JTextField fullName;
    JTextField phone;
    JTextArea area;

    JButton btnOK;
    JButton btnClean;

    String [] genders = {"Masculino","Femenino"};
    static final int WIDTH = 225;
    static final int HEIGHT = 400;

    public Lab2() {
        super("Lab2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        JPanel panel = new JPanel();
        lblFirstName = new JLabel("Nombre: ");
        lblLastName = new JLabel("Apellido: ");
        lblFullName = new JLabel("Nombre Completo: ");
        lblPhone = new JLabel("Phone: ");
        lblGender = new JLabel("Gender: ");
        lblResult = new JLabel("Result: ");
        btnOK = new JButton("OK");
        btnClean = new JButton("CLEAN");

        name = new JTextField(15);
        lastName = new JTextField(15);
        fullName = new JTextField(15);
        phone = new JTextField(8);
        area = new JTextArea(5, 20);

        gender = new JComboBox<>(genders);

        lblFirstName.setName("lblFirstName");
        lblLastName.setName("lblLastName");
        lblFullName.setName("lblFullName");
        lblPhone.setName("lblPhone");
        lblGender.setName("lblGender");

        gender.setSelectedIndex(0);

        panel.add(lblFirstName);
        panel.add(name);
        panel.add(lblLastName);
        panel.add(lastName);
        panel.add(lblFullName);
        panel.add(lblPhone);
        panel.add(fullName);
        panel.add(lblGender);
        panel.add(gender);
        panel.add(lblResult);
        panel.add(area);
        panel.add(btnOK);
        panel.add(btnClean);
        add(panel);
        eventActionListenerBtnOK();


        setVisible(true);

    }

    private void eventActionListenerBtnOK() {
        btnOK.addActionListener(actionEvent -> {
            fullName.setText(name.getText() + " " + lastName.getText());
        });
    }

    public static void main(String[] arguments) {
        Lab2 l = new Lab2();
        l.setVisible(true);
    }
}