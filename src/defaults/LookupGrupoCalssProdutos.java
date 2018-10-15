package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupGrupoCalssProdutos {
  public LookupGrupoCalssProdutos() throws Exception {
    new SwingEngine(this).render("defaults/LookupGrupoCalssProdutos.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupGrupoCalssProdutos();
  }
}
