package fi.birdlife.portal.controller;

import fi.birdlife.portal.domain.Publication;
import fi.birdlife.portal.domain.Publisher;
import javassist.NotFoundException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.io.File;

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

    public void addPublication(int publisherId, Publication publication) throws NotFoundException {
        entityManager = Persistence.createEntityManagerFactory("portaali").createEntityManager();

        Publisher publisher = entityManager.find(Publisher.class, publisherId);
        if (publisher == null) {
            throw new NotFoundException("Publisher with id: "+publisherId+" not found");
        }

        publisher.getPublications().add(publication);

        entityManager.getTransaction().begin();
        entityManager.persist(publisher);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

}