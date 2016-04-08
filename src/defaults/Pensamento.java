package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Pensamento {
  public Pensamento() throws Exception {
    new SwingEngine(this).render("defaults/Pensamento.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Pensamento();
  }
}
