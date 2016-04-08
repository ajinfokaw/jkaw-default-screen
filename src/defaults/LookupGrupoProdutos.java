package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupGrupoProdutos {
  public LookupGrupoProdutos() throws Exception {
    new SwingEngine(this).render("swix/LookupGrupoProdutos.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupGrupoProdutos();
  }
}
