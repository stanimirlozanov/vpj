package app;

import com.formdev.flatlaf.FlatLightLaf;

public class ContactForm extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ContactForm.class.getName());

    private boolean bOnlyReqFields = false;
    
    public ContactForm() {
        initComponents();
        setLocationRelativeTo(null);
        cmbCountry.removeAllItems();
        String[] countries = {"България","Германия","Франция","Канада"};
        for(String c : countries){
            cmbCountry.addItem(c);
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContact = new javax.swing.JPanel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblCountry = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnSample = new javax.swing.JButton();
        cmbCountry = new javax.swing.JComboBox<>();
        lblStatus = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuContacts = new javax.swing.JMenu();
        miSplitName = new javax.swing.JMenuItem();
        mnuView = new javax.swing.JMenu();
        miToggleFields = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFirstName.setText("Име");

        lblLastName.setText("Фамилия");

        lblCity.setText("Град");

        lblCountry.setText("Държава");

        lblEmail.setText("Имейл");

        btnSample.setText("Примерен контакт");
        btnSample.addActionListener(this::btnSampleActionPerformed);

        cmbCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCountry.addActionListener(this::cmbCountryActionPerformed);

        javax.swing.GroupLayout pnlContactLayout = new javax.swing.GroupLayout(pnlContact);
        pnlContact.setLayout(pnlContactLayout);
        pnlContactLayout.setHorizontalGroup(
            pnlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContactLayout.createSequentialGroup()
                .addGroup(pnlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlContactLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlContactLayout.createSequentialGroup()
                        .addGroup(pnlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContactLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlContactLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(pnlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(58, 58, 58)
                        .addGroup(pnlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSample, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(txtLastName)
                            .addComponent(txtCity)
                            .addComponent(txtEmail)
                            .addComponent(cmbCountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        pnlContactLayout.setVerticalGroup(
            pnlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContactLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pnlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCountry)
                    .addComponent(cmbCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlContactLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSample)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        lblStatus.setText("Готово");

        mnuContacts.setText("Контакти");

        miSplitName.setText("Разделяне на име");
        miSplitName.addActionListener(this::miSplitNameActionPerformed);
        mnuContacts.add(miSplitName);

        jMenuBar1.add(mnuContacts);

        mnuView.setText("Изглед");

        miToggleFields.setText("Покажи само задължителните полета");
        miToggleFields.addActionListener(this::miToggleFieldsActionPerformed);
        mnuView.add(miToggleFields);

        jMenuBar1.add(mnuView);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(lblStatus)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSampleActionPerformed
        txtFirstName.setText("Georgi");
        txtLastName.setText("Penchev");
        txtCity.setText("Varna");
        cmbCountry.setSelectedItem("България");
        txtEmail.setText("georgi.penchev@ue-varna.bg");
        lblStatus.setText("Заредени примерни данни");
    }//GEN-LAST:event_btnSampleActionPerformed

    private void miSplitNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSplitNameActionPerformed
        String name = txtFirstName.getText(); //Ivan Ivanov
        try {
            String[] names = name.trim().split(" ");
            //[0]->Ivan , [1]->Ivanov
            txtFirstName.setText(names[0]);
            txtLastName.setText(names[1]);
        } catch (Exception e) {
            lblStatus.setText("Въведете две имена през интервал");
        }
    }//GEN-LAST:event_miSplitNameActionPerformed

    private void miToggleFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miToggleFieldsActionPerformed
        if(bOnlyReqFields == false){
            lblCountry.setVisible(false);
            lblEmail.setVisible(false);
            cmbCountry.setVisible(false);
            txtEmail.setVisible(false);
            miToggleFields.setText("Покажи незадължителните полета");
            bOnlyReqFields = true;
        }
        else{
            lblCountry.setVisible(true);
            lblEmail.setVisible(true);
            cmbCountry.setVisible(true);
            txtEmail.setVisible(true);
            miToggleFields.setText("Покажи само задължителните полета");
            bOnlyReqFields = false;
        }
    }//GEN-LAST:event_miToggleFieldsActionPerformed

    private void cmbCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCountryActionPerformed

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> new ContactForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSample;
    private javax.swing.JComboBox<String> cmbCountry;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JMenuItem miSplitName;
    private javax.swing.JMenuItem miToggleFields;
    private javax.swing.JMenu mnuContacts;
    private javax.swing.JMenu mnuView;
    private javax.swing.JPanel pnlContact;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    // End of variables declaration//GEN-END:variables
}
