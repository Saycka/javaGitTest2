package ex1Hash;

import java.util.HashSet;

public class Ex2 {

    private HashSet<Area> areas = new HashSet<>();;
    Point point = new Point(1, 2);

    public Ex2 () {
        initAreas ();
    }

    private void initAreas() {
        Area area = new Area(point);
        area.addPoint(new Point (2,2));
        areas.add(area);

    }

    public void splitArea() {
        Area sharedArea = findAreaByPoint(new Point (2, 2));
        if (areas.remove(sharedArea)) {
            System.out.println("remove");
        }

        for (Area tArea : areas) {
            if (tArea.equals(sharedArea)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            if (tArea.hashCode() == sharedArea.hashCode()) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        if (areas.contains(sharedArea)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private Area findAreaByPoint(Point point) {
        for (Area area : areas) {
            if (area.getPointsInArea().contains(point)) {
                return area;
            }
        }
        return null;
    }
}
