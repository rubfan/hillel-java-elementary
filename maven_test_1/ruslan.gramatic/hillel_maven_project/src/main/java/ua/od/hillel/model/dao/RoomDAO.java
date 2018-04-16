package ua.od.hillel.model.dao;

import ua.od.hillel.model.dto.RoomDTO;
import ua.od.hillel.model.helpers.QueryHelper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ruslangramatic on 4/16/18.
 */
public class RoomDAO {

    public List<RoomDTO> getListOfRooms() {
        final List<RoomDTO> rooms = new LinkedList<RoomDTO>();

        new QueryHelper() {
            protected void executeQuery(Statement statement) throws SQLException {
                statement.executeUpdate("use card_battle_rts");
                ResultSet rs = statement.executeQuery("select * from Room");
                while(rs.next()) {
                    RoomDTO room = new RoomDTO(rs);
                    rooms.add(room);
                }
            }
        }.run();

        return rooms;
    }
}
