package io.ace.springframewok.springjdbc.dao;

import io.ace.springframewok.springjdbc.storedprcedure.GetActorNameById;
import io.ace.springframewok.springjdbc.storedprcedure.GetSystemDateProcedure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class StoredProcedureDAO {

    @Autowired
    private GetSystemDateProcedure getSystemDateProcedure;

    @Autowired
    private GetActorNameById getActorNameById;

    public Date getSysDate() {
        return this.getSystemDateProcedure.execute();
    }


    public String getActorNameById(int id) {
        return this.getActorNameById.execute(id);
    }
}
