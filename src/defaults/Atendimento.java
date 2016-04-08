package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Atendimento {
  public Atendimento() throws Exception {
    new SwingEngine(this).render("swix/Atendimento.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Atendimento();
  }
}
