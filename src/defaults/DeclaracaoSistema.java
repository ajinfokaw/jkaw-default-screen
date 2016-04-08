package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class DeclaracaoSistema {
  public DeclaracaoSistema() throws Exception {
    new SwingEngine(this).render("swix/DeclaracaoSistema.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new DeclaracaoSistema();
  }
}
