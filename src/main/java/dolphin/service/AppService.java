package dolphin.service;

import dolphin.entity.App;

import java.util.List;

/**
 * @author Alex
 **/
public interface AppService {


    void save(App app);

    void delete(Long id);

    List<App> findAll();

    void update(App app);

    App findByName(String name);
}
