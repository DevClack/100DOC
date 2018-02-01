
class Frog{
    private String name;
    private int id;

    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString() {
        /*
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
        return sb.toString();
        */
        return String.format("id: %d\t name: %s", id, name);
    }
}


public class ToString {
    public static void main(String[] args){
    Frog frog1 = new Frog(7, "Bob");
    System.out.println(frog1);
    }
}
