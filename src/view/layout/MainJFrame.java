package view.layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import util.Util;
import view.EmployeeManagement.EditEmployee;
import view.EmployeeManagement.EditSingleEmployee;
import view.EmployeeManagement.LeaveManagement;
import view.EmployeeManagement.UserRegistration;
import view.PatientManagement.ChanelDoctor;
import view.PatientManagement.PatientManaging;
import view.layout.stockManagement.AddDrugItem;
import view.layout.stockManagement.DrugList;
import view.layout.stockManagement.OrderManage;

/**
 *
 * @author EnTeRs
 */
public class MainJFrame extends JFrame {

    private static MainJFrame self;

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int ScreenW = (int) screenSize.getWidth();
    int ScreenH = (int) screenSize.getHeight();
    double screenW_ratio = ScreenW / 1920.0;
    double screenH_ratio = ScreenH / 1080.0;

    int menuBtnWidth = 140;
    int menuBtnHeight = 140;

    public MainJFrame() {
        self = this;
    }

    public static MainJFrame getInstance() {
        if (self == null) {
            self = new MainJFrame();
        }

        return self;
    }

    /**
     * Create Main Menu Item JPanel
     *
     * @param btnWidth menu item button width
     * @param btnHeight menu item button height
     * @return JPanel
     */
    private JPanel createMenuItemPanel(int btnWidth, int btnHeight) {
        JPanel Panelmenu = new JPanel();
        Panelmenu.setPreferredSize(new Dimension((int) (screenW_ratio * btnWidth), (int) (screenH_ratio * btnHeight)));
        Panelmenu.setOpaque(false);
        return Panelmenu;
    }

    /**
     * Create Main Menu Item JButton
     *
     * @param imgName menu item image path
     * @param btnWidth menu item button width
     * @param btnHeight menu item button height
     * @return JButton
     */
    private JButton createMenuItemButton(String imgName, int btnWidth, int btnHeight) {
        JButton menu_btn = new JButton();
        Image M_reseized_img1 = util.Util.getIcon(getClass(), imgName).getImage()
                .getScaledInstance((int) (screenW_ratio * btnWidth), (int) (screenH_ratio * btnHeight), java.awt.Image.SCALE_SMOOTH);
        ImageIcon Menu_reseize_ImgIcon1 = new ImageIcon(M_reseized_img1);
        menu_btn.setIcon(Menu_reseize_ImgIcon1);
        menu_btn.setPreferredSize(new Dimension((int) (screenW_ratio * btnWidth), (int) (screenH_ratio * btnHeight)));
        return menu_btn;
    }

    /**
     * Create Sub Menu Backdrop JPanel
     *
     * @param xPos X position
     * @param yPos Y position
     * @param backWidth panel backdrop width
     * @param backHeight panel backdrop height
     * @return JPanel
     */
    private JPanel createSubMenuBackdrop(int xPos, int yPos, int backWidth, int backHeight) {
        JPanel menu_btn_back = new JPanel();
        menu_btn_back.setBounds((int) (screenW_ratio * xPos), (int) (screenH_ratio * yPos), (int) (screenW_ratio * backWidth), (int) (screenH_ratio * backHeight));
        menu_btn_back.setOpaque(false);
        menu_btn_back.setVisible(false);
        return menu_btn_back;
    }

    /**
     * Create Sub Menu Button
     *
     * @param xPos X position
     * @param yPos Y position
     * @param backWidth button width
     * @param backHeight button height
     * @return JButton
     */
    private JButton createSubMenuItem(String BtnName, int xPos, int yPos, int btnWidht, int btnHeight) {
        JButton subMenuBtn = new JButton(BtnName);
        subMenuBtn.setBounds((int) (screenW_ratio * xPos), (int) (screenH_ratio * yPos), (int) (screenW_ratio * btnWidht), (int) (screenH_ratio * btnHeight));
        subMenuBtn.setVisible(false);
        return subMenuBtn;
    }

    /**
     * Main Menu Icon Button Custom Actions
     */
    public class menuMainBtnAction implements MouseListener, ActionListener {

        private final JButton[] menuSubBtnArr;
        private final JPanel menuBackdrop;
        private final JPanel centerPanel;
        private final JLabel centerImg;

