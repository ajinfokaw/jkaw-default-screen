package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LancamentoCTe {
  public LancamentoCTe() throws Exception {
    new SwingEngine(this).render("swix/LancamentoCTe.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LancamentoCTe();
  }
}
