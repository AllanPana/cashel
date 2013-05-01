package com.highview.app;

import javax.annotation.Resource;
import javax.inject.Singleton;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: student
 * Date: 4/30/13
 * Time: 1:00 PM
 * To change this template use File | Settings | File Templates.
 */
@Singleton
public class MemberRepository {



    /**
     *
     * @param email
     * @return
     */

    @Resource(lookup="java:/HighviewDS")
    DataSource ds;

    public boolean alreadyRegistered(String email)  {

        try (
                Connection con = ds.getConnection();
                PreparedStatement ps = con.prepareStatement("select * from Subsriber where email = ?")

                )

        {


            ps.setString(1,email);
            try(ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e) ;
        }

    }


    /**
     *  Register a new email address for our news letter
     * @param email
     */
    public void insert(String email) {

        try (
                Connection con = ds.getConnection();
                PreparedStatement ps = con.prepareStatement("insert into Subsriber (email) values(?)")
        )

        {
            ps.setString(1,email);
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e) ;
        }




    }
}
