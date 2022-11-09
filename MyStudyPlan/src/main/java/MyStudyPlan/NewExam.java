package MyStudyPlan;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dulapah Vibulsanti (64011388), Anucha Cheewachanon (64011338),
 * Annopdanai Pamarapa (64011337)
 */
public class NewExam extends javax.swing.JFrame {

    /**
     * Creates new form NewTask
     */
    public NewExam() {
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

        TopBanner = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SubjectTxt = new javax.swing.JLabel();
        SubjectComboBox = new javax.swing.JComboBox<>();
        SubjectAddBtn = new javax.swing.JButton();
        DateTxt = new javax.swing.JLabel();
        DatePicker = new org.jdesktop.swingx.JXDatePicker();
        BuildingRoomTxt = new javax.swing.JLabel();
        BuildingRoomTxtField = new javax.swing.JTextField();
        SeatTxt = new javax.swing.JLabel();
        SeatTxtField = new javax.swing.JTextField();
        TimeTxt = new javax.swing.JLabel();
        HourSpinner = new javax.swing.JSpinner();
        MinuteSpinner = new javax.swing.JSpinner();
        AMPMComboBox = new javax.swing.JComboBox<>();
        DurationTxt = new javax.swing.JLabel();
        DurationSpinner = new javax.swing.JSpinner();
        DurationInfoTxt = new javax.swing.JLabel();
        DetailTxt = new javax.swing.JLabel();
        DetailScrollPane = new javax.swing.JScrollPane();
        DetailTxtArea = new javax.swing.JTextArea();
        CancelBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Exam");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setResizable(false);

        TopBanner.setBackground(new java.awt.Color(59, 162, 191));

        jLabel1.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 24));
        jLabel1.setText("New Exam");

        javax.swing.GroupLayout TopBannerLayout = new javax.swing.GroupLayout(TopBanner);
        TopBanner.setLayout(TopBannerLayout);
        TopBannerLayout.setHorizontalGroup(
            TopBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopBannerLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TopBannerLayout.setVerticalGroup(
            TopBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopBannerLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
        );

        SubjectTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        SubjectTxt.setText("Subject");

        SubjectComboBox.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        SubjectComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        SubjectAddBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SubjectAddBtn.setText("+");
        SubjectAddBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubjectAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubjectAddBtnActionPerformed(evt);
            }
        });

        DateTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        DateTxt.setText("Date");

        DatePicker.setDate(new java.util.Date());
        DatePicker.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        DatePicker.setFormats("dd/MM/yyyy");
        DatePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatePickerActionPerformed(evt);
            }
        });

        BuildingRoomTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        BuildingRoomTxt.setText("Building/Room");

        BuildingRoomTxtField.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));

        SeatTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        SeatTxt.setText("Seat");

        SeatTxtField.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));

        TimeTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        TimeTxt.setText("Time");

        HourSpinner.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        HourSpinner.setModel(new javax.swing.SpinnerNumberModel(9, 1, 12, 1));
        HourSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                HourSpinnerStateChanged(evt);
            }
        });

        MinuteSpinner.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        MinuteSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 5));
        MinuteSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MinuteSpinnerStateChanged(evt);
            }
        });

        AMPMComboBox.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        AMPMComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        AMPMComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                AMPMComboBoxPropertyChange(evt);
            }
        });
        AMPMComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateDurationInfo();
            }
        });

        DurationTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        DurationTxt.setText("Duration");

        DurationSpinner.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        DurationSpinner.setModel(new javax.swing.SpinnerNumberModel(5, 5, 720, 5));
        DurationSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DurationSpinnerStateChanged(evt);
            }
        });

        DurationInfoTxt.setFont(getFont("DINPro-Light.otf", Font.PLAIN, 16));
        DurationInfoTxt.setText("minutes (ending at unknown)");
        setDurationInfo(LocalDateTime.of(getEndDate(), getEndTime()));

        DetailTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 18));
        DetailTxt.setText("Detail");

        DetailTxtArea.setColumns(20);
        DetailTxtArea.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        DetailTxtArea.setRows(5);
        DetailScrollPane.setViewportView(DetailTxtArea);

        CancelBtn.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        CancelBtn.setText("Cancel");
        CancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        SaveBtn.setBackground(new java.awt.Color(59, 162, 191));
        SaveBtn.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        SaveBtn.setText("Save");
        SaveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TopBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SubjectTxt)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(DetailTxt)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(DetailScrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(DatePicker, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(DateTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(TimeTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(HourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(MinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(AMPMComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(BuildingRoomTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(BuildingRoomTxt))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(SeatTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(SeatTxt)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(DurationTxt)
                                                .addComponent(DurationSpinner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(DurationInfoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(468, 468, 468)
                                    .addComponent(CancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(SaveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(SubjectComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(SubjectAddBtn)))
                            .addGap(38, 38, 38)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TopBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SubjectTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(SubjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubjectAddBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(SeatTxt)
                    .addComponent(BuildingRoomTxt)
                    .addComponent(DateTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(DatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuildingRoomTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SeatTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(DurationTxt)
                    .addComponent(TimeTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(DurationInfoTxt)
                    .addComponent(DurationSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AMPMComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MinuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DetailTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DetailScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(SaveBtn)
                    .addComponent(CancelBtn))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubjectAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubjectAddBtnActionPerformed
        ManageSubjects manageSubjects = new ManageSubjects();
        manageSubjects.setVisible(true);
        manageSubjects.setLocationRelativeTo(this);
        this.setEnabled(false);
        manageSubjects.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                NewExam.this.setEnabled(true);
                NewExam.this.requestFocus();
                NewExam.this.setExtendedState(NewExam.this.getExtendedState() & ~NewExam.ICONIFIED);
            }
        });
    }//GEN-LAST:event_SubjectAddBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void DurationSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DurationSpinnerStateChanged
        updateDurationInfo();
    }//GEN-LAST:event_DurationSpinnerStateChanged

    private void HourSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_HourSpinnerStateChanged
        updateDurationInfo();
    }//GEN-LAST:event_HourSpinnerStateChanged

    private void MinuteSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MinuteSpinnerStateChanged
        updateDurationInfo();
    }//GEN-LAST:event_MinuteSpinnerStateChanged

    private void AMPMComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_AMPMComboBoxPropertyChange
        updateDurationInfo();
    }//GEN-LAST:event_AMPMComboBoxPropertyChange

    private void DatePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatePickerActionPerformed
        updateDurationInfo();
    }//GEN-LAST:event_DatePickerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AMPMComboBox;
    private javax.swing.JLabel BuildingRoomTxt;
    private javax.swing.JTextField BuildingRoomTxtField;
    private javax.swing.JButton CancelBtn;
    private org.jdesktop.swingx.JXDatePicker DatePicker;
    private javax.swing.JLabel DateTxt;
    private javax.swing.JScrollPane DetailScrollPane;
    private javax.swing.JLabel DetailTxt;
    private javax.swing.JTextArea DetailTxtArea;
    private javax.swing.JLabel DurationInfoTxt;
    private javax.swing.JSpinner DurationSpinner;
    private javax.swing.JLabel DurationTxt;
    private javax.swing.JSpinner HourSpinner;
    private javax.swing.JSpinner MinuteSpinner;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JLabel SeatTxt;
    private javax.swing.JTextField SeatTxtField;
    private javax.swing.JButton SubjectAddBtn;
    private javax.swing.JComboBox<String> SubjectComboBox;
    private javax.swing.JLabel SubjectTxt;
    private javax.swing.JLabel TimeTxt;
    private javax.swing.JPanel TopBanner;
    private javax.swing.JLabel jLabel1;
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
            font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/font/" + fontName)).deriveFont(fontStyle, fontSize);
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(NewExam.class.getName()).log(Level.SEVERE, null, ex);
        }
        return font;
    }

    /**
     * @return String
     */
    public String getAMPM() {
        return AMPMComboBox.getSelectedItem().toString();
    }

    /**
     * @return String
     */
    public String getBuildingRoom() {
        return BuildingRoomTxtField.getText();
    }

    /**
     * @return String
     */
    public String getDetail() {
        return DetailTxtArea.getText();
    }

    /**
     * @return int
     */
    public int getDuration() {
        return (int) DurationSpinner.getValue();
    }

    /**
     * @return int
     */
    public int getHour() {
        return (int) HourSpinner.getValue();
    }

    /**
     * @return int
     */
    public int getMinute() {
        return (int) MinuteSpinner.getValue();
    }

    /**
     * @return String
     */
    public String getSeat() {
        return SeatTxtField.getText();
    }

    /**
     * @return Subject
     */
    public Subject getSubject() {
        return (Subject) SubjectComboBox.getSelectedItem();
    }

    /**
     * @return LocalTime
     */
    public LocalTime getStartTime() {
        if (getAMPM().equals("PM")) {
            if (getHour() + 12 == 24) {
                return LocalTime.of(0, getMinute());
            } else {
                return LocalTime.of(getHour() + 12, getMinute());
            }
        } else {
            return LocalTime.of(getHour(), getMinute());
        }
    }

    /**
     * @return LocalTime
     */
    public LocalTime getEndTime() {
        return getStartTime().plusMinutes(getDuration());
    }

    /**
     * @return LocalDate
     */
    public LocalDate getStartDate() {
        try {
            return DatePicker.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * @return LocalDate
     */
    public LocalDate getEndDate() {
        if (getHour() + ((getMinute() + getDuration()) / 60) >= 12 && getAMPM().equals("PM")) {
            return getStartDate().plusDays(1);
        }
        return getStartDate();
    }

    public void setDurationInfo(LocalDateTime date) {
        DurationInfoTxt.setText("minutes (ending at " + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a")) + ")");
    }

    private void updateDurationInfo() {
        if (getEndDate() != null) {
            setDurationInfo(LocalDateTime.of(getEndDate(), getEndTime()));
        }
    }

    /**
     * @return ExamInstance
     */
    public ExamInstance getExamInstance() {
        try {
            return new ExamInstance(getSubject(), getStartDate(), getStartTime(), getBuildingRoom(), getSeat(), getDuration(), getDetail());
        } catch (Exception e) {
            return null;
        }
    }
}
