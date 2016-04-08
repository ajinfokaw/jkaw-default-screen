package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class AliquotasINSS {
  public AliquotasINSS() throws Exception {
    new SwingEngine(this).render("swix/AliquotasINSS.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new AliquotasINSS();
  }
}
