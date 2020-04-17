package io.ace.springframework.core.ioc;

public class Messenger {
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init() {
        System.out.println("Init Method Called");
    }

    public void destroy() {
        System.out.println("Destroy Method Called");
    }

    @Override
    public String toString() {
        return "Messenger{" +
                "message='" + message + '\'' +
                '}';
    }
}
