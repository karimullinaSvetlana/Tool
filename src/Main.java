public class Main {
    public static void main(String[] args) {
        Guitar bass = new Guitar(4);
        Drum small = new Drum("small");
        Pipe alto = new Pipe(11.68);
        Tool[] tools = {bass, small, alto};
        for (Tool tool: tools){
            tool.play();
        }
    }
}