package uniderp.loo.escola.dominio;

public abstract class BaseId {
    protected int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BaseId(int id) {
        this.id = id;
    }
    
    
}
