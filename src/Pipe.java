public class Pipe implements Tool{
    double diameter = 0;
    Pipe(double diameter){
        this.diameter = diameter;
    }
    public void play(){
        System.out.println("играет труба, ее диаметр: " + this.diameter);
    }
}
