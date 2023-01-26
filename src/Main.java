import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
//
//        FirstDialog testDialog = new FirstDialog();
//        FirstInteraction testForm = new FirstInteraction();
//
//        testDialog.show();
    MyTable tableClass = new MyTable();
    tableClass.showFrame();
    }
}