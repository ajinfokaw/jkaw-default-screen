package main;
import org.swixml.*;
import javax.swing.*;
import java.awt.event.*;
public class MainWindow {
  public MainWindow() throws Exception {
    new SwingEngine(this).render("main/MainWindow.swx").setVisible(true);
  }
  public static void main(  String[] args) throws Exception {
    new MainWindow();
  }
}
