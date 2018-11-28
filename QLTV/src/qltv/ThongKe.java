/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import javafx.scene.control.ComboBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
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
public class ThongKe extends javax.swing.JPanel {

    /**
     * Creates new form ThongKe
     */
    public ThongKe() {
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

        jComboBoxBook = new javax.swing.JComboBox<>();
        jComboBoxEmployee = new javax.swing.JComboBox<>();
        jComboBoxDocGia = new javax.swing.JComboBox<>();
        jComboBoxMuon = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        BangThongKe = new javax.swing.JTable();
        jButtonXuat = new javax.swing.JButton();
        jLabelSach = new javax.swing.JLabel();
        jLabelNhanVien = new javax.swing.JLabel();
        JLabeDocGia = new javax.swing.JLabel();
        jLabelMuonTra = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        jComboBoxBook.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thống kê theo", "Mã sách", "Tên sách", "Nhà xuất bản", "Tên tác giả","Thể loại" }));
        jComboBoxBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBookActionPerformed(evt);
            }
        });

        jComboBoxEmployee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thống kê theo", "Mã nhân viên", "Tên nhân viên", "Số điện thoại", "Giới tính" }));
        jComboBoxEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEmployeeActionPerformed(evt);
            }
        });

        jComboBoxDocGia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thống kê theo", "Mã độc giả", "Tên độc giả", "Địa chỉ", "Số thẻ", "Giới tính" }));
        jComboBoxDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDocGiaActionPerformed(evt);
            }
        });

        jComboBoxMuon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thống kê theo", "Ngày mượn","Ngày hẹn trả ","Ngày trả", "Số lượng mượn", "Tiền đặt cọc", "Số tiền phạt" }));
        jComboBoxMuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMuonActionPerformed(evt);
            }
        });

        BangThongKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        BangThongKe.setRowHeight(25);
        jScrollPane1.setViewportView(BangThongKe);

        jButtonXuat.setText("Xuất");
        jButtonXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXuatActionPerformed(evt);
            }
        });

        jLabelSach.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSach.setText("Thống kê sách");

        jLabelNhanVien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNhanVien.setText("Thống kê nhân viên");

        JLabeDocGia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLabeDocGia.setText("Thống kê độc giả");

        jLabelMuonTra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelMuonTra.setText("Thống kê mượn trả");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxBook, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxEmployee, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabeDocGia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxMuon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMuonTra, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(77, 77, 77))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)))
                .addComponent(jButtonXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNhanVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabeDocGia, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(jLabelMuonTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxBook, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBoxEmployee, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jButtonXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBookActionPerformed
        // TODO add your handling code here:
        ConnectionDB connectionDB = new ConnectionDB();
        Connection cn = connectionDB.getConnection();
        JComboBox<String> combo = (JComboBox<String>) evt.getSource();
        String selected = (String) combo.getSelectedItem();
        if (selected != null) {
            switch (selected) {
                case "Mã sách":
                    BangThongKe.setModel(new DefaultTableModel(new Object[]{"Mã sách", "Tên sách"}, 0));
                    String sql = " select masach, tensach from quanlithuvien.sach ";
                    try {
                        cn.setAutoCommit(false);
                        PreparedStatement pst = cn.prepareStatement(sql);
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            ((DefaultTableModel) BangThongKe.getModel()).addRow(new Object[]{rs.getString(1), rs.getString(2)});
                        }

                    } catch (Exception e) {
                    }
                    break;
                case "Tên sách":
                    BangThongKe.setModel(new DefaultTableModel(new Object[]{"Tên sách", "Số lượng"}, 0));
                    String sql1 = " select tensach, count(*) from quanlithuvien.sach group by tensach";
                    try {
                        cn.setAutoCommit(false);
                        PreparedStatement pst = cn.prepareStatement(sql1);
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            ((DefaultTableModel) BangThongKe.getModel()).addRow(new Object[]{rs.getString(1), rs.getString(2)});
                        }

                    } catch (Exception e) {
                    }

                    break;
                case "Nhà xuất bản":
                    BangThongKe.setModel(new DefaultTableModel(new Object[]{"Nhà xuất bản", "Số lượng"}, 0));
                    String sql2 = " select nhaXB, count(*) from quanlithuvien.sach group by nhaXB";
                    try {
                        cn.setAutoCommit(false);
                        PreparedStatement pst = cn.prepareStatement(sql2);
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            ((DefaultTableModel) BangThongKe.getModel()).addRow(new Object[]{rs.getString(1), rs.getString(2)});
                        }

                    } catch (Exception e) {
                    }
                    break;
                case "Tên tác giả":
                    BangThongKe.setModel(new DefaultTableModel(new Object[]{"Tên tác giả", "Số lượng"}, 0));
                    String sql3 = " select tentg, count(*) from quanlithuvien.sach group by tentg";
                    try {
                        cn.setAutoCommit(false);
                        PreparedStatement pst = cn.prepareStatement(sql3);
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            ((DefaultTableModel) BangThongKe.getModel()).addRow(new Object[]{rs.getString(1), rs.getString(2)});
                        }

                    } catch (Exception e) {
                    }
                    break;
                case "Thể loại":
                    BangThongKe.setModel(new DefaultTableModel(new Object[]{"Thể loại", "Số lượng"}, 0));
                    String sql4 = " select theloai, count(*) from quanlithuvien.sach group by theloai";
                    try {
                        cn.setAutoCommit(false);
                        PreparedStatement pst = cn.prepareStatement(sql4);
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            ((DefaultTableModel) BangThongKe.getModel()).addRow(new Object[]{rs.getString(1), rs.getString(2)});
                        }

                    } catch (Exception e) {
                    }
                    break;

            }
        };
    }//GEN-LAST:event_jComboBoxBookActionPerformed

    private void jComboBoxEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEmployeeActionPerformed
        // TODO add your handling code here:
        ConnectionDB connectionDB = new ConnectionDB();
        Connection cn = connectionDB.getConnection();
        JComboBox<String> combo = (JComboBox<String>) evt.getSource();
        String selected = (String) combo.getSelectedItem();
        if (selected != null) {
            switch (selected) {
                case "Mã nhân viên":
                    BangThongKe.setModel(new DefaultTableModel(new Object[]{"Mã nhân viên", "Tên nhân viên", "Số lượng"}, 0));
                    String sql = " select manv,tennv, count(*) from quanlithuvien.nhanvien group by manv";
                    try {
                        cn.setAutoCommit(false);
                        PreparedStatement pst = cn.prepareStatement(sql);
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            ((DefaultTableModel) BangThongKe.getModel()).addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3)});
                        }

                    } catch (Exception e) {
                    }
                    break;
                case "Tên nhân viên":
                    BangThongKe.setModel(new DefaultTableModel(new Object[]{"Tên nhân viên", "Số lượng"}, 0));
                    String sql1 = " select tennv, count(*) from quanlithuvien.nhanvien group by tennv";
                    try {
                        cn.setAutoCommit(false);
                        PreparedStatement pst = cn.prepareStatement(sql1);
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            ((DefaultTableModel) BangThongKe.getModel()).addRow(new Object[]{rs.getString(1), rs.getString(2)});
                        }

                    } catch (Exception e) {
                    }

                    break;
                case "Số điện thoại":
                    BangThongKe.setModel(new DefaultTableModel(new Object[]{"Số điện thoại", "Số lượng"}, 0));
                    String sql2 = " select sodt, count(*) from quanlithuvien.nhanvien group by sodt";
                    try {
                        cn.setAutoCommit(false);
                        PreparedStatement pst = cn.prepareStatement(sql2);
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            ((DefaultTableModel) BangThongKe.getModel()).addRow(new Object[]{rs.getString(1), rs.getString(2)});
                        }

                    } catch (Exception e) {
                    }
                    break;
                case "Giới tính":
                    BangThongKe.setModel(new DefaultTableModel(new Object[]{"Giới tính", "Số lượng"}, 0));
                    String sql3 = " select gioitinh, count(*) from quanlithuvien.nhanvien group by gioitinh";
                    try {
                        cn.setAutoCommit(false);
                        PreparedStatement pst = cn.prepareStatement(sql3);
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            ((DefaultTableModel) BangThongKe.getModel()).addRow(new Object[]{rs.getString(1), rs.getString(2)});
                        }

                    } catch (Exception e) {
                    }
                    break;

            }
        };

    }//GEN-LAST:event_jComboBoxEmployeeActionPerformed

    private void jComboBoxDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDocGiaActionPerformed
        // TODO add your handling code here:
        ConnectionDB connectionDB = new ConnectionDB();
        Connection cn = connectionDB.getConnection();
        JComboBox<String> combo = (JComboBox<String>) evt.getSource();
        String selected = (String) combo.getSelectedItem();
        if (selected != null) {
            switch (selected) {
                case "Mã độc giả":
                    BangThongKe.setModel(new DefaultTableModel(new Object[]{"Mã độc giả", "Tên độc giả"}, 0));
                    String sql = " select madg, tengdg from quanlithuvien.docgia ";
                    try {
                        cn.setAutoCommit(false);
                        PreparedStatement pst = cn.prepareStatement(sql);
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            ((DefaultTableModel) BangThongKe.getModel()).addRow(new Object[]{rs.getString(1), rs.getString(2)});
                        }

                    } catch (Exception e) {
                    }
                    break;
                case "Tên độc giả":
                    BangThongKe.setModel(new DefaultTableModel(new Object[]{"Tên độc giả", "Số lượng"}, 0));
                    String sql1 = " select tendg, count(*) from quanlithuvien.docgia group by tendg";
                    try {
                        cn.setAutoCommit(false);
                        PreparedStatement pst = cn.prepareStatement(sql1);
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            ((DefaultTableModel) BangThongKe.getModel()).addRow(new Object[]{rs.getString(1), rs.getString(2)});
                        }

                    } catch (Exception e) {
                    }

                    break;
                case "Địa chỉ":
                    BangThongKe.setModel(new DefaultTableModel(new Object[]{"Địa chỉ", "Số lượng"}, 0));
                    String sql2 = " select diachi, count(*) from quanlithuvien.docgia group by diachi";
                    try {
                        cn.setAutoCommit(false);
                        PreparedStatement pst = cn.prepareStatement(sql2);
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            ((DefaultTableModel) BangThongKe.getModel()).addRow(new Object[]{rs.getString(1), rs.getString(2)});
                        }

                    } catch (Exception e) {
                    }
                    break;
                case "Số thẻ":
                    BangThongKe.setModel(new DefaultTableModel(new Object[]{"Số thẻ", "Số lượng"}, 0));
                    String sql3 = " select sothe, count(*) from quanlithuvien.docgia group by sothe";
                    try {
                        cn.setAutoCommit(false);
                        PreparedStatement pst = cn.prepareStatement(sql3);
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            ((DefaultTableModel) BangThongKe.getModel()).addRow(new Object[]{rs.getString(1), rs.getString(2)});
                        }

                    } catch (Exception e) {
                    }
                    break;
                case "Giới tính":
                    BangThongKe.setModel(new DefaultTableModel(new Object[]{"Giới tính", "Số lượng"}, 0));
                    String sql4 = " select gioitinh, count(*) from quanlithuvien.docgia group by gioitinh";
                    try {
                        cn.setAutoCommit(false);
                        PreparedStatement pst = cn.prepareStatement(sql4);
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            ((DefaultTableModel) BangThongKe.getModel()).addRow(new Object[]{rs.getString(1), rs.getString(2)});
                        }

                    } catch (Exception e) {
                    }
                    break;

            }
        };
    }//GEN-LAST:event_jComboBoxDocGiaActionPerformed

    private void jComboBoxMuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMuonActionPerformed
        // TODO add your handling code here:
        ConnectionDB connectionDB = new ConnectionDB();
        Connection cn = connectionDB.getConnection();
        JComboBox<String> combo = (JComboBox<String>) evt.getSource();
        String selected = (String) combo.getSelectedItem();
        if (selected != null) {
            switch (selected) {
                case "Ngày mượn":
                    BangThongKe.setModel(new DefaultTableModel(new Object[]{"Ngày mượn", "Tên độc giả", "Số lượng mượn"}, 0));
                    String sql = " select  ngaymuon, tendg, soluongmuon from quanlithuvien.muontra, quanlithuvien.docgia where muontra.madg= docgia.madg ";
                    try {
                        cn.setAutoCommit(false);
                        PreparedStatement pst = cn.prepareStatement(sql);
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            ((DefaultTableModel) BangThongKe.getModel()).addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3)});
                        }

                    } catch (Exception e) {
                    }
                    break;
                case "Ngày hẹn trả":
                    BangThongKe.setModel(new DefaultTableModel(new Object[]{"Ngày hẹn trả", "Tên độc giả", " Sô lượng mượn"}, 0));
                    String sql1 = "select  ngayhentra, tendg, soluongmuon from quanlithuvien.muontra, quanlithuvien.docgia where muontra.madg= docgia.madg";
                    try {
                        cn.setAutoCommit(false);
                        PreparedStatement pst = cn.prepareStatement(sql1);
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            ((DefaultTableModel) BangThongKe.getModel()).addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3)});
                        }

                    } catch (Exception e) {
                    }

                    break;
                case "Ngày trả":
                    BangThongKe.setModel(new DefaultTableModel(new Object[]{"Ngày trả", "Tên độc giả"}, 0));
                    String sql2 = " select  ngaytra, tendg from quanlithuvien.chitietmuontra, quanlithuvien.docgia where muontra.madg= docgia.madg";
                    try {
                        cn.setAutoCommit(false);
                        PreparedStatement pst = cn.prepareStatement(sql2);
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            ((DefaultTableModel) BangThongKe.getModel()).addRow(new Object[]{rs.getString(1), rs.getString(2)});
                        }

                    } catch (Exception e) {
                    }
                    break;
                case "Số lượng mượn":
                    BangThongKe.setModel(new DefaultTableModel(new Object[]{"Tên độc giả", " Số lượng mượn"}, 0));
                    String sql3 = " select tendg, soluongmuon from quanlithuvien.muontra, quanlithuvien.docgia where muontra.madg= docgia.madg ";
                    try {
                        cn.setAutoCommit(false);
                        PreparedStatement pst = cn.prepareStatement(sql3);
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            ((DefaultTableModel) BangThongKe.getModel()).addRow(new Object[]{rs.getString(1), rs.getString(2)});
                        }

                    } catch (Exception e) {
                    }
                    break;
                case "Tiền đặt cọc":
                    BangThongKe.setModel(new DefaultTableModel(new Object[]{"Tiền đặt cọc", "Tên độc giả"}, 0));
                    String sql4 = " select tiendatcoc, tendg from quanlithuvien.muontra, quanlythuvien.docgia where docgia.madg= muontra.madg";
                    try {
                        cn.setAutoCommit(false);
                        PreparedStatement pst = cn.prepareStatement(sql4);
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            ((DefaultTableModel) BangThongKe.getModel()).addRow(new Object[]{rs.getString(1), rs.getString(2)});
                        }

                    } catch (Exception e) {
                    }
                    break;
                case "Số tiền phạt":
                    BangThongKe.setModel(new DefaultTableModel(new Object[]{"Số tiền phạt", "Tên độc giả", "Mã độc giả"}, 0));
                    String sql5 = " select sotienphat, tendg, madg from quanlithuvien.docgia, quanlythuvien.chitietmuontra where docgia.madg= chitietmuontra.madg";
                    try {
                        cn.setAutoCommit(false);
                        PreparedStatement pst = cn.prepareStatement(sql5);
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            ((DefaultTableModel) BangThongKe.getModel()).addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3)});
                        }

                    } catch (Exception e) {
                    }
                    break;

            }
        };
    }//GEN-LAST:event_jComboBoxMuonActionPerformed

    private void jButtonXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXuatActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("I:\\quanlythuvien\\thongkesach.docx");
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
                                paragraph.createRun().setText(BangThongKe.getValueAt(i, j).toString());
                            }

                        }
                        addRowData(table, table.getRows().size());
                    }
                }
            }
            OutputStream out = new FileOutputStream("I:\\quanlythuvien\\thongkesach"
                    + ".docx");
            xdoc.write(out);
            out.close();

        } catch (IOException | InvalidFormatException ex) {
        }
        int dialogResult = JOptionPane.showConfirmDialog(null, "Xuất file thành công!\nẤn yes để mở file?");
        if (dialogResult == JOptionPane.YES_OPTION) {
            if (Desktop.isDesktopSupported()) {
                try {
                    File myFile = new File("I:\\quanlythuvien\\thongkesach.docx");
                    Desktop.getDesktop().open(myFile);
                } catch (IOException ex) {
                    // no application registered for PDFs
                }
            }
        } else {
        }
    }//GEN-LAST:event_jButtonXuatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BangThongKe;
    private javax.swing.JLabel JLabeDocGia;
    private javax.swing.JButton jButtonXuat;
    private javax.swing.JComboBox<String> jComboBoxBook;
    private javax.swing.JComboBox<String> jComboBoxDocGia;
    private javax.swing.JComboBox<String> jComboBoxEmployee;
    private javax.swing.JComboBox<String> jComboBoxMuon;
    private javax.swing.JLabel jLabelMuonTra;
    private javax.swing.JLabel jLabelNhanVien;
    private javax.swing.JLabel jLabelSach;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

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
         for (int i = size - 1; i < BangThongKe.getRowCount(); i++) {
            XWPFTableRow newRow = table.createRow();
            for (int j = 0; j < table.getRow(i).getTableCells().size(); j++) {
                newRow.getCell(j).setText(BangThongKe.getValueAt(i, j).toString());
            }

        }
    }
}
