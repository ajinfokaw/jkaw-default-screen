package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class InstalarCertificado {
  public InstalarCertificado() throws Exception {
    new SwingEngine(this).render("swix/InstalarCertificado.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new InstalarCertificado();
  }
}
