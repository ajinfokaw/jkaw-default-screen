package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ListagemSOLICITACAO {
  public ListagemSOLICITACAO() throws Exception {
    new SwingEngine(this).render("rel/ListagemSOLICITACAO.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ListagemSOLICITACAO();
  }
}
