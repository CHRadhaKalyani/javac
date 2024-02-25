package src.doubts;

public class Test4 {
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 5; i >= 2; i--)
        {
            System.out.println(arr[i]);
        }
    }
}


/*
 "C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.2\lib\idea_rt.jar=60121:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.2\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\vasan\IdeaProjects\javac\out\production\javac src.Test4
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at src.Test4.main(Test4.java:10)

Process finished with exit code 1

 */
