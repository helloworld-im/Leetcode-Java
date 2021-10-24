import java.util.*;

public class Courses {
    public static void main(String[] args) {
        HashMap<String, List<String>> h1 = new LinkedHashMap<>();
        HashMap<String, String> h2 = new LinkedHashMap<>();

        System.out.println("Checking for HashMap being empty");
        System.out.println("h1: " + h1.isEmpty());
        System.out.println("h2: " + h2.isEmpty());
        System.out.println();

        List<String> subjects = Arrays.asList("Python", "Math", "C");
        h1.put("A",subjects);
        subjects = Arrays.asList("C","C++");
        h1.put("B",subjects);
        subjects = Arrays.asList("C++","Physics","Chemistry");
        h1.put("C",subjects);

        h2.put("Python","111");
        h2.put("Math","222");
        h2.put("C","333");
        h2.put("C++","444");
        h2.put("Physics","555");
        h2.put("Chemistry","666");
        h2.put("Digital Electronics","777");
        System.out.println();

        System.out.println("Student set:");
        for(Map.Entry m:h1.entrySet()){
            System.out.print(m.getKey()+" : ");
            subjects = (List<String>)m.getValue();
            for(String s:subjects)
                System.out.print(s + " ");
            System.out.println();
        }
        System.out.println();

        System.out.println("Faculty set:");
        for(Map.Entry m:h2.entrySet()){
            System.out.println(m.getKey()+" : "+m.getValue());
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student: ");
        String s = sc.nextLine();

        System.out.println("Faculties of student " + s + " are: ");
        for(Map.Entry m:h1.entrySet()){
            if(m.getKey().equals(s)){
                for(Map.Entry m2:h2.entrySet()){
                    subjects = (List<String>)m.getValue();
                    if(subjects.contains(m2.getKey()))
                        System.out.println(m2.getValue());
                }
            }
        }
    }
}