package ua.od.hillel;

import ua.od.hillel.model.dao.DeployDB;
import ua.od.hillel.model.dao.RoomDAO;
import ua.od.hillel.model.dto.RoomDTO;

/**
 * Created by ruslangramatic on 4/14/18.
 */
public class StartDeployDB {

    public static void main(String[] args) {
        DeployDB deployDB = new DeployDB();
        deployDB.run();

        //test room
        RoomDAO roomDao = new RoomDAO();
        for (RoomDTO roomDTO : roomDao.getListOfRooms()){
            System.out.println(roomDTO);
        }
    }
}
