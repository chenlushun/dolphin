package dolphin.service.impl;

import dolphin.dao.ScriptRepository;
import dolphin.entity.Script;
import dolphin.service.ScriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alex
 **/
@Service
public class ScriptServiceImpl implements ScriptService {

    private final ScriptRepository scriptRepository;

    @Autowired
    public ScriptServiceImpl(ScriptRepository scriptRepository) {
        this.scriptRepository = scriptRepository;
    }

    public List<Script> findAll() {
        return scriptRepository.findAll();
    }

    public void save(Script script) {
        scriptRepository.save(script);
    }


    public Script findHisTory(Long id) {
        return scriptRepository.findHisTory(id);
    }

    public Script findById(Long id) {
        return scriptRepository.findById(id);
    }

    public void update(Script script) {
        Script preScript = scriptRepository.findById(script.getId());
        scriptRepository.expire(script.getId());

        script.setParentId(preScript.getId());
        save(script);
    }

    public Script findByName(String name) {
        return scriptRepository.findByName(name);
    }
}
