package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupProdutosVenda {
  public LookupProdutosVenda() throws Exception {
    new SwingEngine(this).render("swix/LookupProdutosVenda.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupProdutosVenda();
  }
}
