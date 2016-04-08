package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupFinancBaixas {
  public LookupFinancBaixas() throws Exception {
    new SwingEngine(this).render("defaults/LookupFinancBaixas.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupFinancBaixas();
  }
}
