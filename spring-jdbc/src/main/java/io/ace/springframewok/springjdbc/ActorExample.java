package io.ace.springframewok.springjdbc;

import io.ace.springframewok.springjdbc.config.ApplicationConfig;
import io.ace.springframewok.springjdbc.dao.ActorDAO;
import io.ace.springframewok.springjdbc.dao.StoredProcedureDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ActorExample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        ActorDAO actorDAO = ctx.getBean(ActorDAO.class);

//        System.out.println(actorDAO.add(new Actor("Rajesh Hamal", 54, 25, 700000)));
//        System.out.println(actorDAO.addAndReturnKey(new Actor("Aryan Sigdel", 40, 25, 1000000)));
//        System.out.println(actorDAO.addWithColumns(new Actor("Salman Tharu", 70)));
//        System.out.println(actorDAO.addWithBeanProperty(new Actor("sunil",50,1)));


//        System.out.println(actorDAO.getActorNameByIdFunc(1));
//        System.out.println(actorDAO.getActorByIdProc(1));

        StoredProcedureDAO storedProcedureDAO = ctx.getBean(StoredProcedureDAO.class);
        System.out.println(storedProcedureDAO.getActorNameById(1));


        ;
    }

}
