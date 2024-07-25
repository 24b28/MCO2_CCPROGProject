package MCO2;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

public class ReservationGUI{
    private JFrame mainWind;
    private ImageIcon image;
    private JLabel welcomelb, menulightlb, hotelCreatelb, manageHotellb, viewHotellb, viewLowHlb, promptCHllb, promptSHllb, hintLb, Hname, viewHighHlb, viewBookedRoomlb;
    private JLabel viewSelectedRoomlb, viewRoomReservationlb, viewRoomlb, viewReservationlb;
    private JLabel promptChangeHNamelb, promptAddRoomslb, promptRemoveRoomslb;
    private JTextField hTf1str, hTf2int, hTf3int, hTf4int, hTf5double;
    private JButton strtBtn, exitBtn, backBtn;
    private JButton createHBtn, selectHBtn;
    private JButton createOpHBtn, updPriceBtn, backCOpHBtn, selectOpHBtn, backSOpHBtn;
    private JButton viewHBtn, manageHBtn, bookingBtn, dpmBtn, exitHBtn;
    private JButton changeHNameBtn, addRoomBtn, removeRoomBtn, updatePBtn, removeRsrBtn, backMHBtn, removeHBtn;
    private JButton viewHLevelBtn, viewLLevelBtn, backVHBtn;
    private JButton backBookedBtn, backSRoomBtn, backSReservationBtn;
    private JButton selectRoomBtn, selectReservationBtn;
    private JButton backVHHBtn;
    private JButton numBookedRBtn, roomInfoBtn, rsvInfoBtn, backVLHBtn;
    private JButton backRoomBtn, backReservationBtn;
    private JButton backChangeNHBtn, changeNHBtn;
    private JButton backAddRBtn, addRBtn;
    private JButton backRemoveRBtn, removeRBtn;
    private JTable RoomBooked;
    private JComboBox DropDown;
    private JList HotelList, RoomList, ReservationList;
    private JTextArea TextDisplay;

