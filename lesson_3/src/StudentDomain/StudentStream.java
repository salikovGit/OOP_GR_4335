package StudentDomain;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentStream implements Iterable<StudentGroup>{
    final int streamNumber;
    private static final ArrayList<StudentGroup> groupList = new ArrayList<>();

    public StudentStream(int streamNumber) {
        this.streamNumber = streamNumber;
    }

    public int getStreamNumber() {
        return streamNumber;
    }

    public ArrayList<StudentGroup> getGroupList() {
        return groupList;
    }

    /**
     * Java class method
     * @param group Group of students
     */
    public void addGroup(StudentGroup group) {
        groupList.add(group);
    }

    @Override
    public Iterator<StudentGroup> iterator() {

        return new Iterator<StudentGroup>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < groupList.size();
            }

            @Override
            public StudentGroup next() {
                return groupList.get(index++);
            }

        };

    }

    @Override
    public String toString() {
        return "StudentStream:" +
                " \nStream number = " + streamNumber +
                " \nAmount of groups = " + groupList.size() +
                " \nStudents:" + groupList;
    }
}
