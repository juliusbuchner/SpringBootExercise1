package se.lexicon.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.models.entity.AppUser;

import java.util.List;

public interface AppUserRepository extends CrudRepository<AppUser, Integer> {
    List<AppUser>findAppUserById(int id);
}
