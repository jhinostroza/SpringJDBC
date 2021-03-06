
package app.zelper;

import java.util.List;

public interface GenericoDAO<T> {
    
    public List<T> list();

    public T get(T t);

    public void save(T t);

    public void update(T t);

    public void delete(T t);
    
}
