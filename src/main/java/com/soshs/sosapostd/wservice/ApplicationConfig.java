/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.sosapostd.wservice;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author docFSJES
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.soshs.sosapostd.wservice.AdresseFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.AnneeUniFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.DiplomeFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.ElementPedagogiFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.ElpCorrespondElpFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.ElpRegroupeLseFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.EpreuveFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.EtablissementFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.EtapeFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.GroupeDiplomeFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.GrpResultatElpFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.GrpResultatEprFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.GrpResultatVdiFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.GrpResultatVetFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.IndBacFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.IndContratElpFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.IndDispenseElpFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.IndividuFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.InsAdmAnuFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.InsAdmEtpFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.InsAdmSitFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.InsInfoAnuFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.InsPedagogiAnuFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.InsPedagogiEtpFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.ListeElpFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.MentionFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.NatureDiplomeFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.NatureElpFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.NatureEprFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.PhoEtuFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.ResultatElpFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.ResultatEprFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.ResultatVdiFacadeREST.class);
        resources.add(com.soshs.sosapostd.wservice.ResultatVetFacadeREST.class);
    }
    
}
