import java.util.ArrayList;
public class SelectionSort {
    public static void Sort(ArrayList<Student> array) {
        int size = 10; //Array size
        //Outer loop
        for (int step = 0; step < size - 1; step++) {
            int min = step;
            //Inner loop
            for (int i = step + 1; i < size; i++) {
                if (array.get(i).rollno < array.get(min).rollno) {
                min = i;
                }
            }
            Student temp = array.get(step);
            array.set(step, array.get(min));
            array.set(min, temp); //Rearrange
        }
    }
    public static void SortName(ArrayList<Student> array) {
        int size = 10;
        for (int step = 0; step < size - 1; step++) {
            int min = step;
            for (int i = step + 1; i < size; i++) {

                if (array.get(i).name.compareTo(array.get(min).name) < 0 ) {
                min = i;
                }
            }
            Student temp = array.get(step);
            array.set(step, array.get(min));
            array.set(min, temp);
        }
    }

    //Student constructor class
    public static class Student {
        int rollno;
        String name;
        String address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
        }
    public String toString() {
        return "Roll Number: "+ rollno + " Name: " + name + " Address: " + address+"\n";
        }
    }

    public void main(String[] args) {
        //Create array list of Student object
        ArrayList<Student> array = new ArrayList<>();
        array.add(new Student(2, "Jane" , "123 Maple Drive"));
        array.add(new Student(1, "John" , "123 Oak Drive"));
        array.add(new Student(4, "Ashley" , "123 College Drive"));
        array.add(new Student(3, "Scott" , "123 City Drive"));
        array.add(new Student(8, "Zach" , "123 Sample Drive"));
        array.add(new Student(7, "Barbara" , "123 Maple Drive"));
        array.add(new Student(10, "Adam" , "123 Oak Drive"));
        array.add(new Student(6, "Taylor" , "123 College Drive"));
        array.add(new Student(9, "Samantha" , "123 City Drive"));
        array.add(new Student(5, "Tiffany" , "123 Sample Drive"));
        //Print unsorted array
        System.out.println("Unsorted: " +"\n" + array);
        //Sort by roll number
        Sort(array);
        System.out.println("Sorted by roll number:" +"\n"+ array);
        //Sort by name
        SortName(array);
        System.out.println("Sorted by name:" +"\n"+ array);

    }
}

