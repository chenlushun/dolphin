package dolphin.service.impl;

import dolphin.dao.SiteRepository;
import dolphin.entity.Site;
import dolphin.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 站点导航
 *
 * @author Alex
 **/
@Service
public class SiteServiceImpl implements SiteService {

    private final SiteRepository siteRepository;

    @Autowired
    public SiteServiceImpl(SiteRepository siteRepository) {
        this.siteRepository = siteRepository;
    }

    @Override
    public void save(Site site) {
        siteRepository.save(site);
    }

    @Override
    public void delete(Long id) {
        siteRepository.delete(id);
    }

    @Override
    public List<Site> findAll() {
        return siteRepository.findAll();
    }

    public void update(Site site) {
        siteRepository.update(site);
    }
}
