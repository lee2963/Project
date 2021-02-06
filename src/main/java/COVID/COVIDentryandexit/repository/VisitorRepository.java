package COVID.COVIDentryandexit.repository;

import COVID.COVIDentryandexit.domain.Visitor;

import java.util.List;
import java.util.Optional;
class Search_time{
    public String entry;
    String exit;

    Search_time(String entry,String exit){
        this.entry = entry;
        this.exit = exit;
    }
}
public interface VisitorRepository {

    Visitor save(Visitor visitor);
    Optional<Visitor> findByStdid(Long stdid);
    Optional<Visitor> findByName(String name);
    Optional<Visitor> findByTime(Search_time st);
    List<Visitor> findAll();
}
