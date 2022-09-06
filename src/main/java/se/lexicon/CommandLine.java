package se.lexicon;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.lexicon.models.entity.AppUser;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.time.LocalDate;

@Transactional
@Component
public class CommandLine implements CommandLineRunner {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public void run(String... args) throws Exception {
        AppUser appUser = new AppUser("Bla", "Lars", "Berg", LocalDate.parse("2000-12-10"), "Borg");
        entityManager.persist(appUser);
        appUser = entityManager.find(AppUser.class, 1);
        System.out.println(appUser);
    }
}
