package view.layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author EnTeRs
 */
public class MainJFrame extends JFrame {
    public MainJFrame() {
    }

    public static void createAndShowGUI() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int ScreenW = (int) screenSize.getWidth();
        int ScreenH = (int) screenSize.getHeight();
        double screenW_ratio = ScreenW / 1920.0;
        double screenH_ratio = ScreenH / 1080.0;

        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLayeredPane pane = new JLayeredPane();

        //Interface
        JPanel gui = new JPanel(new BorderLayout((int) (screenH_ratio * 5), (int) (screenW_ratio * 5)));
        gui.setBorder(new EmptyBorder((int) (screenH_ratio * 10), (int) (screenW_ratio * 10), (int) (screenH_ratio * 10), (int) (screenW_ratio * 10)));
        gui.setBackground(Color.BLACK);
        gui.setBounds(0, 0, (int) (screenW_ratio * 1920), (int) (screenH_ratio * 1080));

        JPanel gui_top_layer = new JPanel(null);
        gui_top_layer.setOpaque(false);
        //gui_top_layer.setBackground(Color.blue);
        gui_top_layer.setBounds(0, 0, (int) (screenW_ratio * 1920), (int) (screenH_ratio * 1080));

        //logo + menu = TOP
        JPanel TOP = new JPanel(new BorderLayout((int) (screenW_ratio * 5), (int) (screenH_ratio * 5)));
        TOP.setOpaque(false);
        gui.add(TOP, BorderLayout.NORTH);

        //logo
        JPanel logo = new JPanel();
        logo.setBorder(new EmptyBorder((int) (screenH_ratio * 0), (int) (screenW_ratio * 50), (int) (screenH_ratio * 0), (int) (screenW_ratio * 50)));
        logo.setOpaque(false);
        TOP.add(logo, BorderLayout.WEST);
        ImageIcon L_imgicon1 = new ImageIcon("../hospitalplus/src/view/images/common/logo.png");
        Image L_img1 = L_imgicon1.getImage();
        Image L_reseized_img1 = L_img1.getScaledInstance((int) (screenW_ratio * 140), (int) (screenH_ratio * 140), java.awt.Image.SCALE_SMOOTH);
        ImageIcon Logo_reseize_ImgIcon1 = new ImageIcon(L_reseized_img1);
        JLabel stylish_logo = new JLabel();
        stylish_logo.setIcon(Logo_reseize_ImgIcon1);
        logo.add(stylish_logo);

        //menu
        JPanel menu = new JPanel(new GridLayout(1, 9, (int) (screenH_ratio * 50), (int) (screenW_ratio * 0)));
        menu.setOpaque(false);
        menu.setBorder(new EmptyBorder((int) (screenH_ratio * 0), (int) (screenW_ratio * 50), (int) (screenH_ratio * 0), (int) (screenW_ratio * 50)));
        TOP.add(menu, BorderLayout.EAST);

        JPanel Panelmenu_1 = new JPanel();
        Panelmenu_1.setPreferredSize(new Dimension((int) (screenW_ratio * 140), (int) (screenH_ratio * 140)));
        Panelmenu_1.setOpaque(false);
        ImageIcon M_imgicon1 = new ImageIcon("../hospitalplus/src/view/images/common/menu_1.png");
        Image M_img1 = M_imgicon1.getImage();
        Image M_reseized_img1 = M_img1.getScaledInstance((int) (screenW_ratio * 140), (int) (screenH_ratio * 140), java.awt.Image.SCALE_SMOOTH);
        ImageIcon Menu_reseize_ImgIcon1 = new ImageIcon(M_reseized_img1);
        JButton menu_btn1 = new JButton();
        menu_btn1.setIcon(Menu_reseize_ImgIcon1);
        menu_btn1.setPreferredSize(new Dimension((int) (screenW_ratio * 140), (int) (screenH_ratio * 140)));
        Panelmenu_1.add(menu_btn1);
        menu.add(Panelmenu_1);

