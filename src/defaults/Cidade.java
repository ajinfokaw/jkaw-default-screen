package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class Cidade {
  public Cidade() throws Exception {
    new SwingEngine(this).render("swix/Cidade.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new Cidade();
  }
}
