package defaults;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class EspecificacaoTecnica {
  public EspecificacaoTecnica() throws Exception {
    new SwingEngine(this).render("swix/EspecificacaoTecnica.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new EspecificacaoTecnica();
  }
}
