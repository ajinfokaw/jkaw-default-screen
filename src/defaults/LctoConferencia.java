package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LctoConferencia {
  public LctoConferencia() throws Exception {
    new SwingEngine(this).render("defaults/LctoConferencia.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LctoConferencia();
  }
}
