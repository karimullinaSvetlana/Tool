public class Guitar implements Tool{
    int numberOfStrings = 0;
    Guitar(int numberOfStrings){
        this.numberOfStrings = numberOfStrings;
    }
    public void play(){
        System.out.println("играет гитара, количество ее струн: " + this.numberOfStrings);
    }
}
