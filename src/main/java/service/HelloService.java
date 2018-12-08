package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/HelloWorld")
public class HelloService {

    @GET
    @Path("/sayHello")
    public String sayHello() {
        System.out.println("in say hello ");
        return "<h1>Hello World</h1>";
    }
}