        JPanel Panelmenu_3 = new JPanel();
        Panelmenu_3.setPreferredSize(new Dimension((int) (screenW_ratio * 140), (int) (screenH_ratio * 140)));
        Panelmenu_3.setOpaque(false);
        ImageIcon M_imgicon3 = new ImageIcon("../hospitalplus/src/view/images/common/menu_2.png");
        Image M_img3 = M_imgicon3.getImage();
        Image M_reseized_img3 = M_img3.getScaledInstance((int) (screenW_ratio * 140), (int) (screenH_ratio * 140), java.awt.Image.SCALE_SMOOTH);
        ImageIcon Menu_reseize_ImgIcon3 = new ImageIcon(M_reseized_img3);
        JButton menu_btn2 = new JButton();
        menu_btn2.setIcon(Menu_reseize_ImgIcon3);
        menu_btn2.setPreferredSize(new Dimension((int) (screenW_ratio * 140), (int) (screenH_ratio * 140)));
        Panelmenu_3.add(menu_btn2);
        menu.add(Panelmenu_3);

        //CENTER
        JPanel CENTER = new JPanel(new BorderLayout((int) (screenH_ratio * 5), (int) (screenW_ratio * 5)));
        CENTER.setOpaque(false);
        gui.add(CENTER, BorderLayout.CENTER);

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

        ImageIcon I_imgicon3 = new ImageIcon("../hospitalplus/src/view/images/common/home_background.png");
        Image I_img3 = I_imgicon3.getImage();
        Image I_reseized_img3 = I_img3.getScaledInstance((int) (screenW_ratio * 1765), (int) (screenH_ratio * 770), java.awt.Image.SCALE_SMOOTH);
        ImageIcon Ienu_reseize_ImgIcon3 = new ImageIcon(I_reseized_img3);

        JLabel CENTER_PAGE_IMG = new JLabel();
        //ImageIcon home_img = new ImageIcon("..\\DAA_Assigment\\src\\daa_assigment\\img\\Home_Back.jpg");
        CENTER_PAGE_IMG.setIcon(Ienu_reseize_ImgIcon3);
        CENTER_Page.add(CENTER_PAGE_IMG, BorderLayout.NORTH);

        /* ~~~~~~~~~~ SUB MENU 1 ~~~~~~~~~~ */
        JPanel menu_btn1_back = new JPanel();
        menu_btn1_back.setBounds((int) (screenW_ratio * 1520), (int) (screenH_ratio * 155), (int) (screenW_ratio * 160), (int) (screenH_ratio * 110));
        menu_btn1_back.setOpaque(false);
        menu_btn1_back.setVisible(false);

        JButton menu_btn1_1 = new JButton("Sub Menu 1");
        menu_btn1_1.setBounds((int) (screenW_ratio * 1530), (int) (screenH_ratio * 155), (int) (screenW_ratio * 140), (int) (screenH_ratio * 50));
        menu_btn1_1.setVisible(false);

        JButton menu_btn1_2 = new JButton("Sub Menu 2");
        menu_btn1_2.setBounds((int) (screenW_ratio * 1530), (int) (screenH_ratio * 205), (int) (screenW_ratio * 140), (int) (screenH_ratio * 50));
        menu_btn1_2.setVisible(false);

        gui_top_layer.add(menu_btn1_1);
        gui_top_layer.add(menu_btn1_2);
        gui_top_layer.add(menu_btn1_back);

