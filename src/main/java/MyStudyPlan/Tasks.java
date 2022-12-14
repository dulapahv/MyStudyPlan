package MyStudyPlan;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author Dulapah Vibulsanti (64011388), Anucha Cheewachanon (64011338),
 * Annopdanai Pamarapa (64011337)
 */
public class Tasks extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public Tasks() {
        initComponents();

        updateTaskPane();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirmed = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?",
                        "Exit", JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) {
                    Logger.getLogger(Tasks.class.getName()).log(java.util.logging.Level.INFO, "Exiting...");
                    System.exit(0);
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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LeftPanel = new javax.swing.JPanel();
        OverviewBtn = new org.jdesktop.swingx.JXButton();
        CalendarBtn = new org.jdesktop.swingx.JXButton();
        TasksBtn = new org.jdesktop.swingx.JXButton();
        ExamsBtn = new org.jdesktop.swingx.JXButton();
        ScheduleBtn = new org.jdesktop.swingx.JXButton();
        LogoutBtn = new org.jdesktop.swingx.JXButton();
        TopPanel = new javax.swing.JPanel();
        TodayTxt = new javax.swing.JLabel();
        SearchPanel = new org.jdesktop.swingx.JXSearchPanel();
        SearchBtn = new javax.swing.JButton();
        NewTasksBtn = new javax.swing.JButton();
        TaskScrollPane = new javax.swing.JScrollPane();
        TasksPaneContainer = new org.jdesktop.swingx.JXTaskPaneContainer();
        AssignmentTaskPane = new org.jdesktop.swingx.JXTaskPane();
        ReminderTaskPane = new org.jdesktop.swingx.JXTaskPane();
        RevisionTaskPane = new org.jdesktop.swingx.JXTaskPane();
        ClearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("MyStudyPlan");
        setBackground(new java.awt.Color(46, 52, 64));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1108, 632));
        setName("MainMenu"); // NOI18N

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

        LogoutBtn.setBackground(new java.awt.Color(30, 33, 41));
        LogoutBtn.setBorder(null);
        LogoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        ScheduleBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
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
                    .addComponent(ScheduleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LogoutBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        TopPanel.setBackground(new java.awt.Color(59, 162, 191));

        TodayTxt.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 32));
        TodayTxt.setText("Tasks");

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(TodayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(776, Short.MAX_VALUE))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(TodayTxt)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        SearchPanel.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 12));

        SearchBtn.setBackground(new java.awt.Color(86, 96, 118));
        SearchBtn.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 12));
        SearchBtn.setText("Search");
        SearchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SearchBtn.setMargin(new java.awt.Insets(3, 8, 3, 8));
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        NewTasksBtn.setBackground(new java.awt.Color(59, 162, 191));
        NewTasksBtn.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 12));
        NewTasksBtn.setText("+ New Task");
        NewTasksBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewTasksBtn.setMargin(new java.awt.Insets(3, 8, 3, 8));
        NewTasksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewTasksBtnActionPerformed(evt);
            }
        });

        TaskScrollPane.setBorder(null);
        TaskScrollPane.getVerticalScrollBar().setUnitIncrement(12);
        TaskScrollPane.getHorizontalScrollBar().setUnitIncrement(12);

        TasksPaneContainer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        org.jdesktop.swingx.VerticalLayout verticalLayout1 = new org.jdesktop.swingx.VerticalLayout();
        verticalLayout1.setGap(14);
        TasksPaneContainer.setLayout(verticalLayout1);

        AssignmentTaskPane.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        AssignmentTaskPane.setSpecial(true);
        AssignmentTaskPane.setTitle("Assignment (0)");
        TasksPaneContainer.add(AssignmentTaskPane);

        ReminderTaskPane.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        ReminderTaskPane.setSpecial(true);
        ReminderTaskPane.setTitle("Reminder (0)");
        TasksPaneContainer.add(ReminderTaskPane);

        RevisionTaskPane.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 14));
        RevisionTaskPane.setSpecial(true);
        RevisionTaskPane.setTitle("Revision (0)");
        TasksPaneContainer.add(RevisionTaskPane);

        TaskScrollPane.setViewportView(TasksPaneContainer);

        ClearBtn.setBackground(new java.awt.Color(86, 96, 118));
        ClearBtn.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 12));
        ClearBtn.setText("Clear");
        ClearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ClearBtn.setMargin(new java.awt.Insets(3, 8, 3, 8));
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(LeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TaskScrollPane)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SearchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ClearBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 384, Short.MAX_VALUE)
                                .addComponent(NewTasksBtn)))
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
                            .addComponent(SearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewTasksBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TaskScrollPane))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            Database.logout();
            MyStudyPlan.showLoginPage();
            this.dispose();
        }
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SearchBtnActionPerformed
        Pattern pattern = SearchPanel.getPattern();
        if (pattern == null) {
            return;
        }
        AssignmentTaskPane.removeAll();
        ReminderTaskPane.removeAll();
        RevisionTaskPane.removeAll();

        int numAssignment = 0;
        int numReminder = 0;
        int numRevision = 0;

        for (TaskInstance taskInstance : Database.getTaskList()) {
            if (pattern.matcher(taskInstance.getSubject().getName()).find()) {
                JButton label = createLabel(taskInstance);
                switch (taskInstance.getType()) {
                    case Assignment:
                        AssignmentTaskPane.add(label);
                        numAssignment++;
                        break;
                    case Reminder:
                        ReminderTaskPane.add(label);
                        numReminder++;
                        break;
                    case Revision:
                        RevisionTaskPane.add(label);
                        numRevision++;
                        break;
                }
            }
        }
        AssignmentTaskPane.setTitle("Assignment (" + numAssignment + ")");
        ReminderTaskPane.setTitle("Reminder (" + numReminder + ")");
        RevisionTaskPane.setTitle("Revision (" + numRevision + ")");
        AssignmentTaskPane.revalidate();
    }// GEN-LAST:event_SearchBtnActionPerformed

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ClearBtnActionPerformed
        updateTaskPane();
    }// GEN-LAST:event_ClearBtnActionPerformed

    private void NewTasksBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_NewTasksBtnActionPerformed
        NewTask newTask = new NewTask();
        newTask.setVisible(true);
        newTask.setLocationRelativeTo(this);
        this.setEnabled(false);
        newTask.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                Tasks.this.setEnabled(true);
                Tasks.this.requestFocus();
                Tasks.this.setExtendedState(Tasks.this.getExtendedState() & ~Tasks.ICONIFIED);
                updateTaskPane();
            }
        });
    }// GEN-LAST:event_NewTasksBtnActionPerformed

    private void OverviewBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_OverviewBtnActionPerformed
        Overview overview = new Overview();
        if (this.getExtendedState() == Tasks.MAXIMIZED_BOTH) {
            overview.setExtendedState(Tasks.MAXIMIZED_BOTH);
        } else {
            overview.setSize(this.getSize());
            overview.setLocation(this.getLocation());
        }
        overview.setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_OverviewBtnActionPerformed

    private void CalendarBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CalendarBtnActionPerformed
        Calendar calendar = new Calendar();
        if (this.getExtendedState() == Tasks.MAXIMIZED_BOTH) {
            calendar.setExtendedState(Tasks.MAXIMIZED_BOTH);
        } else {
            calendar.setSize(this.getSize());
            calendar.setLocation(this.getLocation());
        }
        calendar.setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_CalendarBtnActionPerformed

    private void TasksBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TasksBtnActionPerformed
        // Do nothing
    }// GEN-LAST:event_TasksBtnActionPerformed

    private void ExamsBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ExamsBtnActionPerformed
        Exams exams = new Exams();
        if (this.getExtendedState() == Tasks.MAXIMIZED_BOTH) {
            exams.setExtendedState(Tasks.MAXIMIZED_BOTH);
        } else {
            exams.setSize(this.getSize());
            exams.setLocation(this.getLocation());
        }
        exams.setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_ExamsBtnActionPerformed

    private void ScheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ScheduleBtnActionPerformed
        Schedule schedule = new Schedule();
        if (this.getExtendedState() == Tasks.MAXIMIZED_BOTH) {
            schedule.setExtendedState(Tasks.MAXIMIZED_BOTH);
        } else {
            schedule.setSize(this.getSize());
            schedule.setLocation(this.getLocation());
        }
        schedule.setVisible(true);
        this.setVisible(false);
    }// GEN-LAST:event_ScheduleBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXTaskPane AssignmentTaskPane;
    private org.jdesktop.swingx.JXButton CalendarBtn;
    private javax.swing.JButton ClearBtn;
    private org.jdesktop.swingx.JXButton ExamsBtn;
    private javax.swing.JPanel LeftPanel;
    private org.jdesktop.swingx.JXButton LogoutBtn;
    private javax.swing.JButton NewTasksBtn;
    private org.jdesktop.swingx.JXButton OverviewBtn;
    private org.jdesktop.swingx.JXTaskPane ReminderTaskPane;
    private org.jdesktop.swingx.JXTaskPane RevisionTaskPane;
    private org.jdesktop.swingx.JXButton ScheduleBtn;
    private javax.swing.JButton SearchBtn;
    private org.jdesktop.swingx.JXSearchPanel SearchPanel;
    private javax.swing.JScrollPane TaskScrollPane;
    private org.jdesktop.swingx.JXButton TasksBtn;
    private org.jdesktop.swingx.JXTaskPaneContainer TasksPaneContainer;
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
            font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/font/" + fontName))
                    .deriveFont(fontStyle, fontSize);
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(Tasks.class.getName()).log(Level.SEVERE, null, ex);
        }
        return font;
    }

    /**
     * @return Pattern
     */
    public Pattern getSearchPanel() {
        return SearchPanel.getPattern();
    }

    private void updateTaskPane() {
        AssignmentTaskPane.removeAll();
        ReminderTaskPane.removeAll();
        RevisionTaskPane.removeAll();

        int numAssignment = 0;
        int numReminder = 0;
        int numRevision = 0;

        Collections.sort(Database.getTaskList(), new Comparator<TaskInstance>() {
            @Override
            public int compare(TaskInstance o1, TaskInstance o2) {
                return o1.getDueDate().compareTo(o2.getDueDate());
            }
        });

        for (TaskInstance taskInstance : Database.getTaskList()) {
            JButton label = createLabel(taskInstance);
            switch (taskInstance.getType()) {
                case Assignment:
                    AssignmentTaskPane.add(label);
                    numAssignment++;
                    break;
                case Reminder:
                    ReminderTaskPane.add(label);
                    numReminder++;
                    break;
                case Revision:
                    RevisionTaskPane.add(label);
                    numRevision++;
                    break;
            }
        }
        AssignmentTaskPane.setTitle("Assignment (" + numAssignment + ")");
        ReminderTaskPane.setTitle("Reminder (" + numReminder + ")");
        RevisionTaskPane.setTitle("Revision (" + numRevision + ")");
    }

    /**
     * @param taskInstance
     * @return JButton
     */
    private JButton createLabel(TaskInstance taskInstance) {
        String string = "Subject: " + taskInstance.getSubject().getCode() + " "
                + taskInstance.getSubject().getName() + "\nName: " + taskInstance.getTitle() + "\nDue date: "
                + taskInstance.getDueDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\nDescription: "
                + taskInstance.getDescription();
        JButton label = new JButton("<html>" + string.replaceAll("\\n", "<br>") + "</html>");
        label.setBackground(taskInstance.getSubject().getColor());
        label.setHorizontalAlignment(SwingConstants.LEFT);
        label.setFont(getFont("DINPro-Medium.otf", Font.PLAIN, 16));
        label.setCursor(new Cursor(Cursor.HAND_CURSOR));
        label.setForeground(new Color(255 - taskInstance.getSubject().getColor().getRed(),
                255 - taskInstance.getSubject().getColor().getGreen(),
                255 - taskInstance.getSubject().getColor().getBlue()));
        label.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewTask viewTask = new ViewTask(taskInstance);
                viewTask.setLocationRelativeTo(Tasks.this);
                viewTask.setVisible(true);
                Tasks.this.setEnabled(false);
                viewTask.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosed(WindowEvent e) {
                        Tasks.this.setEnabled(true);
                        Tasks.this.requestFocus();
                        Tasks.this.setExtendedState(Tasks.this.getExtendedState() & ~Tasks.ICONIFIED);
                        updateTaskPane();
                    }
                });
            }
        });
        return label;
    }
}
