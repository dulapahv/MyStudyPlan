package MyStudyPlan;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dulapah Vibulsanti (64011388), Anucha Cheewachanon (64011338),
 * Annopdanai Pamarapa (64011337)
 */
public class Login extends javax.swing.JFrame {

    private final String usernameGuide = "Enter your username...";
    private final String passwdGuide = "Enter your password...";
    private final String confirmPasswdGuide = "Confirm your password...";
    private final String emptyUsername = "Username cannot be empty!";
    private final String emptyPasswd = "Password cannot be empty!";
    private final String passwdNotMatch = "Password does not match!";
    private final String invalidCredential = "Invalid credential!";
    private final String userExist = "Username already exist!";
    private final char passwdChar = '\u2022';

    /**
     * Creates new form MainMenu
     */
    public Login() {
        initComponents();

        getContentPane().requestFocusInWindow(); // disable automatic focus

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirmed = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit MyStudyPlan?",
                        "Exit MyStudyPlan", JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) {
                    dispose();
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LeftPanel = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        Welcome1Txt = new javax.swing.JLabel();
        Welcome2Txt = new javax.swing.JLabel();
        LoginPanel = new javax.swing.JPanel();
        LoginUsernameTxt = new javax.swing.JLabel();
        LoginUsernameTxtField = new javax.swing.JTextField();
        LoginPasswdTxt = new javax.swing.JLabel();
        LoginPasswdTxtField = new javax.swing.JPasswordField();
        LoginBtn = new javax.swing.JButton();
        LoginStatusTxt = new javax.swing.JLabel();
        RegisterPanel = new javax.swing.JPanel();
        RegUsernameTxt = new javax.swing.JLabel();
        RegUsernameTxtField = new javax.swing.JTextField();
        RegPasswdTxt = new javax.swing.JLabel();
        RegPasswdTxtField = new javax.swing.JPasswordField();
        RegConfirmPasswdTxt = new javax.swing.JLabel();
        RegConfirmPasswdTxtField = new javax.swing.JPasswordField();
        RegisterBtn = new javax.swing.JButton();
        RegisterStatusTxt = new javax.swing.JLabel();
        Separator = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("MyStudyPlan");
        setBackground(new java.awt.Color(46, 52, 64));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1108, 632));
        setName("MainMenu"); // NOI18N
        setResizable(false);

        LeftPanel.setBackground(new java.awt.Color(59, 162, 191));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/welcome.png"))); // NOI18N

        Welcome1Txt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 24));
        Welcome1Txt.setForeground(new java.awt.Color(255, 255, 255));
        Welcome1Txt.setText("Welcome to MyStudyPlan");

        Welcome2Txt.setFont(getFont("DINPro-Light.otf", Font.PLAIN, 24));
        Welcome2Txt.setForeground(new java.awt.Color(255, 255, 255));
        Welcome2Txt.setText("Log in to sync your content.");

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Welcome1Txt)
                    .addComponent(icon)
                    .addComponent(Welcome2Txt))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        LeftPanelLayout.setVerticalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(icon)
                .addGap(18, 18, 18)
                .addComponent(Welcome1Txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Welcome2Txt)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        LoginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(), "Login", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, getFont("DINPro-Medium.otf", Font.PLAIN, 24)));

        LoginUsernameTxt.setFont(getFont("DINPro-Light.otf", Font.PLAIN, 14));
        LoginUsernameTxt.setText("Username");

        LoginUsernameTxtField.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        LoginUsernameTxtField.setText(usernameGuide);
        LoginUsernameTxtField.setToolTipText("");
        LoginUsernameTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LoginUsernameTxtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LoginUsernameTxtFieldFocusLost(evt);
            }
        });

        LoginPasswdTxt.setFont(getFont("DINPro-Light.otf", Font.PLAIN, 14));
        LoginPasswdTxt.setText("Password");

        LoginPasswdTxtField.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        LoginPasswdTxtField.setText(passwdGuide);
        LoginPasswdTxtField.setEchoChar((char) 0);
        LoginPasswdTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LoginPasswdTxtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LoginPasswdTxtFieldFocusLost(evt);
            }
        });

        LoginBtn.setBackground(new java.awt.Color(59, 162, 191));
        LoginBtn.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        LoginBtn.setText("Login");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });

        LoginStatusTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        LoginStatusTxt.setForeground(new java.awt.Color(255, 0, 51));
        LoginStatusTxt.setToolTipText("");

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginPasswdTxtField)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LoginUsernameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LoginPasswdTxt, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(LoginUsernameTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addComponent(LoginStatusTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LoginBtn)))
                .addContainerGap())
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginUsernameTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginUsernameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginPasswdTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginPasswdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(LoginStatusTxt)
                    .addComponent(LoginBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RegisterPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(), "Register", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, getFont("DINPro-Medium.otf", Font.PLAIN, 24)));

        RegUsernameTxt.setFont(getFont("DINPro-Light.otf", Font.PLAIN, 14));
        RegUsernameTxt.setText("Username");

        RegUsernameTxtField.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        RegUsernameTxtField.setText(usernameGuide);
        RegUsernameTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RegUsernameTxtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RegUsernameTxtFieldFocusLost(evt);
            }
        });

        RegPasswdTxt.setFont(getFont("DINPro-Light.otf", Font.PLAIN, 14));
        RegPasswdTxt.setText("Password");

        RegPasswdTxtField.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        RegPasswdTxtField.setText(passwdGuide);
        RegPasswdTxtField.setEchoChar((char) 0);
        RegPasswdTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RegPasswdTxtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RegPasswdTxtFieldFocusLost(evt);
            }
        });

        RegConfirmPasswdTxt.setFont(getFont("DINPro-Light.otf", Font.PLAIN, 14));
        RegConfirmPasswdTxt.setText("Confirm Password");

        RegConfirmPasswdTxtField.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        RegConfirmPasswdTxtField.setText(confirmPasswdGuide);
        RegConfirmPasswdTxtField.setEchoChar((char) 0);
        RegConfirmPasswdTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RegConfirmPasswdTxtFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RegConfirmPasswdTxtFieldFocusLost(evt);
            }
        });

        RegisterBtn.setBackground(new java.awt.Color(59, 162, 191));
        RegisterBtn.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        RegisterBtn.setText("Register");
        RegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtnActionPerformed(evt);
            }
        });

        RegisterStatusTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        RegisterStatusTxt.setForeground(new java.awt.Color(255, 0, 51));
        RegisterStatusTxt.setToolTipText("");

        javax.swing.GroupLayout RegisterPanelLayout = new javax.swing.GroupLayout(RegisterPanel);
        RegisterPanel.setLayout(RegisterPanelLayout);
        RegisterPanelLayout.setHorizontalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RegPasswdTxtField)
                    .addGroup(RegisterPanelLayout.createSequentialGroup()
                        .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RegUsernameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegPasswdTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegConfirmPasswdTxt, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(RegUsernameTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterPanelLayout.createSequentialGroup()
                        .addComponent(RegisterStatusTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RegisterBtn))
                    .addComponent(RegConfirmPasswdTxtField))
                .addContainerGap())
        );
        RegisterPanelLayout.setVerticalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegUsernameTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegUsernameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegPasswdTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegPasswdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegConfirmPasswdTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegConfirmPasswdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(RegisterStatusTxt)
                    .addComponent(RegisterBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RegisterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(69, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(Separator)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(RegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
            .addComponent(LeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_LoginBtnActionPerformed
        if (getLoginUsername().isEmpty() || getLoginUsername().equals(usernameGuide)) {
            setLoginStatus(emptyUsername);
        } else if (getLoginPasswd().isEmpty() || getLoginPasswd().equals(passwdGuide)) {
            setLoginStatus(emptyPasswd);
        } else {
            Logger.getLogger(MyStudyPlan.class.getName()).log(java.util.logging.Level.INFO, "Checking credential...");
            if (FirebaseRTDB.isCredentialValid(getLoginUsername(), getLoginPasswd())) {
                FirebaseRTDB.pullDatabase(getLoginUsername());
                MyStudyPlan.parseDatabase();
                MyStudyPlan.showMainPage();
                this.dispose();
            } else {
                setLoginStatus(invalidCredential);
            }
        }
    }// GEN-LAST:event_LoginBtnActionPerformed

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_RegisterBtnActionPerformed
        if (getRegUsername().isEmpty() || getRegUsername().equals(usernameGuide)) {
            setRegStatus(emptyUsername);
        } else if (getRegPasswd().isEmpty() || getRegPasswd().equals(passwdGuide)) {
            setRegStatus(emptyPasswd);
        } else if (!getRegConfirmPasswd().equals(getRegPasswd())) {
            setRegStatus(passwdNotMatch);
        } else {
            Logger.getLogger(MyStudyPlan.class.getName()).log(java.util.logging.Level.INFO, "Creating new user...");
            if (!FirebaseRTDB.isUserExist(getRegUsername())) {
                Database.addCredential(getRegUsername(), getRegPasswd());
                FirebaseRTDB.createNewUser(getRegUsername(), getRegPasswd());
                MyStudyPlan.parseDatabase();
                MyStudyPlan.showMainPage();
                this.dispose();
            } else {
                setRegStatus(userExist);
            }
        }
    }// GEN-LAST:event_RegisterBtnActionPerformed

    private void LoginUsernameTxtFieldFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_LoginUsernameTxtFieldFocusGained
        setLoginStatus("");
        if (getLoginUsername().equals(usernameGuide)) {
            setLoginUsername("");
        }
    }// GEN-LAST:event_LoginUsernameTxtFieldFocusGained

    private void LoginUsernameTxtFieldFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_LoginUsernameTxtFieldFocusLost
        if (getLoginUsername().equals("")) {
            setLoginUsername(usernameGuide);
        }
    }// GEN-LAST:event_LoginUsernameTxtFieldFocusLost

    private void LoginPasswdTxtFieldFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_LoginPasswdTxtFieldFocusGained
        setLoginStatus("");
        if (getLoginPasswd().equals(passwdGuide)) {
            setLoginPasswd("");
            LoginPasswdTxtField.setEchoChar(passwdChar);
        }
    }// GEN-LAST:event_LoginPasswdTxtFieldFocusGained

    private void LoginPasswdTxtFieldFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_LoginPasswdTxtFieldFocusLost
        if (getLoginPasswd().equals("")) {
            setLoginPasswd(passwdGuide);
            LoginPasswdTxtField.setEchoChar((char) 0);
        }
    }// GEN-LAST:event_LoginPasswdTxtFieldFocusLost

    private void RegUsernameTxtFieldFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_RegUsernameTxtFieldFocusGained
        setRegStatus("");
        if (getRegUsername().equals(usernameGuide)) {
            setRegUsername("");
        }
    }// GEN-LAST:event_RegUsernameTxtFieldFocusGained

    private void RegUsernameTxtFieldFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_RegUsernameTxtFieldFocusLost
        if (getRegUsername().equals("")) {
            setRegUsername(usernameGuide);
        }
    }// GEN-LAST:event_RegUsernameTxtFieldFocusLost

    private void RegPasswdTxtFieldFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_RegPasswdTxtFieldFocusGained
        setRegStatus("");
        if (getRegPasswd().equals(passwdGuide)) {
            setRegPasswd("");
            RegPasswdTxtField.setEchoChar(passwdChar);
        }
    }// GEN-LAST:event_RegPasswdTxtFieldFocusGained

    private void RegPasswdTxtFieldFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_RegPasswdTxtFieldFocusLost
        if (getRegPasswd().equals("")) {
            setRegPasswd(passwdGuide);
            RegPasswdTxtField.setEchoChar((char) 0);
        }
    }// GEN-LAST:event_RegPasswdTxtFieldFocusLost

    private void RegConfirmPasswdTxtFieldFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_RegConfirmPasswdTxtFieldFocusGained
        setRegStatus("");
        if (getRegConfirmPasswd().equals(confirmPasswdGuide)) {
            setRegConfirmPasswd("");
            RegConfirmPasswdTxtField.setEchoChar(passwdChar);
        }
    }// GEN-LAST:event_RegConfirmPasswdTxtFieldFocusGained

    private void RegConfirmPasswdTxtFieldFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_RegConfirmPasswdTxtFieldFocusLost
        if (getRegConfirmPasswd().equals("")) {
            setRegConfirmPasswd(confirmPasswdGuide);
            RegConfirmPasswdTxtField.setEchoChar((char) 0);
        }
    }// GEN-LAST:event_RegConfirmPasswdTxtFieldFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JLabel LoginPasswdTxt;
    private javax.swing.JPasswordField LoginPasswdTxtField;
    private javax.swing.JLabel LoginStatusTxt;
    private javax.swing.JLabel LoginUsernameTxt;
    private javax.swing.JTextField LoginUsernameTxtField;
    private javax.swing.JLabel RegConfirmPasswdTxt;
    private javax.swing.JPasswordField RegConfirmPasswdTxtField;
    private javax.swing.JLabel RegPasswdTxt;
    private javax.swing.JPasswordField RegPasswdTxtField;
    private javax.swing.JLabel RegUsernameTxt;
    private javax.swing.JTextField RegUsernameTxtField;
    private javax.swing.JButton RegisterBtn;
    private javax.swing.JPanel RegisterPanel;
    private javax.swing.JLabel RegisterStatusTxt;
    private javax.swing.JSeparator Separator;
    private javax.swing.JLabel Welcome1Txt;
    private javax.swing.JLabel Welcome2Txt;
    private javax.swing.JLabel icon;
    // End of variables declaration//GEN-END:variables

    /**
     * @param fontName
     * @param fontStyle
     * @param fontSize
     * @return Font
     */
    private Font getFont(String fontName, int fontStyle, float fontSize) {
        Font font = null;
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/font/" + fontName))
                    .deriveFont(fontStyle, fontSize);
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return font;
    }

    /**
     * @return JTextField
     */
    public String getLoginUsername() {
        return LoginUsernameTxtField.getText();
    }

    /**
     * @return String
     */
    public String getLoginPasswd() {
        return String.valueOf(LoginPasswdTxtField.getPassword());
    }

    /**
     * @return String
     */
    public String getRegUsername() {
        return RegUsernameTxtField.getText();
    }

    /**
     * @return String
     */
    public String getRegPasswd() {
        return String.valueOf(RegPasswdTxtField.getPassword());
    }

    /**
     * @return String
     */
    public String getRegConfirmPasswd() {
        return String.valueOf(RegConfirmPasswdTxtField.getPassword());
    }

    /**
     * @param string
     */
    public void setLoginPasswd(String string) {
        if (string != null) {
            LoginPasswdTxtField.setText(string);
        }
    }

    /**
     * @param string
     */
    public void setLoginUsername(String string) {
        if (string != null) {
            LoginUsernameTxtField.setText(string);
        }
    }

    /**
     * @param string
     */
    public void setRegConfirmPasswd(String string) {
        if (string != null) {
            RegConfirmPasswdTxtField.setText(string);
        }
    }

    /**
     * @param string
     */
    public void setRegPasswd(String string) {
        if (string != null) {
            RegPasswdTxtField.setText(string);
        }
    }

    /**
     * @param string
     */
    public void setRegUsername(String string) {
        if (string != null) {
            RegUsernameTxtField.setText(string);
        }
    }

    /**
     * @param string
     */
    public void setLoginStatus(String string) {
        if (string != null) {
            LoginStatusTxt.setText(string);
        }
    }

    /**
     * @param string
     */
    public void setRegStatus(String string) {
        if (string != null) {
            RegisterStatusTxt.setText(string);
        }
    }

    // private void checkCredential() {
    //     // TODO add your handling code here:
    // }
}
