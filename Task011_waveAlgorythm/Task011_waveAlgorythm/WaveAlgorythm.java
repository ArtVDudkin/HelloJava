package Task011_waveAlgorythm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class WaveAlgorythm {
    int[][] map;

    public WaveAlgorythm(int[][] map) {
        this.map = map;
    }

    public void Colorize(Point2D startPoint) {
        Queue<Point2D> queue = new LinkedList<Point2D>();
        queue.add(startPoint);
        map[startPoint.x][startPoint.y] = 1;

        while (queue.size() != 0) {
            Point2D p = queue.remove();

            if (map[p.x - 1][p.y] == 0) {
                queue.add(new Point2D(p.x - 1, p.y));
                map[p.x - 1][p.y] = map[p.x][p.y] + 1;
            }
            if (map[p.x][p.y - 1] == 0) {
                queue.add(new Point2D(p.x, p.y - 1));
                map[p.x][p.y - 1] = map[p.x][p.y] + 1;
            }
            if (map[p.x + 1][p.y] == 0) {
                queue.add(new Point2D(p.x + 1, p.y));
                map[p.x + 1][p.y] = map[p.x][p.y] + 1;
            }
            if (map[p.x][p.y + 1] == 0) {
                queue.add(new Point2D(p.x, p.y + 1));
                map[p.x][p.y + 1] = map[p.x][p.y] + 1;
            }
        }
    }

    public ArrayList<Point2D> getRoad(Point2D exit) {
        ArrayList<Point2D> road = new ArrayList<>();
        road.add(exit);
        Point2D p = road.get(road.size() -1);
    
        while (map[p.x][p.y] != 1) {
            p = road.get(road.size() -1);
            if (map[p.x][p.y] - map[p.x - 1][p.y] == 1) {
                road.add(new Point2D(p.x - 1, p.y));   
            } 
            else if (map[p.x][p.y] - map[p.x][p.y - 1] == 1) {
                    road.add(new Point2D(p.x, p.y - 1));   
            }
            else if (map[p.x][p.y] - map[p.x + 1][p.y] == 1) {
                    road.add(new Point2D(p.x + 1, p.y));
            }
            else if (map[p.x][p.y] - map[p.x][p.y + 1] == 1) {
                road.add(new Point2D(p.x, p.y + 1));
            }
        }
        return road;
    }

    public void putRoadToMap(ArrayList<Point2D> road) {

        for (var item : road) {
            map[item.x][item.y] = -4;
        }
        map[road.get(road.size() -1).x][road.get(road.size() -1).y] = -2;
        map[road.get(0).x][road.get(0).y] = -3;
    }
}
