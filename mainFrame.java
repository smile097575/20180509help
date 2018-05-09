import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainFrame extends JFrame {
    int count =20;
    private JButton jbnB = new JButton("BIG");
    private JButton jbnS = new JButton("SMALL");
    private JButton jbnE = new JButton("EXIT");
    private JLabel jlb = new JLabel("HI!!");

    public mainFrame() {
        Ex1();
    }

    private void Ex1() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocation(100,50);
        this.setSize(800,600);
        jlb.setBounds(50,150,100,100);
        jbnB.setBounds(50,80,100,100);
        jbnS.setBounds(150,80,100,100);
        jbnE.setBounds(250,80,100,100);
        jbnE.setBounds(250,80,100,100);

        this.add(jbnB);
        this.add(jbnS);
        this.add(jbnE);
        this.add(jlb);

        jbnB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count+=3;
                jlb.setFont(new Font(null,Font.BOLD,count));
            }
        });
        jbnS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count-=3;
                jlb.setFont(new Font(null,Font.BOLD,count));
            }
        });
        jbnE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }


}