        /**
         * 
         * @param menuSubBtnArr sub menu button array
         * @param menuBackdrop panel backdrop
         * @param centerPanel frame center JPanel
         * @param centerImg frame center JLabel image
         */
        public menuMainBtnAction(JButton[] menuSubBtnArr, JPanel menuBackdrop,
                JPanel centerPanel, JLabel centerImg) {
            super();
            this.menuSubBtnArr = menuSubBtnArr;
            this.menuBackdrop = menuBackdrop;
            this.centerPanel = centerPanel;
            this.centerImg = centerImg;
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            for (JButton jbutton : menuSubBtnArr) {
                jbutton.setVisible(true);
            }
            menuBackdrop.setVisible(true);
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            for (JButton jbutton : menuSubBtnArr) {
                jbutton.setVisible(false);
            }
            menuBackdrop.setVisible(false);
        }

        @Override
        public void mouseClicked(MouseEvent evt) {
            centerPanel.removeAll();
            centerPanel.add(centerImg, BorderLayout.NORTH);
            centerPanel.updateUI();
        }

        @Override
        public void mousePressed(MouseEvent evt) {
        }

        @Override
        public void mouseReleased(MouseEvent evt) {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            centerPanel.removeAll();
//            for (int i = 0; i < 2; i++) {
//                for (int rm = 0; rm < centerPanel.getComponentCount(); rm++) {
//                    centerPanel.remove(rm);
//                }
//            }
//
//            centerPanel.add(centerImg, BorderLayout.NORTH);
//            centerPanel.updateUI();
        }
    }

    /**
     * Sub Menu Button Custom Actions
     */
    public class menuSubBtnAction implements MouseListener, ActionListener {

        private final JButton[] menuSubBtnArr;
        private final JPanel menuBackdrop;
        private final JPanel centerPanel;
        private final JFrame centerFrame;

