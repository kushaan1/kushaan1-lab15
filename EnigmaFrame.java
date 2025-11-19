import javax.swing.*;
import java.awt.*;

public class EnigmaFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600, 400);
        frame.setTitle("Enigma GUI");

        JLabel labelInner = new JLabel("Inner");
        JLabel labelMiddle = new JLabel("Middle");
        JLabel labelOuter = new JLabel("Outer");

        JLabel initialPos = new JLabel("Initial Positions");
        JTextField startingPos = new JTextField();
        int charLimit = 3;

        JButton encryptBtn = new JButton("Encrypt");
        JButton decryptBtn = new JButton("Decrypt");

        Integer[] rotorOptions = {1, 2, 3, 4, 5};
        JComboBox<Integer> innerBox = new JComboBox<>(rotorOptions);
        JComboBox<Integer> middleBox = new JComboBox<>(rotorOptions);
        JComboBox<Integer> outerBox = new JComboBox<>(rotorOptions);

        JPanel header = new JPanel();
        

        header.setLayout(new FlowLayout());
        header.add(labelInner);
        header.add(innerBox);
        header.add(labelMiddle);
        header.add(middleBox);
        header.add(labelOuter);
        header.add(outerBox);

        header.add(initialPos);
        header.add(startingPos);

        header.add(encryptBtn);
        header.add(decryptBtn);

        JPanel inputBoxes = new JPanel();
        inputBoxes.setLayout(new BoxLayout(inputBoxes, BoxLayout.Y_AXIS));
        inputBoxes.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel inputLabel = new JLabel("Input");
        inputLabel.setPreferredSize(new Dimension(60, 20));
        JTextArea inputText = new JTextArea(3, 50);

        JPanel inputRow = new JPanel(new BorderLayout(5,5));
        inputRow.add(inputLabel, BorderLayout.WEST);
        inputRow.add(new JScrollPane(inputText), BorderLayout.CENTER);

        JLabel outputLabel = new JLabel("Output");
        outputLabel.setPreferredSize(new Dimension(60, 20));
        JTextArea outputText = new JTextArea(3, 50);

        JPanel outputRow = new JPanel(new BorderLayout(5,5));
        outputRow.add(outputLabel, BorderLayout.WEST);
        outputRow.add(new JScrollPane(outputText), BorderLayout.CENTER);

        inputBoxes.add(inputRow);
        inputBoxes.add(Box.createVerticalStrut(10));
        inputBoxes.add(outputRow);

        frame.add(header, BorderLayout.NORTH);
        frame.add(inputBoxes, BorderLayout.CENTER);
        frame.pack();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
