package safyrus.tp5_service.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import safyrus.tp5_service.model.NESGame;

public interface NESGameRepo extends CrudRepository<NESGame, String> {

    List<NESGame> findAll();

    NESGame findByID(String id);

    <S extends NESGame> S save(NESGame game);

    void deleteByID(String id);
}
