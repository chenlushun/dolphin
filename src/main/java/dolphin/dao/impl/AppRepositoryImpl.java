package dolphin.dao.impl;

import dolphin.dao.AppRepository;
import dolphin.dao.mapper.AppMapper;
import dolphin.entity.App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Alex
 **/
@Repository
public class AppRepositoryImpl implements AppRepository {
    @Autowired
    private AppMapper appMapper;

    public void save(App app) {
        appMapper.save(app);
    }

    public void delete(Long id) {

    }

    public List<App> findAll() {
        return appMapper.findAll();
    }

    public void update(App app) {
        appMapper.update(app);
    }

    @Override
    public App findByName(String name) {
        return appMapper.findByName(name);
    }
}
