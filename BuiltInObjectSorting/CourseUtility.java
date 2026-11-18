

import java.util.Comparator;

public class CourseUtility {

    String direction;

    public CourseUtility(String direction) {
        this.direction = direction;
    }

    public Comparator<Course> getComparator() {

        if (direction.equals("ASC")) {
            return Comparator.comparingInt(c -> c.fee);
        }
        else {
            return Comparator.comparingInt((Course c) -> c.fee).reversed();
        }
    }
}
