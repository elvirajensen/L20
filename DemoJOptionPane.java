import javax.swing.JOptionPane;

public class DemoJOptionPane {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,"Detta är ett program som multiplicerar två tal.");
        String name = JOptionPane.showInputDialog("Ange ditt namn");
        int nbr1 = Integer.parseInt(JOptionPane.showInputDialog("Ange det första talet!!!"));
        int nbr2 = Integer.parseInt(JOptionPane.showInputDialog("Ange det andra talet"));

        int product = nbr1*nbr2;
        String answerSuggestion = "Tack " + name + "!\nÄr svaret: "+product;

        int answer = JOptionPane.showConfirmDialog(null,answerSuggestion, "Vad blir svaret?",JOptionPane.YES_NO_OPTION);

        if(answer == JOptionPane.YES_OPTION){ //yes är 0
            JOptionPane.showMessageDialog(null, "Svaret är rätt!");
        }
        else if(answer == JOptionPane.NO_OPTION) { //no är 1
            JOptionPane.showMessageDialog(null, "Svaret är fel!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Inget svar!");
        }
    }
}

