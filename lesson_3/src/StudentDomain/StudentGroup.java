package StudentDomain;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>{
    List<Student> group;
    final int idGroup;

    /**
     * Java class constructor
     * @param group List of Students
     * @param idGroup Group's unique ID
     */
    public StudentGroup(List<Student> group, int idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    /**
     * Java class method
     * @return List of students in this group
     */
    public List<Student> getGroup() {
        return group;
    }

    /**
     * Java class method
     * @return Unique ID of this group
     */
    public int getIdGroup() {
        return idGroup;
    }


    @Override
    public String toString() {
        return "StudentGroup" +
                " \nid = " + idGroup +
                " \nAmount of students = " + group.size() +
                " \nStudents: " + group +
                "\n";
    }

    @Override
    public Iterator<Student> iterator() {

        return new Iterator<Student>()
        {
            private int counter;

            @Override
            public boolean hasNext() {
                return counter<group.size();
            }

            @Override
            public Student next() {
                if(!hasNext())
                {
                    return null;
                }
                return group.get(counter++);
            }
        };

        //return new SGIterator(group);
    }


    @Override
    public int compareTo(StudentGroup o) {
        if (this.getGroup().size() == o.getGroup().size()) {
            return Integer.compare(this.getIdGroup(), o.getIdGroup());
        }
        if(this.getGroup().size() < o.getGroup().size()) {
            return -1;
        }
        return 1;

    }
}