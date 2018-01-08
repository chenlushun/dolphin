package dolphin.dao.impl;

import dolphin.dao.SiteRepository;
import dolphin.dao.mapper.SiteMapper;
import dolphin.entity.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 站点导航
 *
 * @author Alex
 **/
@Repository
public class SiteRepositoryImpl implements SiteRepository {
    private final SiteMapper siteMapper;

    @Autowired
    public SiteRepositoryImpl(SiteMapper siteMapper) {
        this.siteMapper = siteMapper;
    }

    public void save(Site site) {
        siteMapper.save(site);
    }

    public void delete(Long id) {
        siteMapper.delete(id);
    }

    public List<Site>  findAll() {
        return siteMapper.findAll();
    }

    public void update(Site site) {
        siteMapper.update(site);
    }
}
