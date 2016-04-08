package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class CartaCorrecao {
  public CartaCorrecao() throws Exception {
    new SwingEngine(this).render("swix/CartaCorrecao.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new CartaCorrecao();
  }
}
