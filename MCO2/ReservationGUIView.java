
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

/**
 * The ReservationGUIView class is the controller which is responsible for displaying the GUI of the program.
 * The User inputs will then be used for the InputController class to communicate with the Model.
 */
public class ReservationGUIView{
    private JFrame mainWind;
    private ImageIcon image;
    private JLabel welcomelb, menulightlb, hotelCreatelb, manageHotellb, viewHotellb, viewLowHlb, promptCHllb, promptSHllb, hintLb, Hname, viewHighHlb, viewBookedRoomlb;
    private JLabel viewSelectedRoomlb, viewRoomReservationlb, viewRoomlb, viewReservationlb;
    private JLabel promptChangeHNamelb, promptAddRoomslb, promptRemoveRoomslb, promptUpdatePlb, promptSimulatelb, promptRemoveRsvlb, promptDpmlb;
    private JTextField hTf1str, hTf2int, hTf3int, hTf4int, hTf5double, hTf6str;
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
    private JButton backRemoveRsvBtn, removeRsvBtn;
    private JButton backUpdatePBtn, updateBasePBtn;
    private JButton backSimulateBtn, simulateBtn, discountBtn;
    private JButton backDpmBtn, modifyDpmBtn;
    private JTable RoomBooked;
    private JComboBox<Integer> DropDown;
    private JComboBox<String> RoomTypeDropDown;
    private JComboBox<Integer> DateDropDown;
    private JList<String> HotelList;
    private JList<Integer> RoomList;
    private JList<String> ReservationList;
    private JTextArea TextDisplay, TextDisplay2;

    /**
     * Constructor that initializes all the attributes such as JButton, JList, etc.
     * Also initializes the Main window where everything is shown.
     *
     */
    public ReservationGUIView() {

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
        backUpdatePBtn = new JButton();
        updateBasePBtn = new JButton();
        backSimulateBtn = new JButton();
        simulateBtn = new JButton();
        discountBtn = new JButton();
        backReservationBtn = new JButton();
        backRemoveRsvBtn = new JButton();
        removeRsvBtn = new JButton();
        backDpmBtn = new JButton();
        modifyDpmBtn = new JButton();
        Hname = new JLabel();
        hTf1str = new JTextField();
        hTf2int = new JTextField();
        hTf3int = new JTextField();
        hTf4int = new JTextField();
        hTf5double = new JTextField();
        hTf6str = new JTextField();
        TextDisplay = new JTextArea();
        TextDisplay2 = new JTextArea();
        Integer date[] = new Integer[31];
        for (int i = 1; i<=31;i++){
            date[i-1]=i;
        }
        DropDown = new JComboBox<>(date);
        DateDropDown = new JComboBox<>(date);
        this.hTf1str.setText("Enter text...");
        this.hTf2int.setText("Enter value...");
        this.hTf3int.setText("Enter value...");
        this.hTf4int.setText("Enter value...");
        this.hTf5double.setText("Enter value...");
        this.hTf6str.setText("Enter text...");



        StartScreen();

        this.mainWind.setVisible(true);
    }

