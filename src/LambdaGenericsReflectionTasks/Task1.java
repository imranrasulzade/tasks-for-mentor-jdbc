package LambdaGenericsReflectionTasks;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public class Task1 {
    public static void sort(List<Integer> list) {
        List<Integer> sortedNumbers = list.stream()
                .sorted(Integer::compareTo)
                .toList();
        System.out.println("Ordered list " + sortedNumbers);
    }


    public static <T> void updateField(T object, String fieldName, Object newValue) throws NoSuchFieldException,
            IllegalAccessException {
        Class<?> clazz = object.getClass();
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(object, newValue);
    }


    public static <T> Object invokeMethod(T object, String methodName) throws Exception {
        Class<?> clazz = object.getClass();
        Method method = clazz.getDeclaredMethod(methodName);
        method.setAccessible(true);
        return method.invoke(object);
    }


    public static void listMethodsAndParameters(Class<?> clazz) {
        Arrays.stream(clazz.getDeclaredMethods())
                .forEach(method -> {
                    System.out.println("Method " + method.getName());
                    System.out.println("Param " + method.getParameterCount());
                    System.out.println("------");
                });
    }



    public static void filterList(){
        List<Integer> numbers = List.of(1, 5, 8, 12, 7, 9);

        List<Integer> filteredList = numbers.stream()
                .filter(num -> num > 5)
                .toList();

        System.out.println(filteredList);
    }


    public static void mergeLists(){
        List<String> firstList = List.of("apple", "banana", "orange");
        List<String> secondList = List.of("grape", "kiwi", "melon");

        List<String> mergedList = new ArrayList<>(firstList);
        mergedList.addAll(secondList);

        System.out.println(mergedList);
    }


    public static void updateArrayListElement(){
        List<String> colors = new ArrayList<>(List.of("red", "blue", "green", "yellow"));
        String targetColor = "green";
        int index = colors.indexOf(targetColor);
        if (index != -1) {
            colors.set(index, "purple");
        }
        System.out.println(colors);
    }


    public static void findDuplicates(){
        List<String> names = List.of("Alice", "Bob", "Charlie", "Alice", "David", "Bob");
        Set<String> uniqueNames = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        for (String name : names) {
            if (!uniqueNames.add(name)) {
                duplicates.add(name);
            }
        }
        System.out.println(duplicates);
    }



}
