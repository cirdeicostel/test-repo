import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MyTable {

    public JFrame f;
    public JTable table;
    public MyTable() {
        DefaultTableModel tableModel = new DefaultTableModel();
        table = new JTable(tableModel);

        tableModel.addColumn("C0");
        tableModel.addColumn("C1");
        tableModel.addColumn("C2");
        tableModel.insertRow(0, new Object[] { "00", "1", "2" });
        tableModel.insertRow(1, new Object[] { "10", "1", "2" });
        tableModel.insertRow(2, new Object[] { "20", "1", "2" });
        tableModel.insertRow(3, new Object[] { "30", "1", "2" });

//        tableModel.get
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = table.rowAtPoint(evt.getPoint());
                int col = table.columnAtPoint(evt.getPoint());
                if (row >= 0 && col >= 0) {
                    System.out.print(row + '-' + col);
                }
            }
        });

        f = new JFrame();
        f.setSize(550, 350);
        f.add(new JScrollPane(table));

    }

    public void showFrame() {
        f.setVisible(true);
    }
}
