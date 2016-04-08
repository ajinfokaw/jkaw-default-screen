package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Cadastro {
  public Cadastro() throws Exception {
    new SwingEngine(this).render("swix/Cadastro.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Cadastro();
  }
}
