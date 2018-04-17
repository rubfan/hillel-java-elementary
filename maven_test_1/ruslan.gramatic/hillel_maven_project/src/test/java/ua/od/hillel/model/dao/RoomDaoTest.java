package ua.od.hillel.model.dao;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import ua.od.hillel.model.dto.RoomDTO;

import java.util.List;

/**
 * Created by ruslangramatic on 4/16/18.
 */
public class RoomDaoTest {

    @Before
    public void init(){
        DeployDB deployDB = new DeployDB();
    }

    @Test
    public void getListOfRooms() {
        RoomDAO roomDao = new RoomDAO();
        List<RoomDTO> rdto = roomDao.getListOfRooms();

        for (RoomDTO roomDTO : rdto){
            System.out.println(roomDTO);
        }
        assertTrue(rdto.size() > 0);
    }
}
