package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class RazaoPorClasseGerencial {
  public RazaoPorClasseGerencial() throws Exception {
    new SwingEngine(this).render("rel/RazaoPorClasseGerencial.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new RazaoPorClasseGerencial();
  }
}
