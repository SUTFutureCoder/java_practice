package com.hyper;

/**
 * @author xingchen.lin
 * @time 2018/10/14 4:09 PM.
 */
public class GenericMethodTest {

    // 泛型方法 printArray
    public static <E> void printArray(E[] inputArray) {
        // 输出数组元素
        for (E element: inputArray) {
            System.out.printf("%s ", element);
        }
    }
    public static void main(String []args) {
        // 创建不同类型数组 Integer Double Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("整形数组元素");
        printArray(intArray);

        System.out.println("双精度数组元素");
        printArray(doubleArray);

        System.out.println("字符型数组元素");
        printArray(charArray);
    }

}
