package listasligadas.es.luigillerena.listasenlazadas;

public class List {
    private Node first ;
    private Node last ;

    public List (){
        this.first= null;
        this.last= null;
    }

    //Agregar elemntos al primero
    public  void  unshift (int info){
        Node newNode = new Node (info); //Creamos el nodo
        if (first == null){
            this.first = newNode;
            this.last = newNode;
        } else {
            newNode.setLink(this.first);
            this.first = newNode; // Darle  referencia al nuevo nodo
        }

    }

    // Push agregar al final al nodo
    public  void  push ( int info){
         Node newNode = new Node(info);
         if ( first == null ){
             this.first= newNode;
             this.last= newNode;
         }else {
             this.last.setLink(newNode);
             this.last = newNode;
             this.last.setLink(null);
         }
    }

    public  boolean isEmpty(){
        return this.first == null;
    }

    public boolean search (int info){
        Node p = first;
        while (p.getLink() != null){
            if (p.getInfo() == info){
                return  true ;
            }
            p = p.getLink();
        }
        return  false;
    }

    // Eliminar
    public  boolean  shift(){
        if (this.isEmpty()){
            return false;
        }if (this.first.getLink() ==   null){
            this.first = null;
            this.last=null;
            return  true;
        }
        Node temp = this.first;
        this.first = this.first.getLink();
        temp = null;
        return  true;
    }

    // Pop
    public  boolean pop (){
       if ( this.isEmpty()){
           return  false;
       }
       if (this.first.getLink()== null){
           this.first = null;
           this.last = null;
           return  true;
       }
       Node temp = this.first;
       Node temp2 = this.first;
       while (temp.getLink() != null){
               temp2 = temp;
               temp = temp.getLink();
       }
       this.last = temp2;
       this.last.setLink((null));
       temp = null ;
       return  true;
    }

    // Imprimir
    public  String print(){
        StringBuilder str = new StringBuilder();
        Node p = this.first;
        while (p.getLink() != null){
            str.append(p.getInfo()).append("|");
            p = p.getLink();
        }
        return str.toString();
    }

}
