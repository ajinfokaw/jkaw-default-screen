package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoVendaCarrinho2 {
  public LctoVendaCarrinho2() throws Exception {
    new SwingEngine(this).render("defaults/LctoVendaCarrinho2.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoVendaCarrinho2();
  }
}
