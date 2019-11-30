package com.shaizankhan.petclinic.services.map;

import com.shaizankhan.petclinic.model.Visit;
import com.shaizankhan.petclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Shaizan.Khan
 * Created on 30-11-2019
 */
@Service
public class VisitMapService  extends AbstractMapService<Visit,Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {

    }

    @Override
    public Visit save(Visit visit) {
        if (visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null
                || visit.getPet().getOwner().getId() == null){
            throw new RuntimeException("Invalid Visit");
        }
        return super.save(visit);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}
