package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class PBaixa {
  public PBaixa() throws Exception {
    new SwingEngine(this).render("swix/PBaixa.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new PBaixa();
  }
}
