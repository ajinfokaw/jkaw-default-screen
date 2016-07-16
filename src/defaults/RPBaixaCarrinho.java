package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class RPBaixaCarrinho {
  public RPBaixaCarrinho() throws Exception {
    new SwingEngine(this).render("defaults/RPBaixaCarrinho.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new RPBaixaCarrinho();
  }
}
