package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoSelecao {
  public LctoSelecao() throws Exception {
    new SwingEngine(this).render("defaults/LctoSelecao.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoSelecao();
  }
}
