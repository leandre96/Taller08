package ensamblajecomputadoras.creacional;

public class SistemaOperativo {
	private String nombre;
    private int arquitectura;
    private String version;

    public SistemaOperativo(String nombre, int arquitectura, String version) {
        this.nombre = nombre;
        this.arquitectura = arquitectura;
        this.version = version;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getArquitectura() {
        return arquitectura;
    }

    public void setArquitectura(int arquitectura) {
        this.arquitectura = arquitectura;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return nombre+" "+version+" "+arquitectura;
    }
}
