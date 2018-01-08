package dolphin.dao.mapper;

import dolphin.entity.Site;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Alex
 **/
public interface SiteMapper {

    @Insert("INSERT  INTO site(name,url,create_at) VALUES (#{site.name},#{site.url},now())")
    void save(@Param("site") Site site);

    @Update("UPDATE site SET is_delete=0 WHERE id=#{id}")
    void delete(@Param("id") Long id);

    List<Site> findAll();

    @Update("UPDATE site set(name,url,update_at) VALUES (#{site.name},#{site.url},now())")
    void update(@Param("site") Site site);
}
