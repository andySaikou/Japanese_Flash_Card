/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flash.card;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author guoshaoyuan
 */
public class GUI extends javax.swing.JFrame
{
    static CardArray allCards = new CardArray("All", 0);
    static int count = 0;
    static Boolean isRevealed = false;
    
    /**
     * Creates new form GUI
     */
    public GUI()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        labelTranslation = new javax.swing.JLabel();
        labelWord = new javax.swing.JLabel();
        buttonUpload = new javax.swing.JButton();
        buttonYes = new javax.swing.JButton();
        buttonNo = new javax.swing.JButton();
        checkboxRandom = new javax.swing.JCheckBox();
        buttonClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTranslation.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        labelTranslation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTranslation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelTranslation.setPreferredSize(new java.awt.Dimension(100, 40));
        labelTranslation.setSize(new java.awt.Dimension(100, 30));

        labelWord.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        labelWord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelWord.setPreferredSize(new java.awt.Dimension(100, 40));

        buttonUpload.setText("Upload");
        buttonUpload.setPreferredSize(new java.awt.Dimension(80, 35));
        buttonUpload.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonUploadActionPerformed(evt);
            }
        });

        buttonYes.setText("Yes");
        buttonYes.setPreferredSize(new java.awt.Dimension(100, 40));
        buttonYes.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonYesActionPerformed(evt);
            }
        });

        buttonNo.setText("No");
        buttonNo.setPreferredSize(new java.awt.Dimension(100, 40));

        checkboxRandom.setText("Random");
        checkboxRandom.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                checkboxRandomActionPerformed(evt);
            }
        });

        buttonClear.setText("Clear");
        buttonClear.setPreferredSize(new java.awt.Dimension(80, 35));
        buttonClear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelWord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTranslation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(buttonYes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 245, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonUpload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkboxRandom)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(labelWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(labelTranslation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonYes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonUpload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkboxRandom)
                    .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void buttonUploadActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonUploadActionPerformed
    {//GEN-HEADEREND:event_buttonUploadActionPerformed
        
        FileNameExtensionFilter myFilter = new FileNameExtensionFilter("Text files", "txt");
        JFileChooser browse = new JFileChooser();
        browse.setCurrentDirectory(new File("/Users/guoshaoyuan/Desktop/Imperial College/Japanese/Flash Card"));
        
        String filename = "unknown";
        
        int showOpenDialog = browse.showOpenDialog(null);
        File selectedFile = null; //The images selected by user in the file chooser
        if(showOpenDialog == JFileChooser.APPROVE_OPTION)
        {
            selectedFile = browse.getSelectedFile();
            if(selectedFile != null)
            {
                filename = selectedFile.getName();
            }
        }   
        CardArray newArray = new CardArray(filename.substring(0,filename.indexOf(".")), 0);
        
        try
        {
            BufferedReader myReader = new BufferedReader(new FileReader(selectedFile));
            while(myReader.ready())
            {
                String line = myReader.readLine();
                if(line.indexOf("#") < 0)
                {
                    String kanji = line.substring(0,line.indexOf(" "));
                    String word = line.substring(line.indexOf("[")+1, line.lastIndexOf("]"));
                    String translation = line.substring(line.indexOf("/")+1, line.length()-1);
                    
                    Card newCard = new Card(kanji, word, translation); 
                    newArray.add(newCard);
                    allCards.add(newCard);
                }
            }
            myReader.close();
            allCards.setRandom();
            
        }
        catch(IOException e)
        {
            System.out.println("Error reading from file");
        }
        
    }//GEN-LAST:event_buttonUploadActionPerformed

    private void buttonYesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonYesActionPerformed
    {//GEN-HEADEREND:event_buttonYesActionPerformed
        String kanji = "";
        String word = "";
        String translation = "";
        
        if(checkboxRandom.isSelected())
        {
            kanji = allCards.getInRandom(count % allCards.size()).getKanji();
            word = allCards.getInRandom(count % allCards.size()).getWord();
            translation = allCards.getInRandom(count % allCards.size()).getTranslation();
        }
        else 
        {
            kanji = allCards.get(count % allCards.size()).getKanji();
            word = allCards.get(count % allCards.size()).getWord();
            translation = allCards.get(count % allCards.size()).getTranslation();
        }
        
        if(!isRevealed)
        {
            labelTranslation.setText(translation);
            labelWord.setText("");

            buttonNo.setEnabled(false);
            buttonYes.setText("Reveal");
            isRevealed = true;
        }
        else
        {
            if(kanji.equals(word))
            {
                labelWord.setText(kanji);
            }
            else
            {
                labelWord.setText(kanji + ", " + word);
            }
            count ++;
            buttonNo.setEnabled(true);
            buttonYes.setText("Yes");
            isRevealed = false;
        }
        
    }//GEN-LAST:event_buttonYesActionPerformed

    private void checkboxRandomActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_checkboxRandomActionPerformed
    {//GEN-HEADEREND:event_checkboxRandomActionPerformed
        count = 0;
        allCards.setRandom();
    }//GEN-LAST:event_checkboxRandomActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonClearActionPerformed
    {//GEN-HEADEREND:event_buttonClearActionPerformed
        count = 0;
        allCards.clear();
        labelWord.setText("");
        labelTranslation.setText("");
    }//GEN-LAST:event_buttonClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonNo;
    private javax.swing.JButton buttonUpload;
    private javax.swing.JButton buttonYes;
    private javax.swing.JCheckBox checkboxRandom;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTranslation;
    private javax.swing.JLabel labelWord;
    // End of variables declaration//GEN-END:variables
}
