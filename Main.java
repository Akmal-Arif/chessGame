import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;

class Main {

  public Main(){

    JFrame frame = new JFrame("Chess Written In Java (CWIJ)");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 800);
    // CardLayout cl = new CardLayout();
    // frame.setLayout(cl);

    JPanel jp1 = new JPanel();
    JPanel jp2 = new JPanel();
    
    
    JButton btnStart = new JButton("Start Game");
    JButton btnStart2 = new JButton("terst anotehr button");


    jp1.add(btnStart);
    jp2.add(btnStart2);

    frame.add(jp1);
    frame.add(jp2);
    frame.setVisible(true);
  }
  public static void main(String[] args) {
    new Main();
    
  }
}
