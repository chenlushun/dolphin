package dolphin.service.impl;

import dolphin.dao.AppRepository;
import dolphin.entity.App;
import dolphin.entity.Site;
import dolphin.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alex
 **/
@Service
public class AppServiceImpl implements AppService {
    @Autowired
    private AppRepository appRepository;

    public void save(App app) {
        appRepository.save(app);
    }

    public void delete(Long id) {

    }

    public List<App> findAll() {
        return appRepository.findAll();
    }

    public void update(App app) {
        appRepository.update(app);
    }

    @Override
    public App findByName(String  name) {
        return appRepository.findByName(name);
    }
}
