package proyectop2;
//import java.lang.Integer;

public class Conversiones extends javax.swing.JFrame {

    
    
    public Conversiones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        num1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        binbtn = new javax.swing.JButton();
        octalbtn = new javax.swing.JButton();
        hexabtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        rest = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setBackground(null);
        jLabel1.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONVERSIONES");

        num1.setBackground(null);
        num1.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(null);
        jLabel2.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        jLabel2.setText("Ingresa tu numero: ");

        binbtn.setBackground(null);
        binbtn.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        binbtn.setText("BINARIO");
        binbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binbtnActionPerformed(evt);
            }
        });

        octalbtn.setBackground(null);
        octalbtn.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        octalbtn.setText("OCTAL");
        octalbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                octalbtnActionPerformed(evt);
            }
        });

        hexabtn.setBackground(null);
        hexabtn.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        hexabtn.setText("HEXADECIMAL");
        hexabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hexabtnActionPerformed(evt);
            }
        });

        jLabel3.setBackground(null);
        jLabel3.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        jLabel3.setText("RESULTADO");

        rest.setBackground(null);
        rest.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(binbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(octalbtn)
                .addGap(113, 113, 113)
                .addComponent(hexabtn)
                .addGap(88, 88, 88))
            .addGroup(layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(num1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rest)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(binbtn)
                    .addComponent(octalbtn)
                    .addComponent(hexabtn))
                .addGap(61, 61, 61)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rest, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void binbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binbtnActionPerformed

        Conversion gama=new Conversion();
        String num;
        num=num1.getText();
    
        rest.setText(gama.bin(new Integer(num)));
    }//GEN-LAST:event_binbtnActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
     
    }//GEN-LAST:event_num1ActionPerformed

    private void hexabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hexabtnActionPerformed
       
        Conversion gama=new Conversion();
        String num;
        num=num1.getText();
    
        rest.setText(gama.hexa(new Integer(num)));
    }//GEN-LAST:event_hexabtnActionPerformed

    private void octalbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_octalbtnActionPerformed
        
        Conversion gama=new Conversion();
        String num;
        num=num1.getText();
        
        rest.setText(gama.octal(new Integer(num)));
    }//GEN-LAST:event_octalbtnActionPerformed

    
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversiones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton binbtn;
    private javax.swing.JButton hexabtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField num1;
    private javax.swing.JButton octalbtn;
    private javax.swing.JTextField rest;
    // End of variables declaration//GEN-END:variables
}
