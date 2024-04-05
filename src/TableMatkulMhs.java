import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TableMatkulMhs {
    private JScrollPane gridtable;

    public TableMatkulMhs() {
        initializeTable();
    }

    private void initializeTable() {
        String[][] tableData = {
                {"Pemrograman Visual 3",  "Anti Korupsi", "Sistem Pakar", "Metode Penelitian Sistem Informasi"},
                {"Pemrograman Visual 3", "Anti Korupsi", "Sistem Pakar", "Metode Penelitian Sistem Informasi"},
                {"Interaksi Manusia & Komputer", "Anti Korupsi", "Business Analiytics", "Analisis dan Visualisasi Data"},
                {"Interaksi Manusia & Komputer", "Anti Korupsi", "Business Analiytics", "Analisis dan Visualisasi Data"}
        };
        String[] columnNames = {"Senin", "Selasa", "Kamis", "Sabtu"};

        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        for (String[] row : tableData) {
            model.addRow(row);
        }

        JTable table = new JTable(model);
        gridtable = new JScrollPane(table);

        // Menentukan lebar kolom
        for (int i = 0; i < columnNames.length; i++) {
            table.getColumnModel().getColumn(i).setPreferredWidth(200);
        }
    }

    public JScrollPane getGridtable() {
        return gridtable;
    }
}