    /**
     * The Start Screen of the GUI.
     *
     */
    public final void StartScreen(){
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

    /**
     * The GUI of this section contains the buttons where you either create or select hotel.
     *
     */
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

    /**
     * The GUI of this section contains the textfields to create hotel.
     *
     */
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

    /**
     * The GUI of this section contains the List of all hotels created to be selected.
     *
     */
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

    /**
     * The GUI of this section contains all the options that can be done to a hotel such as "simulate booking".
     *
     */
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

    /**
     * The GUI of this section contains the inputs needed to simulate a booking.
     *
     */
    public void promptSimulateBooking(){
        this.menulightlb.setVisible(false);
        promptSimulatelb = new JLabel(this.image);
        promptSimulatelb.setSize(720, 460);
        promptSimulatelb.setLayout(new BorderLayout());
        this.mainWind.add(promptSimulatelb);
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
        promptSimulatelb.add(panelNorth, BorderLayout.NORTH);

        // Center Panel
        Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 20);
        gbc.insets = new Insets(5, 5 ,5 ,5);
        JPanel panelSome = new JPanel();
        panelSome.setLayout(new GridBagLayout());
        panelSome.setOpaque(false);
        JLabel rName = new JLabel("Name of Reservation: ");
        rName.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        rName.setForeground(Color.WHITE);
        hTf1str.setColumns(20);
        hTf1str.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        hTf1str.setBorder(new LineBorder(Color.BLACK, 3));
        gbc.gridy = 0;
        panelSome.add(rName, gbc);
        panelSome.add(hTf1str, gbc);
        gbc.gridy = 1;
        JLabel ciNum = new JLabel("Check-in Time: ");
        ciNum.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        ciNum.setForeground(Color.WHITE);
        hTf2int.setColumns(20);
        hTf2int.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        hTf2int.setBorder(new LineBorder(Color.BLACK, 3));
        panelSome.add(ciNum, gbc);
        panelSome.add(hTf2int, gbc);
        gbc.gridy = 2;
        JLabel coNum = new JLabel("Check-out Time: ");
        coNum.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        coNum.setForeground(Color.WHITE);
        hTf3int.setColumns(20);
        hTf3int.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        hTf3int.setBorder(new LineBorder(Color.BLACK, 3));
        panelSome.add(coNum, gbc);
        panelSome.add(hTf3int, gbc);
        gbc.gridy = 3;
        JLabel rType = new JLabel("Room Type: ");
        rType.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        rType.setForeground(Color.WHITE);
        RoomTypeDropDown.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        RoomTypeDropDown.setOpaque(false);
        panelSome.add(rType, gbc);
        panelSome.add(RoomTypeDropDown, gbc);
        gbc.gridy = 4;
        JLabel DiscountCode = new JLabel("Discount Code: ");
        DiscountCode.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        DiscountCode.setForeground(Color.WHITE);
        hTf6str.setColumns(20);
        hTf6str.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        hTf6str.setEditable(false);
        hTf6str.setBorder(new LineBorder(Color.BLACK, 3));
        hTf6str.setBackground(new Color(0, 0, 0,0));
        discountBtn.setText("Discount Price?");
        setButton(discountBtn,buttonFont);
        discountBtn.setPreferredSize(new Dimension(150,35));
        panelSome.add(DiscountCode, gbc);
        panelSome.add(hTf6str, gbc);
        panelSome.add(discountBtn, gbc);
        gbc.gridy = 5;
        simulateBtn.setText("Book a Room");
        setButton(simulateBtn,buttonFont);
        backSimulateBtn.setText("Back");
        setButton(backSimulateBtn,buttonFont);
        gbc.gridx = -1;
        panelSome.add(backSimulateBtn,gbc);
        gbc.gridx = 2;
        panelSome.add(simulateBtn, gbc);
        promptSimulatelb.add(panelSome,BorderLayout.CENTER);

        this.promptSimulatelb.setVisible(true);
    }

    /**
     * The GUI of this section contains the inputs to modify a price given a date using JComboBox.
     *
     */
    public void promptDatePriceModifier(){
        this.menulightlb.setVisible(false);
        promptDpmlb = new JLabel(this.image);
        promptDpmlb.setSize(720, 460);
        promptDpmlb.setLayout(new BorderLayout());
        this.mainWind.add(promptDpmlb);
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
        promptDpmlb.add(panelNorth,BorderLayout.NORTH);

        // Center Panel
        gbc.insets = new Insets(5, 5 ,5 ,5);
        JPanel panelSome = new JPanel();
        panelSome.setLayout(new GridBagLayout());
        panelSome.setOpaque(false);
        gbc.gridy = 0;
        JLabel hName = new JLabel("Modify Price: ");
        hName.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        hName.setForeground(Color.WHITE);
        hTf5double.setColumns(20);
        hTf5double.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        hTf5double.setBorder(new LineBorder(Color.BLACK, 3));
        DateDropDown.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
        DateDropDown.setOpaque(false);
        DateDropDown.setPreferredSize(new Dimension(80, 70));
        panelSome.add(hName, gbc);
        panelSome.add(hTf5double, gbc);
        panelSome.add(DropDown, gbc);
        gbc.gridy = 1;
        backDpmBtn.setText("Back");
        setButton(backDpmBtn, font);
        backDpmBtn.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        gbc.insets = new Insets(15, 15 ,15 ,0);
        panelSome.add(backDpmBtn, gbc);
        modifyDpmBtn.setText("Modify");
        setButton(modifyDpmBtn, font);
        modifyDpmBtn.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        panelSome.add(modifyDpmBtn, gbc);
        promptDpmlb.add(panelSome,BorderLayout.CENTER);

        this.promptDpmlb.setVisible(true);
    }

