package api;

import model.Event;

import java.util.List;

/**
 * Created by cherepanov on 21.06.2017.
 */
public class CacheFileEventLogger extends FileEventLogger {
    private int cacheSize;
    private List<Event> cache;

    public CacheFileEventLogger(int cacheSize) {
        this.cacheSize = cacheSize;
    }

    @Override
    public void logEvent(Event event) {
        cache.add(event);

        if (cache.size() == cacheSize) {
            for (int i = 0; i < cache.size(); i++) {
                super.logEvent(event);
            }
            cache.clear();
        }
    }

    public void destroy(){
        if(!cache.isEmpty()){
            for(Event event: cache){
                super.logEvent(event);
            }
        }
    }
}
