package infra;

import java.util.ArrayList;
import java.util.List;

public interface BridgeDAO<V> 
{
     List<V> get();
     void add();
     void delete();
     void update();
}