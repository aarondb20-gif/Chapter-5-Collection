import java.util.Objects;

public class Artifact {
    private String id;
    private String name;
    private String era;

    public Artifact(String id, String name, String era){
        this.id = id;
        this.name = name;
        this.era = era;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEra(){
        return era;
    }
    @Override
    public String toString(){
        return "ID: " + id + "Name: " + name + "Era: " + era;
    }
    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if (object == null || this.getClass() != object.getClass()){
            return false;
        }
        Artifact item = (Artifact) object;

        return this.id.equals(item.id);
    }
    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

}
