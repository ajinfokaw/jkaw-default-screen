package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class TextoAdicional {
  public TextoAdicional() throws Exception {
    new SwingEngine(this).render("swix/TextoAdicional.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new TextoAdicional();
  }
}
