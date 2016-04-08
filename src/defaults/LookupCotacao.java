package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupCotacao {
  public LookupCotacao() throws Exception {
    new SwingEngine(this).render("swix/LookupCotacao.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupCotacao();
  }
}
