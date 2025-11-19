import javax.swing.*;
import java.awt.*;

public class EnigmaFrame extends JFrame {
    public JComboBox<Integer> innerBox;
    public JComboBox<Integer> middleBox;
    public JComboBox<Integer> outerBox;
   
    public JButton encryptBtn;
    public JButton decryptBtn;
   
    public JTextField startingPos;
    public JTextArea inputText;
    public JTextArea outputText;

    public EnigmaFrame() {
        setSize(600, 400);
        setTitle("Enigma GUI");

        JLabel labelInner = new JLabel("Inner");
        JLabel labelMiddle = new JLabel("Middle");
        JLabel labelOuter = new JLabel("Outer");

        JLabel initialPos = new JLabel("Initial Positions");
        startingPos = new JTextField(3);

        encryptBtn = new JButton("Encrypt");
        decryptBtn = new JButton("Decrypt");

        Integer[] rotorOptions = {1, 2, 3, 4, 5};
        innerBox = new JComboBox<>(rotorOptions);
        middleBox = new JComboBox<>(rotorOptions);
        outerBox = new JComboBox<>(rotorOptions);

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
        inputText = new JTextArea(3, 50);

        JPanel inputRow = new JPanel(new BorderLayout(5,5));
        inputRow.add(inputLabel, BorderLayout.WEST);
        inputRow.add(new JScrollPane(inputText), BorderLayout.CENTER);

        JLabel outputLabel = new JLabel("Output");
        outputLabel.setPreferredSize(new Dimension(60, 20));
        outputText = new JTextArea(3, 50);
        outputText.setEditable(false);

        JPanel outputRow = new JPanel(new BorderLayout(5,5));
        outputRow.add(outputLabel, BorderLayout.WEST);
        outputRow.add(new JScrollPane(outputText), BorderLayout.CENTER);

        inputBoxes.add(inputRow);
        inputBoxes.add(Box.createVerticalStrut(10));
        inputBoxes.add(outputRow);

        add(header, BorderLayout.NORTH);
        add(inputBoxes, BorderLayout.CENTER);
        pack();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

}
