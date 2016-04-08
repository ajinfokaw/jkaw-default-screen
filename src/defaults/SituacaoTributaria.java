package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class SituacaoTributaria {
  public SituacaoTributaria() throws Exception {
    new SwingEngine(this).render("swix/SituacaoTributaria.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new SituacaoTributaria();
  }
}
