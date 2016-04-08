package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class RPBaixa {
  public RPBaixa() throws Exception {
    new SwingEngine(this).render("swix/RPBaixa.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new RPBaixa();
  }
}
