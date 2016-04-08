package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Usuario {
  public Usuario() throws Exception {
    new SwingEngine(this).render("swix/Usuario.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Usuario();
  }
}
