public class EnigmaGUI {

    public static void main(String[] args) {
        EnigmaFrame frame = new EnigmaFrame();
        frame.encryptBtn.addActionListener(e -> processChoices(frame, true));
        frame.decryptBtn.addActionListener(e -> processChoices(frame, false));
    }
    public static void processChoices(EnigmaFrame frame, boolean isEncrypt){
        int inner = (Integer)frame.innerBox.getSelectedItem(); 
        int middle = (Integer)frame.middleBox.getSelectedItem();
        int outer = (Integer)frame.outerBox.getSelectedItem();
        String startPos = frame.startingPos.getText().toUpperCase();    
        String input = frame.inputText.getText().toUpperCase();
        Enigma enigma = new Enigma(inner, middle, outer, startPos);

        if(isEncrypt){
            String encryptedText = enigma.encrypt(input);
            frame.outputText.setText(encryptedText);
        } else {
            String decryptedText = enigma.decrypt(input);
            frame.outputText.setText(decryptedText);
        }
    }

}