        menu_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_btn1_1.setVisible(true);
                menu_btn1_2.setVisible(true);
                menu_btn1_back.setVisible(true);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_btn1_1.setVisible(false);
                menu_btn1_2.setVisible(false);
                menu_btn1_back.setVisible(false);
            }
        });

        menu_btn1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_btn1_1.setVisible(true);
                menu_btn1_2.setVisible(true);
                menu_btn1_back.setVisible(true);
            }
        });

        menu_btn1_back.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_btn1_1.setVisible(false);
                menu_btn1_2.setVisible(false);
                menu_btn1_back.setVisible(false);
            }
        });

        /* ~~~~~~~~~~ SUB MENU 2 ~~~~~~~~~~ */
        JPanel menu_btn2_back = new JPanel();
        menu_btn2_back.setBounds((int) (screenH_ratio * 1720), (int) (screenH_ratio * 155), (int) (screenH_ratio * 160), (int) (screenH_ratio * 110));
        menu_btn2_back.setOpaque(false);
        menu_btn2_back.setVisible(false);

        JButton menu_btn2_1 = new JButton("Sub Menu 1");
        menu_btn2_1.setBounds((int) (screenH_ratio * 1720), (int) (screenH_ratio * 155), (int) (screenH_ratio * 140), (int) (screenH_ratio * 50));
        menu_btn2_1.setVisible(false);

        JButton menu_btn2_2 = new JButton("Sub Menu 2");
        menu_btn2_2.setBounds((int) (screenH_ratio * 1720), (int) (screenH_ratio * 205), (int) (screenH_ratio * 140), (int) (screenH_ratio * 50));
        menu_btn2_2.setVisible(false);

        gui_top_layer.add(menu_btn2_1);
        gui_top_layer.add(menu_btn2_2);
        gui_top_layer.add(menu_btn1_back);

        menu_btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_btn2_1.setVisible(true);
                menu_btn2_2.setVisible(true);
                menu_btn2_back.setVisible(true);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_btn2_1.setVisible(false);
                menu_btn2_2.setVisible(false);
                menu_btn2_back.setVisible(false);
            }
        });

        menu_btn2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_btn2_1.setVisible(true);
                menu_btn2_2.setVisible(true);
                menu_btn2_back.setVisible(true);
            }
        });

        menu_btn2_back.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_btn2_1.setVisible(false);
                menu_btn2_2.setVisible(false);
                menu_btn2_back.setVisible(false);
            }
        });

        /* ~~~~~~~~~~ SUB MENU Clicking ~~~~~~~~~~ */
        JButton menu_btn_all = new JButton();

        menu_btn_all.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CENTER_Page.add(CENTER_PAGE_IMG, BorderLayout.NORTH);
                CENTER_Page.updateUI();
            }
        });

        /* ~~~~~~~~~~ SUB MENU Clicking 1 ~~~~~~~~~~ */
        menu_btn1_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu_btn1.doClick();

                CENTER_Page.remove(CENTER_PAGE_IMG);

//                Selection_Sort_obj = null;
//                Selection_Sort_obj = new Selection_Sort();

//                CENTER_Page.add(Selection_Sort_obj.SS_jf, BorderLayout.CENTER);

            }
        });

        menu_btn1_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu_btn1.doClick();

                CENTER_Page.remove(CENTER_PAGE_IMG);

//                Selection_Sort_obj = null;
//                Selection_Sort_obj = new Selection_Sort();

//                CENTER_Page.add(Selection_Sort_obj.SS_algo_jf, BorderLayout.CENTER);

            }
        });

        menu_btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 2; i++) {
                    for (int rm = 0; rm < CENTER_Page.getComponentCount(); rm++) {
                        CENTER_Page.remove(rm);
                    }
                }

                menu_btn_all.doClick();
            }
        });

        /* ~~~~~~~~~~ SUB MENU Clicking 2 ~~~~~~~~~~ */
        menu_btn2_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu_btn1.doClick();

                CENTER_Page.remove(CENTER_PAGE_IMG);

//                Insertion_Sort_obj = null;
//                Insertion_Sort_obj = new Insertion_Sort();

//                CENTER_Page.add(Insertion_Sort_obj.IS_jf, BorderLayout.CENTER);

            }
        });

        menu_btn2_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu_btn1.doClick();

                CENTER_Page.remove(CENTER_PAGE_IMG);

//                Insertion_Sort_obj = null;
//                Insertion_Sort_obj = new Insertion_Sort();

//                CENTER_Page.add(Insertion_Sort_obj.IS_algo_jf, BorderLayout.CENTER);

            }
        });

        menu_btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 2; i++) {
                    for (int rm = 0; rm < CENTER_Page.getComponentCount(); rm++) {
                        CENTER_Page.remove(rm);
                    }
                }

                menu_btn_all.doClick();
            }
        });

//        logout_btn.setBounds((int) (screenH_ratio * 1750), (int) (screenH_ratio * 980), (int) (screenH_ratio * 100), (int) (screenH_ratio * 30));
//        gui_top_layer.add(logout_btn);
//
//        logout_btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(1);
//            }
//        });

        f.setTitle("Hospital Plus");
        f.setVisible(true);
        f.add(pane);

        pane.add(gui, new Integer(1));
        pane.add(gui_top_layer, new Integer(2));

        f.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        f.pack();
        f.setResizable(false);
        f.show();

    }
}
