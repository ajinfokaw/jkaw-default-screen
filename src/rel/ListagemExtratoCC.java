package rel;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class ListagemExtratoCC {
  public ListagemExtratoCC() throws Exception {
    new SwingEngine(this).render("rel/ListagemExtratoCC.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new ListagemExtratoCC();
  }
}
