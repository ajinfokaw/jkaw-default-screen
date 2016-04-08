package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoSearchProd {
  public LctoSearchProd() throws Exception {
    new SwingEngine(this).render("defaults/LctoSearchProd.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoSearchProd();
  }
}
