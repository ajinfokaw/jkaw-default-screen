package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupProdutos2 {
  public LookupProdutos2() throws Exception {
    new SwingEngine(this).render("defaults/LookupProdutos2.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupProdutos2();
  }
}
