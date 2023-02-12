public class Drum implements Tool{
    String size = "";
    Drum(String size){
        this.size = size;
    }
    public void play(){
        System.out.println("играет барабан, его размер: " + this.size);
    }
}
