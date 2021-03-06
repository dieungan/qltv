/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv;

import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.IBodyElement;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

/**
 *
 * @author Ngan Sam
 */
public class Quanlysach extends javax.swing.JPanel {
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField searchBar;
    private int choose = 0;


    /**
     * Creates new form Quanlysach
     */
    public Quanlysach() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btTimKiem = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btThem = new javax.swing.JButton();
        btHienThi = new javax.swing.JButton();
        btNhapFile = new javax.swing.JButton();
        btXuatFile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSach = new javax.swing.JTable();
        jLabelHovaten = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        btTimKiem.setText("Tìm kiếm");
        btTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimKiemActionPerformed(evt);
            }
        });

        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btHienThi.setText("Hiển thị");
        btHienThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHienThiActionPerformed(evt);
            }
        });

        btNhapFile.setText("Nhập file");
        btNhapFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNhapFileActionPerformed(evt);
            }
        });

        btXuatFile.setText("Xuất file");
        btXuatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXuatFileActionPerformed(evt);
            }
        });

        tableSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã sách", "Tên sách", "Nhà xuất bản", "Tên tác giả", "Thể loại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableSach.setRowHeight(26);
        tableSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableSachMouseReleased(evt);
            }
        });
        tableSach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableSachKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tableSach);

        jLabelHovaten.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelHovaten.setText("Nguyễn Thị Ngân - 20165434");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btNhapFile)
                .addGap(18, 18, 18)
                .addComponent(btXuatFile)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btHienThi)
                        .addGap(18, 18, 18)
                        .addComponent(btThem)
                        .addGap(18, 18, 18)
                        .addComponent(btSua)
                        .addGap(10, 10, 10)
                        .addComponent(btXoa)
                        .addGap(10, 10, 10)
                        .addComponent(btTimKiem))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelHovaten)
                        .addGap(107, 107, 107))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelHovaten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNhapFile)
                    .addComponent(btXuatFile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTimKiem)
                    .addComponent(btXoa)
                    .addComponent(btSua)
                    .addComponent(btThem)
                    .addComponent(btHienThi)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        ConnectionDB connectionDB= new ConnectionDB();
        Connection cn= connectionDB.getConnection();
        String sql= "insert into quanlithuvien.sach values(?,?,?,?,?)";
         try {
            cn.setAutoCommit(false);
            PreparedStatement pst = cn.prepareStatement(sql);
            for (int i = 0; i < tableSach.getRowCount(); i++) {
                if (!isEmptyRow(i)) {
                    pst.setString(1, (String) tableSach.getValueAt(i, 0));
                    pst.setString(2, (String) tableSach.getValueAt(i, 1));
                    pst.setString(3, (String) tableSach.getValueAt(i, 2));
                    pst.setString(4, (String) tableSach.getValueAt(i, 3));
                    pst.setString(5, (String) tableSach.getValueAt(i, 4));
                    pst.addBatch();
                    pst.executeUpdate();
                    cn.commit();
                }

            }
            JOptionPane.showMessageDialog(null,"Bạn đã thêm thành công");
        } catch (SQLException ex) {
            Logger.getLogger(Quanlysach.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }//GEN-LAST:event_btThemActionPerformed

    private void btHienThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHienThiActionPerformed
        // TODO add your handling code here:
         ConnectionDB connectionDB = new ConnectionDB();
        Connection cn = connectionDB.getConnection();
        ((DefaultTableModel) tableSach.getModel()).setNumRows(0);
        String sql = "select *from quanlithuvien.sach";
        try {
            cn.setAutoCommit(false);
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ((DefaultTableModel) tableSach.getModel()).addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Quanlydocgia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btHienThiActionPerformed

    private void tableSachKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableSachKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER && tableSach.getSelectedRow() == tableSach.getRowCount() - 1) {
            ((DefaultTableModel) tableSach.getModel()).addRow(new Object[]{null});
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && tableSach.getSelectedColumn() == tableSach.getColumnCount() - 1) {
            tableSach.changeSelection(tableSach.getSelectedRow(), 0, false, false);
        }
    }//GEN-LAST:event_tableSachKeyPressed

    private void btNhapFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNhapFileActionPerformed
        // TODO add your handling code here:
        Vector colums = new Vector();
        String path = "";
        String dir = "";
        String fileName = "";
        JFileChooser fileChooser = new JFileChooser();
        int box = fileChooser.showOpenDialog(null);
        if (box == fileChooser.APPROVE_OPTION) {
            fileName = fileChooser.getSelectedFile().getName();
            dir = fileChooser.getCurrentDirectory().toString();
            path = dir + "\\" + fileName;
        } else {
            return;
        }
        ((DefaultTableModel) tableSach.getModel()).setNumRows(0);
        try {
            FileInputStream file = new FileInputStream(new File(path));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowiIt = sheet.iterator();
            while (rowiIt.hasNext()) {
                Row row = rowiIt.next();
                Iterator<Cell> cellIt = row.cellIterator();
                if (row.getRowNum() == 0) {
                    while (cellIt.hasNext()) {
                        Cell cell = cellIt.next();
                        colums.add(cell.getStringCellValue());
                        ((DefaultTableModel) tableSach.getModel()).setColumnIdentifiers(colums);
                    }
                } else {
                    Vector<String> rowData = new Vector<String>();
                    while (cellIt.hasNext()) {
                        Cell cell = cellIt.next();
                        if (cell.getCellType() == CellType.STRING) {
                            rowData.add(cell.getStringCellValue());
                        } else if (cell.getCellType() == CellType.NUMERIC) {
                            rowData.add(Double.toString(cell.getNumericCellValue()));
                        }
                    }
                    ((DefaultTableModel) tableSach.getModel()).addRow(rowData);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btNhapFileActionPerformed

    private void tableSachMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSachMouseReleased
        // TODO add your handling code here:
        tableSach.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int r = tableSach.rowAtPoint(e.getPoint());
                if (r >= 0 && r < tableSach.getRowCount()) {
                    tableSach.setRowSelectionAllowed(true);
                } else {
                    tableSach.clearSelection();
                }

                int[] rowindex = tableSach.getSelectedRows();
                for (int i = 0; i < rowindex.length; i++) {
                    int j = rowindex[i];
                    if (j < 0) {
                        return;
                    }
                }
                if (e.isPopupTrigger() && e.getComponent() instanceof JTable) {
                    JPopupMenu popup = popUp();
                    popup.show(e.getComponent(), e.getX(), e.getY());
                }

            }
            private JPopupMenu popUp() {
                JPopupMenu popup = new JPopupMenu();
        JMenuItem deleteTable = new JMenuItem("Xóa bảng");
        deleteTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                ((DefaultTableModel) tableSach.getModel()).setNumRows(0);
                ((DefaultTableModel) tableSach.getModel()).addRow(new Object[]{null});
            }
        });
        popup.add(deleteTable);
        return popup;
            }

        });
    }//GEN-LAST:event_tableSachMouseReleased

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:
         DefaultTableModel tableModel = (DefaultTableModel) tableSach.getModel();
        ConnectionDB connectionDB = new ConnectionDB();
        Connection con = connectionDB.getConnection();
        String sql = "update quanlithuvien.sach set masach = ?, tensach = ?, nhaXB = ?, tentg = ?, theloai = ?  where masach = ?";
        int rowSelected = tableSach.getSelectedRow();
        String temp = (String) tableModel.getValueAt(rowSelected, 0);
        try {
            con.setAutoCommit(false);
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(6, temp);
            pst.setString(1, (String) tableSach.getValueAt(rowSelected, 0));
            pst.setString(2, (String) tableSach.getValueAt(rowSelected, 1));
            pst.setString(3, (String) tableSach.getValueAt(rowSelected, 2));
            pst.setString(4, (String) tableSach.getValueAt(rowSelected, 3));
            pst.setString(5, (String) tableSach.getValueAt(rowSelected, 4));
            pst.addBatch();
            pst.executeUpdate();
            con.commit();
            JOptionPane.showMessageDialog(null, " Bạn đã sửa thành công");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Bạn có chắc chắn muốn xóa không");
        int[] rows = tableSach.getSelectedRows();
        Arrays.sort(rows);
        for (int i = 0; i < rows.length; i++) {
            int row = rows[i];
            ConnectionDB connectDB = new ConnectionDB();
            Connection connection = connectDB.getConnection();

            DefaultTableModel tableModel = (DefaultTableModel) tableSach.getModel();
            String sql = "DELETE FROM quanlithuvien.sach WHERE (masach = ?)";
            try {
                connection.setAutoCommit(false);
                PreparedStatement pst = connection.prepareStatement(sql);
                String manv = (String) tableModel.getValueAt(row, 0);
                pst.setString(1, manv);
                pst.executeUpdate();
                connection.commit();
            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Can not delele!\n" + ex.getMessage());
            }
            ((DefaultTableModel) tableSach.getModel()).removeRow(row);
            for (int j = i + 1; j < rows.length; j++) {
                rows[j] = rows[j] - 1;
            }
        }
        JOptionPane.showMessageDialog(null, "Bạn đã xóa thành công");
    }//GEN-LAST:event_btXoaActionPerformed

    private void btXuatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXuatFileActionPerformed
        // TODO add your handling code here:
         try {
            FileInputStream fis = new FileInputStream("I:\\quanlythuvien\\tbsach.docx");
            XWPFDocument xdoc = new XWPFDocument(OPCPackage.open(fis));
            Iterator bodyElementIterator = xdoc.getBodyElementsIterator();
            while (bodyElementIterator.hasNext()) {
                IBodyElement element = (IBodyElement) bodyElementIterator.next();

                if ("TABLE".equalsIgnoreCase(element.getElementType().name())) {
                    java.util.List<XWPFTable> tableList = element.getBody().getTables();
                    for (XWPFTable table : tableList) {
                        setDefaultTable(table);
                        for (int i = 1; i < table.getRows().size(); i++) {
                            for (int j = 0; j < table.getRow(i).getTableCells().size(); j++) {
                                removeParagraphs(table.getRow(i).getCell(j));
                                XWPFParagraph paragraph = table.getRow(i).getCell(j).addParagraph();
                                paragraph.createRun().setText(tableSach.getValueAt(i - 1, j).toString());
                            }
                        }
                        addRowData(table, table.getRows().size());
                    }
                }
            }
            OutputStream out = new FileOutputStream("I:\\quanlythuvien\\tbsach.docx");
            xdoc.write(out);
            out.close();

        } catch (IOException | InvalidFormatException ex) {
        }
        int dialogResult = JOptionPane.showConfirmDialog(null, "File đã tạo thành công!\nẤn yes để mở file?");
        if (dialogResult == JOptionPane.YES_OPTION) {
            if (Desktop.isDesktopSupported()) {
                try {
                    File myFile = new File("I:\\quanlythuvien\\tbsach.docx");
                    Desktop.getDesktop().open(myFile);
                } catch (IOException ex) {
                    // no application registered for PDFs
                }
            }
        } else {
        }
    }//GEN-LAST:event_btXuatFileActionPerformed

    private void btTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimKiemActionPerformed
        // TODO add your handling code here:
        Searching();
    }//GEN-LAST:event_btTimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHienThi;
    private javax.swing.JButton btNhapFile;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btTimKiem;
    private javax.swing.JButton btXoa;
    private javax.swing.JButton btXuatFile;
    private javax.swing.JLabel jLabelHovaten;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSach;
    // End of variables declaration//GEN-END:variables

    private boolean isEmptyRow(int i) {
      for (int j = 0; j < tableSach.getColumnCount(); j++) {
            String str = (String) tableSach.getValueAt(i, j);
            if (str == null) {
                return true;
            }
        }
        return false;  
    }

    private void setDefaultTable(XWPFTable table) {
         for (int i = 1; i < table.getRows().size(); i++) {
            table.removeRow(1);
        }
    }

    private void removeParagraphs(XWPFTableCell cell) {
         int count = cell.getParagraphs().size();
        for (int i = 0; i < count; i++) {
            cell.removeParagraph(i);
        }
    }

    private void addRowData(XWPFTable table, int size) {
       for (int i = size - 1; i < tableSach.getRowCount(); i++) {
            XWPFTableRow newRow = table.createRow();
            for (int j = 0; j < table.getRow(i).getTableCells().size(); j++) {
                newRow.getCell(j).setText(tableSach.getValueAt(i, j).toString());
            }

        }
        
    }
    private void Searching() {
        JFrame searchingBox = new JFrame("Tìm kiếm");
        searchingBox.setLocation(450, 400);
        searchingBox.setSize(600, 200);
        jComboBox1 = new javax.swing.JComboBox<>();
        searchBar = new javax.swing.JTextField();
        jLabel = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        searchingBox.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Tìm kiếm theo", "Mã sách", "Tên sách", "Nhà xuất bản", "Tên tác giả", " Thể loại"}));
        jComboBox1.addActionListener((ActionEvent evt) -> {
            JComboBox<String> combo = (JComboBox<String>) evt.getSource();
            String selected = (String) combo.getSelectedItem();
            if (selected != null) {
                switch (selected) {
                    case "Mã sách":
                        choose = 1;
                        break;
                    case "Tên sách":
                        choose = 2;
                        break;
                    case "Nhà xuất bản":
                        choose = 3;
                        break;
                    case "Tên tác giả":
                        choose = 4;
                        break;
                    case "Thể loại":
                        choose = 5;
                        break;
                }
            }
        });
        searchBar.setToolTipText("Search");

        jLabel.setFont(new java.awt.Font("Dialog", 1, 14));
        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel.setText("Tìm kiếm");
        jLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        okButton.setText("OK");
        okButton.addActionListener((ActionEvent e) -> {
            process();
        });

        searchBar.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    process();
                }
            }
        });
        javax.swing.GroupLayout layoutSearchingBox = new javax.swing.GroupLayout(searchingBox.getContentPane());
        searchingBox.getContentPane().setLayout(layoutSearchingBox);
        layoutSearchingBox.setHorizontalGroup(
                layoutSearchingBox.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layoutSearchingBox.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layoutSearchingBox.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(40, Short.MAX_VALUE))
        );
        layoutSearchingBox.setVerticalGroup(
                layoutSearchingBox.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layoutSearchingBox.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layoutSearchingBox.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(okButton))
                        .addContainerGap(70, Short.MAX_VALUE))
        );
        searchingBox.setVisible(true);
}

    private void process() {
        if (choose == 0) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn thuộc tính tìm kiếm!");
            return;
        } else if (searchBar.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Bạn hãy nhập vào ô tìm kiếm!");
            return;
        }
        ((DefaultTableModel) tableSach.getModel()).setNumRows(0);
        ConnectionDB connectDB = new ConnectionDB();
        Connection connection = connectDB.getConnection();
        String text = searchBar.getText().trim().replaceAll("\\s+", " ");
        DefaultTableModel tableModel = (DefaultTableModel) tableSach.getModel();
        switch (choose) {
            case 1:
                String sql = "SELECT * FROM quanlithuvien.sach WHERE (masach = '" + text + "')";
                System.out.println(sql);
                try {
                    Statement st = connection.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    while (rs.next()) {
                        tableModel.addRow(new Object[]{rs.getString(1), rs.getString(2),
                            rs.getString(3), rs.getString(4), rs.getString(5)});

                    }
                    tableSach.setModel(tableModel);
                    warning(tableSach.getRowCount());
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Thất bại!\n" + "Lỗi: " + ex.getMessage());
                }
                break;
            case 2:
                String sql2 = "SELECT * FROM quanlithuvien.sach WHERE (tensach = '" + text + "')";
                System.out.println(sql2);
                try {
                    Statement st = connection.createStatement();
                    ResultSet rs = st.executeQuery(sql2);
                    while (rs.next()) {
                        tableModel.addRow(new Object[]{rs.getString(1), rs.getString(2),
                            rs.getString(3), rs.getString(4), rs.getString(5)});
                    }
                    tableSach.setModel(tableModel);
                    warning(tableSach.getRowCount());
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Thất bại!\n" + "Lỗi: " + ex.getMessage());
                }
                break;
            case 3:
                String sql3 = "SELECT * FROM quanlithuvien.sach WHERE (nhaXB = '" + text + "')";
                System.out.println(sql3);
                try {
                    Statement st = connection.createStatement();
                    ResultSet rs = st.executeQuery(sql3);
                    while (rs.next()) {
                        tableModel.addRow(new Object[]{rs.getString(1), rs.getString(2),
                            rs.getString(3), rs.getString(4), rs.getString(5)});
                    }
                    tableSach.setModel(tableModel);
                    warning(tableSach.getRowCount());
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Thất bại!\n" + "Lỗi: " + ex.getMessage());
                }
                break;
            case 4:
                String sql4 = "SELECT * FROM quanlithuvien.sach WHERE (tentg = '" + text + "')";
                System.out.println(sql4);
                try {
                    Statement st = connection.createStatement();
                    ResultSet rs = st.executeQuery(sql4);
                    while (rs.next()) {
                        tableModel.addRow(new Object[]{rs.getString(1), rs.getString(2),
                            rs.getString(3), rs.getString(4), rs.getString(5)});
                    }
                    tableSach.setModel(tableModel);
                    warning(tableSach.getRowCount());
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Thất bại!\n" + "Lỗi: " + ex.getMessage());
                }
                break;
            case 5:
                String sql5 = "SELECT * FROM quanlithuvien.sach WHERE (theloai = '" + text + "')";
                System.out.println(sql5);
                try {
                    Statement st = connection.createStatement();
                    ResultSet rs = st.executeQuery(sql5);
                    while (rs.next()) {
                        tableModel.addRow(new Object[]{rs.getString(1), rs.getString(2),
                            rs.getString(3), rs.getString(4), rs.getString(5)});
                    }
                    tableSach.setModel(tableModel);
                    warning(tableSach.getRowCount());
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Thất bại!\n" + "Lỗi: " + ex.getMessage());
                }
                break;

        }
    }

    private void warning(int rowCount) {
         if (rowCount == 0) {
            JOptionPane.showMessageDialog(null, "Không có kết quả phù hợp!");
        }
    }
}