    /**
     * The GUI of this section contains all the manage hotel options such as "Add Rooms".
     *
     */
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

    /**
     * The GUI of this section contains the input for changing the hotel name.
     *
     */
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

    /**
     * The GUI of this section contains the input for adding Standard, Deluxe, and Executive Rooms.
     *
     */
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

    /**
     * The GUI of this section contains the JList that contains all removable rooms.
     *
     */
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

    /**
     * The GUI of this section contains the input for updating the base price of the hotel.
     *
     */
    public void promptUpdateBasePrice(){
        this.manageHotellb.setVisible(false);
        promptUpdatePlb = new JLabel(this.image);
        promptUpdatePlb.setSize(720, 460);
        promptUpdatePlb.setLayout(new BorderLayout());
        this.mainWind.add(promptUpdatePlb);
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
        promptUpdatePlb.add(panelNorth, BorderLayout.NORTH);

        // Center Panel
        Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 20);
        gbc.insets = new Insets(5, 5 ,5 ,5);
        JPanel panelSome = new JPanel();
        panelSome.setLayout(new GridBagLayout());
        panelSome.setOpaque(false);
        JLabel hName = new JLabel("Update Base Price: ");
        hName.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        hName.setForeground(Color.WHITE);
        hTf5double.setColumns(20);
        hTf5double.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        hTf5double.setBorder(new LineBorder(Color.BLACK, 3));
        gbc.gridy = 0;
        panelSome.add(hName, gbc);
        panelSome.add(hTf5double, gbc);
        backUpdatePBtn.setText("Back");
        setButton(backUpdatePBtn,buttonFont);
        updateBasePBtn.setText("Change Name");
        setButton(updateBasePBtn,buttonFont);
        gbc.gridy = 1;
        panelSome.add(backUpdatePBtn,gbc);
        panelSome.add(updateBasePBtn, gbc);
        promptUpdatePlb.add(panelSome,BorderLayout.CENTER);

