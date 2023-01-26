import javax.swing.*;
import javax.swing.JTable;
import java.awt.event.*;

public class FirstDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTable table1;

    public FirstDialog() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

//        table1 = new JTable();
//        this.table1.addRow(new Object[]{"Column 1", "Column 2", "Column 3"});
//        DefaultTableModel model = new DefaultTableModel();
//        table1 = new JTable(model);
//        table1.addColumn("Test");
//        table1.addColumn(new TableColumn(new Object[]{"Test1"}));
//        this.table1.addRow(new Object[]{"Column 1", "Column 2", "Column 3"});
//        this.onOK();
//        table1 = new JTable();
//        table1.inse
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        FirstDialog dialog = new FirstDialog();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
