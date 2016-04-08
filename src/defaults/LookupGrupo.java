package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupGrupo {
  public LookupGrupo() throws Exception {
    new SwingEngine(this).render("swix/LookupGrupo.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupGrupo();
  }
}
