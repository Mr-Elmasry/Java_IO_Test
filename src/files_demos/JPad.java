/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */
package files_demos;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.*;
import javax.swing.*;

public class JPad extends JFrame {
    // Variables ;
    JTextArea txtEditor;
    //... Create actions for menu items, buttons, ...
    private final Action openAction = new OpenAction();
    private final Action saveAction = new SaveAction();
    private final Action exitAction = new ExitAction();

    public JPad() {
        //the Window
        this.setSize(800, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        txtEditor = new JTextArea(15, 80);
        txtEditor.setFont(new Font("Arial", Font.PLAIN, 20));

        this.add(txtEditor);

        JMenuBar menuBar = new JMenuBar();
        JMenu fMenu = menuBar.add(new JMenu("File"));
        JMenu edMenu = menuBar.add(new JMenu("Edit"));

        JMenuItem opItem = new JMenuItem(openAction);
        opItem.setText("Open");
        fMenu.add(opItem);
        JMenuItem savItem = new JMenuItem(saveAction);
        savItem.setText("Save");
        fMenu.add(savItem);
        JMenuItem exItem = new JMenuItem(exitAction);
        exItem.setText("Exit");
        fMenu.add(exItem);

        this.setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        new JPad().setVisible(true);
    }

    class OpenAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fChsr = new JFileChooser();
            int retval = fChsr.showOpenDialog(JPad.this);
            if (retval == JFileChooser.APPROVE_OPTION) {
                File f = fChsr.getSelectedFile();
                try {
                    FileReader reader = new FileReader(f);
                    txtEditor.read(reader, null);
                } catch (IOException ex) {
                    System.out.println(ex);
                    System.exit(1);
                }
            }
        }
    }

    class SaveAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fChsr = new JFileChooser();
            int retval = fChsr.showSaveDialog(null);
            if (retval == JFileChooser.APPROVE_OPTION) {
                File f = fChsr.getSelectedFile();
                try {
                    FileWriter writer = new FileWriter(f);
                    txtEditor.write(writer);

                } catch (IOException ioex) {
                    System.out.println(ioex);
                    System.exit(1);
                }
            }

        }
    }

    class ExitAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

}