        this.promptUpdatePlb.setVisible(true);
    }

    /**
     * The GUI of this section contains the JList that contains all the removable reservations.
     *
     */
    public void promptRemoveReservations(){
        this.manageHotellb.setVisible(false);
        promptRemoveRsvlb = new JLabel(this.image);
        promptRemoveRsvlb.setSize(720, 460);
        promptRemoveRsvlb.setLayout(new BorderLayout());
        this.mainWind.add(promptRemoveRsvlb);
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
        promptRemoveRsvlb.add(panelNorth, BorderLayout.NORTH);

        // Center Panel
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
        list.setPreferredSize(new Dimension(250, 150));
        list.getVerticalScrollBar().setOpaque(false);
        gbc.gridy = 0;
        panelSome.add(list, gbc);
        backRemoveRsvBtn.setText("Back");
        setButton(backRemoveRsvBtn,font);
        gbc.gridy = 1;
        panelSome.add(backRemoveRsvBtn, gbc);
        removeRsvBtn.setText("Remove");
        setButton(removeRsvBtn,font);
        gbc.gridy = 1;
        gbc.gridx = 2;
        panelSome.add(removeRsvBtn, gbc);
        promptRemoveRsvlb.add(panelSome,BorderLayout.CENTER);

        this.promptRemoveRsvlb.setVisible(true);
    }

    /**
     * The GUI of this section contains the options for viewing hotel such as "View High-Level Information".
     *
     */
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
        viewHLevelBtn.setPreferredSize(new Dimension(200,65));
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

    /**
     * The GUI of this section contains the text area containing the high-level information of the hotel.
     *
     */
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
        gbc.insets = new Insets(3, 0 ,4,0);
        JPanel panelSome = new JPanel();
        panelSome.setLayout(new GridBagLayout());
        panelSome.setOpaque(false);
        TextDisplay.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
        TextDisplay.setEditable(false);
        TextDisplay.setOpaque(false);
        TextDisplay.setBackground(new Color(0,0,0,0));
        TextDisplay.setBorder(new LineBorder(Color.WHITE, 6));
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

    /**
     * The GUI of this section contains the choices for viewing low-level information of the hotel.
     *
     */
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

    /**
     * The GUI of this section contains the TextArea containing non-booked and booked rooms.
     *
     */
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
        TextDisplay.setBorder(new LineBorder(Color.WHITE, 6));
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

    /**
     * The GUI of this section contains the JList for selecting rooms.
     *
     */
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

    /**
     * The GUI of this section contains the TextArea for the information of the room.
     *
     */
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

    /**
     * The GUI of this section contains the JList for selecting reservations.
     *
     */
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
        list.setPreferredSize(new Dimension(250, 150));
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
        panelSome.add(selectReservationBtn, gbc);
        viewRoomReservationlb.add(panelSome,BorderLayout.CENTER);

        this.viewRoomReservationlb.setVisible(true);
    }

    /**
     * The GUI of this section contains the TextArea containing the information of the selected Reservation.
     *
     */
    public void ViewReservation(){
        this.viewRoomReservationlb.setVisible(false);
        viewReservationlb = new JLabel(this.image);
        viewReservationlb.setSize(720, 460);
        viewReservationlb.setLayout(new BorderLayout());
        this.mainWind.add(viewReservationlb);
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
        viewReservationlb.add(panelNorth,BorderLayout.NORTH);

        // Center Panel
        gbc.insets = new Insets(3, 0 ,4,0);
        JPanel panelSome = new JPanel();
        panelSome.setLayout(new GridBagLayout());
        panelSome.setOpaque(false);
        TextDisplay2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        TextDisplay2.setEditable(false);
        TextDisplay2.setOpaque(false);
        TextDisplay2.setBorder(new LineBorder(Color.WHITE,0));
        TextDisplay2.setBackground(new Color(0,0,0,0));
        TextDisplay2.setForeground(Color.WHITE);
        JScrollPane list = new JScrollPane(TextDisplay2);
        list.setOpaque(false);
        list.getViewport().setOpaque(false);
        list.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.WHITE,4),"Reservation Information", TitledBorder.CENTER,TitledBorder.TOP, new Font("Comic Sans MS", Font.PLAIN, 22), Color.WHITE));
        list.setPreferredSize(new Dimension(500, 270));
        list.getVerticalScrollBar().setOpaque(false);
        panelSome.add(list, gbc);
        gbc.gridy = 1;
        backReservationBtn.setText("Back");
        setButton(backReservationBtn, font);
        backReservationBtn.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        panelSome.add(backReservationBtn, gbc);
        viewReservationlb.add(panelSome,BorderLayout.CENTER);

        this.viewReservationlb.setVisible(true);
    }

    /**
     * For going back to the StartScreen menu.
     *
     */
    public void RetryStartScreen(){
        this.menulightlb.setVisible(false);
        StartScreen();
    }

    /**
     * For going back to the CreateHotel menu from the HotelMenu.
     *
     */
    public void RetryCreateHotelScreen(){
        this.menulightlb.setVisible(false);
        CreateHotel();
    }

    /**
     * For going back to the CreateHotel menu from the promptCreateHotel.
     *
     */
    public void RetryCOpCreateHotelScreen(){
        this.promptCHllb.setVisible(false);
        CreateHotel();
    }

    /**
     * For going back to the CreateHotel menu from the promptSelectHotel.
     *
     */
    public void RetrySOpCreateHotelScreen(){
        this.promptSHllb.setVisible(false);
        CreateHotel();
    }

    /**
     * For going back to the HotelMenu from the ManageHotel.
     *
     */
    public void RetryMHHotelMenu(){
        this.manageHotellb.setVisible(false);
        HotelMenu();
    }

    /**
     * For going back to the HotelMenu  from the ViewHotel.
     *
     */
    public void RetryVHHotelMenu(){
        this.viewHotellb.setVisible(false);
        HotelMenu();
    }

    /**
     * For going back to the HotelMenu from the SelectHotel.
     *
     */
    public void RetrySOHotelMenu(){
        this.promptSHllb.setVisible(false);
        HotelMenu();
    }

    /**
     * For going back to the ViewHotel from the ViewLowHotel.
     *
     */
    public void RetryViewLHotel(){
        this.viewLowHlb.setVisible(false);
        ViewHotel();
    }

    /**
     * For going back to the ViewLowHotel from the ViewBookedRoom.
     *
     */
    public void RetryViewBookedHotel(){
        this.viewBookedRoomlb.setVisible(false);
        ViewLowH();
    }

    /**
     * For going back to the ViewLowHotel from the ViewSelectRoom.
     *
     */
    public void RetryViewRoomSHotel(){
        this.viewSelectedRoomlb.setVisible(false);
        ViewLowH();
    }

    /**
     * For going back to the ViewSelectedRoom from the ViewRoom.
     *
     */
    public void RetryViewSelectRoom(){
        this.viewRoomlb.setVisible(false);
        ViewSelectedRoom();
    }

    /**
     * For going back to the ViewLowHotel from the ViewRoomReservation.
     *
     */
    public void RetryViewReservationSHotel(){
        this.viewRoomReservationlb.setVisible(false);
        ViewLowH();
    }

    /**
     * For going back to the ViewHotel from the viewHighHotel.
     *
     */
    public void RetryViewHHotel(){
        this.viewHighHlb.setVisible(false);
        ViewHotel();
    }

    /**
     * For going back to the ManageHotel from the promptChangeName.
     *
     */
    public void RetryChangeMHotel(){
        this.promptChangeHNamelb.setVisible(false);
        ManageHotel();
    }

    /**
     * For going back to the ManageHotel from the promptAddRooms.
     *
     */
    public void RetryAddRooms(){
        this.promptAddRoomslb.setVisible(false);
        ManageHotel();
    }

    /**
     * For going back to the ManageHotel from the promptRemoveRooms.
     *
     */
    public void RetryRemoveRooms(){
        this.promptRemoveRoomslb.setVisible(false);
        ManageHotel();
    }

    /**
     * For going back to the ManageHotel from the promptUpdatePrice.
     *
     */
    public void RetryUpdatePrice(){
        this.promptUpdatePlb.setVisible(false);
        ManageHotel();
    }

    /**
     * For going back to the CreateHotel from the ManageHotel.
     *
     */
    public void RetryRemoveHotel(){
        this.manageHotellb.setVisible(false);
        CreateHotel();
    }

    /**
     * For going back to the HotelMenu from the promptSimulateBooking.
     *
     */
    public void RetrySimulateBooking(){
        this.promptSimulatelb.setVisible(false);
        HotelMenu();
    }

    /**
     * For going back to the ViewRoomReservation from the ViewReservation.
     *
     */
    public void RetryViewReservation(){
        this.viewReservationlb.setVisible(false);
        ViewRoomReservation();
    }

    /**
     * For going back to the ManageHotel from the promptRemoveReservation.
     *
     */
    public void RetryRemoveRsv(){
        this.promptRemoveRsvlb.setVisible(false);
        ManageHotel();
    }

    /**
     * For going back to the HotelMenu from the promptDatePriceModifier.
     *
     */
    public void RetryDpm(){
        this.promptDpmlb.setVisible(false);
        HotelMenu();
    }

    public final void setButton(JButton name, Font font){
        LineBorder border = new LineBorder(Color.WHITE, 6);
        name.setOpaque(false);
        name.setPreferredSize(new Dimension(150,65));
        name.setFont(font);
        name.setForeground(Color.WHITE);
        name.setBackground(new Color(0,0,0,0));
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

    public String gethTf6strText(){
        return this.hTf6str.getText();
    }

    public void sethTf6strText(String text){
        this.hTf6str.setText(text);
    }

    public void sethTf6strEdit(boolean result){
        this.hTf6str.setEditable(result);
    }

    public void sethTf6strColor(Color color){
        this.hTf6str.setBackground(color);
    }

    public int getSelectedName(){
        return this.HotelList.getSelectedIndex();
    }

    public int getRoomName(){
        return (int) this.RoomList.getSelectedValue();
    }

    public void setHotelList(String[] names){
        HotelList = new JList<>(names);
    }

    public void setRoomList(Integer[] names){
        RoomList = new JList<>(names);
    }

    public void setRoomTypeDropDown(){
        String[] rType = {"Standard", "Deluxe", "Exclusive"};
        RoomTypeDropDown = new JComboBox<>(rType);
    }

    public int getRoomTypeDropDown(){
        return this.RoomTypeDropDown.getSelectedIndex();
    }

    public void setReservationList(String[] names){
        ReservationList = new JList<>(names);
    }

    public int getReservationIndex(){return this.ReservationList.getSelectedIndex();}

    public void setHotelName(String name){
        this.Hname.setText("Hotel " + name);
    }

    public void setTextDisplay(String text){
        this.TextDisplay.setText(text);
    }

    public void setTextDisplay2(String text){
        this.TextDisplay2.setText(text);
    }

    public int getDropDownItem(){
        return (int) this.DropDown.getSelectedItem();
    }

    public int getDateDropDownItem(){
        return (int) this.DateDropDown.getSelectedItem();
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
        this.hTf6str.setText("Enter text...");
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
    public void setUpdatePBtnActionListener(ActionListener listener){this.updatePBtn.addActionListener(listener);}
    public void setBackUpdatePBtnActionListener(ActionListener listener){this.backUpdatePBtn.addActionListener(listener);}
    public void setUpdateBasePBtnActionListener(ActionListener listener){this.updateBasePBtn.addActionListener(listener);}
    public void setRemoveHBtnActionListener(ActionListener listener){this.removeHBtn.addActionListener(listener);}
    public void setBackSimulateBtnActionListener(ActionListener listener){this.backSimulateBtn.addActionListener(listener);}
    public void setDiscountBtnActionListener(ActionListener listener){this.discountBtn.addActionListener(listener);}
    public void setSimulateBtnActionListener(ActionListener listener){this.simulateBtn.addActionListener(listener);}
    public void setBookingBtnActionListener(ActionListener listener){this.bookingBtn.addActionListener(listener);}
    public void setBackReservationBtnActionListener(ActionListener listener){this.backReservationBtn.addActionListener(listener);}
    public void setRemoveRsrBtnActionListener(ActionListener listener){this.removeRsrBtn.addActionListener(listener);}
    public void setBackRemoveRsvBtnActionListener(ActionListener listener){this.backRemoveRsvBtn.addActionListener(listener);}
    public void setRemoveRsvBtnActionListener(ActionListener listener){this.removeRsvBtn.addActionListener(listener);}
    public void setDpmBtnActionListener(ActionListener listener){this.dpmBtn.addActionListener(listener);}
    public void setBackDpmBtnActionListener(ActionListener listener){this.backDpmBtn.addActionListener(listener);}
    public void setModifyDpmBtnActionListener(ActionListener listener){this.modifyDpmBtn.addActionListener(listener);}

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
    public void sethTf6strFocusListener(FocusListener listener){this.hTf6str.addFocusListener(listener);}
}
