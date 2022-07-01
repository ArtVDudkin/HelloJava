package Task011_waveAlgorythm;

public class Program {
    public static void main(String[] args) {

        var mg = new MapGenerator();
       
        System.out.println(
            new MapPrinter().mapColor(
                    mg.getMap())
        );

        var lee = new WaveAlgorythm(mg.getMap());
        lee.Colorize(new Point2D(13, 10));
        lee.putRoadToMap(lee.getRoad(new Point2D(5,8)));
        
        // посмотреть карту в цифровом виде
        // System.out.println(
        //         new MapPrinter().rawData(
        //                 mg.getMap())
        // );

        System.out.println(
                new MapPrinter().mapColor(
                        mg.getMap())
        );
    }
}
