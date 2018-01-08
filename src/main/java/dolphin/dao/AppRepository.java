package dolphin.dao;

import dolphin.entity.App;
import dolphin.entity.Site;

import java.util.List;

/**
 * @author Alex
 **/
public interface AppRepository {

    void save(App app);

    void delete(Long id);

    List<App> findAll();

    void update(App app);

    App findByName(String name);
}
