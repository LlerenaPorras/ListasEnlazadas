package listasligadas.es.luigillerena.listasenlazadas;
import  java.util.*;
public class App {

        //Declaramos las varibles que vamos ausar
        private List lst;
        private int info = 11;
        private int initialInfo = 0;
        private String menu;
        private Scanner sc;

        // Creamos un constructor para inicializar la aplicacion
        public App(){

            this.lst = new List();
            this.sc = new Scanner(System.in);
            this.menu =   "Listas enlazadas Simples\n" +
                            "1. Crear lista \n" +
                            "2. Imprimir lista \n" +
                            "3. Agregar Nodos al inicio \n" +
                            "4. Agregar Nodos al final \n" +
                            "5. Buscar Nodo \n" +
                            "6. Borrar Nodo inicial \n" +
                            "7. Borrar Nodo final \n" +
                            "8. Salir \n";
        }

    public void displayMenu(){
        int number = 0;
        do{
            System.out.println(menu);
            number = sc.nextInt();
            switch (number){
                case 1:this.createList(); break;
                case 2:System.out.println(this.lst.print()); break;
                case 3:this.unshiftNode(); break;
                case 4:this.pushNode(); break;
                case 5:this.searchNode(); break;
                case 6:this.shiftNode(); break;
                case 7:this.popNode(); break;
                case 8:System.out.println("Goodbye"); break;
                default:System.out.println("Opcion incorrecta"); break;
            }
        } while(number != 8);
    }

        //Inicializamos la lista con 10 elementos
    public void createList(){
        this.lst = new List();
        for(int info = 1; info<=10; info++)
            this.lst.push(info);
        System.out.println(this.lst.print());
    }

    // Agregamos nodos

    public void unshiftNode(){
        this.lst.unshift(initialInfo);
        --initialInfo;
        System.out.println(this.lst.print());
    }
     // Movemos los nodos
    public void pushNode(){
        info++;
        this.lst.push(info);
        System.out.println(this.lst.print());
    }

    //Buscamos el nodo
    public void searchNode(){
        int n = 0;
        System.out.println("Digita el numero a buscar");
        n = sc.nextInt();
        if(this.lst.search(n)){
            System.out.println("Valor encontrado");
        } else {
            System.out.println("Valor no encontrado");
        }
        System.out.println(this.lst.print());
    }

// Elimina el primer nodo de la lista
    public void shiftNode(){
        if(this.lst.shift()){
            System.out.println("Nodo eliminado");
        } else {
            System.out.println("Valor no encontrado");
        }
        System.out.println(this.lst.print());
    }
    // Elimina el ultimo nodo de la lista

    public void popNode(){
        if(this.lst.pop()){
            System.out.println("Nodo eliminado");
        } else {
            System.out.println("Valor no encontrado");
        }
        System.out.println(this.lst.print());
    }





    public static void main(String[] args) throws Exception {
            App list = new App();
            list.displayMenu();
    }
}
