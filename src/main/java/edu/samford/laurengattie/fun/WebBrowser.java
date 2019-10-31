/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.samford.laurengattie.fun;

import edu.samford.laurengattie.stacksandqueues.ListStack;
import edu.samford.laurengattie.stacksandqueues.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
// STACK = LAST IN FIRST OUT 

/**
 *
 * @author laurengattie
 */
public class WebBrowser extends javax.swing.JFrame {

    Stack<String> backStack = new ListStack<>();
    Stack<String> forwardStack = new ListStack<>();
    String currentURL = "HOME";

    /**
     * Creates new form WebBrowser
     */
    public WebBrowser() {
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

        jButtonBack = new javax.swing.JButton();
        jButtonForward = new javax.swing.JButton();
        jTextUrlBar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPage = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonBack.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jButtonBack.setText("<-- Back");
        jButtonBack.setActionCommand("<-- Back");
        jButtonBack.setEnabled(false);
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jButtonForward.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jButtonForward.setText("Forward -->");
        jButtonForward.setEnabled(false);
        jButtonForward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForwardActionPerformed(evt);
            }
        });

        jTextUrlBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUrlBarActionPerformed(evt);
            }
        });

        jTextPage.setEditable(false);
        jTextPage.setColumns(20);
        jTextPage.setRows(5);
        jScrollPane1.setViewportView(jTextPage);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonForward, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextUrlBar, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBack)
                    .addComponent(jButtonForward)
                    .addComponent(jTextUrlBar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed

        if (!backStack.isEmpty()) {
            jButtonForward.setEnabled(true);
            forwardStack.push(currentURL);
            currentURL = backStack.pop();
            if (backStack.isEmpty()) {
                jButtonBack.setEnabled(false);
            }
            jTextUrlBar.setText(currentURL);
            // TODO: load the pageat currentURL
            loadCurrentPage();
            // System.out.println("back button clicked"); *TESTING*
            // jTextPage.setText(jTextPage.getText() + "back button clicked\n");*TESTING*
        }

    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonForwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForwardActionPerformed

        if (!forwardStack.isEmpty()) {
            jButtonBack.setEnabled(true);
            backStack.push(currentURL);
            currentURL = forwardStack.pop();
            if (forwardStack.isEmpty()) {
                jButtonForward.setEnabled(false);
            }
            jTextUrlBar.setText(currentURL);
            // TODO: load the pageat currentURL
            loadCurrentPage();
            // System.out.println("forward button clicked"); *TESTING*
            //jTextPage.setText(jTextPage.getText() + "forward button clicked\n"); *TESTING*
        }
    }//GEN-LAST:event_jButtonForwardActionPerformed

    private void jTextUrlBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUrlBarActionPerformed
        // TODO add your handling code here:
        // Push the current URL page onto the back stack
        backStack.push(currentURL);
        currentURL = jTextUrlBar.getText();
        //TODO: Retreive the new page using http
        loadCurrentPage();

        jButtonBack.setEnabled(true);

        // User just wiped out the forward stack, let's do the same
        jButtonForward.setEnabled(false);
        forwardStack = new ListStack<>();

        //   System.out.println("url bar action performed..."+ jTextUrlBar.getText());
        //  jTextPage.setText(jTextPage.getText()+"url bar action performed... "+ jTextUrlBar.getText()+ "\n");
    }//GEN-LAST:event_jTextUrlBarActionPerformed

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
            java.util.logging.Logger.getLogger(WebBrowser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WebBrowser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WebBrowser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WebBrowser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WebBrowser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonForward;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextPage;
    private javax.swing.JTextField jTextUrlBar;
    // End of variables declaration//GEN-END:variables

    private void loadCurrentPage() {
        try {
            jTextPage.setText(getHTML(currentURL));
        } catch (Exception ex) {
            Logger.getLogger(WebBrowser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String getHTML(String urlToRead) throws Exception {
        StringBuilder result = new StringBuilder();
        URL url = new URL(urlToRead);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line+"\n");
        }
        rd.close();
        return result.toString();
    }
}