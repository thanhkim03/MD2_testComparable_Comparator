import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCompartor {
        public static void main(String[] args) {
            List<Studen> studenList = new ArrayList<>();
            studenList.add(new Studen(1,"mạnh",20,18.5));
            studenList.add(new Studen(2,"thành",19,13.5));
            studenList.add(new Studen(3,"Anh",19,13.0));
            studenList.add(new Studen(4,"Hùng",28,20.7));
            Collections.sort(studenList, new Comparator<Studen>() {
//                sắp xếp theo bảng chữ cái
//                @Override
//                public int compare(Studen o1, Studen o2) {
//                    return o1.getName().compareTo(o2.getName());
//                }
//            });
//            sắp xếp theo id
                @Override
                public int compare(Studen o1, Studen o2) {
                    return o1.getId()-(o2.getId());
                }
            });
            for (Studen student:studenList
                 ) {
                System.out.println(student.toString());
                
            }
        }
    }
