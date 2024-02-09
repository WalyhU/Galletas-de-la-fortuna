import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Galletas de la fortuna");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel label = new JLabel("Mensaje de la galleta de la fortuna");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(Box.createVerticalGlue());
        panel.add(label);

        JButton button = new JButton("Abrir galleta");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(button);

        JLabel messageLabel = new JLabel();
        messageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(messageLabel);

        button.addActionListener(e -> {
            MessageGenerator generator = new MessageGenerator();
            messageLabel.setText(generator.getRandomMessage());
        });

        panel.add(Box.createVerticalGlue());

        frame.add(panel);
        frame.setVisible(true);
    }
}