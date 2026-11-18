

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortApp {

    public static void main(String[] args) {

        Course c1 = new Course(1, "Java Programming", 1200);
        Course c2 = new Course(2, "SQL Programming", 800);
        Course c3 = new Course(3, "React Programming", 2100);
        Course c4 = new Course(4, "Data Structure", 1100);

        List<Course> list = new ArrayList<>();

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);

        System.out.println("Total Number of Courses: " + list.size());

        System.out.println("*********All Courses*********");
        for (Course c : list) {
            System.out.println(c);
        }

        System.out.println("*********All Courses in ASC order by Fee*********");
        sortCourses(list, "ASC");

        System.out.println("*********All Courses in DESC order by Fee*********");
        sortCourses(list, "DESC");
    }

    private static void sortCourses(List<Course> list, String direction) {

        Collections.sort(list, new CourseUtility(direction).getComparator());

        for (Course c : list) {
            System.out.println(c);
        }
    }
}
