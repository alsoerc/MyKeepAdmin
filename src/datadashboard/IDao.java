package datadashboard;

import java.util.List;

/**
 *
 * @author alsorc
 * @param <T>
 */
public interface IDao<T> {
    public List<T> getRecords(int carrera);
    
    
    
}
