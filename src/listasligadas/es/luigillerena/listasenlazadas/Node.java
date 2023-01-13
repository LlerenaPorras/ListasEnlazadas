package listasligadas.es.luigillerena.listasenlazadas;
// CLase Auto referenciada
public class Node {
     private int info;
    private Node link; // Informacio  y referencia

    // Para que sea  un nodo tiene que ser un clase auto referencial
   // Constructor
    public Node (){
        this.info =0;
        this.link= null;

    }
    public Node (int info){
        this.info= info;
        this.link= null;
    }

    public  Node ( int info, Node link){
        this.info=info;
        this.link =link;
    }
    // Get
    public int getInfo() {
        return info;
    }
    public Node getLink(){
        return  link;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public void setLink(Node link) {
        this.link = link;
    }
}
