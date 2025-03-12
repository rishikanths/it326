package SOLID.OCP.GoodPractise.persist;

public abstract class Persistance {
    
    protected String path;

    public abstract boolean connect();

    public abstract boolean close();

    public abstract boolean save(Object obj);

    public abstract boolean delete(Object obj);

    public abstract boolean update(Object obj);

}
