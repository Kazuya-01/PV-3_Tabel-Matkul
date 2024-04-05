import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // 1. Buat JFrame
//        JFrame jFrame = new JFrame("Hello World Frame");
            JFrame jFrame = new JFrame("Jadwal Mata Kuliah");


            // Buat instance dari TableMhs
            TableMatkulMhs tableMatkulMhs = new TableMatkulMhs();

            // 2. set content pane
            // jFrame.setContentPane(new HelloForm().panel1);

            // Menambahkan JScrollPane ke content pane JFrame
            jFrame.getContentPane().add(tableMatkulMhs.getGridtable());
            // 3. set jika tombol x di klik
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.add(tableMatkulMhs.getGridtable());
            jFrame.setSize(800, 800);
            jFrame.pack();
            jFrame.setVisible(true);

        });
    }
}