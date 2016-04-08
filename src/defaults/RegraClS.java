package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class RegraClS {
  public RegraClS() throws Exception {
    new SwingEngine(this).render("swix/RegraClS.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new RegraClS();
  }
}
