import java.util.*;


public class Main {
    public static void main(String[] args) {
        String[] students = {"Антонов","Шевченко","Бойко","Шевченко","Кравченко",
                "Савицький","Антонов","Шевченко", "Тетерів","Мамченко"};
        List<String> studentsList = new ArrayList<>();
        for(String student:students){
            studentsList.add(student);
        }
        System.out.println(studentsList.size());
        Set<String> studentsSet= new HashSet<>();
        for (String student:students){
            studentsSet.add(student);
        }
        System.out.println(studentsSet.size());
        Map<String, Byte> studentsMap = new HashMap<>();
        for (String student:studentsSet){
            studentsMap.put(student, (byte) student.length());
        }
    }
}

