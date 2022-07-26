package MovieBookingSystem;

import java.text.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;

public class BookMovie extends javax.swing.JFrame {

    String mc, mn, ns, md;

    public BookMovie() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setResizable(false);
    }

    public void fillcombo() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "dps");
            Statement st = con.createStatement();
            String selectQuery = "select movie_name from movie";
            ResultSet rs = st.executeQuery(selectQuery);
            while (rs.next()) {
                movieName.addItem(rs.getString("movie_name"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        movieName = new javax.swing.JComboBox<>();
        SeatNo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        movieCost = new javax.swing.JLabel();
        MovieDate = new com.toedter.calendar.JDateChooser();
        pop = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        drink = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        gold = new javax.swing.JRadioButton();
        premium = new javax.swing.JRadioButton();
        platinum = new javax.swing.JRadioButton();
        time = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        avail = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lang = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Book Movie");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Details to Book Movie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setText("Select Class");

        jLabel1.setText("Select Movie ");

        jLabel3.setText("Select No of seats");

        movieName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movieNameMouseClicked(evt);
            }
        });
        movieName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieNameActionPerformed(evt);
            }
        });

        SeatNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        SeatNo.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                SeatNoInputMethodTextChanged(evt);
            }
        });
        SeatNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeatNoActionPerformed(evt);
            }
        });

        jLabel4.setText("Enter Movie Date");

        jButton1.setText("Click to Book Movie");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        pop.setText("Popcorns");
        pop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popActionPerformed(evt);
            }
        });

        jLabel5.setText("Snacks :");

        drink.setText("Cold Drinks");
        drink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinkActionPerformed(evt);
            }
        });

        jCheckBox3.setText(" I agree to the");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jButton3.setText("terms and conditions.");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(gold);
        gold.setText("Gold");
        gold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goldActionPerformed(evt);
            }
        });

        buttonGroup1.add(premium);
        premium.setText("Premium");
        premium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premiumActionPerformed(evt);
            }
        });

        buttonGroup1.add(platinum);
        platinum.setText("Platinum");
        platinum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platinumActionPerformed(evt);
            }
        });

        time.setText(" ");

        jLabel7.setText("Time");

        avail.setText("Check for Availablity of seats");
        avail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availActionPerformed(evt);
            }
        });

        jLabel6.setText("Language");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(jCheckBox3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                        .addComponent(movieName, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(time, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                            .addComponent(lang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(6, 6, 6))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(movieCost, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(pop)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(MovieDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(SeatNo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(drink))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gold)
                                .addGap(18, 18, 18)
                                .addComponent(premium)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(platinum)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(avail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(movieName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(time))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gold)
                    .addComponent(jLabel2)
                    .addComponent(premium)
                    .addComponent(platinum))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(SeatNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(avail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(MovieDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drink)
                    .addComponent(pop)
                    .addComponent(jLabel5))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(movieCost, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ns = SeatNo.getSelectedItem().toString();
        SimpleDateFormat sdf = new SimpleDateFormat("E,dd-MM-yyyy");
        md = sdf.format(MovieDate.getDate());
        double total = 0;
        int snacks = 0;
        if (pop.isSelected()) {
            snacks = snacks + 150;
        }
        if (drink.isSelected()) {
            snacks = snacks + 50;
        }
        total = snacks + GetCost() * Integer.parseInt((String) SeatNo.getSelectedItem());
        int s = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "dps");

            String sql = "select sum(SEATS) as total_booking from booking where movie_name=? and date=?";
            PreparedStatement psmt = con.prepareStatement(sql);
            String name = movieName.getSelectedItem().toString();
            psmt.setString(1, name);
            SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
            String dt = d.format(MovieDate.getDate());
            psmt.setString(2, dt);
            ResultSet rs = psmt.executeQuery();
            if (rs.next()) {

                if (rs.getString("total_booking") == null) {
                    s = 0;
                } else {
                    s = Integer.parseInt(rs.getString("total_booking"));
                }
            }
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error1");
        }

        int nos = Integer.parseInt(ns);
        if ((s + nos) <= 5) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "dps");

                String sql = "insert into booking values(?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pst = con.prepareStatement(sql);
                mn = movieName.getSelectedItem().toString();
                pst.setString(1, mn);
                pst.setString(2, lang.getText());
                if (gold.isSelected()) {
                    mc = "Gold";
                }
                if (premium.isSelected()) {
                    mc = "Premium";
                }
                if (platinum.isSelected()) {
                    mc = "Platinum";
                }
                pst.setString(3, mc);

                pst.setInt(4, Integer.parseInt(ns));
                SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
                String date = d.format(MovieDate.getDate());
                pst.setString(5, date);
                pst.setString(6, time.getText());
                String snk = "";
                if (pop.isSelected()) {
                    snk += pop.getText() + " ";
                }
                if (drink.isSelected()) {
                    snk += drink.getText() + " ";
                }
                pst.setString(7, snk);
                pst.setDouble(8, total);

                pst.executeUpdate();

                con.close();
                JOptionPane.showMessageDialog(null, "Your Movie  " + mn + "  with   " + mc + " class " + "with  " + ns + "  seats"
                        + " has been booked successfully.\nYour total cost is ="
                        + GetCost() * Integer.parseInt((String) SeatNo.getSelectedItem()) + "\nYour movie date is =" + md
                        + "\nMovie will start at " + time.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "" + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Sorry! Show is full");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void movieNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieNameActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie", "root", "dps");

            String sql = "select time from movie where movie_name=?";
            PreparedStatement pst = con.prepareStatement(sql);
            String name = (String) movieName.getSelectedItem();
            pst.setString(1, name);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                time.setText(rs.getString("time"));
            }

            String sql2 = "select language from movie where movie_name=?";
            PreparedStatement pst2 = con.prepareStatement(sql2);
            String name2 = (String) movieName.getSelectedItem();
            pst2.setString(1, name2);
            ResultSet rs2 = pst2.executeQuery();
            if (rs2.next()) {
                lang.setText(rs2.getString("language"));
            }

            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }//GEN-LAST:event_movieNameActionPerformed

    private void movieNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movieNameMouseClicked

    }//GEN-LAST:event_movieNameMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        gold.setSelected(true);
        fillcombo();
        Date date = new Date();
        MovieDate.setDate(date);
        MovieDate.setMinSelectableDate(new Date());
        setLableText();
        jButton1.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void SeatNoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_SeatNoInputMethodTextChanged

    }//GEN-LAST:event_SeatNoInputMethodTextChanged

    private void SeatNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeatNoActionPerformed
        setLableText();
    }//GEN-LAST:event_SeatNoActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if (jCheckBox3.isSelected()) {
            jButton1.setEnabled(true);
        } else {
            jButton1.setEnabled(false);
        }


    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void premiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premiumActionPerformed
        setLableText();
    }//GEN-LAST:event_premiumActionPerformed

    private void goldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goldActionPerformed
        setLableText();
    }//GEN-LAST:event_goldActionPerformed

    private void platinumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platinumActionPerformed
        setLableText();
    }//GEN-LAST:event_platinumActionPerformed

    private void popActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popActionPerformed
        setLableText();
    }//GEN-LAST:event_popActionPerformed

    private void drinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinkActionPerformed
        setLableText();
    }//GEN-LAST:event_drinkActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        terms terms = new terms();
        terms.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void availActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availActionPerformed
        seatsavailability sa = new seatsavailability();
        sa.setVisible(true);
    }//GEN-LAST:event_availActionPerformed
    public void setLableText() {
        int snacks = 0, total = 0;
        if (pop.isSelected()) {
            snacks = snacks + 150;
        }
        if (drink.isSelected()) {
            snacks = snacks + 50;
        }
        total = snacks + GetCost() * Integer.parseInt((String) SeatNo.getSelectedItem());
        movieCost.setText("Total cost for your " + (String) SeatNo.getSelectedItem()
                + " seats will be " + total);

    }

    public int GetCost() {
        if (gold.isSelected()) {
            return 250;
        } else if (premium.isSelected()) {
            return 450;
        } else //if(movieClass.getSelectedIndex()==2)
        {
            return 550;
        }

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BookMovie().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser MovieDate;
    private javax.swing.JComboBox<String> SeatNo;
    private javax.swing.JButton avail;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox drink;
    private javax.swing.JRadioButton gold;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lang;
    private javax.swing.JLabel movieCost;
    private javax.swing.JComboBox<String> movieName;
    private javax.swing.JRadioButton platinum;
    private javax.swing.JCheckBox pop;
    private javax.swing.JRadioButton premium;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
