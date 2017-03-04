/**
 * Created by vijay on 3/1/17.
 */
package com.services;

import com.dao.ReservationDao;
import io.swagger.annotations.Api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Api
@Path("service1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ReservationService {

    private ReservationDao reservationDao;


    public ReservationService(ReservationDao reservationDao) {
        this.reservationDao = reservationDao;
    }

    public static final String CLICHED_MESSAGE = "Hello World!";



    @GET
    public ResponseSample getHello() {
        return new ResponseSample();
    }
}
