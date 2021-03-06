package com.mycompany.poly.app.ui;

import com.mycompany.poly.app.dao.SinhVienDao;
import com.mycompany.poly.app.helper.DataValidator;
import com.mycompany.poly.app.helper.ImageHelper;
import com.mycompany.poly.app.helper.MessageDialogHelper;
import com.mycompany.poly.app.model.SinhVien;
import java.awt.Image;
import java.io.File;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class StudenManagementPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudenManagementPanel
     */
    private MainForm parentForm;
    private DefaultTableModel tblModel;
    private byte [] personalImage;
    public StudenManagementPanel() {
        initComponents();
        initTable();
        loadDataToTable();
    }
    private void initTable(){
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Mã Sinh Viên","Họ Tên", "Email", "Số ĐT", "Giới Tính", "Địa Chỉ"});
        tblStudents.setModel(tblModel);
    }
    private void loadDataToTable(){
        try {
            SinhVienDao dao = new SinhVienDao();
            List<SinhVien> list = dao.findAll();
            tblModel.setRowCount(0);
            for(SinhVien it : list){
                tblModel.addRow(new Object[]{
                    it.getMaSinhVIen(), it.getHoTen(), it.getEmail(), it.getSoDT(),
                    it.getGioiTinh()==1? "Nam" : "Nữ", it.getDiaChi()
            });
            }
            tblModel.fireTableDataChanged();
        }
        catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtStudentId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        btnBrowse = new javax.swing.JButton();
        rdbMale = new javax.swing.JRadioButton();
        rdbFemale = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaAddress = new javax.swing.JTextArea();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        bntUpdate = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jScrollPane3.setViewportView(jTree1);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Quản Lý Sinh Viên");

        jLabel2.setText("Mã Sinh Viên:");

        jLabel3.setText("Họ Tên:");

        jLabel4.setText("Email:");

        jLabel5.setText("Số Điện Thoại:");

        jLabel6.setText("Giới  Tính");

        jLabel7.setText("Địa Chỉ: ");

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/10207-man-student-light-skin-tone-icon-64.png"))); // NOI18N

        btnBrowse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/open-file-icon-16.png"))); // NOI18N
        btnBrowse.setText("Mở Hình");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(btnBrowse)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBrowse)
                .addGap(4, 4, 4))
        );

        buttonGroup1.add(rdbMale);
        rdbMale.setText("Nam");
        rdbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbMaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbFemale);
        rdbFemale.setText("Nữ");
        rdbFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbFemaleActionPerformed(evt);
            }
        });

        txaAddress.setColumns(20);
        txaAddress.setRows(5);
        jScrollPane1.setViewportView(txaAddress);

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/new-icon-16.png"))); // NOI18N
        btnNew.setText("Tạo Mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/Save-icon.png"))); // NOI18N
        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/Actions-edit-delete-icon-16.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        bntUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/Actions-document-edit-icon-16.png"))); // NOI18N
        bntUpdate.setText("Cập Nhật");
        bntUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntUpdateActionPerformed(evt);
            }
        });

        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
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
        tblStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentsMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblStudents);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(77, 77, 77)
                                                        .addComponent(rdbFemale)
                                                        .addGap(0, 0, Short.MAX_VALUE))
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel5))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(rdbMale)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                        .addComponent(txtEmail)
                                                        .addComponent(txtName)
                                                        .addComponent(txtStudentId)))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnNew)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSave)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bntUpdate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDelete)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(rdbMale)
                            .addComponent(rdbFemale))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnSave)
                    .addComponent(bntUpdate)
                    .addComponent(btnDelete))
                .addGap(30, 30, 30)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtStudentId, sb, "Mã Sinh Viên");
        
        if(sb.length()>0){
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }
        if(MessageDialogHelper.showConfirmDialog(parentForm, "Bạn Có Muốn Xóa Sinh Viên Không ?", "Hỏi") == JOptionPane.NO_OPTION){
            return;
        }
        try {
           
            
            SinhVienDao dao = new SinhVienDao();
            if(dao.delete(txtStudentId.getText())){
                MessageDialogHelper.showConfirmDialog(parentForm, "Sinh Viên Đã Được Xóa", "Thông Báo");
                btnNewActionPerformed(evt);
                loadDataToTable();
            }
            else{
                MessageDialogHelper.showConfirmDialog(parentForm, "Sinh Viên Chưa Được Xóa Do Lỗi Nào Đó", "Cảnh Báo");
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showConfirmDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtEmail.setText("");
        txtName.setText("");
        txtPhone.setText("");
        txtStudentId.setText("");
        txaAddress.setText("");
        personalImage = null;
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/10207-man-student-light-skin-tone-icon-64.png"));
        lblImage.setIcon(icon);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtStudentId, sb, "Mã Sinh Viên");
        DataValidator.validateEmpty(txtName, sb, "Tên Sinh Viên Không Được Để Trống");
        if(sb.length()>0){
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }
        try {
            SinhVien sv = new SinhVien();
            sv.setMaSinhVIen(txtStudentId.getText());
            sv.setHoTen(txtName.getText());
            sv.setEmail(txtEmail.getText());
            sv.setSoDT(txtPhone.getText());
            sv.setGioiTinh(rdbMale.isSelected()?1: 0);
            sv.setDiaChi(txaAddress.getText());
            sv.setHinh(personalImage);
            
            SinhVienDao dao = new SinhVienDao();
            if(dao.insert(sv)){
                MessageDialogHelper.showConfirmDialog(parentForm, "Sinh Viên Đã Được Lưu", "Thông Báo");
                loadDataToTable();
            }
            else{
                MessageDialogHelper.showConfirmDialog(parentForm, "Sinh Viên Chưa Được Lưu Do Lỗi Nào Đó", "Cảnh Báo");
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showConfirmDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f){
                if(f.isDirectory()){
                    return true;
                }
                else{
                    return f.getName().toLowerCase().endsWith(".jpg");
                }
            }

            @Override
            public String getDescription() {
                return "Image File (*.jpg)";
            }
        });
        if(chooser.showOpenDialog(parentForm)== JFileChooser.CANCEL_OPTION){
            return;
        }
        File file = chooser.getSelectedFile();
        try {
            ImageIcon icon = new ImageIcon(file.getPath());
            Image img = ImageHelper.resize(icon.getImage(), 140, 160);
            ImageIcon resizedIcon = new ImageIcon(img);
            lblImage.setIcon(resizedIcon);
            personalImage = ImageHelper.toByteArray(img, "jpg");
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showMessageDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void bntUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntUpdateActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtStudentId, sb, "Mã Sinh Viên");
        DataValidator.validateEmpty(txtName, sb, "Tên Sinh Viên Không Được Để Trống");
        if(sb.length()>0){
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }
        if(MessageDialogHelper.showConfirmDialog(parentForm, "Bạn Có Muốn Cập Nhật?", "Hỏi") == JOptionPane.NO_OPTION){
            return;
        }
        try {
            SinhVien sv = new SinhVien();
            sv.setMaSinhVIen(txtStudentId.getText());
            sv.setHoTen(txtName.getText());
            sv.setEmail(txtEmail.getText());
            sv.setSoDT(txtPhone.getText());
            sv.setGioiTinh(rdbMale.isSelected()?1: 0);
            sv.setDiaChi(txaAddress.getText());
            sv.setHinh(personalImage);
            
            SinhVienDao dao = new SinhVienDao();
            if(dao.update(sv)){
                MessageDialogHelper.showConfirmDialog(parentForm, "Sinh Viên Đã Được Cập Nhật", "Thông Báo");
                loadDataToTable();
            }
            else{
                MessageDialogHelper.showConfirmDialog(parentForm, "Sinh Viên Chưa Được Cập Nhật Do Lỗi Nào Đó", "Cảnh Báo");
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showConfirmDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_bntUpdateActionPerformed

    private void rdbFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbFemaleActionPerformed

    private void rdbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbMaleActionPerformed

    private void tblStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentsMouseClicked
        try {
            int row = tblStudents.getSelectedRow();
            if(row >=0){
                String id = (String) tblStudents.getValueAt(row, 0);
                SinhVienDao dao = new SinhVienDao();
                SinhVien sv = dao.findById(id);
                
                if(sv!=null){
                    txtStudentId.setText(sv.getMaSinhVIen());
                    txtName.setText(sv.getHoTen());
                    txtEmail.setText(sv.getEmail());
                    txtPhone.setText(sv.getSoDT());
                    txaAddress.setText(sv.getDiaChi());
                    rdbMale.setSelected(sv.getGioiTinh()==1? true : false);
                    
                    if(sv.getHinh() != null){
                        Image img = ImageHelper.createImageFromByteArray(sv.getHinh(), "jpg");
                        lblImage.setIcon(new ImageIcon(img));
                        personalImage = sv.getHinh();
                    }
                    else{
                        personalImage = sv.getHinh();
                        ImageIcon icon = new ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/10207-man-student-light-skin-tone-icon-64.png"));
                        lblImage.setIcon(icon);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showConfirmDialog(parentForm, e.getMessage(), "Lỗi");
        }
            
    }//GEN-LAST:event_tblStudentsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntUpdate;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JRadioButton rdbFemale;
    private javax.swing.JRadioButton rdbMale;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextArea txaAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtStudentId;
    // End of variables declaration//GEN-END:variables
}
