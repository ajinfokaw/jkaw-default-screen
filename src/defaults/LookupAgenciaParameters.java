package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class LookupAgenciaParameters {
  public LookupAgenciaParameters() throws Exception {
    new SwingEngine(this).render("swix/LookupAgenciaParameters.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new LookupAgenciaParameters();
  }
}
