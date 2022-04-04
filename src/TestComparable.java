import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {
    public static void main(String[] args) {
        List<Studen> studenList = new ArrayList<>();
        studenList.add(new Studen(1,"mạnh",20,18.5));
        studenList.add(new Studen(2,"thành",19,13.5));
        studenList.add(new Studen(3,"Anh",19,13.0));
        studenList.add(new Studen(4,"Hùng",28,20.7));
        Collections.sort(studenList);
//        so sánh age và GPA theo thứ tự tăng dần
        for (Studen student:studenList) {
            System.out.println(student.toString());
        }
    }
}
