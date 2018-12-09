package controller;

import service.HelloService;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/HelloWorld")
public class HelloController {

    @EJB
    private HelloService helloService;

    @GET
    @Path("/sayHello")
    public String sayHello() {
        System.out.println("in say hello ");
        return "<h1>Hello World</h1>";
    }

    @GET
    @Path("/getUser")
    public String getUser(@QueryParam("id") int id) {

        return helloService.getUserByID(id).toString();
    }


}
