package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class AliquotasICMS {
  public AliquotasICMS() throws Exception {
    new SwingEngine(this).render("swix/AliquotasICMS.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new AliquotasICMS();
  }
}
