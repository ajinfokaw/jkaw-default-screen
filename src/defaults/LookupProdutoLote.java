package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupProdutoLote {
  public LookupProdutoLote() throws Exception {
    new SwingEngine(this).render("defaults/LookupProdutoLote.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupProdutoLote();
  }
}
