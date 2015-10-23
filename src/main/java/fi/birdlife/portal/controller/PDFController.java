package fi.birdlife.portal.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

@RestController
public class PDFController {

    private EntityManager entityManager;

    @RequestMapping("/publisher/{publisherid}/publication/{pubicationid}")
    public void getPublication(@PathVariable Integer publisherid, @PathVariable Integer pubicationid) {

        entityManager = Persistence.createEntityManagerFactory("portaali")
                .createEntityManager();

        entityManager.getTransaction().begin();
/*
        AppUser user = new AppUser("seconduser");
        entityManager.persist(user);

        entityManager.getTransaction().commit();
        entityManager.close();
        */
    }
}