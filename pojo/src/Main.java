public class Main {
    public static void main(String[] args)
    {
        for (int i=1;i<=5;i++) {
            Student student = new Student(11110 + i,
                    switch (i){
                    case 1 -> "test1";
                    case 2 -> "test2";
                    case 3 -> "test3";
                    case 4 -> "test4";
                    case 5 -> "test5";
                        default -> "Anonymous";
        }, "25042005", "F2");

            System.out.println(student);
        }

        System.out.println();

        for (int i=1;i<=5;i++) {
            Student2 student2  = new Student2(11110 + i,
                    switch (i){
                        case 1 -> "test1";
                        case 2 -> "test2";
                        case 3 -> "test3";
                        case 4 -> "test4";
                        case 5 -> "test5";
                        default -> "Anonymous";
                    }, "25042005", "F2");

            System.out.println(student2);
        }

    }
}
