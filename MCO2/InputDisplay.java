package MCO2;

import java.awt.*;
import java.awt.event.*;

/**
 * The InputDisplay class is responsible for displaying statements and also taking in User inputs.
 * The User inputs will then be used to invoke methods from the ReservationSystem class.
 */
public class InputDisplay {
    private ReservationSystem reservation;
    private ReservationGUI GUI;
    private int index;

    public InputDisplay(ReservationGUI GUI, ReservationSystem reservation){
        this.GUI = GUI;
        this.reservation = reservation;

        this.GUI.setStrtBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.CreateHotel();
            }
        });

        this.GUI.setExitBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        this.GUI.setBackBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.RetryStartScreen();
            }
        });

        this.GUI.setCreateHBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.promptCreateHotel();
            }
        });

        this.GUI.setExitHBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.RetryCreateHotelScreen();
            }
        });

        this.GUI.setManageHBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.setHotelName(reservation.getHotelList().get(index).getName());
                GUI.ManageHotel();
            }
        });

        this.GUI.setBackMHBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.RetryMHHotelMenu();
            }
        });

        this.GUI.setViewHBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.setHotelName(reservation.getHotelList().get(index).getName());
                GUI.ViewHotel();
            }
        });

        this.GUI.setBackVHBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.RetryVHHotelMenu();
            }
        });

        this.GUI.setViewLLevelBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.setHotelName(reservation.getHotelList().get(index).getName());
                GUI.ViewLowH();
            }
        });

        this.GUI.setBackVLHBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.RetryViewLHotel();
            }
        });

        this.GUI.setBackCOpHBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.RetryCOpCreateHotelScreen();
                GUI.clearTextFields();
            }
        });

        this.GUI.setUpdPriceBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.sethTf5doubleEdit(true);
                GUI.sethTf5doubleColor(Color.WHITE);
            }
        });

        this.GUI.setSelectHBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (reservation.getHotelList().size()!=0) {
                    String[] names = new String[reservation.getHotelList().size()];
                    for (int i=0;i<reservation.getHotelList().size();i++){
                        names[i]=reservation.getHotelList().get(i).getName();
                    }
                    GUI.setHotelList(names);
                    GUI.promptSelectHotel();
                }
                else
                    GUI.setHintlbText("<html>Have at least 1 created <br/>Hotel to use this feature<html>");
            }
        });

        this.GUI.setSelectOpHBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                index = GUI.getSelectedName();
                if (index==-1){
                    GUI.setHintlbText("<html>Please select a Hotel!<html>");
                }
                else {
                    GUI.setHotelName(reservation.getHotelList().get(index).getName());
                    GUI.RetrySOHotelMenu();
                }
            }
        });

        this.GUI.setBackSOpHBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.RetrySOpCreateHotelScreen();
            }
        });

        this.GUI.setNumBookedRBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.ViewBookedRoom();
                GUI.setTextDisplay(reservation.AvailableSRooms(index, GUI.getDropDownItem()));
            }
        });

        this.GUI.setDropDownActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.setTextDisplay(reservation.AvailableSRooms(index, GUI.getDropDownItem()));
            }
        });

        this.GUI.setBackBookedBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.RetryViewBookedHotel();
            }
        });

        this.GUI.setRoomInfoBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.setRoomList(reservation.getRoomNames(index));
                GUI.ViewSelectedRoom();
            }
        });

        this.GUI.setRsvInfoBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (reservation.getHotelList().get(index).getReservationList().size()==0) {
                    GUI.setHintlbText("You have no reservations!");
                }
                else{
                    GUI.setReservationList(reservation.getReservationNames(index));
                    GUI.ViewRoomReservation();
                }
            }
        });

        this.GUI.setBackSReservationBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.RetryViewReservationSHotel();
            }
        });

        this.GUI.setSelectReservationBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("idk");
            }
        });

        this.GUI.setSelectRoomBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.setTextDisplay(reservation.RoomInfo(index, GUI.getRoomName()));
                GUI.setRoomBooked(reservation.RoomAvailability(index, GUI.getRoomName()));
                GUI.ViewRoom();
            }
        });

        this.GUI.setBackRoomBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.RetryViewSelectRoom();
            }
        });

        this.GUI.setBackSRoomBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.RetryViewRoomSHotel();
            }
        });

        this.GUI.setCreateOpHBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = GUI.gethTf1strText();
                int index = reservation.getHotelList().size();
                try {
                    int numSRoom = Integer.parseInt(GUI.gethTf2intText());
                    int numDRoom = Integer.parseInt(GUI.gethTf3intText());
                    int numERoom = Integer.parseInt(GUI.gethTf4intText());
                    if (numSRoom + numDRoom + numERoom <= 50) {
                        if (GUI.gethTf5doubleText().equals("") || GUI.gethTf5doubleText().equals("Enter value...")) {
                            reservation.CreateHotel(name);
                            reservation.addHotelRoom(index, numSRoom, 1);
                            reservation.addHotelRoom(index, numDRoom, 2);
                            reservation.addHotelRoom(index, numERoom, 3);
                            GUI.setHintlbText("Hotel Created!");
                            GUI.clearTextFields();
                        } else if (Double.parseDouble(GUI.gethTf5doubleText())>=100){
                            reservation.CreateHotel(name, Double.parseDouble(GUI.gethTf5doubleText()));
                            reservation.addHotelRoom(index, numSRoom, 1);
                            reservation.addHotelRoom(index, numDRoom, 2);
                            reservation.addHotelRoom(index, numERoom, 3);
                            GUI.setHintlbText("Hotel Created!");
                            GUI.clearTextFields();
                        } else{
                            GUI.setHintlbText("Failed to Create Hotel!");
                        }
                    } else {
                        GUI.setHintlbText("Failed to Create Hotel!");
                        GUI.clearTextFields();
                    }
                } catch (Exception error){
                    GUI.setHintlbText("Something Went Wrong...");
                }
            }
        });

        this.GUI.setViewHLevelBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.setTextDisplay(reservation.viewHighLevel(index));
                GUI.ViewHighH();
            }
        });

        this.GUI.setBackVHHBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.RetryViewHHotel();
            }
        });

        this.GUI.setBackChangeNHBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.clearTextFields();
                GUI.setHotelName(reservation.getHotelList().get(index).getName());
                GUI.RetryChangeMHotel();
            }
        });

        this.GUI.setChangeNHBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (GUI.gethTf1strText().equals("") || GUI.gethTf1strText().equals("Enter text...")){
                    GUI.setHintlbText("Please Type a Name!");
                }
                else {
                    GUI.setHintlbText("Please Type a Name!");
                    boolean result = reservation.changeHotelName(index, GUI.gethTf1strText());
                    if (result){
                        GUI.setHintlbText("Name Change Successful!");
                    }
                    else {
                        GUI.setHintlbText("Name Change Unsuccessful!");
                    }
                }
            }
        });

        this.GUI.setChangeHNameBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.promptChangeHotelName();
            }
        });

        this.GUI.setBackAddRBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.RetryAddRooms();
            }
        });

        this.GUI.setAddRBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int numSRoom = Integer.parseInt(GUI.gethTf2intText());
                    int numDRoom = Integer.parseInt(GUI.gethTf3intText());
                    int numERoom = Integer.parseInt(GUI.gethTf4intText());
                    if (numSRoom + numDRoom + numERoom <= 50) {
                        reservation.addHotelRoom(index, numSRoom, 1);
                        reservation.addHotelRoom(index, numDRoom, 2);
                        reservation.addHotelRoom(index, numERoom, 3);
                        GUI.setHintlbText("Rooms Added!");
                        GUI.clearTextFields();
                    } else {
                        GUI.setHintlbText("Failed to Add Rooms!");
                        GUI.clearTextFields();
                    }
                } catch (Exception error){
                    GUI.setHintlbText("Something Went Wrong...");
                }
            }
        });

        this.GUI.setAddRoomBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.promptAddRooms();
            }
        });

        this.GUI.setBackRemoveRBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.RetryRemoveRooms();
            }
        });

        this.GUI.setRemoveRBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(reservation.getHotelList().get(index).numRoom()>1){
                    boolean result = reservation.removeHotelRoom(index, GUI.getRoomName());
                    if (result){
                        GUI.setHintlbText("Room Removed!");
                        GUI.RetryRemoveRooms();
                        GUI.setRoomList(reservation.showRemovableRoom(index));
                        GUI.promptRemoveRooms();
                    }
                    else{
                        GUI.setHintlbText("Cannot Remove Room!");
                    }
                }
                else{
                    GUI.setHintlbText("Cannot Remove Room!");
                }
            }
        });

        this.GUI.setRemoveRoomBtnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI.setRoomList(reservation.showRemovableRoom(index));
                GUI.promptRemoveRooms();
            }
        });

        this.GUI.setStrtBtnMouseListener(new MouseListener() {
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
                GUI.setHintlbText("Starts Program");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                GUI.setHintlbText("What do you want to do?");
            }
        });

        this.GUI.setExitBtnnMouseListener(new MouseListener() {
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
                GUI.setHintlbText("Exits Program");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                GUI.setHintlbText("What do you want to do?");
            }
        });

        this.GUI.setCreateHBtnMouseListener(new MouseListener() {
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
                GUI.setHintlbText("Creates Hotel");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                GUI.setHintlbText("What do you want to do?");
            }
        });

        this.GUI.setSelectHBtnMouseListener(new MouseListener() {
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
                GUI.setHintlbText("Selects Hotel");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                GUI.setHintlbText("What do you want to do?");
            }
        });

        this.GUI.setCreateOpHBtnListener(new MouseListener() {
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

            @Override
            public void mouseExited(MouseEvent e) {
                GUI.setHintlbText("What do you want to do?");
            }
        });

        this.GUI.sethTf1strFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (GUI.gethTf1strText().equals("Enter text...")) {
                    GUI.sethTf1strText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (GUI.gethTf1strText().equals("")){
                    GUI.sethTf1strText("Enter text...");
                }
            }
        });

        this.GUI.sethTf2intFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (GUI.gethTf2intText().equals("Enter value...")) {
                    GUI.sethTf2intText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (GUI.gethTf2intText().equals("")){
                    GUI.sethTf2intText("Enter value...");
                }
            }
        });

        this.GUI.sethTf3intFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (GUI.gethTf3intText().equals("Enter value...")) {
                    GUI.sethTf3intText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e){
                if (GUI.gethTf3intText().equals("")){
                    GUI.sethTf3intText("Enter value...");
                }
            }
        });

        this.GUI.sethTf4intFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (GUI.gethTf4intText().equals("Enter value...")){
                    GUI.sethTf4intText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (GUI.gethTf4intText().equals("")){
                    GUI.sethTf4intText("Enter value...");
                }
            }
        });

        this.GUI.sethTf5doubleFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (GUI.gethTf5doubleText().equals("Enter value...")){
                    GUI.sethTf5doubleText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (GUI.gethTf5doubleText().equals("")){
                    GUI.sethTf5doubleText("Enter value...");
                }
            }
        });
    }
}