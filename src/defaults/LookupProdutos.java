package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupProdutos {
  public LookupProdutos() throws Exception {
    new SwingEngine(this).render("swix/LookupProdutos.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupProdutos();
  }
}
