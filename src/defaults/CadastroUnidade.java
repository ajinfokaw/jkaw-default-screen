package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class CadastroUnidade {
  public CadastroUnidade() throws Exception {
    new SwingEngine(this).render("swix/CadastroUnidade.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new CadastroUnidade();
  }
}
