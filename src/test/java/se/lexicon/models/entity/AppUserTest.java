package se.lexicon.models.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AppUserTest {
    AppUser appUser = new AppUser("Bla", "Lars", "Berg", LocalDate.parse("2000-12-10"), "Borg");

    @Test
    void getUsername() {
        String getUsername = appUser.getUsername();
        Assertions.assertEquals(getUsername, appUser.getUsername());
    }

    @Test
    void getFirstName() {
        String getFirstName = appUser.getFirstName();
        Assertions.assertEquals(getFirstName, appUser.getFirstName());
    }

    @Test
    void getLastName() {
        String getLastName = appUser.getLastName();
        Assertions.assertEquals(getLastName, appUser.getLastName());
    }

    @Test
    void getBirthDate() {
        LocalDate getBirthDate = appUser.getBirthDate();
        Assertions.assertEquals(getBirthDate, appUser.getBirthDate());
    }

    @Test
    void isActive() {
        Assertions.assertTrue(appUser.isActive());
    }

    @Test
    void getPassword() {
        String getPassword = appUser.getPassword();
        Assertions.assertEquals(getPassword, appUser.getPassword());
    }
}