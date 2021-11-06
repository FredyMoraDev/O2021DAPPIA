package uia.com.compras;

import java.util.List;

public class ListaInfoComprasUIA {
    protected int id;
    protected String name;
    private List<InfoComprasUIA> items;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<InfoComprasUIA> getItems() {
        return items;
    }

    public void setItems(List<InfoComprasUIA> items) {
        this.items = items;
    }
}
