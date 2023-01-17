import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class x1 {
    private JPanel panel1;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a1Button;
    private JButton a4Button;
    private JButton CALCULARButton;

    public x1() {
        CALCULARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {;

            }
        });
    }

    public static void main(String[] arg){
        JFrame frame = new JFrame("x1");
        frame.setContentPane(new x1().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
