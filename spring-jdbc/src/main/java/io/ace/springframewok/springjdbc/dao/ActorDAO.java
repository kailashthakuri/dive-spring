package io.ace.springframewok.springjdbc.dao;

import io.ace.springframewok.springjdbc.model.Actor;

public interface ActorDAO {


    public Actor getActorByIdProc(int id);

    public String getActorNameByIdFunc(int id);

    public int add(Actor actor);

    public int addAndReturnKey(Actor actor);

    public int addWithColumns(Actor actor);

    public int addWithBeanProperty(Actor actor);

}
