package se.lexicon.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import se.lexicon.models.entity.AppUser;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
@Component
class AppUserDAOImplTest {
    AppUser appUser = new AppUser("Bla", "Lars", "Berg", LocalDate.parse("2000-12-10"), "Borg");
    AppUser appUser2 = new AppUser("Bla", "Lars", "Berg", LocalDate.parse("2000-12-10"), "Borg");
    AppUserDAOImpl appUserDAO = new AppUserDAOImpl();

    @Test
    void findById() {
        appUser = appUserDAO.findById(1);
        Assertions.assertEquals(appUser, appUser2);
    }

    @Test
    void save() {
        appUserDAO.delete(appUser);
        appUserDAO.save(appUser);
        appUser = appUserDAO.findById(1);
        Assertions.assertEquals(appUser, appUser2);
    }

    @Test
    void delete() {
        appUserDAO.delete(appUser);
        appUser = appUserDAO.findById(1);
        Assertions.assertNotEquals(appUser, appUser2);
    }
}