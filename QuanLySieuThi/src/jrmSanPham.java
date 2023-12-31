
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author admin
 */
public class jrmSanPham extends javax.swing.JFrame {

    /**
     * Creates new form jrmSanPham
     */
    public jrmSanPham() {
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

        javax.swing.JPanel jbSanPham = new javax.swing.JPanel();
        jbDanhSachSanPham = new javax.swing.JLabel();
        javax.swing.JPanel jpSanPham = new javax.swing.JPanel();
        javax.swing.JLabel jLabel = new javax.swing.JLabel();
        tfMaSanPham = new javax.swing.JTextField();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        tfGiaNhap = new javax.swing.JTextField();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        tfTenSP = new javax.swing.JTextField();
        javax.swing.JLabel tfTenNXS = new javax.swing.JLabel();
        tfTenNSX = new javax.swing.JTextField();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        tfGiaBan = new javax.swing.JTextField();
        DonViTinhjcb1 = new javax.swing.JComboBox<>();
        SoLuongjs = new javax.swing.JSpinner();
        javax.swing.JPanel jpTimKiem = new javax.swing.JPanel();
        tfTimKiem = new javax.swing.JTextField();
        javax.swing.JButton btnThem = new javax.swing.JButton();
        javax.swing.JButton btnThoat = new javax.swing.JButton();
        javax.swing.JButton btnXoa = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        tableSanPham = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbSanPham.setBackground(new java.awt.Color(255, 204, 255));

        jbDanhSachSanPham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbDanhSachSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbDanhSachSanPham.setText("Danh Sách Sản Phẩm");
        jbDanhSachSanPham.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jpSanPham.setBackground(new java.awt.Color(204, 255, 255));
        jpSanPham.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bar-code.png"))); // NOI18N
        jLabel.setText("Mã Sản Phẩm");

        tfMaSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMaSanPhamActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/money.png"))); // NOI18N
        jLabel3.setText("Đơn Vị Tính");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/price.png"))); // NOI18N
        jLabel4.setText("Giá Nhập");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/overflow.png"))); // NOI18N
        jLabel5.setText("Số Lượng");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/box.png"))); // NOI18N
        jLabel6.setText("Tên SP");

        tfTenSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTenSPActionPerformed(evt);
            }
        });

        tfTenNXS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NSX.png"))); // NOI18N
        tfTenNXS.setText("Tên NSX");

        tfTenNSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTenNSXActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giá bán.png"))); // NOI18N
        jLabel8.setText("Giá Bán");

        DonViTinhjcb1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        DonViTinhjcb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Nghìn Đồng" }));

        SoLuongjs.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        javax.swing.GroupLayout jpSanPhamLayout = new javax.swing.GroupLayout(jpSanPham);
        jpSanPham.setLayout(jpSanPhamLayout);
        jpSanPhamLayout.setHorizontalGroup(
            jpSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpSanPhamLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(SoLuongjs, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSanPhamLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpSanPhamLayout.createSequentialGroup()
                        .addGroup(jpSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpSanPhamLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tfMaSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                            .addComponent(DonViTinhjcb1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(59, 59, 59)
                .addGroup(jpSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfTenNXS, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jpSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfTenSP)
                    .addComponent(tfTenNSX)
                    .addComponent(tfGiaBan, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        jpSanPhamLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfGiaBan, tfGiaNhap, tfMaSanPham, tfTenNSX, tfTenSP});

        jpSanPhamLayout.setVerticalGroup(
            jpSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(tfTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfTenNXS)
                    .addComponent(tfTenNSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DonViTinhjcb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(tfGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jpSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(SoLuongjs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jpSanPhamLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tfGiaBan, tfGiaNhap, tfMaSanPham, tfTenNSX, tfTenSP});

        jpTimKiem.setBackground(new java.awt.Color(204, 255, 255));
        jpTimKiem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        tfTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTimKiemActionPerformed(evt);
            }
        });
        tfTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfTimKiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jpTimKiemLayout = new javax.swing.GroupLayout(jpTimKiem);
        jpTimKiem.setLayout(jpTimKiemLayout);
        jpTimKiemLayout.setHorizontalGroup(
            jpTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jpTimKiemLayout.setVerticalGroup(
            jpTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimKiemLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(tfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        tableSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản Phẩm", "Đơn Vị Tính", "Giá Nhập", "Số Lượng", "Tên Sản Phẩm", "Tên NSX", "Giá Bán"
            }
        ));
        jScrollPane1.setViewportView(tableSanPham);

        javax.swing.GroupLayout jbSanPhamLayout = new javax.swing.GroupLayout(jbSanPham);
        jbSanPham.setLayout(jbSanPhamLayout);
        jbSanPhamLayout.setHorizontalGroup(
            jbSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbSanPhamLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jbSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jbSanPhamLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnThoat))
                    .addGroup(jbSanPhamLayout.createSequentialGroup()
                        .addComponent(jpSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jbSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jbSanPhamLayout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jpTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 42, Short.MAX_VALUE))
            .addComponent(jbDanhSachSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jbSanPhamLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnThem, btnThoat});

        jbSanPhamLayout.setVerticalGroup(
            jbSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbSanPhamLayout.createSequentialGroup()
                .addComponent(jbDanhSachSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jbSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jbSanPhamLayout.createSequentialGroup()
                        .addComponent(jpSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jbSanPhamLayout.createSequentialGroup()
                        .addComponent(jpTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jbSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnThoat)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbSanPhamLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnThem, btnThoat});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(707, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int row  =tableSanPham.getSelectedRow();

        if( row < 0){
            JOptionPane.showMessageDialog(this,
                "Không có hàng nào được chọn! Vui lòng chọn một hàng",
                "Chọn hàng!",
                JOptionPane.ERROR_MESSAGE);

        } else {
            DefaultTableModel model = (DefaultTableModel) tableSanPham.getModel();
            model.removeRow(row);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        if (JOptionPane.YES_OPTION==JOptionPane.showConfirmDialog( this
            ,"Bạn có muốn thoát không ?","Hãy lựa chọn!",
            JOptionPane.YES_NO_OPTION))
    System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String maSanPham = tfMaSanPham.getText();
        String giaNhap = tfGiaNhap.getText();      
        String tenSP = tfTenSP.getText();
        String tenNSX = tfTenNSX.getText();
        String giaBan = tfGiaBan.getText();

        if(maSanPham.isEmpty() ||  giaNhap.isEmpty() || tenSP.isEmpty() || tenNSX.isEmpty() || giaBan.isEmpty()){
            JOptionPane.showMessageDialog(this,
                "Vui lòng nhập yêu cầu! ",
                "Thử lại",
                JOptionPane.ERROR_MESSAGE);

        } else {
            DefaultTableModel model = (DefaultTableModel) tableSanPham.getModel();
            model.addRow( new Object[] {maSanPham,giaNhap,tenSP, tenNSX, giaBan});

            tfMaSanPham.setText("");
            tfGiaNhap.setText("");
            tfTenSP.setText("");
            tfTenNSX.setText("");
            tfGiaBan.setText("");
        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void tfTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTimKiemActionPerformed

    private void tfTenSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTenSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTenSPActionPerformed

    private void tfMaSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMaSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMaSanPhamActionPerformed

    private void tfTenNSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTenNSXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTenNSXActionPerformed

    private void tfTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTimKiemKeyReleased
        DefaultTableModel ob = (DefaultTableModel) tableSanPham.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        tableSanPham.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(tfTimKiem.getText()));
    }//GEN-LAST:event_tfTimKiemKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jrmSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jrmSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jrmSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jrmSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jrmSanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DonViTinhjcb1;
    private javax.swing.JSpinner SoLuongjs;
    private javax.swing.JLabel jbDanhSachSanPham;
    private javax.swing.JTable tableSanPham;
    private javax.swing.JTextField tfGiaBan;
    private javax.swing.JTextField tfGiaNhap;
    private javax.swing.JTextField tfMaSanPham;
    private javax.swing.JTextField tfTenNSX;
    private javax.swing.JTextField tfTenSP;
    private javax.swing.JTextField tfTimKiem;
    // End of variables declaration//GEN-END:variables
}