    public ReservationGUI() {

        image = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("Background.png")));

        this.mainWind = new JFrame("Hotel Reservation System");
        this.mainWind.setLayout(new BorderLayout());
        this.mainWind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainWind.setSize(720, 480);
        this.mainWind.setLocationRelativeTo(null);
        this.mainWind.setResizable(false);
        this.mainWind.setBackground(Color.decode("#737373"));
        hintLb = new JLabel();
        strtBtn = new JButton();
        exitBtn = new JButton();
        backBtn = new JButton();
        createHBtn = new JButton();
        selectHBtn = new JButton();
        viewHBtn = new JButton();
        manageHBtn = new JButton();
        bookingBtn = new JButton();
        dpmBtn = new JButton();
        exitHBtn = new JButton();
        removeHBtn = new JButton();
        changeHNameBtn = new JButton();
        addRoomBtn = new JButton();
        removeRoomBtn = new JButton();
        updatePBtn = new JButton();
        removeRsrBtn = new JButton();
        backMHBtn = new JButton();
        viewHLevelBtn = new JButton();
        viewLLevelBtn = new JButton();
        backVHBtn = new JButton();
        numBookedRBtn = new JButton();
        roomInfoBtn = new JButton();
        rsvInfoBtn = new JButton();
        backVLHBtn = new JButton();
        createOpHBtn = new JButton();
        selectOpHBtn = new JButton();
        backCOpHBtn = new JButton();
        backSOpHBtn = new JButton();
        updPriceBtn = new JButton();
        backVHHBtn = new JButton();
        backBookedBtn = new JButton();
        backSRoomBtn = new JButton();
        backSReservationBtn = new JButton();
        selectRoomBtn = new JButton();
        selectReservationBtn = new JButton();
        backRoomBtn = new JButton();
        backReservationBtn = new JButton();
        backChangeNHBtn = new JButton();
        changeNHBtn = new JButton();
        backAddRBtn = new JButton();
        addRBtn = new JButton();
        backRemoveRBtn = new JButton();
        removeRBtn = new JButton();
        Hname = new JLabel();
        hTf1str = new JTextField();
        hTf2int = new JTextField();
        hTf3int = new JTextField();
        hTf4int = new JTextField();
        hTf5double = new JTextField();
        TextDisplay = new JTextArea();
        Integer date[] = new Integer[31];
        for (int i = 1; i<=31;i++){
            date[i-1]=i;
        }
        DropDown = new JComboBox(date);
        this.hTf1str.setText("Enter text...");
        this.hTf2int.setText("Enter value...");
        this.hTf3int.setText("Enter value...");
        this.hTf4int.setText("Enter value...");
        this.hTf5double.setText("Enter value...");



        StartScreen();
        //Main Menu
        //Manage Hotel
        //

        this.mainWind.setVisible(true);
    }

    public void StartScreen(){
        welcomelb = new JLabel(this.image);
        welcomelb.setSize(720, 460);
        welcomelb.setLayout(new BorderLayout());
        this.mainWind.add(welcomelb);
        GridBagConstraints gbc = new GridBagConstraints();
        Font font = new Font("Comic Sans MS", Font.PLAIN, 30);

        // Top Panel
        gbc.insets = new Insets(2, 0,2,0);
        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new GridBagLayout());
        panelNorth.setOpaque(false);
        JLabel titleLb = new JLabel("Hotel Reservation System");
        titleLb.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        titleLb.setForeground(Color.WHITE);
        gbc.gridy = 0;
        panelNorth.add(titleLb, gbc);
        hintLb = new JLabel("Welcome!!!!!!!!!");
        hintLb.setFont(font);
        hintLb.setForeground(Color.WHITE);
        gbc.gridy = 1;
        panelNorth.add(hintLb, gbc);
        welcomelb.add(panelNorth,BorderLayout.NORTH);

        // Center Panel
        gbc.insets = new Insets(15, 15 ,15 ,15);
        JPanel panelSome = new JPanel();
        panelSome.setLayout(new GridBagLayout());
        panelSome.setOpaque(false);
        strtBtn.setText("Start");
        setButton(strtBtn, font);
        gbc.gridy = 0;
        panelSome.add(strtBtn, gbc);
        exitBtn.setText("Exit");
        setButton(exitBtn, font);
        gbc.gridy = 1;
        panelSome.add(exitBtn, gbc);
        welcomelb.add(panelSome,BorderLayout.CENTER);
    }

    public void CreateHotel(){
        this.welcomelb.setVisible(false);
        hotelCreatelb = new JLabel(this.image);
        hotelCreatelb.setSize(720, 460);
        hotelCreatelb.setLayout(new BorderLayout());
        this.mainWind.add(hotelCreatelb);
        GridBagConstraints gbc = new GridBagConstraints();
        Font font = new Font("Comic Sans MS", Font.PLAIN, 30);

        // Top Panel
        gbc.insets = new Insets(2, 0 ,2 ,0);
        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new GridBagLayout());
        panelNorth.setOpaque(false);
        JLabel titleLb = new JLabel("Hotel Reservation System");
        titleLb.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        titleLb.setForeground(Color.WHITE);
        gbc.gridy = 0;
        panelNorth.add(titleLb, gbc);
        hintLb.setText("What do you want to do?");
        hintLb.setFont(font);
        hintLb.setForeground(Color.WHITE);
        gbc.gridy = 1;
        panelNorth.add(hintLb, gbc);
        hotelCreatelb.add(panelNorth, BorderLayout.NORTH);

        // Center Panel
        Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 20);
        gbc.insets = new Insets(15, 15 ,15 ,15);
        JPanel panelSome = new JPanel();
        panelSome.setLayout(new GridBagLayout());
        panelSome.setOpaque(false);
        createHBtn.setText("Create Hotel");
        setButton(createHBtn,buttonFont);
        gbc.gridy = 0;
        panelSome.add(createHBtn, gbc);
        gbc.gridy = 1;
        selectHBtn.setText("Select Hotel");
        setButton(selectHBtn,buttonFont);
        panelSome.add(selectHBtn, gbc);
        gbc.gridy = 2;
        panelSome.add(exitBtn,gbc);
        hotelCreatelb.add(panelSome,BorderLayout.CENTER);

        this.hotelCreatelb.setVisible(true);
    }

    public void promptCreateHotel(){
        this.hotelCreatelb.setVisible(false);
        promptCHllb = new JLabel(this.image);
        promptCHllb.setSize(720, 460);
        promptCHllb.setLayout(new BorderLayout());
        this.mainWind.add(promptCHllb);
        GridBagConstraints gbc = new GridBagConstraints();
        Font font = new Font("Comic Sans MS", Font.PLAIN, 30);

        // Top Panel
        gbc.insets = new Insets(2, 0 ,2 ,0);
        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new GridBagLayout());
        panelNorth.setOpaque(false);
        JLabel titleLb = new JLabel("Hotel Reservation System");
        titleLb.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        titleLb.setForeground(Color.WHITE);
        gbc.gridy = 0;
        panelNorth.add(titleLb, gbc);
        hintLb.setText("What do you want to do?");
        hintLb.setFont(font);
        hintLb.setForeground(Color.WHITE);
        gbc.gridy = 1;
        panelNorth.add(hintLb, gbc);
        promptCHllb.add(panelNorth, BorderLayout.NORTH);

        // Center Panel
        Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 20);
        gbc.insets = new Insets(5, 5 ,5 ,5);
        JPanel panelSome = new JPanel();
        panelSome.setLayout(new GridBagLayout());
        panelSome.setOpaque(false);
        JLabel hName = new JLabel("Name of Hotel: ");
        hName.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        hName.setForeground(Color.WHITE);
        hTf1str.setColumns(20);
        hTf1str.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        hTf1str.setBorder(new LineBorder(Color.BLACK, 3));
        gbc.gridy = 0;
        panelSome.add(hName, gbc);
        panelSome.add(hTf1str, gbc);
        gbc.gridy = 1;
        JLabel sNum = new JLabel("Standard Rooms: ");
        sNum.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        sNum.setForeground(Color.WHITE);
        hTf2int.setColumns(20);
        hTf2int.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        hTf2int.setBorder(new LineBorder(Color.BLACK, 3));
        panelSome.add(sNum, gbc);
        panelSome.add(hTf2int, gbc);
        gbc.gridy = 2;
        JLabel dNum = new JLabel("Deluxe Rooms: ");
        dNum.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        dNum.setForeground(Color.WHITE);
        hTf3int.setColumns(20);
        hTf3int.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        hTf3int.setBorder(new LineBorder(Color.BLACK, 3));
        panelSome.add(dNum, gbc);
        panelSome.add(hTf3int, gbc);
        gbc.gridy = 3;
        JLabel eNum = new JLabel("Executive Rooms: ");
        eNum.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        eNum.setForeground(Color.WHITE);
        hTf4int.setColumns(20);
        hTf4int.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        hTf4int.setBorder(new LineBorder(Color.BLACK, 3));
        panelSome.add(eNum, gbc);
        panelSome.add(hTf4int, gbc);
        gbc.gridy = 4;
        JLabel UpdatePrice = new JLabel("Base Price: ");
        UpdatePrice.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        UpdatePrice.setForeground(Color.WHITE);
        hTf5double.setColumns(20);
        hTf5double.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        hTf5double.setEditable(false);
        hTf5double.setBorder(new LineBorder(Color.BLACK, 3));
        hTf5double.setBackground(new Color(0, 0, 0,0));
        updPriceBtn.setText("Update Price?");
        setButton(updPriceBtn,buttonFont);
        updPriceBtn.setPreferredSize(new Dimension(150,35));
        panelSome.add(UpdatePrice, gbc);
        panelSome.add(hTf5double, gbc);
        panelSome.add(updPriceBtn, gbc);
        gbc.gridy = 5;
        createOpHBtn.setText("Create Hotel");
        setButton(createOpHBtn,buttonFont);
        backCOpHBtn.setText("Back");
        setButton(backCOpHBtn,buttonFont);
        gbc.gridx = -1;
        panelSome.add(backCOpHBtn,gbc);
        gbc.gridx = 2;
        panelSome.add(createOpHBtn, gbc);
        promptCHllb.add(panelSome,BorderLayout.CENTER);

        this.promptCHllb.setVisible(true);
    }

    public void promptSelectHotel(){
        this.hotelCreatelb.setVisible(false);
        promptSHllb = new JLabel(this.image);
        promptSHllb.setSize(720, 460);
        promptSHllb.setLayout(new BorderLayout());
        this.mainWind.add(promptSHllb);
        GridBagConstraints gbc = new GridBagConstraints();
        Font font = new Font("Comic Sans MS", Font.PLAIN, 30);

        // Top Panel
        gbc.insets = new Insets(2, 0 ,2 ,0);
        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new GridBagLayout());
        panelNorth.setOpaque(false);
        JLabel titleLb = new JLabel("Hotel Reservation System");
        titleLb.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        titleLb.setForeground(Color.WHITE);
        gbc.gridy = 0;
        panelNorth.add(titleLb, gbc);
        hintLb.setText("What do you want to do?");
        hintLb.setFont(font);
        hintLb.setForeground(Color.WHITE);
        gbc.gridy = 1;
        panelNorth.add(hintLb, gbc);
        promptSHllb.add(panelNorth, BorderLayout.NORTH);

        // Center Panel
        Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 20);
        gbc.insets = new Insets(5, 5 ,5 ,5);
        JPanel panelSome = new JPanel();
        panelSome.setLayout(new GridBagLayout());
        panelSome.setOpaque(false);
        JLabel hName = new JLabel("Hotel Selection: ");
        hName.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        hName.setForeground(Color.WHITE);
        gbc.gridy = 0;
        panelSome.add(hName, gbc);
        HotelList.setVisibleRowCount(4);
        HotelList.setFont(font);
        HotelList.setForeground(Color.WHITE);
        HotelList.setBackground(new Color(0, 0, 0,0));
        HotelList.setOpaque(false);
        JScrollPane list = new JScrollPane(HotelList);
        list.setOpaque(false);
        list.getViewport().setOpaque(false);
        list.setBorder(new LineBorder(Color.WHITE, 6));
        list.setPreferredSize(new Dimension(300, 200));
        list.getVerticalScrollBar().setOpaque(false);
        gbc.gridy = 0;
        panelSome.add(list, gbc);
        backSOpHBtn.setText("Back");
        setButton(backSOpHBtn,font);
        gbc.gridy = 1;
        panelSome.add(backSOpHBtn, gbc);
        selectOpHBtn.setText("Select");
        setButton(selectOpHBtn,font);
        gbc.gridy = 1;
        gbc.gridx = 2;
        panelSome.add(selectOpHBtn, gbc);
        promptSHllb.add(panelSome,BorderLayout.CENTER);

        this.promptSHllb.setVisible(true);
    }

    public void HotelMenu(){
        this.hotelCreatelb.setVisible(false);
        menulightlb = new JLabel(this.image);
        menulightlb.setSize(720, 460);
        menulightlb.setLayout(new BorderLayout());
        this.mainWind.add(menulightlb);
        GridBagConstraints gbc = new GridBagConstraints();
        Font font = new Font("Comic Sans MS", Font.PLAIN, 30);

        // Top Panel
        gbc.insets = new Insets(2, 0 ,2 ,0);
        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new GridBagLayout());
        panelNorth.setOpaque(false);
        JLabel titleLb = new JLabel("Hotel Reservation System");
        titleLb.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        titleLb.setForeground(Color.WHITE);
        gbc.gridy = 0;
        panelNorth.add(titleLb, gbc);
        JLabel hintLb = new JLabel("What do you want to do?");
        hintLb.setFont(font);
        hintLb.setForeground(Color.WHITE);
        Hname.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        Hname.setForeground(Color.WHITE);
        gbc.gridy = 1;
        panelNorth.add(hintLb, gbc);
        gbc.insets = new Insets(0, 0 ,0 ,0);
        gbc.gridy = 2;
        panelNorth.add(Hname, gbc);
        menulightlb.add(panelNorth,BorderLayout.NORTH);

        // Center Panel
        Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 20);
        gbc.insets = new Insets(15, 15 ,15 ,15);
        JPanel panelSome = new JPanel();
        panelSome.setLayout(new GridBagLayout());
        panelSome.setOpaque(false);
        viewHBtn.setText("View Hotel");
        setButton(viewHBtn, buttonFont);
        gbc.gridy = 0;
        panelSome.add(viewHBtn, gbc);
        manageHBtn.setText("Manage Hotel");
        setButton(manageHBtn, buttonFont);
        bookingBtn.setText("<html>Simulate <br/>Booking<html>");
        setButton(bookingBtn, buttonFont);
        dpmBtn.setText("<html>Date Price <br/>Modifier<html>");
        setButton(dpmBtn, buttonFont);
        panelSome.add(manageHBtn, gbc);
        gbc.gridy = 1;
        panelSome.add(bookingBtn, gbc);
        panelSome.add(dpmBtn, gbc);
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        exitHBtn.setText("Exit Hotel");
        setButton(exitHBtn, buttonFont);
        panelSome.add(exitHBtn, gbc);
        menulightlb.add(panelSome,BorderLayout.CENTER);

        this.menulightlb.setVisible(true);
    }

    public void ManageHotel(){
        this.menulightlb.setVisible(false);
        manageHotellb = new JLabel(this.image);
        manageHotellb.setSize(720, 460);
        manageHotellb.setLayout(new BorderLayout());
        this.mainWind.add(manageHotellb);
        GridBagConstraints gbc = new GridBagConstraints();
        Font font = new Font("Comic Sans MS", Font.PLAIN, 30);

        // Top Panel
        gbc.insets = new Insets(2, 0 ,2 ,0);
        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new GridBagLayout());
        panelNorth.setOpaque(false);
        JLabel titleLb = new JLabel("Hotel Reservation System");
        titleLb.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        titleLb.setForeground(Color.WHITE);
        gbc.gridy = 0;
        panelNorth.add(titleLb, gbc);
        JLabel hintLb = new JLabel("What do you want to do?");
        hintLb.setFont(font);
        hintLb.setForeground(Color.WHITE);
        gbc.gridy = 1;
        panelNorth.add(hintLb, gbc);
        Hname.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        Hname.setForeground(Color.WHITE);
        gbc.insets = new Insets(0, 0 ,0 ,0);
        gbc.gridy = 2;
        panelNorth.add(Hname, gbc);
        manageHotellb.add(panelNorth,BorderLayout.NORTH);

        // Center Panel
        Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 20);
        gbc.insets = new Insets(15, 15 ,15 ,15);
        JPanel panelSome = new JPanel();
        panelSome.setLayout(new GridBagLayout());
        panelSome.setOpaque(false);
        gbc.gridy = 0;
        changeHNameBtn.setText("<html>Change <br/>Hotel Name<html>");
        setButton(changeHNameBtn, buttonFont);
        addRoomBtn.setText("Add Rooms");
        setButton(addRoomBtn, buttonFont);
        removeRoomBtn.setText("<html>Remove <br/>Rooms<html>");
        setButton(removeRoomBtn, buttonFont);
        panelSome.add(changeHNameBtn, gbc);
        panelSome.add(addRoomBtn, gbc);
        panelSome.add(removeRoomBtn, gbc);
        gbc.gridy = 1;
        updatePBtn.setText("<html>Update <br/>Base Price<html>");
        setButton(updatePBtn, buttonFont);
        removeRsrBtn.setText("<html>Remove <br/>Reservation<html>");
        setButton(removeRsrBtn, buttonFont);
        removeHBtn.setText("Remove Hotel");
        setButton(removeHBtn, buttonFont);
        panelSome.add(updatePBtn, gbc);
        panelSome.add(removeRsrBtn, gbc);
        panelSome.add(removeHBtn, gbc);
        gbc.gridy = 2;
        gbc.gridwidth = 4;
        backMHBtn.setText("Back");
        setButton(backMHBtn, buttonFont);
        panelSome.add(backMHBtn, gbc);
        manageHotellb.add(panelSome,BorderLayout.CENTER);

        this.manageHotellb.setVisible(true);
    }

    public void promptChangeHotelName(){
        this.manageHotellb.setVisible(false);
        promptChangeHNamelb = new JLabel(this.image);
        promptChangeHNamelb.setSize(720, 460);
        promptChangeHNamelb.setLayout(new BorderLayout());
        this.mainWind.add(promptChangeHNamelb);
        GridBagConstraints gbc = new GridBagConstraints();
        Font font = new Font("Comic Sans MS", Font.PLAIN, 30);

        // Top Panel
        gbc.insets = new Insets(2, 0 ,2 ,0);
        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new GridBagLayout());
        panelNorth.setOpaque(false);
        JLabel titleLb = new JLabel("Hotel Reservation System");
        titleLb.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        titleLb.setForeground(Color.WHITE);
        gbc.gridy = 0;
        panelNorth.add(titleLb, gbc);
        hintLb.setText("What do you want to do?");
        hintLb.setFont(font);
        hintLb.setForeground(Color.WHITE);
        gbc.gridy = 1;
        panelNorth.add(hintLb, gbc);
        promptChangeHNamelb.add(panelNorth, BorderLayout.NORTH);

        // Center Panel
        Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 20);
        gbc.insets = new Insets(5, 5 ,5 ,5);
        JPanel panelSome = new JPanel();
        panelSome.setLayout(new GridBagLayout());
        panelSome.setOpaque(false);
        JLabel hName = new JLabel("Change Name of Hotel: ");
        hName.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        hName.setForeground(Color.WHITE);
        hTf1str.setColumns(20);
        hTf1str.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        hTf1str.setBorder(new LineBorder(Color.BLACK, 3));
        gbc.gridy = 0;
        panelSome.add(hName, gbc);
        panelSome.add(hTf1str, gbc);
        backChangeNHBtn.setText("Back");
        setButton(backChangeNHBtn,buttonFont);
        changeNHBtn.setText("Change Name");
        setButton(changeNHBtn,buttonFont);
        gbc.gridy = 1;
        panelSome.add(backChangeNHBtn,gbc);
        panelSome.add(changeNHBtn, gbc);
        promptChangeHNamelb.add(panelSome,BorderLayout.CENTER);

        this.promptChangeHNamelb.setVisible(true);
    }

    public void promptAddRooms(){
        this.manageHotellb.setVisible(false);
        promptAddRoomslb = new JLabel(this.image);
        promptAddRoomslb.setSize(720, 460);
        promptAddRoomslb.setLayout(new BorderLayout());
        this.mainWind.add(promptAddRoomslb);
        GridBagConstraints gbc = new GridBagConstraints();
        Font font = new Font("Comic Sans MS", Font.PLAIN, 30);

        // Top Panel
        gbc.insets = new Insets(2, 0 ,2 ,0);
        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new GridBagLayout());
        panelNorth.setOpaque(false);
        JLabel titleLb = new JLabel("Hotel Reservation System");
        titleLb.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        titleLb.setForeground(Color.WHITE);
        gbc.gridy = 0;
        panelNorth.add(titleLb, gbc);
        hintLb.setText("What do you want to do?");
        hintLb.setFont(font);
        hintLb.setForeground(Color.WHITE);
        gbc.gridy = 1;
        panelNorth.add(hintLb, gbc);
        promptAddRoomslb.add(panelNorth, BorderLayout.NORTH);

        // Center Panel
        Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 20);
        gbc.insets = new Insets(5, 5 ,5 ,5);
        JPanel panelSome = new JPanel();
        panelSome.setLayout(new GridBagLayout());
        panelSome.setOpaque(false);
        JLabel numSRoom = new JLabel("Add Standard Rooms: ");
        numSRoom.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        numSRoom.setForeground(Color.WHITE);
        hTf2int.setColumns(20);
        hTf2int.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        hTf2int.setBorder(new LineBorder(Color.BLACK, 3));
        gbc.gridy = 0;
        panelSome.add(numSRoom, gbc);
        panelSome.add(hTf2int, gbc);
        JLabel numDRoom = new JLabel("Add Deluxe Rooms: ");
        numDRoom.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        numDRoom.setForeground(Color.WHITE);
        hTf3int.setColumns(20);
        hTf3int.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        hTf3int.setBorder(new LineBorder(Color.BLACK, 3));
        gbc.gridy = 1;
        panelSome.add(numDRoom, gbc);
        panelSome.add(hTf3int, gbc);
        JLabel numERoom = new JLabel("Add Exclusive Rooms: ");
        numERoom.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        numERoom.setForeground(Color.WHITE);
        hTf4int.setColumns(20);
        hTf4int.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        hTf4int.setBorder(new LineBorder(Color.BLACK, 3));
        gbc.gridy = 2;
        panelSome.add(numERoom, gbc);
        panelSome.add(hTf4int, gbc);
        backAddRBtn.setText("Back");
        setButton(backAddRBtn,buttonFont);
        addRBtn.setText("Add Rooms");
        setButton(addRBtn,buttonFont);
        gbc.gridy = 3;
        panelSome.add(backAddRBtn,gbc);
        panelSome.add(addRBtn, gbc);
        promptAddRoomslb.add(panelSome,BorderLayout.CENTER);

        this.promptAddRoomslb.setVisible(true);
    }

    public void promptRemoveRooms(){
        this.manageHotellb.setVisible(false);
        promptRemoveRoomslb = new JLabel(this.image);
        promptRemoveRoomslb.setSize(720, 460);
        promptRemoveRoomslb.setLayout(new BorderLayout());
        this.mainWind.add(promptRemoveRoomslb);
        GridBagConstraints gbc = new GridBagConstraints();
        Font font = new Font("Comic Sans MS", Font.PLAIN, 30);

        // Top Panel
        gbc.insets = new Insets(2, 0 ,2 ,0);
        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new GridBagLayout());
        panelNorth.setOpaque(false);
        JLabel titleLb = new JLabel("Hotel Reservation System");
        titleLb.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        titleLb.setForeground(Color.WHITE);
        gbc.gridy = 0;
        panelNorth.add(titleLb, gbc);
        hintLb.setText("What do you want to do?");
        hintLb.setFont(font);
        hintLb.setForeground(Color.WHITE);
        gbc.gridy = 1;
        panelNorth.add(hintLb, gbc);
        promptRemoveRoomslb.add(panelNorth, BorderLayout.NORTH);

        // Center Panel
        Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 20);
        gbc.insets = new Insets(5, 5 ,5 ,5);
        JPanel panelSome = new JPanel();
        panelSome.setLayout(new GridBagLayout());
        panelSome.setOpaque(false);
        JLabel hName = new JLabel("Room Selection: ");
        hName.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        hName.setForeground(Color.WHITE);
        gbc.gridy = 0;
        panelSome.add(hName, gbc);
        RoomList.setVisibleRowCount(4);
        RoomList.setFont(font);
        RoomList.setForeground(Color.WHITE);
        RoomList.setBackground(new Color(0, 0, 0,0));
        RoomList.setOpaque(false);
        JScrollPane list = new JScrollPane(RoomList);
        list.setOpaque(false);
        list.getViewport().setOpaque(false);
        list.setBorder(new LineBorder(Color.WHITE, 6));
        list.setPreferredSize(new Dimension(300, 200));
        list.getVerticalScrollBar().setOpaque(false);
        gbc.gridy = 0;
        panelSome.add(list, gbc);
        backRemoveRBtn.setText("Back");
        setButton(backRemoveRBtn,font);
        gbc.gridy = 1;
        panelSome.add(backRemoveRBtn, gbc);
        removeRBtn.setText("Remove");
        setButton(removeRBtn,font);
        gbc.gridy = 1;
        gbc.gridx = 2;
        panelSome.add(removeRBtn, gbc);
        promptRemoveRoomslb.add(panelSome,BorderLayout.CENTER);

        this.promptRemoveRoomslb.setVisible(true);
    }

    public void ViewHotel(){
        this.menulightlb.setVisible(false);
        viewHotellb = new JLabel(this.image);
        viewHotellb.setSize(720, 460);
        viewHotellb.setLayout(new BorderLayout());
        this.mainWind.add(viewHotellb);
        GridBagConstraints gbc = new GridBagConstraints();
        Font font = new Font("Comic Sans MS", Font.PLAIN, 30);

        // Top Panel
        gbc.insets = new Insets(2, 0 ,2 ,0);
        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new GridBagLayout());
        panelNorth.setOpaque(false);
        JLabel titleLb = new JLabel("Hotel Reservation System");
        titleLb.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        titleLb.setForeground(Color.WHITE);
        gbc.gridy = 0;
        panelNorth.add(titleLb, gbc);
        JLabel hintLb = new JLabel("What do you want to do?");
        hintLb.setFont(font);
        hintLb.setForeground(Color.WHITE);
        gbc.gridy = 1;
        panelNorth.add(hintLb, gbc);
        Hname.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        Hname.setForeground(Color.WHITE);
        gbc.insets = new Insets(0, 0 ,0 ,0);
        gbc.gridy = 2;
        panelNorth.add(Hname, gbc);
        viewHotellb.add(panelNorth,BorderLayout.NORTH);

        // Center Panel
        Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 20);
        gbc.insets = new Insets(15, 15 ,15 ,15);
        JPanel panelSome = new JPanel();
        panelSome.setLayout(new GridBagLayout());
        panelSome.setOpaque(false);
        viewHLevelBtn.setText("<html>View High-Level<br/>Hotel Information<html>");
        setButton(viewHLevelBtn, buttonFont);
        viewHLevelBtn.setPreferredSize(new Dimension(200,70));
        viewLLevelBtn.setText("<html>View Low-Level<br/>Hotel Information<html>");
        setButton(viewLLevelBtn, buttonFont);
        viewLLevelBtn.setPreferredSize(new Dimension(200,70));
        backVHBtn.setText("Back");
        setButton(backVHBtn, buttonFont);
        gbc.gridy = 0;
        panelSome.add(viewHLevelBtn, gbc);
        gbc.gridy = 1;
        panelSome.add(viewLLevelBtn, gbc);
        gbc.gridy = 2;
        panelSome.add(backVHBtn, gbc);
        viewHotellb.add(panelSome,BorderLayout.CENTER);

        this.viewHotellb.setVisible(true);
    }

    public void ViewHighH(){
        this.viewHotellb.setVisible(false);
        viewHighHlb = new JLabel(this.image);
        viewHighHlb.setSize(720, 460);
        viewHighHlb.setLayout(new BorderLayout());
        this.mainWind.add(viewHighHlb);
        GridBagConstraints gbc = new GridBagConstraints();
        Font font = new Font("Comic Sans MS", Font.PLAIN, 30);

        // Top Panel
        gbc.insets = new Insets(2, 0 ,2 ,0);
        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new GridBagLayout());
        panelNorth.setOpaque(false);
        JLabel titleLb = new JLabel("Hotel Reservation System");
        titleLb.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        titleLb.setForeground(Color.WHITE);
        gbc.gridy = 0;
        panelNorth.add(titleLb, gbc);
        viewHighHlb.add(panelNorth,BorderLayout.NORTH);

        // Center Panel
        Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 20);
        gbc.insets = new Insets(3, 0 ,4,0);
        JPanel panelSome = new JPanel();
        panelSome.setLayout(new GridBagLayout());
        panelSome.setOpaque(false);
        TextDisplay.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
        TextDisplay.setEditable(false);
        TextDisplay.setOpaque(false);
        TextDisplay.setBackground(new Color(0,0,0,0));
        TextDisplay.setForeground(Color.WHITE);
        TextDisplay.setPreferredSize(new Dimension(500, 270));
        panelSome.add(TextDisplay, gbc);
        gbc.gridy = 1;
        backVHHBtn.setText("Back");
        setButton(backVHHBtn, font);
        backVHHBtn.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        panelSome.add(backVHHBtn, gbc);
        viewHighHlb.add(panelSome,BorderLayout.CENTER);

        this.viewHighHlb.setVisible(true);
    }

    public void ViewLowH(){
        this.viewHotellb.setVisible(false);
        viewLowHlb = new JLabel(this.image);
        viewLowHlb.setSize(720, 460);
        viewLowHlb.setLayout(new BorderLayout());
        this.mainWind.add(viewLowHlb);
        GridBagConstraints gbc = new GridBagConstraints();
        Font font = new Font("Comic Sans MS", Font.PLAIN, 30);

        // Top Panel
        gbc.insets = new Insets(2, 0 ,2 ,0);
        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new GridBagLayout());
        panelNorth.setOpaque(false);
        JLabel titleLb = new JLabel("Hotel Reservation System");
        titleLb.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        titleLb.setForeground(Color.WHITE);
        gbc.gridy = 0;
        panelNorth.add(titleLb, gbc);
        hintLb.setText("What do you want to do?");
        hintLb.setFont(font);
        hintLb.setForeground(Color.WHITE);
        gbc.gridy = 1;
        panelNorth.add(hintLb, gbc);
        Hname.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        Hname.setForeground(Color.WHITE);
        gbc.insets = new Insets(0, 0 ,0 ,0);
        gbc.gridy = 2;
        panelNorth.add(Hname, gbc);
        viewLowHlb.add(panelNorth,BorderLayout.NORTH);

        // Center Panel
        Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 20);
        gbc.insets = new Insets(15, 15 ,15 ,15);
        JPanel panelSome = new JPanel();
        panelSome.setLayout(new GridBagLayout());
        panelSome.setOpaque(false);
        numBookedRBtn.setText("<html>View Number<br/>of Booked Rooms<html>");
        setButton(numBookedRBtn, buttonFont);
        numBookedRBtn.setPreferredSize(new Dimension(200,100));
        roomInfoBtn.setText("<html>Information of<br/>Selected Room<html>");
        setButton(roomInfoBtn, buttonFont);
        roomInfoBtn.setPreferredSize(new Dimension(200,100));
        rsvInfoBtn.setText("<html>Information of <br/>Selected Reservation<html>");
        setButton(rsvInfoBtn, buttonFont);
        rsvInfoBtn.setPreferredSize(new Dimension(200,100));
        backVLHBtn.setText("Back");
        setButton(backVLHBtn, buttonFont);
        gbc.gridy = 0;
        panelSome.add(numBookedRBtn, gbc);
        panelSome.add(roomInfoBtn, gbc);
        panelSome.add(rsvInfoBtn, gbc);
        gbc.gridy = 1;
        gbc.gridwidth = 5;
        panelSome.add(backVLHBtn, gbc);
        viewLowHlb.add(panelSome,BorderLayout.CENTER);

        this.viewLowHlb.setVisible(true);
    }

    public void ViewBookedRoom(){
        this.viewLowHlb.setVisible(false);
        viewBookedRoomlb = new JLabel(this.image);
        viewBookedRoomlb.setSize(720, 460);
        viewBookedRoomlb.setLayout(new BorderLayout());
        this.mainWind.add(viewBookedRoomlb);
        GridBagConstraints gbc = new GridBagConstraints();
        Font font = new Font("Comic Sans MS", Font.PLAIN, 30);

        // Top Panel
        gbc.insets = new Insets(2, 0 ,2 ,0);
        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new GridBagLayout());
        panelNorth.setOpaque(false);
        JLabel titleLb = new JLabel("Hotel Reservation System");
        titleLb.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        titleLb.setForeground(Color.WHITE);
        gbc.gridy = 0;
        panelNorth.add(titleLb, gbc);
        viewBookedRoomlb.add(panelNorth,BorderLayout.NORTH);

        // Center Panel
        gbc.insets = new Insets(3, 0 ,4,0);
        JPanel panelSome = new JPanel();
        panelSome.setLayout(new GridBagLayout());
        panelSome.setOpaque(false);
        TextDisplay.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
        TextDisplay.setEditable(false);
        TextDisplay.setOpaque(false);
        TextDisplay.setBackground(new Color(0,0,0,0));
        TextDisplay.setForeground(Color.WHITE);
        TextDisplay.setPreferredSize(new Dimension(500, 270));
        DropDown.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
        DropDown.setOpaque(false);
        DropDown.setPreferredSize(new Dimension(80, 70));
        panelSome.add(TextDisplay, gbc);
        panelSome.add(DropDown, gbc);
        gbc.gridy = 1;
        backBookedBtn.setText("Back");
        setButton(backBookedBtn, font);
        backBookedBtn.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        panelSome.add(backBookedBtn, gbc);
        viewBookedRoomlb.add(panelSome,BorderLayout.CENTER);

        this.viewBookedRoomlb.setVisible(true);
    }

    public void ViewSelectedRoom(){
        this.viewLowHlb.setVisible(false);
        viewSelectedRoomlb = new JLabel(this.image);
        viewSelectedRoomlb.setSize(720, 460);
        viewSelectedRoomlb.setLayout(new BorderLayout());
        this.mainWind.add(viewSelectedRoomlb);
        GridBagConstraints gbc = new GridBagConstraints();
        Font font = new Font("Comic Sans MS", Font.PLAIN, 30);

        // Top Panel
        gbc.insets = new Insets(2, 0 ,2 ,0);
        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new GridBagLayout());
        panelNorth.setOpaque(false);
        JLabel titleLb = new JLabel("Hotel Reservation System");
        titleLb.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        titleLb.setForeground(Color.WHITE);
        gbc.gridy = 0;
        panelNorth.add(titleLb, gbc);
        hintLb.setText("What do you want to do?");
        hintLb.setFont(font);
        hintLb.setForeground(Color.WHITE);
        gbc.gridy = 1;
        panelNorth.add(hintLb, gbc);
        viewSelectedRoomlb.add(panelNorth, BorderLayout.NORTH);

        // Center Panel
        Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 20);
        gbc.insets = new Insets(5, 5 ,5 ,5);
        JPanel panelSome = new JPanel();
        panelSome.setLayout(new GridBagLayout());
        panelSome.setOpaque(false);
        JLabel hName = new JLabel("Room Selection: ");
        hName.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        hName.setForeground(Color.WHITE);
        gbc.gridy = 0;
        panelSome.add(hName, gbc);
        RoomList.setVisibleRowCount(4);
        RoomList.setFont(font);
        RoomList.setForeground(Color.WHITE);
        RoomList.setBackground(new Color(0, 0, 0,0));
        RoomList.setOpaque(false);
        JScrollPane list = new JScrollPane(RoomList);
        list.setOpaque(false);
        list.getViewport().setOpaque(false);
        list.setBorder(new LineBorder(Color.WHITE, 6));
        list.setPreferredSize(new Dimension(300, 200));
        list.getVerticalScrollBar().setOpaque(false);
        gbc.gridy = 0;
        panelSome.add(list, gbc);
        backSRoomBtn.setText("Back");
        setButton(backSRoomBtn,font);
        gbc.gridy = 1;
        panelSome.add(backSRoomBtn, gbc);
        selectRoomBtn.setText("Select");
        setButton(selectRoomBtn,font);
        gbc.gridy = 1;
        gbc.gridx = 2;
        panelSome.add(selectRoomBtn, gbc);
        viewSelectedRoomlb.add(panelSome,BorderLayout.CENTER);

        this.viewSelectedRoomlb.setVisible(true);
    }

    public void ViewRoom(){
        this.viewSelectedRoomlb.setVisible(false);
        viewRoomlb = new JLabel(this.image);
        viewRoomlb.setSize(720, 460);
        viewRoomlb.setLayout(new BorderLayout());
        this.mainWind.add(viewRoomlb);
        GridBagConstraints gbc = new GridBagConstraints();
        Font font = new Font("Comic Sans MS", Font.PLAIN, 30);

        // Top Panel
        gbc.insets = new Insets(2, 0 ,2 ,0);
        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new GridBagLayout());
        panelNorth.setOpaque(false);
        JLabel titleLb = new JLabel("Hotel Reservation System");
        titleLb.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        titleLb.setForeground(Color.WHITE);
        gbc.gridy = 0;
        panelNorth.add(titleLb, gbc);
        viewRoomlb.add(panelNorth,BorderLayout.NORTH);

        // Center Panel
        Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 20);
        gbc.insets = new Insets(3, 0 ,4,0);
        JPanel panelSome = new JPanel();
        panelSome.setLayout(new GridBagLayout());
        panelSome.setOpaque(false);
        TextDisplay.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        TextDisplay.setEditable(false);
        TextDisplay.setOpaque(false);
        TextDisplay.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE,4),"Room Information", TitledBorder.CENTER,TitledBorder.TOP, new Font("Comic Sans MS", Font.PLAIN, 22), Color.WHITE));
        TextDisplay.setBackground(new Color(0,0,0,0));
        TextDisplay.setForeground(Color.WHITE);
        TextDisplay.setPreferredSize(new Dimension(500, 110));
        gbc.gridy = 0;
        panelSome.add(TextDisplay, gbc);
        RoomBooked.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
        RoomBooked.setOpaque(false);
        RoomBooked.setBackground(new Color(0,0,0,0));
        RoomBooked.setForeground(Color.WHITE);
        RoomBooked.setDefaultEditor(Object.class,null);
        RoomBooked.setRowHeight(30);
        JScrollPane list = new JScrollPane(RoomBooked);
        list.setOpaque(false);
        list.getViewport().setOpaque(false);
        list.setBorder(new LineBorder(Color.WHITE, 6));
        list.setPreferredSize(new Dimension(400, 150));
        list.getVerticalScrollBar().setOpaque(false);
        gbc.gridy = 1;
        panelSome.add(list, gbc);
        gbc.gridy = 2;
        backRoomBtn.setText("Back");
        setButton(backRoomBtn, font);
        backRoomBtn.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        panelSome.add(backRoomBtn, gbc);
        viewRoomlb.add(panelSome,BorderLayout.CENTER);

        this.viewRoomlb.setVisible(true);
    }

    public void ViewRoomReservation(){
        this.viewLowHlb.setVisible(false);
        viewRoomReservationlb = new JLabel(this.image);
        viewRoomReservationlb.setSize(720, 460);
        viewRoomReservationlb.setLayout(new BorderLayout());
        this.mainWind.add(viewRoomReservationlb);
        GridBagConstraints gbc = new GridBagConstraints();
        Font font = new Font("Comic Sans MS", Font.PLAIN, 30);

        // Top Panel
        gbc.insets = new Insets(2, 0 ,2 ,0);
        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new GridBagLayout());
        panelNorth.setOpaque(false);
        JLabel titleLb = new JLabel("Hotel Reservation System");
        titleLb.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        titleLb.setForeground(Color.WHITE);
        gbc.gridy = 0;
        panelNorth.add(titleLb, gbc);
        hintLb.setText("What do you want to do?");
        hintLb.setFont(font);
        hintLb.setForeground(Color.WHITE);
        gbc.gridy = 1;
        panelNorth.add(hintLb, gbc);
        viewRoomReservationlb.add(panelNorth, BorderLayout.NORTH);

        // Center Panel
        Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 20);
        gbc.insets = new Insets(5, 5 ,5 ,5);
        JPanel panelSome = new JPanel();
        panelSome.setLayout(new GridBagLayout());
        panelSome.setOpaque(false);
        JLabel hName = new JLabel("Reservation Selection: ");
        hName.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        hName.setForeground(Color.WHITE);
        gbc.gridy = 0;
        panelSome.add(hName, gbc);
        ReservationList.setVisibleRowCount(4);
        ReservationList.setFont(font);
        ReservationList.setForeground(Color.WHITE);
        ReservationList.setBackground(new Color(0, 0, 0,0));
        ReservationList.setOpaque(false);
        JScrollPane list = new JScrollPane(ReservationList);
        list.setOpaque(false);
        list.getViewport().setOpaque(false);
        list.setBorder(new LineBorder(Color.WHITE, 6));
        list.setPreferredSize(new Dimension(300, 200));
        list.getVerticalScrollBar().setOpaque(false);
        gbc.gridy = 0;
        panelSome.add(list, gbc);
        backSReservationBtn.setText("Back");
        setButton(backSReservationBtn,font);
        gbc.gridy = 1;
        panelSome.add(backSReservationBtn, gbc);
        selectReservationBtn.setText("Select");
        setButton(selectReservationBtn,font);
        gbc.gridy = 1;
        gbc.gridx = 2;
        panelSome.add(selectReservationBtn, gbc);
        viewRoomReservationlb.add(panelSome,BorderLayout.CENTER);

        this.viewRoomReservationlb.setVisible(true);
    }

    public void RetryStartScreen(){
        this.menulightlb.setVisible(false);
        StartScreen();
    }

    public void RetryCreateHotelScreen(){
        this.menulightlb.setVisible(false);
        CreateHotel();
    }

    public void RetryCOpCreateHotelScreen(){
        this.promptCHllb.setVisible(false);
        CreateHotel();
    }

    public void RetrySOpCreateHotelScreen(){
        this.promptSHllb.setVisible(false);
        CreateHotel();
    }

    public void RetryMHHotelMenu(){
        this.manageHotellb.setVisible(false);
        HotelMenu();
    }

    public void RetryVHHotelMenu(){
        this.viewHotellb.setVisible(false);
        HotelMenu();
    }

    public void RetrySOHotelMenu(){
        this.promptSHllb.setVisible(false);
        HotelMenu();
    }

    public void RetryViewLHotel(){
        this.viewLowHlb.setVisible(false);
        ViewHotel();
    }

    public void RetryViewBookedHotel(){
        this.viewBookedRoomlb.setVisible(false);
        ViewLowH();
    }

    public void RetryViewRoomSHotel(){
        this.viewSelectedRoomlb.setVisible(false);
        ViewLowH();
    }

    public void RetryViewSelectRoom(){
        this.viewRoomlb.setVisible(false);
        ViewSelectedRoom();
    }

    public void RetryViewReservationSHotel(){
        this.viewRoomReservationlb.setVisible(false);
        ViewLowH();
    }

    public void RetryViewHHotel(){
        this.viewHighHlb.setVisible(false);
        ViewHotel();
    }

    public void RetryChangeMHotel(){
        this.promptChangeHNamelb.setVisible(false);
        ManageHotel();
    }

    public void RetryAddRooms(){
        this.promptAddRoomslb.setVisible(false);
        ManageHotel();
    }

    public void RetryRemoveRooms(){
        this.promptRemoveRoomslb.setVisible(false);
        ManageHotel();
    }

    public void setButton(JButton name, Font font){
        LineBorder border = new LineBorder(Color.WHITE, 6);
        name.setPreferredSize(new Dimension(150,70));
        name.setFont(font);
        name.setForeground(Color.WHITE);
        name.setBorder(border);
    }

    public String getHintlbText(){
        return this.hintLb.getText();
    }

    public void setHintlbText(String text){
        this.hintLb.setText(text);
    }

    public String gethTf1strText(){
        return this.hTf1str.getText();
    }

    public void sethTf1strText(String text){
        this.hTf1str.setText(text);
    }

    public String gethTf2intText(){
        return this.hTf2int.getText();
    }

    public void sethTf2intText(String text){
        this.hTf2int.setText(text);
    }

    public String gethTf3intText(){
        return this.hTf3int.getText();
    }

    public void sethTf3intText(String text){
        this.hTf3int.setText(text);
    }

    public String gethTf4intText(){
        return this.hTf4int.getText();
    }

    public void sethTf4intText(String text){
        this.hTf4int.setText(text);
    }

    public String gethTf5doubleText(){
        return this.hTf5double.getText();
    }

    public void sethTf5doubleText(String text){
        this.hTf5double.setText(text);
    }

    public void sethTf5doubleEdit(boolean result){
        this.hTf5double.setEditable(result);
    }

    public void sethTf5doubleColor(Color color){
        this.hTf5double.setBackground(color);
    }

    public int getSelectedName(){
        return this.HotelList.getSelectedIndex();
    }

    public int getRoomName(){
        return (int) this.RoomList.getSelectedValue();
    }

    public void setHotelList(String[] names){
        HotelList = new JList(names);
    }

    public void setRoomList(Integer[] names){
        RoomList = new JList(names);
    }

    public void setReservationList(String[] names){
        ReservationList = new JList(names);
    }

    public void setHotelName(String name){
        this.Hname.setText("Hotel " + name);
    }

    public void setTextDisplay(String text){
        this.TextDisplay.setText(text);
    }

    public int getDropDownItem(){
        return (int) this.DropDown.getSelectedItem();
    }

    public void setRoomBooked(String[] booked){
        String[][] date = new String[31][2];
        String[] title = {"Date", "Availability"};
        for (int i=1; i<=31;i++) {
            date[i - 1][0] = String.valueOf(i);
            date[i - 1][1] = booked[i-1];
        }

        RoomBooked = new JTable(date, title);
    }

    public void clearTextFields(){
        this.hTf1str.setText("Enter text...");
        this.hTf2int.setText("Enter value...");
        this.hTf3int.setText("Enter value...");
        this.hTf4int.setText("Enter value...");
        this.hTf5double.setText("Enter value...");
    }

    // Add Action Listeners
    public void setStrtBtnActionListener(ActionListener listener){this.strtBtn.addActionListener(listener);}
    public void setExitBtnActionListener(ActionListener listener){this.exitBtn.addActionListener(listener);}
    public void setBackBtnActionListener(ActionListener listener){this.backBtn.addActionListener(listener);}
    public void setBackMHBtnActionListener(ActionListener listener){this.backMHBtn.addActionListener(listener);}
    public void setCreateHBtnActionListener(ActionListener listener){this.createHBtn.addActionListener(listener);}
    public void setExitHBtnActionListener(ActionListener listener){this.exitHBtn.addActionListener(listener);}
    public void setManageHBtnActionListener(ActionListener listener){this.manageHBtn.addActionListener(listener);}
    public void setViewHBtnActionListener(ActionListener listener){this.viewHBtn.addActionListener(listener);}
    public void setBackVHBtnActionListener(ActionListener listener){this.backVHBtn.addActionListener(listener);}
    public void setViewLLevelBtnActionListener(ActionListener listener){this.viewLLevelBtn.addActionListener(listener);}
    public void setBackVLHBtnActionListener(ActionListener listener){this.backVLHBtn.addActionListener(listener);}
    public void setBackCOpHBtnActionListener(ActionListener listener){this.backCOpHBtn.addActionListener(listener);}
    public void setUpdPriceBtnActionListener(ActionListener listener){this.updPriceBtn.addActionListener(listener);}
    public void setSelectHBtnActionListener(ActionListener listener){this.selectHBtn.addActionListener(listener);}
    public void setSelectOpHBtnActionListener(ActionListener listener){this.selectOpHBtn.addActionListener(listener);}
    public void setBackSOpHBtnActionListener(ActionListener listener){this.backSOpHBtn.addActionListener(listener);}
    public void setCreateOpHBtnActionListener(ActionListener listener){this.createOpHBtn.addActionListener(listener);}
    public void setViewHLevelBtnActionListener(ActionListener listener){this.viewHLevelBtn.addActionListener(listener);}
    public void setBackVHHBtnActionListener(ActionListener listener){this.backVHHBtn.addActionListener(listener);}
    public void setNumBookedRBtnActionListener(ActionListener listener){this.numBookedRBtn.addActionListener(listener);}
    public void setBackBookedBtnActionListener(ActionListener listener){this.backBookedBtn.addActionListener(listener);}
    public void setDropDownActionListener(ActionListener listener){this.DropDown.addActionListener(listener);}
    public void setRoomInfoBtnActionListener(ActionListener listener){this.roomInfoBtn.addActionListener(listener);}
    public void setSelectRoomBtnActionListener(ActionListener listener){this.selectRoomBtn.addActionListener(listener);}
    public void setBackSRoomBtnActionListener(ActionListener listener){this.backSRoomBtn.addActionListener(listener);}
    public void setRsvInfoBtnActionListener(ActionListener listener){this.rsvInfoBtn.addActionListener(listener);}
    public void setSelectReservationBtnActionListener(ActionListener listener){this.selectReservationBtn.addActionListener(listener);}
    public void setBackSReservationBtnActionListener(ActionListener listener){this.backSReservationBtn.addActionListener(listener);}
    public void setBackRoomBtnActionListener(ActionListener listener){this.backRoomBtn.addActionListener(listener);}
    public void setBackChangeNHBtnActionListener(ActionListener listener){this.backChangeNHBtn.addActionListener(listener);}
    public void setChangeNHBtnActionListener(ActionListener listener){this.changeNHBtn.addActionListener(listener);}
    public void setChangeHNameBtnActionListener(ActionListener listener){this.changeHNameBtn.addActionListener(listener);}
    public void setBackAddRBtnActionListener(ActionListener listener){this.backAddRBtn.addActionListener(listener);}
    public void setAddRBtnActionListener(ActionListener listener){this.addRBtn.addActionListener(listener);}
    public void setAddRoomBtnActionListener(ActionListener listener){this.addRoomBtn.addActionListener(listener);}
    public void setBackRemoveRBtnActionListener(ActionListener listener){this.backRemoveRBtn.addActionListener(listener);}
    public void setRemoveRBtnActionListener(ActionListener listener){this.removeRBtn.addActionListener(listener);}
    public void setRemoveRoomBtnActionListener(ActionListener listener){this.removeRoomBtn.addActionListener(listener);}

    // Add Mouse Listener
    public void setStrtBtnMouseListener(MouseListener listener){this.strtBtn.addMouseListener(listener);}
    public void setExitBtnnMouseListener(MouseListener listener){this.exitBtn.addMouseListener(listener);}
    public void setCreateHBtnMouseListener(MouseListener listener){this.createHBtn.addMouseListener(listener);}
    public void setSelectHBtnMouseListener(MouseListener listener){this.selectHBtn.addMouseListener(listener);}
    public void setCreateOpHBtnListener(MouseListener listener){this.createOpHBtn.addMouseListener(listener);}

    // Add Focus Listener
    public void sethTf1strFocusListener(FocusListener listener){this.hTf1str.addFocusListener(listener);}
    public void sethTf2intFocusListener(FocusListener listener){this.hTf2int.addFocusListener(listener);}
    public void sethTf3intFocusListener(FocusListener listener){this.hTf3int.addFocusListener(listener);}
    public void sethTf4intFocusListener(FocusListener listener){this.hTf4int.addFocusListener(listener);}
    public void sethTf5doubleFocusListener(FocusListener listener){this.hTf5double.addFocusListener(listener);}
}