        /**
         * 
         * @param menuSubBtnArr sub menu button array
         * @param menuBackdrop panel backdrop
         * @param centerPanel frame center JPanel
         */
        public menuSubBtnAction(JButton[] menuSubBtnArr, JPanel menuBackdrop,
                JPanel centerPanel, JFrame jframeObj) {
            super();
            this.menuSubBtnArr = menuSubBtnArr;
            this.menuBackdrop = menuBackdrop;
            this.centerPanel = centerPanel;
            this.centerFrame = jframeObj;
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            for (JButton jbutton : menuSubBtnArr) {
                jbutton.setVisible(true);
            }
            menuBackdrop.setVisible(true);
        }

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            centerPanel.removeAll();
            centerPanel.updateUI();
            centerFrame.getContentPane().setBackground(Color.BLACK);
            centerPanel.add(centerFrame.getContentPane(), BorderLayout.CENTER);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            System.out.println("ee");
//            for (int i = 0; i < 2; i++) {
//                System.out.println(i);
//                System.out.println(centerPanel.getComponentCount());
//
//                for (int rm = 0; rm < centerPanel.getComponentCount(); rm++) {
//                    centerPanel.remove(rm);
//                }
//            }

//            Selection_Sort_obj = null;
//            Selection_Sort_obj = new contentIns();
//            centerPanel.add(Selection_Sort_obj.SS_jf, BorderLayout.CENTER);
        }
    }

    /**
     * Menu Item Backdrop Mouse Actions
     */
    public class menuBackDropAction implements MouseListener {

        private final JButton[] menuSubBtnArr;
        private final JPanel menuBackdrop;

        /**
         * 
         * @param menuSubBtnArr sub menu button array
         * @param menuBackdrop panel backdrop
         */
        public menuBackDropAction(JButton[] menuSubBtnArr, JPanel menuBackdrop) {
            super();
            this.menuSubBtnArr = menuSubBtnArr;
            this.menuBackdrop = menuBackdrop;
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
            for (JButton jbutton : menuSubBtnArr) {
                jbutton.setVisible(false);
            }
            menuBackdrop.setVisible(false);
        }

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }
    }
    public JFrame GuiMainFrame;
    /**
     * Create main GUI with menu
     */
    public void createAndShowGUI() {
        GuiMainFrame = new JFrame();
        GuiMainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLayeredPane layeredPane = new JLayeredPane();

        //Interface
        JPanel guiJPanel = new JPanel(new BorderLayout((int) (screenH_ratio * 5), (int) (screenW_ratio * 5)));
        guiJPanel.setBorder(new EmptyBorder((int) (screenH_ratio * 10), (int) (screenW_ratio * 10), (int) (screenH_ratio * 10), (int) (screenW_ratio * 10)));
        guiJPanel.setBackground(Color.BLACK);
        guiJPanel.setBounds(0, 0, (int) (screenW_ratio * 1920), (int) (screenH_ratio * 1080));

        JPanel guiTopLayer = new JPanel(null);
        guiTopLayer.setOpaque(false);
        guiTopLayer.setBounds(0, 0, (int) (screenW_ratio * 1920), (int) (screenH_ratio * 1080));

        // Logo + Menu = TOP
        JPanel TOP = new JPanel(new BorderLayout((int) (screenW_ratio * 5), (int) (screenH_ratio * 5)));
        TOP.setOpaque(false);
        guiJPanel.add(TOP, BorderLayout.NORTH);

        // Logo
        JPanel logo = new JPanel();
        logo.setBorder(new EmptyBorder((int) (screenH_ratio * 0), (int) (screenW_ratio * 50), (int) (screenH_ratio * 0), (int) (screenW_ratio * 50)));
        logo.setOpaque(false);
        TOP.add(logo, BorderLayout.WEST);
        Image L_img1 = Util.getIcon(getClass(), "common/logo").getImage();
        Image L_reseized_img1 = L_img1.getScaledInstance((int) (screenW_ratio * 140), (int) (screenH_ratio * 140), java.awt.Image.SCALE_SMOOTH);
        ImageIcon Logo_reseize_ImgIcon1 = new ImageIcon(L_reseized_img1);
        JLabel stylish_logo = new JLabel();
        stylish_logo.setIcon(Logo_reseize_ImgIcon1);
        logo.add(stylish_logo);

        // Menu Items Panel
        JPanel menu = new JPanel(new GridLayout(1, 9, (int) (screenH_ratio * 50), (int) (screenW_ratio * 0)));
        menu.setOpaque(false);
        menu.setBorder(new EmptyBorder((int) (screenH_ratio * 0), (int) (screenW_ratio * 50), (int) (screenH_ratio * 0), (int) (screenW_ratio * 50)));
        TOP.add(menu, BorderLayout.EAST);

        JPanel menuItemPanel1 = createMenuItemPanel(menuBtnWidth, menuBtnHeight);
        JButton menuMainIconBtn1 = createMenuItemButton("common/menu_1", menuBtnWidth, menuBtnHeight);
        menuItemPanel1.add(menuMainIconBtn1);
        menu.add(menuItemPanel1);

        JPanel menuItemPanel2 = createMenuItemPanel(menuBtnWidth, menuBtnHeight);
        JButton menuMainIconBtn2 = createMenuItemButton("common/menu_2", menuBtnWidth, menuBtnHeight);
        menuItemPanel2.add(menuMainIconBtn2);
        menu.add(menuItemPanel2);

        JPanel menuItemPanel3 = createMenuItemPanel(menuBtnWidth, menuBtnHeight);
        JButton menuMainIconBtn3 = createMenuItemButton("common/menu_3", menuBtnWidth, menuBtnHeight);
        menuItemPanel3.add(menuMainIconBtn3);
        menu.add(menuItemPanel3);

        JPanel menuItemPanel4 = createMenuItemPanel(menuBtnWidth, menuBtnHeight);
        JButton menuMainIconBtn4 = createMenuItemButton("common/menu_4", menuBtnWidth, menuBtnHeight);
        menuItemPanel4.add(menuMainIconBtn4);
        menu.add(menuItemPanel4);

        // CENTER
        JPanel CENTER = new JPanel(new BorderLayout((int) (screenH_ratio * 5), (int) (screenW_ratio * 5)));
        CENTER.setOpaque(false);
        guiJPanel.add(CENTER, BorderLayout.CENTER);

        JPanel CENTER_NORTH = new JPanel();
        CENTER_NORTH.setBorder(new EmptyBorder((int) (screenH_ratio * 0), (int) (screenW_ratio * 0), (int) (screenH_ratio * 25), (int) (screenW_ratio * 0)));
        CENTER_NORTH.setOpaque(false);
        CENTER.add(CENTER_NORTH, BorderLayout.NORTH);

        JPanel CENTER_WEST = new JPanel();
        CENTER_WEST.setBorder(new EmptyBorder((int) (screenH_ratio * 0), (int) (screenW_ratio * 50), (int) (screenH_ratio * 0), (int) (screenW_ratio * 0)));
        CENTER_WEST.setOpaque(false);
        CENTER.add(CENTER_WEST, BorderLayout.WEST);

        JPanel CENTER_EAST = new JPanel();
        CENTER_EAST.setBorder(new EmptyBorder((int) (screenH_ratio * 0), (int) (screenW_ratio * 0), (int) (screenH_ratio * 0), (int) (screenW_ratio * 50)));
        CENTER_EAST.setOpaque(false);
        CENTER.add(CENTER_EAST, BorderLayout.EAST);

        JPanel CENTER_SOUTH = new JPanel();
        CENTER_SOUTH.setBorder(new EmptyBorder((int) (screenH_ratio * 0), (int) (screenW_ratio * 0), (int) (screenH_ratio * 45), (int) (screenW_ratio * 0)));
        CENTER_SOUTH.setOpaque(false);
        CENTER.add(CENTER_SOUTH, BorderLayout.SOUTH);

        JPanel CENTER_Page = new JPanel(new BorderLayout(0, 0));
        CENTER_Page.setOpaque(false);
        CENTER.add(CENTER_Page, BorderLayout.CENTER);

        // Center content panel background
        Image I_reseized_img3 = util.Util.getIcon(getClass(), "common/home_background").getImage()
                .getScaledInstance((int) (screenW_ratio * 1765), (int) (screenH_ratio * 770), java.awt.Image.SCALE_SMOOTH);
        ImageIcon Ienu_reseize_ImgIcon3 = new ImageIcon(I_reseized_img3);
        JLabel CENTER_PAGE_IMG = new JLabel();
        CENTER_PAGE_IMG.setIcon(Ienu_reseize_ImgIcon3);
        CENTER_Page.add(CENTER_PAGE_IMG, BorderLayout.NORTH);

        /* ~~~~~~~~~~ SUB MENU 1 ~~~~~~~~~~ */
        JPanel menu1Backdrop = createSubMenuBackdrop(1140, 155, 160, 110);
        JButton menu1SubMenuBtn1 = createSubMenuItem("Patient Manage", 1150, 155, 140, 50);
        JButton menu1SubMenuBtn2 = createSubMenuItem("Chanelling", 1150, 205, 140, 50);
        JButton[] SubMenu1BtnArray = new JButton[]{menu1SubMenuBtn1, menu1SubMenuBtn2};

        guiTopLayer.add(menu1SubMenuBtn1);
        guiTopLayer.add(menu1SubMenuBtn2);
        guiTopLayer.add(menu1Backdrop);

        menuMainIconBtn1.addMouseListener(new menuMainBtnAction(SubMenu1BtnArray, menu1Backdrop, CENTER_Page, CENTER_PAGE_IMG));
        
        // Load JFrames to center panel
        PatientManaging patientManagingObj = new PatientManaging();
        menu1SubMenuBtn1.addMouseListener(new menuSubBtnAction(SubMenu1BtnArray, menu1Backdrop, CENTER_Page, patientManagingObj));
        ChanelDoctor chanelDoctor = new ChanelDoctor();
        menu1SubMenuBtn2.addMouseListener(new menuSubBtnAction(SubMenu1BtnArray, menu1Backdrop, CENTER_Page, chanelDoctor));
        menu1Backdrop.addMouseListener(new menuBackDropAction(SubMenu1BtnArray, menu1Backdrop));

        /* ~~~~~~~~~~ SUB MENU 2 ~~~~~~~~~~ */
        JPanel menu2Backdrop = createSubMenuBackdrop(1330, 155, 160, 160);
        JButton menu2SubMenuBtn1 = createSubMenuItem("Drug List", 1340, 155, 140, 50);
        JButton menu2SubMenuBtn2 = createSubMenuItem("Add Drug", 1340, 205, 140, 50);
        JButton menu2SubMenuBtn3 = createSubMenuItem("Order Manage", 1340, 255, 140, 50);
        JButton[] SubMenu2BtnArray = new JButton[]{menu2SubMenuBtn1, menu2SubMenuBtn2, menu2SubMenuBtn3};

        guiTopLayer.add(menu2SubMenuBtn1);
        guiTopLayer.add(menu2SubMenuBtn2);
        guiTopLayer.add(menu2SubMenuBtn3);
        guiTopLayer.add(menu2Backdrop);

        menuMainIconBtn2.addMouseListener(new menuMainBtnAction(SubMenu2BtnArray, menu2Backdrop, CENTER_Page, CENTER_PAGE_IMG));
        
        // Load JFrames to center panel
        DrugList druglistObj = DrugList.getInstance();
        menu2SubMenuBtn1.addMouseListener(new menuSubBtnAction(SubMenu2BtnArray, menu2Backdrop, CENTER_Page, druglistObj));
        AddDrugItem addDrugItemObj = AddDrugItem.getInstance();
        menu2SubMenuBtn2.addMouseListener(new menuSubBtnAction(SubMenu2BtnArray, menu2Backdrop, CENTER_Page, addDrugItemObj));
        OrderManage orderManageObj = OrderManage.getInstance();
        menu2SubMenuBtn3.addMouseListener(new menuSubBtnAction(SubMenu2BtnArray, menu2Backdrop, CENTER_Page, orderManageObj));

        menu2Backdrop.addMouseListener(new menuBackDropAction(SubMenu2BtnArray, menu2Backdrop));

        /* ~~~~~~~~~~ SUB MENU 3 ~~~~~~~~~~ */
        JPanel menu3Backdrop = createSubMenuBackdrop(1520, 155, 160, 110);
        JButton menu3SubMenuBtn1 = createSubMenuItem("Prescription", 1530, 155, 140, 50);
        JButton menu3SubMenuBtn2 = createSubMenuItem("Available Drugs", 1530, 205, 140, 50);
        JButton[] SubMenu3BtnArray = new JButton[]{menu3SubMenuBtn1, menu3SubMenuBtn2};

        guiTopLayer.add(menu3SubMenuBtn1);
        guiTopLayer.add(menu3SubMenuBtn2);
        guiTopLayer.add(menu3Backdrop);

        menuMainIconBtn3.addMouseListener(new menuMainBtnAction(SubMenu3BtnArray, menu3Backdrop, CENTER_Page, CENTER_PAGE_IMG));
        //menu3SubMenuBtn1.addMouseListener(new menuSubBtnAction(SubMenu3BtnArray, menu3Backdrop, CENTER_Page));
        menu3Backdrop.addMouseListener(new menuBackDropAction(SubMenu3BtnArray, menu3Backdrop));

      /* ~~~~~~~~~~ SUB MENU 4 ~~~~~~~~~~ */
        JPanel menu4Backdrop = createSubMenuBackdrop(1710, 155, 160, 110);
        JButton menu4SubMenuBtn1 = createSubMenuItem("Register", 1720, 155, 140, 50);
        JButton menu4SubMenuBtn2 = createSubMenuItem("Edit Profile", 1720, 205, 140, 50);
        JButton menu4SubMenuBtn3 = createSubMenuItem("Leaves", 1720, 255, 140, 50);
        JButton menu4SubMenuBtn4 = createSubMenuItem("Edit All", 1720, 255, 140, 50);
        
        JButton[] SubMenu4BtnArray = new JButton[]{menu4SubMenuBtn1, menu4SubMenuBtn2, menu4SubMenuBtn3,menu4SubMenuBtn4};

        guiTopLayer.add(menu4SubMenuBtn1);
        guiTopLayer.add(menu4SubMenuBtn2);
        guiTopLayer.add(menu4SubMenuBtn3);
        guiTopLayer.add(menu4SubMenuBtn4);
        guiTopLayer.add(menu4Backdrop);

        menuMainIconBtn4.addMouseListener(new menuMainBtnAction(SubMenu4BtnArray, menu4Backdrop, CENTER_Page, CENTER_PAGE_IMG));
        
        String UserID = "5";
        
        // Load JFrames to center panel
        UserRegistration userRegistrationObj = new UserRegistration();
        menu4SubMenuBtn1.addMouseListener(new menuSubBtnAction(SubMenu4BtnArray, menu4Backdrop, CENTER_Page, userRegistrationObj));
        EditSingleEmployee editsingleEmployee = new EditSingleEmployee(UserID);
        menu4SubMenuBtn2.addMouseListener(new menuSubBtnAction(SubMenu4BtnArray, menu4Backdrop, CENTER_Page, editsingleEmployee));
        LeaveManagement leaveManagement = new LeaveManagement(UserID);
        menu4SubMenuBtn3.addMouseListener(new menuSubBtnAction(SubMenu4BtnArray, menu4Backdrop, CENTER_Page, leaveManagement));
        EditEmployee admiEdit = new EditEmployee();
        menu4SubMenuBtn4.addMouseListener(new menuSubBtnAction(SubMenu4BtnArray, menu4Backdrop, CENTER_Page, admiEdit));
        menu4Backdrop.addMouseListener(new menuBackDropAction(SubMenu4BtnArray, menu4Backdrop));

//        logout_btn.setBounds((int) (screenH_ratio * 1750), (int) (screenH_ratio * 980), (int) (screenH_ratio * 100), (int) (screenH_ratio * 30));
//        guiTopLayer.add(logout_btn);
//
//        logout_btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(1);
//            }
//        });

        GuiMainFrame.setTitle("Hospital Plus");
        GuiMainFrame.setVisible(true);
        GuiMainFrame.add(layeredPane);

        layeredPane.add(guiJPanel, new Integer(1));
        layeredPane.add(guiTopLayer, new Integer(2));

        GuiMainFrame.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        GuiMainFrame.pack();
        GuiMainFrame.setResizable(false);
        GuiMainFrame.show();

    }
}
