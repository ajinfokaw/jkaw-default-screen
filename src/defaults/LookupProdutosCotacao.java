package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupProdutosCotacao {
  public LookupProdutosCotacao() throws Exception {
    new SwingEngine(this).render("swix/LookupProdutosCotacao.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupProdutosCotacao();
  }
}
