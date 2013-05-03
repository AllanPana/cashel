package com.highview.app;

import javax.annotation.Resource;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

@Singleton
public class MemberRepository {


    @PersistenceContext(unitName = "HighviewPU")
    EntityManager em;

    public boolean alreadyRegistered(Member member)  {
        throw  new RuntimeException(" not implemented yet");


    }
    public void insert(Member member) {

          em.persist(member);
    }
}
