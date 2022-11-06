package MyStudyPlan;

import com.formdev.flatlaf.intellijthemes.FlatNordIJTheme;
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
public class Overview extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public Overview() {
        initComponents();

        int time = java.time.LocalTime.now().getHour();
        if (time >= 0 && time < 12) {
            TodayTxt.setText("Good Morning!");
        } else if (time >= 12 && time < 18) {
            TodayTxt.setText("Good Afternoon!");
        } else {
            TodayTxt.setText("Good Evening!");
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

        LeftPanel = new javax.swing.JPanel();
        OverviewBtn = new org.jdesktop.swingx.JXButton();
        CalendarBtn = new org.jdesktop.swingx.JXButton();
        TasksBtn = new org.jdesktop.swingx.JXButton();
        ExamsBtn = new org.jdesktop.swingx.JXButton();
        ScheduleBtn = new org.jdesktop.swingx.JXButton();
        TopPanel = new javax.swing.JPanel();
        TodayTxt = new javax.swing.JLabel();
        DateTxt = new javax.swing.JLabel();
        ScheduleTopTxt = new javax.swing.JLabel();
        ScheduleTopVal = new javax.swing.JLabel();
        TasksTopTxt = new javax.swing.JLabel();
        TasksTopVal = new javax.swing.JLabel();
        ExamsTopTxt = new javax.swing.JLabel();
        ExamsTopVal = new javax.swing.JLabel();
        Separator1 = new javax.swing.JSeparator();
        Separator2 = new javax.swing.JSeparator();
        ScheduleTxt = new javax.swing.JLabel();
        NewClassBtn = new javax.swing.JButton();
        SchedulePane = new javax.swing.JScrollPane();
        ScheduleTable = new javax.swing.JTable();
        TasksTxt = new javax.swing.JLabel();
        NewTaskBtn = new javax.swing.JButton();
        TasksPaneContainer = new org.jdesktop.swingx.JXTaskPaneContainer();
        AssignmentTasksPane = new org.jdesktop.swingx.JXTaskPane();
        ReminderTasksPane = new org.jdesktop.swingx.JXTaskPane();
        RevisionTasksPane = new org.jdesktop.swingx.JXTaskPane();
        ExamsTxt = new javax.swing.JLabel();
        NewExamBtn = new javax.swing.JButton();
        ExamsPane = new javax.swing.JScrollPane();
        ExamsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyStudyPlan");
        setBackground(new java.awt.Color(46, 52, 64));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1108, 632));
        setName("MainMenu"); // NOI18N
        setSize(new java.awt.Dimension(1108, 632));

        LeftPanel.setBackground(new java.awt.Color(30, 33, 41));
        LeftPanel.setFocusable(false);

        OverviewBtn.setBackground(new java.awt.Color(30, 33, 41));
        OverviewBtn.setBorder(null);
        OverviewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/overview.png"))); // NOI18N
        OverviewBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OverviewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OverviewBtnActionPerformed(evt);
            }
        });

        CalendarBtn.setBackground(new java.awt.Color(30, 33, 41));
        CalendarBtn.setBorder(null);
        CalendarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar.png"))); // NOI18N
        CalendarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CalendarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalendarBtnActionPerformed(evt);
            }
        });

        TasksBtn.setBackground(new java.awt.Color(30, 33, 41));
        TasksBtn.setBorder(null);
        TasksBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tasks.png"))); // NOI18N
        TasksBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TasksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TasksBtnActionPerformed(evt);
            }
        });

        ExamsBtn.setBackground(new java.awt.Color(30, 33, 41));
        ExamsBtn.setBorder(null);
        ExamsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exams.png"))); // NOI18N
        ExamsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExamsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamsBtnActionPerformed(evt);
            }
        });

        ScheduleBtn.setBackground(new java.awt.Color(30, 33, 41));
        ScheduleBtn.setBorder(null);
        ScheduleBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/schedule.png"))); // NOI18N
        ScheduleBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ScheduleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScheduleBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OverviewBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CalendarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(TasksBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExamsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScheduleBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        TodayTxt.setText("Good Morning!");

        DateTxt.setFont(getFont("DINPro-Light.otf", Font.PLAIN, 18));
        DateTxt.setText(new java.text.SimpleDateFormat("EEEE, d MMMM yyyy").format(new java.util.Date()));

        ScheduleTopTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 28));
        ScheduleTopTxt.setText("Schedule");

        ScheduleTopVal.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 28));
        ScheduleTopVal.setText("0");

        TasksTopTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 28));
        TasksTopTxt.setText("Tasks");

        TasksTopVal.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 28));
        TasksTopVal.setText("0");

        ExamsTopTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 28));
        ExamsTopTxt.setText("Exams");

        ExamsTopVal.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 28));
        ExamsTopVal.setText("0");

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DateTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(TodayTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ScheduleTopTxt)
                .addGap(18, 18, 18)
                .addComponent(ScheduleTopVal)
                .addGap(60, 60, 60)
                .addComponent(TasksTopTxt)
                .addGap(18, 18, 18)
                .addComponent(TasksTopVal)
                .addGap(60, 60, 60)
                .addComponent(ExamsTopTxt)
                .addGap(18, 18, 18)
                .addComponent(ExamsTopVal)
                .addGap(21, 21, 21))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(TodayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(DateTxt)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ScheduleTopTxt)
                    .addComponent(ScheduleTopVal)
                    .addComponent(TasksTopTxt)
                    .addComponent(TasksTopVal)
                    .addComponent(ExamsTopTxt)
                    .addComponent(ExamsTopVal))
                .addGap(34, 34, 34))
        );

        Separator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        Separator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        ScheduleTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 24));
        ScheduleTxt.setText("Schedule");

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

        ScheduleTable.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        ScheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
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
            ScheduleTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        }

        TasksTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 24));
        TasksTxt.setText("Tasks");

        NewTaskBtn.setBackground(new java.awt.Color(59, 162, 191));
        NewTaskBtn.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 12));
        NewTaskBtn.setText("+ New Task");
        NewTaskBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewTaskBtn.setMargin(new java.awt.Insets(3, 8, 3, 8));
        NewTaskBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewTaskBtnActionPerformed(evt);
            }
        });

        TasksPaneContainer.setBackground(new java.awt.Color(46, 52, 64));
        TasksPaneContainer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        org.jdesktop.swingx.VerticalLayout verticalLayout2 = new org.jdesktop.swingx.VerticalLayout();
        verticalLayout2.setGap(14);
        TasksPaneContainer.setLayout(verticalLayout2);

        AssignmentTasksPane.setBackground(new java.awt.Color(46, 52, 64));
        AssignmentTasksPane.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        AssignmentTasksPane.setSpecial(true);
        AssignmentTasksPane.setTitle("Assignment (0)");
        TasksPaneContainer.add(AssignmentTasksPane);

        ReminderTasksPane.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        ReminderTasksPane.setSpecial(true);
        ReminderTasksPane.setTitle("Reminder (0)");
        TasksPaneContainer.add(ReminderTasksPane);

        RevisionTasksPane.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        RevisionTasksPane.setSpecial(true);
        RevisionTasksPane.setTitle("Revision (0)");
        TasksPaneContainer.add(RevisionTasksPane);

        ExamsTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 24));
        ExamsTxt.setText("Exams");

        NewExamBtn.setBackground(new java.awt.Color(59, 162, 191));
        NewExamBtn.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 12));
        NewExamBtn.setText("+ New Exam");
        NewExamBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewExamBtn.setMargin(new java.awt.Insets(3, 8, 3, 8));
        NewExamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewExamBtnActionPerformed(evt);
            }
        });

        ExamsTable.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        ExamsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ExamsTable.setShowVerticalLines(true);
        ExamsTable.getTableHeader().setReorderingAllowed(false);
        ExamsPane.setViewportView(ExamsTable);
        if (ExamsTable.getColumnModel().getColumnCount() > 0) {
            ExamsTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(LeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ScheduleTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                                .addComponent(NewClassBtn))
                            .addComponent(SchedulePane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(TasksTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                                .addComponent(NewTaskBtn))
                            .addComponent(TasksPaneContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Separator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ExamsTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                                .addComponent(NewExamBtn))
                            .addComponent(ExamsPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Separator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(ScheduleTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                    .addComponent(NewClassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TasksTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                    .addComponent(NewTaskBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ExamsTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                    .addComponent(NewExamBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TasksPaneContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SchedulePane, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                                    .addComponent(ExamsPane)))
                            .addComponent(Separator2)))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ExamsTxt, ScheduleTxt, TasksTxt});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NewClassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewClassBtnActionPerformed
        NewClass newClass = new NewClass();
        newClass.setVisible(true);
        newClass.setLocationRelativeTo(this);
        this.setEnabled(false);
        newClass.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                Overview.this.setEnabled(true);
                Overview.this.requestFocus();
                Overview.this.setExtendedState(Overview.this.getExtendedState() & ~Overview.ICONIFIED);
            }
        });
    }//GEN-LAST:event_NewClassBtnActionPerformed

    private void NewTaskBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewTaskBtnActionPerformed
        NewTask newTask = new NewTask();
        newTask.setVisible(true);
        newTask.setLocationRelativeTo(this);
        this.setEnabled(false);
        newTask.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                Overview.this.setEnabled(true);
                Overview.this.requestFocus();
                Overview.this.setExtendedState(Overview.this.getExtendedState() & ~Overview.ICONIFIED);
            }
        });
    }//GEN-LAST:event_NewTaskBtnActionPerformed

    private void NewExamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewExamBtnActionPerformed
        NewExam newExam = new NewExam();
        newExam.setVisible(true);
        newExam.setLocationRelativeTo(this);
        this.setEnabled(false);
        newExam.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                Overview.this.setEnabled(true);
                Overview.this.requestFocus();
                Overview.this.setExtendedState(Overview.this.getExtendedState() & ~Overview.ICONIFIED);
            }
        });
    }//GEN-LAST:event_NewExamBtnActionPerformed

    private void ScheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScheduleBtnActionPerformed
        Schedule schedule = new Schedule();
        if (this.getExtendedState() == this.MAXIMIZED_BOTH) {
            schedule.setExtendedState(this.MAXIMIZED_BOTH);
        } else {
            schedule.setSize(this.getSize());
            schedule.setLocation(this.getLocation());
        }
        schedule.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ScheduleBtnActionPerformed

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

    private void OverviewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OverviewBtnActionPerformed
        // Do nothing
    }//GEN-LAST:event_OverviewBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the theme */
        FlatNordIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Overview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXTaskPane AssignmentTasksPane;
    private org.jdesktop.swingx.JXButton CalendarBtn;
    private javax.swing.JLabel DateTxt;
    private org.jdesktop.swingx.JXButton ExamsBtn;
    private javax.swing.JScrollPane ExamsPane;
    private javax.swing.JTable ExamsTable;
    private javax.swing.JLabel ExamsTopTxt;
    private javax.swing.JLabel ExamsTopVal;
    private javax.swing.JLabel ExamsTxt;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JButton NewClassBtn;
    private javax.swing.JButton NewExamBtn;
    private javax.swing.JButton NewTaskBtn;
    private org.jdesktop.swingx.JXButton OverviewBtn;
    private org.jdesktop.swingx.JXTaskPane ReminderTasksPane;
    private org.jdesktop.swingx.JXTaskPane RevisionTasksPane;
    private org.jdesktop.swingx.JXButton ScheduleBtn;
    private javax.swing.JScrollPane SchedulePane;
    private javax.swing.JTable ScheduleTable;
    private javax.swing.JLabel ScheduleTopTxt;
    private javax.swing.JLabel ScheduleTopVal;
    private javax.swing.JLabel ScheduleTxt;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator2;
    private org.jdesktop.swingx.JXButton TasksBtn;
    private org.jdesktop.swingx.JXTaskPaneContainer TasksPaneContainer;
    private javax.swing.JLabel TasksTopTxt;
    private javax.swing.JLabel TasksTopVal;
    private javax.swing.JLabel TasksTxt;
    private javax.swing.JLabel TodayTxt;
    private javax.swing.JPanel TopPanel;
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
            Logger.getLogger(Overview.class.getName()).log(Level.SEVERE, null, ex);
        }
        return font;
    }
}
