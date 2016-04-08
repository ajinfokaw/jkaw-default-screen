package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class GrupoProdutos {
  public GrupoProdutos() throws Exception {
    new SwingEngine(this).render("swix/GrupoProdutos.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new GrupoProdutos();
  }
}
