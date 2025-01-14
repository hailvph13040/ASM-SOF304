package view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sunnycss.MODEL.LoaiSP;
import sunnycss.MODEL.SanPham;
import sunnycssw.DAO.BanHangDAO;

/**
 *
 * @author hai95
 */
public class pnlBanHang extends javax.swing.JPanel {

    /**
     * Creates new form BanHang
     */
    BanHangDAO bhmodel = new BanHangDAO();
    public static pnlBanHang pnBanHang;
    List<LoaiSP> lstLSP;
    List<SanPham> listSP;
    public int soLuong;
    DefaultTableModel modelsp;
    DefaultTableModel modelmua;
    int index, indexSPM = -1;

    public pnlBanHang() {
        initComponents();
        setSize(840, 450);
        pnBanHang = this;
        loadLSP();
        createHD();
        modelsp = (DefaultTableModel) tblSP.getModel();
        modelmua = (DefaultTableModel) tblSPMua.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pnLSP = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSP = new javax.swing.JTable();
        pnHoaDon = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblMaHoaDon = new javax.swing.JLabel();
        lblNhanVien = new javax.swing.JLabel();
        lblNgayLapHD = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSPMua = new javax.swing.JTable();
        btnTraHang = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtThanhTien = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtKhachtra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTienThua = new javax.swing.JTextField();
        btnThanhtoan = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(840, 450));
        setPreferredSize(new java.awt.Dimension(840, 450));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Loại Sản Phẩm");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel1);
        jLabel1.setBounds(10, 11, 290, 25);

        pnLSP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(pnLSP);
        pnLSP.setBounds(10, 47, 290, 120);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sản Phẩm");
        add(jLabel2);
        jLabel2.setBounds(10, 178, 290, 25);

        tblSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID SP", "Tên Sản Phẩm", "Đơn Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSP);
        if (tblSP.getColumnModel().getColumnCount() > 0) {
            tblSP.getColumnModel().getColumn(0).setResizable(false);
            tblSP.getColumnModel().getColumn(0).setPreferredWidth(60);
            tblSP.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblSP.getColumnModel().getColumn(2).setPreferredWidth(70);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 209, 290, 222);

        pnHoaDon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnHoaDon.setPreferredSize(new java.awt.Dimension(440, 130));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Hóa đơn");

        lblMaHoaDon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMaHoaDon.setText("Mã Hóa Đơn : HD01");

        lblNhanVien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNhanVien.setText("Nhân viên lập: Lê Văn Hai");

        lblNgayLapHD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNgayLapHD.setText("Ngày lập: 30/05/2021");

        tblSPMua.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID SP", "Tên Sản Phẩm", "Số Lượng", "Đơn Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSPMua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSPMuaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSPMua);
        if (tblSPMua.getColumnModel().getColumnCount() > 0) {
            tblSPMua.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblSPMua.getColumnModel().getColumn(1).setPreferredWidth(140);
            tblSPMua.getColumnModel().getColumn(2).setPreferredWidth(70);
            tblSPMua.getColumnModel().getColumn(3).setPreferredWidth(70);
        }

        btnTraHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTraHang.setText("Trả Hàng");
        btnTraHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnHoaDonLayout = new javax.swing.GroupLayout(pnHoaDon);
        pnHoaDon.setLayout(pnHoaDonLayout);
        pnHoaDonLayout.setHorizontalGroup(
            pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHoaDonLayout.createSequentialGroup()
                .addGroup(pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnHoaDonLayout.createSequentialGroup()
                        .addGroup(pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnHoaDonLayout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(jLabel3))
                            .addGroup(pnHoaDonLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblMaHoaDon))
                            .addGroup(pnHoaDonLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblNhanVien))
                            .addGroup(pnHoaDonLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblNgayLapHD)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnHoaDonLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTraHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnHoaDonLayout.setVerticalGroup(
            pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMaHoaDon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNhanVien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNgayLapHD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTraHang)
                .addGap(18, 18, 18))
        );

        add(pnHoaDon);
        pnHoaDon.setBounds(310, 11, 318, 420);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Thành tiền");
        add(jLabel7);
        jLabel7.setBounds(700, 80, 80, 17);

        txtThanhTien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtThanhTien.setEnabled(false);
        add(txtThanhTien);
        txtThanhTien.setBounds(634, 112, 184, 37);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Khách đưa");
        add(jLabel8);
        jLabel8.setBounds(701, 167, 70, 17);

        txtKhachtra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtKhachtra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKhachtraKeyReleased(evt);
            }
        });
        add(txtKhachtra);
        txtKhachtra.setBounds(634, 195, 184, 23);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Tiền thừa");
        add(jLabel9);
        jLabel9.setBounds(700, 230, 70, 17);

        txtTienThua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTienThua.setEnabled(false);
        add(txtTienThua);
        txtTienThua.setBounds(634, 257, 184, 23);

        btnThanhtoan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThanhtoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dollar.png"))); // NOI18N
        btnThanhtoan.setText("Thanh toán");
        btnThanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhtoanActionPerformed(evt);
            }
        });
        add(btnThanhtoan);
        btnThanhtoan.setBounds(646, 314, 161, 42);
    }// </editor-fold>//GEN-END:initComponents

    private void tblSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPMouseClicked
        // TODO add your handling code here:
        index = tblSP.getSelectedRow();
        addSP();
    }//GEN-LAST:event_tblSPMouseClicked

    private void tblSPMuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPMuaMouseClicked
        // TODO add your handling code here:
        indexSPM = tblSPMua.getSelectedRow();
    }//GEN-LAST:event_tblSPMuaMouseClicked

    private void txtKhachtraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKhachtraKeyReleased
        // TODO add your handling code here:
        tinhTien();
    }//GEN-LAST:event_txtKhachtraKeyReleased

    private void btnTraHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraHangActionPerformed
        // TODO add your handling code here:

        traHang();
    }//GEN-LAST:event_btnTraHangActionPerformed

    private void btnThanhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhtoanActionPerformed
        // TODO add your handling code here:
        thanhToan();
    }//GEN-LAST:event_btnThanhtoanActionPerformed
    public void loadLSP() {
        try {

            lstLSP = bhmodel.loadListLSP();
            pnLSP.removeAll();
            JButton[] btnLoai = new JButton[lstLSP.size()];
            for (int i = 0; i < lstLSP.size(); i++) {
                btnLoai[i] = new JButton();
                btnLoai[i].setName(lstLSP.get(i).getIdLoai() + "");
                btnLoai[i].setText(lstLSP.get(i).getTenLoai());
                btnLoai[i].setFont(new java.awt.Font("Tahoma", 0, 14));
                btnLoai[i].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent event) {
                        listSP = bhmodel.loadListSPtheoLoai(Integer.parseInt(event.getComponent().getName()));
                        modelsp.setRowCount(0);
                        for (SanPham sanPham : listSP) {
                            modelsp.addRow(new Object[]{sanPham.getIdSP(), sanPham.getTenSP(), sanPham.getDonGia()});
                        }

                    }

                });
                pnLSP.add(btnLoai[i]);
                pnLSP.updateUI();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Failed: Lỗi load list Loại: " + e);
        }
    }

    public void createHD() {
        bhmodel.createHD();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        lblMaHoaDon.setText("Mã hóa đơn: HD" + bhmodel.hd.getIdHD());
        lblNhanVien.setText("Nhân viên lập: " + Run.nVien.getHoTen());
        lblNgayLapHD.setText("Ngày lập HD: " + bhmodel.hd.getNgayLapHD());

    }

    public void addSP() {
        dg_SoLuong dgsLuong = new dg_SoLuong(Run.trangChu, true);
        dgsLuong.setVisible(true);
        int IDSP = Integer.parseInt(tblSP.getValueAt(index, 0).toString());
        if (checkSP(IDSP)) {
            modelmua.addRow(new Object[]{tblSP.getValueAt(index, 0), tblSP.getValueAt(index, 1), tblSP.getValueAt(index, 2), soLuong});
        } else {
            for (int i = 0; i < tblSPMua.getRowCount(); i++) {
                if (tblSP.getValueAt(index, 0).equals(tblSPMua.getValueAt(i, 0))) {
                    soLuong += Integer.parseInt(tblSPMua.getValueAt(i, 3).toString());
                    tblSPMua.setValueAt(soLuong, i, 3);
                    break;
                }
            }
        }
        thanhTien();

    }

    public void traHang() {
        try {
            index = -1;
            dg_SoLuong dgsLuong = new dg_SoLuong(Run.trangChu, true);
            dgsLuong.setVisible(true);
            int sl = Integer.parseInt(tblSPMua.getValueAt(indexSPM, 3).toString()) - soLuong;
            if (sl <= 0) {
                modelmua.removeRow(indexSPM);
            } else {
                tblSPMua.setValueAt(sl, indexSPM, 3);
            }
            thanhTien();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Failed: Lỗi trả hàng: " + e);
        }
    }

    public boolean checkSP(int IDSP) {
        for (int i = 0; i < tblSPMua.getRowCount(); i++) {
            if (IDSP == Integer.parseInt(tblSPMua.getValueAt(i, 0).toString())) {
                return false;
            }
        }
        return true;
    }

    public void thanhTien() {
        int thanhtien = 0;
        for (int i = 0; i < tblSPMua.getRowCount(); i++) {
            int dongia = Integer.parseInt(tblSPMua.getValueAt(i, 3).toString());
            int soluong = Integer.parseInt(tblSPMua.getValueAt(i, 2).toString());
            thanhtien += (dongia * soluong);
        }
        txtThanhTien.setText(thanhtien + "");
    }

    public void removeText() {
        txtThanhTien.setText(null);
        txtKhachtra.setText(null);
        txtTienThua.setText(null);
    }

    public void tinhTien() {
        try {
            int khachTra = Integer.parseInt(txtKhachtra.getText());
            int thanhtien = Integer.parseInt(txtThanhTien.getText());
            int thua = khachTra - thanhtien;
            txtTienThua.setText(thua + "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Failed: Lỗi nhập tiền khách trả " + e);
        }
    }

    public void thanhToan() {
        try {
            if (!checkHD()) {
                return;
            }
            int rowcount = 0;
            for (int i = 0; i < tblSPMua.getRowCount(); i++) {
                int IDSP = Integer.parseInt(tblSPMua.getValueAt(i, 0).toString());
                int soLuong = Integer.parseInt(tblSPMua.getValueAt(i, 2).toString());
                rowcount += bhmodel.insertToHD(IDSP, soLuong);
            }
            if (rowcount == tblSPMua.getRowCount()) {
                JOptionPane.showMessageDialog(this, "Thanh toán thành công");
                //set trạng thái thanh toán thành công
                bhmodel.confirmHD();
                //reset table sau khi thanh toán
                modelmua.setRowCount(0);
                //khởi tạo hóa đơn mới
                createHD();
            } else {
                JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi thanh toán");

            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Bạn phải nhập tiền khách trả là số");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi thanh toán" + e);
        }
        pnBanHang.updateUI();
    }

    public boolean checkHD() {

        if (tblSPMua.getRowCount() <= 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn sản phẩm cần thanh toán");
            return false;
        }
        int khachTra = Integer.parseInt(txtKhachtra.getText());
        int tongTien = Integer.parseInt(txtThanhTien.getText());
        int tienThua = Integer.parseInt(txtTienThua.getText());
        if (khachTra < 0) {
            JOptionPane.showMessageDialog(this, "Bạn phải nhập số tiền lớn hơn 0");
            return false;
        }
        if (tienThua < 0) {
            JOptionPane.showMessageDialog(this, "Khách hàng chưa thanh toán đủ tiền hóa đơn");
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThanhtoan;
    private javax.swing.JButton btnTraHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMaHoaDon;
    private javax.swing.JLabel lblNgayLapHD;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JPanel pnHoaDon;
    private javax.swing.JPanel pnLSP;
    private javax.swing.JTable tblSP;
    private javax.swing.JTable tblSPMua;
    private javax.swing.JTextField txtKhachtra;
    private javax.swing.JTextField txtThanhTien;
    private javax.swing.JTextField txtTienThua;
    // End of variables declaration//GEN-END:variables
}
