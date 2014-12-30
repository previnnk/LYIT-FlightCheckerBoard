/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.project.checkerboard.entity.service;

import ie.lyit.project.checkerboard.entity.LyitDisplayboard;
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
@Path("ie.lyit.project.checkerboard.entity.lyitdisplayboard")
public class LyitDisplayboardFacadeREST extends AbstractFacade<LyitDisplayboard> {
    @PersistenceContext(unitName = "ie.lyit.project.checkerboard_LYIT-FlightCheckerBoardWeb_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    public LyitDisplayboardFacadeREST() {
        super(LyitDisplayboard.class);
    }

    @POST
    @Override
    @Consumes({"application/json"})
    public void create(LyitDisplayboard entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/json"})
    public void edit(@PathParam("id") Integer id, LyitDisplayboard entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({ "application/json"})
    public LyitDisplayboard find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({ "application/json"})
    public List<LyitDisplayboard> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/json"})
    public List<LyitDisplayboard> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
