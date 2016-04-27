package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ListagemApuracaoResultado {
  public ListagemApuracaoResultado() throws Exception {
    new SwingEngine(this).render("rel/ListagemApuracaoResultado.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ListagemApuracaoResultado();
  }
}
