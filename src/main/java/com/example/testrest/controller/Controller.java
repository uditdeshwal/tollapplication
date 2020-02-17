package com.example.testrest.controller;

import com.example.testrest.model.DataSource;
import com.example.testrest.model.DbSchema;
import com.example.testrest.model.DbSchemaDetails;
import com.example.testrest.request.User;
import com.example.testrest.response.PriceDetails;
import com.example.testrest.service.OrderServiceImpl;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;
import java.util.Set;

@Path("/api/v1/datasource")
public class Controller {
    public  OrderServiceImpl orderService;
    @Inject
    public Controller( OrderServiceImpl orderService){
        this.orderService = orderService;

    }

    @GET
    @Path("/cart")
    public  Response getCartDetails(@QueryParam("item") Set<Integer> items, @QueryParam("qty") Set<Integer> qty, @QueryParam("time")Date date){

       if(items ==null || items.size()==0 || qty == null || qty.size() ==0 ){
          return Response.status(Response.Status.BAD_REQUEST)
                   .entity("please validate your request").type(MediaType.TEXT_PLAIN).build();
       }
       else {

           PriceDetails priceDetails = orderService.calPrice(items,qty,date);
           return  Response.ok(priceDetails).build();
       }


    }

    @GET
    @Path("/query/{time}")

    public  Response query(@PathParam("time") Date date){

        return  Response.ok(date).build();
    }


    @POST
    public  Response createUser(User user){
        System.out.println(user);

        return  Response.status(201).build();
    }

    @GET
    @Path("{accountId}")
    @Produces("application/json")
    public Response getCred( @PathParam("accountId") String accountId){


        DataSource dataSource = new DataSource();

        DbSchemaDetails admin = new DbSchemaDetails("10.11.7.27:1521:orcl", "RES5_CUST", DbSchema
                .CUST_DB, "RES5_CUST");
        DbSchemaDetails cust = new DbSchemaDetails("10.11.7.27:1521:orcl", "RES5_CUST", DbSchema.CUST_DB, "RES5_CUST");
        DbSchemaDetails dw = new DbSchemaDetails("10.11.7.27:1521:orcl", "RES5_DW", DbSchema.DATA_WAREHOUSE_DB, "RES5_DW");

        dataSource.getDatasource().add(cust);
        dataSource.getDatasource().add(dw);
        dataSource.getDatasource().add(admin);
        return  Response.ok(dataSource).build();


    }

}
