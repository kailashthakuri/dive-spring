package io.ace.springframework.core.ioc.di.lookupmethod;


import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class StudentServices {


    @Lookup
    public StudentNotification getStudentNotification() {
        /*
        spring will override this method to get new  instance of StudentNotification each time when it is required.
        */
        return null;
    }
}
