package dolphin.service;

import dolphin.entity.Site;

import java.util.List;

/**
 * 站点导航
 *
 * @author Alex
 **/
public interface SiteService {


    void save(Site site);

    void delete(Long id);

    List<Site> findAll();

    void update(Site site);

}
