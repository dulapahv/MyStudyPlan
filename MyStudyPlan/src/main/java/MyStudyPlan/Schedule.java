/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MyStudyPlan;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dulapah Vibulsanti (64011388), Anucha Cheewachanon (64011338),
 * Annopdanai Pamarapa (64011337)
 */
public class Schedule extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public Schedule() {
        initComponents();

        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        OverviewBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CalendarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TasksBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExamsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ScheduleBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LeftPanel = new javax.swing.JPanel();
        OverviewBtn = new org.jdesktop.swingx.JXButton();
        CalendarBtn = new org.jdesktop.swingx.JXButton();
        TasksBtn = new org.jdesktop.swingx.JXButton();
        ExamsBtn = new org.jdesktop.swingx.JXButton();
        ScheduleBtn = new org.jdesktop.swingx.JXButton();
        TopPanel = new javax.swing.JPanel();
        TodayTxt = new javax.swing.JLabel();
        SearchPane = new org.jdesktop.swingx.JXSearchPanel();
        SearchBtn = new javax.swing.JButton();
        ManageSubjectsBtn = new javax.swing.JButton();
        NewClassBtn = new javax.swing.JButton();
        SchedulePane = new javax.swing.JScrollPane();
        ScheduleTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyStudyPlan");
        setBackground(new java.awt.Color(46, 52, 64));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1108, 632));
        setName("MainMenu"); // NOI18N

        LeftPanel.setBackground(new java.awt.Color(30, 33, 41));
        LeftPanel.setFocusable(false);

        OverviewBtn.setBackground(new java.awt.Color(30, 33, 41));
        OverviewBtn.setBorder(null);
        OverviewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/overview.png"))); // NOI18N
        OverviewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OverviewBtnActionPerformed(evt);
            }
        });

        CalendarBtn.setBackground(new java.awt.Color(30, 33, 41));
        CalendarBtn.setBorder(null);
        CalendarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar.png"))); // NOI18N
        CalendarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalendarBtnActionPerformed(evt);
            }
        });

        TasksBtn.setBackground(new java.awt.Color(30, 33, 41));
        TasksBtn.setBorder(null);
        TasksBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tasks.png"))); // NOI18N
        TasksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TasksBtnActionPerformed(evt);
            }
        });

        ExamsBtn.setBackground(new java.awt.Color(30, 33, 41));
        ExamsBtn.setBorder(null);
        ExamsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exams.png"))); // NOI18N
        ExamsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamsBtnActionPerformed(evt);
            }
        });

        ScheduleBtn.setBackground(new java.awt.Color(30, 33, 41));
        ScheduleBtn.setBorder(null);
        ScheduleBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/schedule.png"))); // NOI18N
        ScheduleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScheduleBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OverviewBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(CalendarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TasksBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExamsBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScheduleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        LeftPanelLayout.setVerticalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(OverviewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CalendarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TasksBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ExamsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ScheduleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        TopPanel.setBackground(new java.awt.Color(59, 162, 191));

        TodayTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 32));
        TodayTxt.setText("Schedule");

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(TodayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(782, Short.MAX_VALUE))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(TodayTxt)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        SearchPane.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 12));

        SearchBtn.setBackground(new java.awt.Color(86, 96, 118));
        SearchBtn.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 12));
        SearchBtn.setText("Search");
        SearchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SearchBtn.setMargin(new java.awt.Insets(3, 8, 3, 8));

        ManageSubjectsBtn.setBackground(new java.awt.Color(59, 162, 191));
        ManageSubjectsBtn.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 12));
        ManageSubjectsBtn.setText("Manage Subjects");
        ManageSubjectsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageSubjectsBtn.setMargin(new java.awt.Insets(3, 8, 3, 8));
        ManageSubjectsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageSubjectsBtnActionPerformed(evt);
            }
        });

        NewClassBtn.setBackground(new java.awt.Color(59, 162, 191));
        NewClassBtn.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 12));
        NewClassBtn.setText("+ New Class");
        NewClassBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewClassBtn.setMargin(new java.awt.Insets(3, 8, 3, 8));
        NewClassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewClassBtnActionPerformed(evt);
            }
        });

        ScheduleTable.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 12));
        ScheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Time", "Subjects"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScheduleTable.setPreferredSize(new java.awt.Dimension(325, 80));
        ScheduleTable.setShowVerticalLines(true);
        ScheduleTable.getTableHeader().setReorderingAllowed(false);
        SchedulePane.setViewportView(ScheduleTable);
        if (ScheduleTable.getColumnModel().getColumnCount() > 0) {
            ScheduleTable.getColumnModel().getColumn(1).setPreferredWidth(600);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(SearchPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NewClassBtn)
                                .addGap(18, 18, 18)
                                .addComponent(ManageSubjectsBtn))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SchedulePane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(SearchPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ManageSubjectsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SchedulePane, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewClassBtnActionPerformed
        NewClass newClass = new NewClass();
        newClass.setVisible(true);
        newClass.setLocationRelativeTo(this);
        this.setEnabled(false);
        newClass.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                Schedule.this.setEnabled(true);
                Schedule.this.requestFocus();
                Schedule.this.setExtendedState(Schedule.this.getExtendedState() & ~Schedule.ICONIFIED);
            }
        });
    }//GEN-LAST:event_NewClassBtnActionPerformed

    private void ManageSubjectsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageSubjectsBtnActionPerformed
        ManageSubjects manageSubjects = new ManageSubjects();
        manageSubjects.setVisible(true);
        manageSubjects.setLocationRelativeTo(this);
        this.setEnabled(false);
        manageSubjects.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                Schedule.this.setEnabled(true);
                Schedule.this.requestFocus();
                Schedule.this.setExtendedState(Schedule.this.getExtendedState() & ~Schedule.ICONIFIED);
            }
        });
    }//GEN-LAST:event_ManageSubjectsBtnActionPerformed

    private void OverviewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OverviewBtnActionPerformed
        Overview overview = new Overview();
        if (this.getExtendedState() == this.MAXIMIZED_BOTH) {
            overview.setExtendedState(this.MAXIMIZED_BOTH);
        } else {
            overview.setSize(this.getSize());
            overview.setLocation(this.getLocation());
        }
        overview.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_OverviewBtnActionPerformed

    private void CalendarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalendarBtnActionPerformed
        Calendar calendar = new Calendar();
        if (this.getExtendedState() == this.MAXIMIZED_BOTH) {
            calendar.setExtendedState(this.MAXIMIZED_BOTH);
        } else {
            calendar.setSize(this.getSize());
            calendar.setLocation(this.getLocation());
        }
        calendar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CalendarBtnActionPerformed

    private void TasksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TasksBtnActionPerformed
        Tasks tasks = new Tasks();
        if (this.getExtendedState() == this.MAXIMIZED_BOTH) {
            tasks.setExtendedState(this.MAXIMIZED_BOTH);
        } else {
            tasks.setSize(this.getSize());
            tasks.setLocation(this.getLocation());
        }
        tasks.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_TasksBtnActionPerformed

    private void ExamsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamsBtnActionPerformed
        Exams exams = new Exams();
        if (this.getExtendedState() == this.MAXIMIZED_BOTH) {
            exams.setExtendedState(this.MAXIMIZED_BOTH);
        } else {
            exams.setSize(this.getSize());
            exams.setLocation(this.getLocation());
        }
        exams.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ExamsBtnActionPerformed

    private void ScheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScheduleBtnActionPerformed
        // Do nothing
    }//GEN-LAST:event_ScheduleBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton CalendarBtn;
    private org.jdesktop.swingx.JXButton ExamsBtn;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JButton ManageSubjectsBtn;
    private javax.swing.JButton NewClassBtn;
    private org.jdesktop.swingx.JXButton OverviewBtn;
    private org.jdesktop.swingx.JXButton ScheduleBtn;
    private javax.swing.JScrollPane SchedulePane;
    private javax.swing.JTable ScheduleTable;
    private javax.swing.JButton SearchBtn;
    private org.jdesktop.swingx.JXSearchPanel SearchPane;
    private org.jdesktop.swingx.JXButton TasksBtn;
    private javax.swing.JLabel TodayTxt;
    private javax.swing.JPanel TopPanel;
    // End of variables declaration//GEN-END:variables

    private Font getFont(String fontName, int fontStyle, float fontSize) {
        Font font = null;
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/font/" + fontName)).deriveFont(fontStyle, fontSize);
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(Overview.class.getName()).log(Level.SEVERE, null, ex);
        }
        return font;
    }
}
