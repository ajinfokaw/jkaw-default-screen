package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class GrupoCadastro {
  public GrupoCadastro() throws Exception {
    new SwingEngine(this).render("swix/GrupoCadastro.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new GrupoCadastro();
  }
}
