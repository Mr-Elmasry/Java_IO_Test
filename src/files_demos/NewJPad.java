/**
 * * @author Mr. Ahmed Elmasry Mr_el_masry@yahoo.com *Date:Aug 13, 2014
 */
package files_demos;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class NewJPad extends JFrame{
    //Variables
    private JTextArea  txtEditor;
    private OpenAction opAction;
    private SaveAction svAction;
    private ExitAction exAction;
    
  
    public NewJPad() {
        setWindow();
        addMenus();
    }
    
    public static void main(String[] args) {
        new NewJPad().setVisible(true);
    }
    
    private void addMenus(){
        JMenuBar mBar    = new JMenuBar();
        JMenu    fileM   = new JMenu("File");
        
        JMenuItem opItem = new JMenuItem(opAction);
        opItem.setText("Open");
        JMenuItem svItem = new JMenuItem(svAction);
        svItem.setText("Save");
        JMenuItem exItem = new JMenuItem(exAction);
        exItem.setText("Exit");
        
        fileM.add(opItem);
        fileM.add(svItem);
        fileM.add(exItem);
        mBar.add(fileM);
        JMenu edMenu = mBar.add(new JMenu("Edit"));
        this.setJMenuBar(mBar);
}   

    private void setWindow() {
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Simple Editor!");
        txtEditor = new JTextArea();
        txtEditor.setFont(new Font("Arial", Font.BOLD, 22));
        add(txtEditor);        
    }
    class OpenAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e){
        }
        }
    class SaveAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e){
        }
        }
    class ExitAction extends AbstractAction{
         @Override
         public void actionPerformed(ActionEvent e){
            }
    }
}
