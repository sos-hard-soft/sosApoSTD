/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.sosapostd.wservice;

import com.soshs.sosapostd.entites.GrpResultatEpr;
import com.soshs.sosapostd.entites.GrpResultatEprPK;
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
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author docFSJES
 */
@Stateless
@Path("com.soshs.sosapostd.entites.grpresultatepr")
public class GrpResultatEprFacadeREST extends AbstractFacade<GrpResultatEpr> {

    @PersistenceContext(unitName = "com.soshs_sosApoSTD_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    private GrpResultatEprPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;codEpr=codEprValue;codAnu=codAnuValue;codSes=codSesValue;codAdm=codAdmValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        com.soshs.sosapostd.entites.GrpResultatEprPK key = new com.soshs.sosapostd.entites.GrpResultatEprPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> codEpr = map.get("codEpr");
        if (codEpr != null && !codEpr.isEmpty()) {
            key.setCodEpr(codEpr.get(0));
        }
        java.util.List<String> codAnu = map.get("codAnu");
        if (codAnu != null && !codAnu.isEmpty()) {
            key.setCodAnu(codAnu.get(0));
        }
        java.util.List<String> codSes = map.get("codSes");
        if (codSes != null && !codSes.isEmpty()) {
            key.setCodSes(codSes.get(0));
        }
        java.util.List<String> codAdm = map.get("codAdm");
        if (codAdm != null && !codAdm.isEmpty()) {
            key.setCodAdm(codAdm.get(0));
        }
        return key;
    }

    public GrpResultatEprFacadeREST() {
        super(GrpResultatEpr.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(GrpResultatEpr entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") PathSegment id, GrpResultatEpr entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        com.soshs.sosapostd.entites.GrpResultatEprPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public GrpResultatEpr find(@PathParam("id") PathSegment id) {
        com.soshs.sosapostd.entites.GrpResultatEprPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<GrpResultatEpr> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<GrpResultatEpr> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
