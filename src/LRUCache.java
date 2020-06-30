import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V>{

    private static int limit;


    public LRUCache(int limit){
        /**
         * 默认情况下，LinkedHashMap 是按插入顺序维护链表,不过我们可以在初始化 LinkedHashMap，
         * 指定 accessOrder 参数为 true，即可让它按访问顺序维护链表。
         */
        super(limit,0.75f,true);
        this.limit=limit;

    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return this.size()>limit;
    }
}
