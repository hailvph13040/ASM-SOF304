package view;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sunnycssw.DAO.BanHangDAO;
import sunnycssw.DAO.DangNhapDAO;

/**
 *
 * @author hai95
 */
public class frTrangChu extends javax.swing.JFrame {

    pnlBanHang banHang;
    pnlTrangChu homePage;
    pnlQuanLy quanLy;
    pnlThongKe thongKe;
    pnlThietLap thietLap;
    DangNhapDAO dnDAO = new DangNhapDAO();

    /**
     * Creates new form Home
     */
    public frTrangChu() {
        initComponents();
        setLocationRelativeTo(null);
        sethomepage();
        pnlNoiDung.setSize(840, 450);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem7 = new javax.swing.JMenuItem();
        pnlNoiDung = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        lblThoiGian = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblCa = new javax.swing.JLabel();
        lblChucVu = new javax.swing.JLabel();
        btnTrangChu = new javax.swing.JButton();
        btnBanHang = new javax.swing.JButton();
        btnQuanLy = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnThietLap = new javax.swing.JButton();
        jmbMenu = new javax.swing.JMenuBar();
        mnBanHang = new javax.swing.JMenu();
        mniBanHang = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniQLNV = new javax.swing.JMenuItem();
        mniQLLSP = new javax.swing.JMenuItem();
        mniQLSP = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mniThongKe = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mniDoimk = new javax.swing.JMenuItem();
        mniThayNen = new javax.swing.JMenuItem();
        mniABoutUs = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();

        jMenuItem7.setText("jMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlNoiDung.setMinimumSize(new java.awt.Dimension(840, 450));
        pnlNoiDung.setLayout(null);

        pnlMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMenu.setPreferredSize(new java.awt.Dimension(840, 160));
        pnlMenu.setLayout(null);

        lblThoiGian.setText("Timer ");
        pnlMenu.add(lblThoiGian);
        lblThoiGian.setBounds(0, 0, 275, 23);

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/41-128.png"))); // NOI18N
        btnThoat.setText("Đăng Xuất");
        btnThoat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        pnlMenu.add(btnThoat);
        btnThoat.setBounds(700, 10, 120, 25);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Tên nhân viên:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Ca:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Chức vụ");

        lblName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Lê Văn Hai");
        lblName.setPreferredSize(new java.awt.Dimension(150, 17));

        lblCa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCa.setText("2");

        lblChucVu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblChucVu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChucVu.setText("Quản lý");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblCa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblChucVu))
                .addContainerGap())
        );

        pnlMenu.add(jPanel1);
        jPanel1.setBounds(600, 40, 229, 92);

        btnTrangChu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconHome.png"))); // NOI18N
        btnTrangChu.setText("Trang Chủ");
        btnTrangChu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTrangChu.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnTrangChu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuActionPerformed(evt);
            }
        });
        pnlMenu.add(btnTrangChu);
        btnTrangChu.setBounds(20, 30, 90, 80);

        btnBanHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconBanhang.png"))); // NOI18N
        btnBanHang.setText("Bán Hàng");
        btnBanHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBanHang.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnBanHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanHangActionPerformed(evt);
            }
        });
        pnlMenu.add(btnBanHang);
        btnBanHang.setBounds(120, 30, 90, 80);

        btnQuanLy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnQuanLy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconQLy.png"))); // NOI18N
        btnQuanLy.setText("Quản lý");
        btnQuanLy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQuanLy.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnQuanLy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQuanLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyActionPerformed(evt);
            }
        });
        pnlMenu.add(btnQuanLy);
        btnQuanLy.setBounds(220, 30, 90, 80);

        btnThongKe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconthongke.png"))); // NOI18N
        btnThongKe.setText("Thống kê");
        btnThongKe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThongKe.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnThongKe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });
        pnlMenu.add(btnThongKe);
        btnThongKe.setBounds(320, 30, 90, 80);

        btnThietLap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThietLap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconThietLap.png"))); // NOI18N
        btnThietLap.setText("Thiết lập");
        btnThietLap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThietLap.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnThietLap.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThietLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThietLapActionPerformed(evt);
            }
        });
        pnlMenu.add(btnThietLap);
        btnThietLap.setBounds(420, 30, 90, 80);

        mnBanHang.setText("Bán Hàng");

        mniBanHang.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mniBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Edit.png"))); // NOI18N
        mniBanHang.setText("Bán Hàng");
        mniBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBanHangActionPerformed(evt);
            }
        });
        mnBanHang.add(mniBanHang);

        jmbMenu.add(mnBanHang);

        jMenu2.setText("Quản Lý");

        mniQLNV.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mniQLNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User.png"))); // NOI18N
        mniQLNV.setText("Quản lý nhân viên");
        mniQLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQLNVActionPerformed(evt);
            }
        });
        jMenu2.add(mniQLNV);

        mniQLLSP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mniQLLSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/43777.png"))); // NOI18N
        mniQLLSP.setText("Quản lý loại sản phẩm");
        mniQLLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQLLSPActionPerformed(evt);
            }
        });
        jMenu2.add(mniQLLSP);

        mniQLSP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mniQLSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1170577.png"))); // NOI18N
        mniQLSP.setText("Quản lý sản phẩm");
        mniQLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQLSPActionPerformed(evt);
            }
        });
        jMenu2.add(mniQLSP);

        jmbMenu.add(jMenu2);

        jMenu3.setText("Thống kê");

        mniThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bar chart.png"))); // NOI18N
        mniThongKe.setText("Thống kê");
        mniThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThongKeActionPerformed(evt);
            }
        });
        jMenu3.add(mniThongKe);

        jmbMenu.add(jMenu3);

        jMenu4.setText("Thiết lập");

        mniDoimk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Edit.png"))); // NOI18N
        mniDoimk.setText("Đổi mật khẩu");
        mniDoimk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoimkActionPerformed(evt);
            }
        });
        jMenu4.add(mniDoimk);

        mniThayNen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Help.png"))); // NOI18N
        mniThayNen.setText("Trợ giúp");
        mniThayNen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThayNenActionPerformed(evt);
            }
        });
        jMenu4.add(mniThayNen);

        mniABoutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Info.png"))); // NOI18N
        mniABoutUs.setText("About Us");
        mniABoutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniABoutUsActionPerformed(evt);
            }
        });
        jMenu4.add(mniABoutUs);

        mniDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/41-128.png"))); // NOI18N
        mniDangXuat.setText("Đăng Xuất");
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        jMenu4.add(mniDangXuat);

        jmbMenu.add(jMenu4);

        setJMenuBar(jmbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanHangActionPerformed
        displayUI(2);
    }//GEN-LAST:event_btnBanHangActionPerformed

    private void btnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuActionPerformed
        // TODO add your handling code here:
        displayUI(1);
    }//GEN-LAST:event_btnTrangChuActionPerformed

    private void btnQuanLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyActionPerformed
        // TODO add your handling code here:
        displayUI(3);
    }//GEN-LAST:event_btnQuanLyActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:
        displayUI(4);
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnThietLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThietLapActionPerformed
        // TODO add your handling code here:
        displayUI(5);
    }//GEN-LAST:event_btnThietLapActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        exit();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        dnDAO.clearHD();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        dnDAO.clearHD();
    }//GEN-LAST:event_formWindowClosed

    private void mniQLNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQLNVActionPerformed
        // TODO add your handling code here:
        displayUI(3);
        quanLy.displayTbl(1);
    }//GEN-LAST:event_mniQLNVActionPerformed

    private void mniThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThongKeActionPerformed
        // TODO add your handling code here:
        displayUI(4);
    }//GEN-LAST:event_mniThongKeActionPerformed

    private void mniBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBanHangActionPerformed
        // TODO add your handling code here:
        displayUI(2);
    }//GEN-LAST:event_mniBanHangActionPerformed

    private void mniQLLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQLLSPActionPerformed
        // TODO add your handling code here:
        displayUI(3);
        quanLy.displayTbl(2);
    }//GEN-LAST:event_mniQLLSPActionPerformed

    private void mniQLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQLSPActionPerformed
        // TODO add your handling code here:
        displayUI(3);
        quanLy.displayTbl(3);
    }//GEN-LAST:event_mniQLSPActionPerformed

    private void mniDoimkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoimkActionPerformed
        // TODO add your handling code here:
        pnlThietLap pnThietLap = new pnlThietLap();
        pnThietLap.doimk();
    }//GEN-LAST:event_mniDoimkActionPerformed

    private void mniThayNenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThayNenActionPerformed
        // TODO add your handling code here:
        displayUI(5);
        thietLap.TroGiup();
    }//GEN-LAST:event_mniThayNenActionPerformed

    private void mniABoutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniABoutUsActionPerformed
        // TODO add your handling code here:
        displayUI(5);
        thietLap.About();
    }//GEN-LAST:event_mniABoutUsActionPerformed

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        // TODO add your handling code here:
         exit();
    }//GEN-LAST:event_mniDangXuatActionPerformed

    public void sethomepage() {
        pnlNoiDung.removeAll();
        homePage = new pnlTrangChu();
        pnlNoiDung.add(homePage);
        pnlNoiDung.updateUI();
        thread();
        lblName.setText(Run.nVien.getHoTen());
        lblChucVu.setText(Run.nVien.getRoles());
        if (Run.nVien.getRoles().equalsIgnoreCase("Nhân viên")) {
            btnThongKe.setEnabled(false);
        }
    }

    public void exit() {
        String optionString[] = {"Thoát", "Đăng xuất", "Hủy"};
        int type = JOptionPane.QUESTION_MESSAGE;
        int option = JOptionPane.showOptionDialog(this, "Bạn muôn thoát không?", "Thoát", 0, type, null, optionString, "Thoát");
        
        if (option == 0) {
            dnDAO.clearHD();
            System.exit(0);
        } else if (option == 1) {
            dnDAO.clearHD();
            this.setVisible(false);
            Run.frDangNhap();
        } else {
            return;
        }
        
    }
    

    public void thread() {
        Thread clock = new Thread() {
            @Override
            public void run() {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy     HH:mm:ss");
                while (true) {
                    try {
                        Calendar cal = Calendar.getInstance();
                        Date date = cal.getTime();
                        int hour = date.getHours();
                        lblThoiGian.setText("Time: " + sdf.format(date));
                        if (hour >= 14 && hour < 22) {
                            lblCa.setText("2");
                        } else if (hour >= 8 && hour < 14) {
                            lblCa.setText("1");
                        } else {
                            lblCa.setText("");
                        }
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        };
        clock.start();
    }

    public void displayUI(int number) {
        pnlNoiDung.removeAll();
        switch (number) {
            case 1:
                if (homePage == null) {
                    homePage = new pnlTrangChu();
                }
                pnlNoiDung.add(homePage);
                break;
            case 2:
                if (banHang == null) {
                    banHang = new pnlBanHang();
                }
                pnlNoiDung.add(banHang);
                break;
            case 3:
                if (quanLy == null) {
                    quanLy = new pnlQuanLy();
                }
                pnlNoiDung.add(quanLy);
                break;
            case 4:
                if (thongKe == null) {
                    thongKe = new pnlThongKe();
                }
                pnlNoiDung.add(thongKe);
                break;
            case 5:
                if (thietLap == null) {
                    thietLap = new pnlThietLap();
                }
                pnlNoiDung.add(thietLap);
                break;
        }
        pnlNoiDung.updateUI();
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(frTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frTrangChu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBanHang;
    private javax.swing.JButton btnQuanLy;
    private javax.swing.JButton btnThietLap;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnTrangChu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JLabel lblCa;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblThoiGian;
    private javax.swing.JMenu mnBanHang;
    private javax.swing.JMenuItem mniABoutUs;
    private javax.swing.JMenuItem mniBanHang;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDoimk;
    private javax.swing.JMenuItem mniQLLSP;
    private javax.swing.JMenuItem mniQLNV;
    private javax.swing.JMenuItem mniQLSP;
    private javax.swing.JMenuItem mniThayNen;
    private javax.swing.JMenuItem mniThongKe;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlNoiDung;
    // End of variables declaration//GEN-END:variables
}
