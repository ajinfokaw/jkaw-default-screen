package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class FormularioEmail {
  public FormularioEmail() throws Exception {
    new SwingEngine(this).render("swix/FormularioEmail.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new FormularioEmail();
  }
}
