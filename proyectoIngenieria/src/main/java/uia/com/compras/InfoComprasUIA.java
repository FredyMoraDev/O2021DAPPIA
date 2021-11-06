package uia.com.compras;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.List;


@JsonTypeInfo(
	    use = JsonTypeInfo.Id.NAME,
	    include = JsonTypeInfo.As.PROPERTY,
	    property = "type")
	@JsonSubTypes({
	    @Type(value = ReporteNivelStock.class, name = "reporteNS")
	    })

public class InfoComprasUIA {

	private int id;
	private String name;
	private String descripcion;
	private List<InfoComprasUIA> items;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	
	public InfoComprasUIA(int id, String name)
	{
		this.id=id;
		this.name = name;
	}
	
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
		this.items =  items;
	}


	public void imprimeInfo() {
		System.out.println(this);
		System.out.println("Id:\t" + this.getId());
		System.out.println("Name:\t" + this.getName());
	}

}
