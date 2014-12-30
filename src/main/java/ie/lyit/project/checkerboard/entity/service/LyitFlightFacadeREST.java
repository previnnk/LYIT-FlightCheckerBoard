/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.project.checkerboard.entity.service;

import ie.lyit.project.checkerboard.entity.LyitFlight;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author Previn
 */
@Stateless
@Path("ie.lyit.project.checkerboard.entity.lyitflight")
public class LyitFlightFacadeREST extends AbstractFacade<LyitFlight> {
    @PersistenceContext(unitName = "ie.lyit.project.checkerboard_LYIT-FlightCheckerBoardWeb_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    public LyitFlightFacadeREST() {
        super(LyitFlight.class);
    }

    @POST
    @Override
    @Consumes({"application/json"})
    public void create(LyitFlight entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/json"})
    public void edit(@PathParam("id") String id, LyitFlight entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") String id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/json"})
    public LyitFlight find(@PathParam("id") String id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/json"})
    public List<LyitFlight> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/json"})
    public List<LyitFlight> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
