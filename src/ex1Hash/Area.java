package ex1Hash;

import java.util.HashSet;

public class Area {

    private HashSet<Point> pointsInArea;

    public Area(Point point) {
        pointsInArea = new HashSet<>();
        pointsInArea.add(point);
    }


    public HashSet<Point> getPointsInArea() {
        return pointsInArea;
    }

    public void addPoint(Point point) {
        pointsInArea.add(point);
    }

    @Override
    public int hashCode() {
        if (pointsInArea.size() == 0) {
            return -1;
        }
        int maxX = -1;
        int maxY = -1;
        Point maxPoint = null;
        for (Point point : pointsInArea) {
            if (point.getX() > maxX) {
                maxX = point.getX();
                maxPoint = point;
            }
        }
        for (Point point : pointsInArea)
            if (point.getX() == maxX) {
                if (point.getY() > maxY) {
                    maxY = point.getY();
                    maxPoint = point;
                }
            }

        return maxPoint.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Area otherArea = (Area) obj;
        if (hashCode() != otherArea.hashCode()) {
            return false;
        }
        return true;
    }
}
