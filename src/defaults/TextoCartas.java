package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class TextoCartas {
  public TextoCartas() throws Exception {
    new SwingEngine(this).render("swix/TextoCartas.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new TextoCartas();
  }
}
