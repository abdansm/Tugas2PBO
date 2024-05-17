/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mvcMysql;
import static java.lang.Double.parseDouble;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ABDAN SM
 */
public class ViewMovieData extends javax.swing.JFrame {
    ControllerMovie controller = new ControllerMovie();
    public Statement st;
   public ResultSet rs;
   public DefaultTableModel tabModel;
   Connection cn = mvcMysql.Koneksi.Koneksi();
    /**
     * Creates new form ViewMovieData
     */
    
   public void judul() {
  Object[] judul = {
    "Judul", "Alur", "Penokohan", "Akting", "Nilai"
  };
  tabModel = new DefaultTableModel(null, judul);
  tabelMovie.setModel(tabModel);
}
   
   
   public void tampilData() {
  try {
    st = cn.createStatement();
    tabModel.getDataVector().removeAllElements();
    tabModel.fireTableDataChanged();
    rs = st.executeQuery("SELECT * FROM movie ");
    
    while (rs.next()) {
      Object[] data = {
        rs.getString("judul"),
        rs.getString("alur"),
        rs.getString("penokohan"),
        rs.getString("akting"),
        rs.getString("nilai"),
      };
        
        tabModel.addRow(data);
    }
  } catch(Exception e) {
    e.printStackTrace();
  }
}
    public ViewMovieData() {
        initComponents();
        judul();
        tampilData();
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        fJudul = new javax.swing.JTextField();
        fAlur = new javax.swing.JTextField();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        fPenokohan = new javax.swing.JTextField();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        fAkting = new javax.swing.JTextField();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane2 = new javax.swing.JScrollPane();
        tabelMovie = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(663, 370));
        jPanel1.setName(""); // NOI18N

        jLabel1.setText("Judul");

        fJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fJudulActionPerformed(evt);
            }
        });

        fAlur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fAlurActionPerformed(evt);
            }
        });

        jLabel2.setText("Alur");

        fPenokohan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fPenokohanActionPerformed(evt);
            }
        });

        jLabel3.setText("Penokohan");

        fAkting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fAktingActionPerformed(evt);
            }
        });

        jLabel4.setText("Akting");

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tabelMovie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Judul", "Alur", "Penokohan", "Akting", "Nilai"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelMovie.getTableHeader().setReorderingAllowed(false);
        tabelMovie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMovieMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelMovie);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fAlur, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fPenokohan, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fAkting, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTambah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fAlur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fPenokohan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fAkting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(29, 71, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fJudulActionPerformed

    private void fAlurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fAlurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fAlurActionPerformed

    private void fPenokohanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fPenokohanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fPenokohanActionPerformed

    private void fAktingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fAktingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fAktingActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        fJudul.setText("");
        fAlur.setText("");
        fAkting.setText("");
        fPenokohan.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        String judul = fJudul.getText();
        String alur = fAlur.getText();
        String penokohan = fPenokohan.getText();
        String akting = fAkting.getText();
        
        if(judul.isEmpty()||alur.isEmpty()||akting.isEmpty()||penokohan.isEmpty()){
        JOptionPane.showMessageDialog(this, "Harap isi semua Field","Coba Lagi",JOptionPane.ERROR_MESSAGE);
        }else{
        
        controller.setJudul(judul);
        controller.setAlur(parseDouble(alur));
        controller.setPenokohan(parseDouble(penokohan));
        controller.setAkting(parseDouble(akting));
        controller.olahNilai();
        controller.simpanData();
        tampilData();
        fJudul.setText("");
        fAlur.setText("");
        fAkting.setText("");
        fPenokohan.setText("");
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
   String judul = fJudul.getText();
        String alur = fAlur.getText();
        String penokohan = fPenokohan.getText();
        String akting = fAkting.getText();
        
        if(judul.isEmpty()||alur.isEmpty()||akting.isEmpty()||penokohan.isEmpty()){
        JOptionPane.showMessageDialog(this, "Harap isi semua Field","Coba Lagi",JOptionPane.ERROR_MESSAGE);
        }else{
        
        controller.setJudul(judul);
        controller.setAlur(parseDouble(alur));
        controller.setPenokohan(parseDouble(penokohan));
        controller.setAkting(parseDouble(akting));
        controller.olahNilai();
        controller.updateData();
    JOptionPane.showMessageDialog(null, "Update Berhasil");
     tampilData();
     fJudul.setText("");
        fAlur.setText("");
        fAkting.setText("");
        fPenokohan.setText("");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
    int jawab;
    
    if ((jawab = JOptionPane.showConfirmDialog(null, "Ingin menghapus data?", "konfirmasi", JOptionPane.YES_NO_OPTION)) == 0) {
      st = cn.createStatement();
      st.executeUpdate("DELETE FROM movie WHERE judul='"
          + tabModel.getValueAt(tabelMovie.getSelectedRow(), 0) + "'");
      tampilData();
      fJudul.setText("");
        fAlur.setText("");
        fAkting.setText("");
        fPenokohan.setText("");
    }
  } catch (Exception e) {
    e.printStackTrace();
  }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tabelMovieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMovieMouseClicked
        fJudul.setText(tabelMovie.getValueAt(tabelMovie.getSelectedRow(), 0).toString());
  fAlur.setText(tabelMovie.getValueAt(tabelMovie.getSelectedRow(), 1).toString());
  fPenokohan.setText(tabelMovie.getValueAt(tabelMovie.getSelectedRow(), 2).toString());
  fAkting.setText(tabelMovie.getValueAt(tabelMovie.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_tabelMovieMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMovieData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField fAkting;
    private javax.swing.JTextField fAlur;
    private javax.swing.JTextField fJudul;
    private javax.swing.JTextField fPenokohan;
    private javax.swing.JTable tabelMovie;
    // End of variables declaration//GEN-END:variables
}