package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class CadastroCliente {
  public CadastroCliente() throws Exception {
    new SwingEngine(this).render("swix/CadastroCliente.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new CadastroCliente();
  }
}
