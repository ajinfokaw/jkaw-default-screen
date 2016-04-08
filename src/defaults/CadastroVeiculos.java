package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class CadastroVeiculos {
  public CadastroVeiculos() throws Exception {
    new SwingEngine(this).render("swix/CadastroVeiculos.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new CadastroVeiculos();
  }
}
