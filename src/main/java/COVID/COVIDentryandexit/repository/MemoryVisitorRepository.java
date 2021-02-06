package COVID.COVIDentryandexit.repository;

import COVID.COVIDentryandexit.domain.Visitor;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MemoryVisitorRepository implements VisitorRepository{

    private Map<Search_time, Visitor> store = new HashMap<>();

    @Override
    public Visitor save(Visitor visitor) {
        visitor.setEntry_time();
        visitor.setEntry_time();
        Search_time st = new Search_time(visitor.getEntry_time(),visitor.getExit_time());
        store.put(st,visitor);
        return visitor;
    }
    @Override
    public Optional<Visitor> findByStdid(Long stdid) {
        return store.values().stream().filter(visitor -> visitor.getStdid().equals(stdid)).findAny();
    }

    @Override
    public Optional<Visitor> findByName(String name) {
        return store.values().stream().filter(visitor -> visitor.getName().equals(name)).findAny();
    }

    @Override
    public Optional<Visitor> findByTime(Search_time st) {
        LocalDateTime getmap_entry = LocalDateTime.parse(store.get(st).getEntry_time());//저장된 사람 중 특정한 사람의 들어온 시간
        LocalDateTime getmap_exit = LocalDateTime.parse(store.get(st).getExit_time());//저장된 사람 중 특정한 사람의 나간 시간
        LocalDateTime input_entry = LocalDateTime.parse(st.entry);//확진자 들어온 시간
        LocalDateTime input_exit = LocalDateTime.parse(st.exit);//확진자 나간 시간


        return store.values().stream().filter(visitor -> visitor.get().(input_entry.isBefore(getmap_entry) && input_exit.isAfter(getmap_entry)) ||
                (getmap_entry.isBefore(input_entry) && getmap_exit.isAfter(input_entry))).findAny();
        if((input_entry.isBefore(getmap_entry) && input_exit.isAfter(getmap_entry)) ||
                (getmap_entry.isBefore(input_entry) && getmap_exit.isAfter(input_entry))){
            return  Optional.ofNullable(store.get(st));
        }
        else{
            return
        }
    }

    @Override
    public List<Visitor> findAll() {
        return null;
    }
}
