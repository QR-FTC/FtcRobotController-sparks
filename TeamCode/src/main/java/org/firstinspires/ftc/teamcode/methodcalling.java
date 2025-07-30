package org.firstinspires.ftc.teamcode;

public class methodcalling {
    //||||||||
//vvvvvvv
    //function
    public static double getArea(double radius) { // parameters
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        double r = 1.0;
        double area = getArea(r); // pass argument through method
        System.out.println("the area of a circle with radius " + r + " is " + area + ".");
    }

    public static class FindMaxNum {

        public static int getMax(int a, int b) {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        }

        public static void main(String[] args) {
            int a = 2;
            int b = 3;
            double larger = getMax(a, b);
            System.out.println("The larger number is " + larger + ".");

        }


        public static class rect {
            public static int getArea(int a, int b) {
                return a * b;
            }

            public static void main(String[] args) {
                int length = 2;
                int width = 3;
                int area = getArea(length, width);
                System.out.println("The larger number is " + area + ".");
            }


            public static class squareroot {

                public static int getSquareRoots(int a) {

                    return (int) Math.sqrt(a);
                }

                public static void main(String[] args) {
                    int number = 2;
                    int squareRoot = getSquareRoots(number);
                    System.out.println("The square root of " + number + " is " + squareRoot + ".");
                }
            }

            public static class findAverage {
                public static double getaverage(int a, int b, int c) {
                    return (a + b + c) / 3;
                }

                public static void main(String[] args) {
                    int a = 2;
                    int b = 3;
                    int c = 4;
                    double average = getaverage(a, b, c);
                    System.out.println("The average of " + a + ", " + b + ", and " + c + " is " + average + ".");
                }
            }

            public static class greeting {
                public static String getGreeting(String name) {
                    return "Hello " + name + "!";

                }

                public static void main(String[] args) {
                    String name = "Bob";
                    String greeting = getGreeting(name);
                    System.out.println(greeting);
                }
            }

            public static class getEvens {
                public static int getEvens(int a) {
                    int count = 0;
                    for (int i = 1; i <= a; i++) {
                        if (i % 2 == 0) {
                            count++;
                        }
                    }
                    return count;
                }

                public static void main(String[] args) {
                    int a = 10;
                    int evens = getEvens(a);
                    System.out.println("There are " + evens + " even numbers between 1 and " + a + ".");
                }


                public static class factorials{
                    public static int getFactorial(int a) {
                        int factorial = 1;
                        for (int i = 1; i <= a; i++) {
                            factorial *= i;
                        }
                        return factorial;
                    }

                    public static void main(String[] args) {
                        int a = 5;
                        int factorial = getFactorial(a);
                        System.out.println("The factorial of " + a + " is " + factorial + ".");}


                }

                public static class printarray{
                    public static int printarray(int[] array) {
                        for (int i = 0; i < array.length; i++) {
                            System.out.println(array[i] + " ");
                        }
                        return 0;
                    }

                   public static void main(String[] args) {
                        int[] array = {1, 2, 3, 4, 5};
                        printarray(array);}


                }
                
                public static class getmax{
                    public static int getmax(int[] array) {
                        int max = array[0];
                        for (int i = 1; i < array.length; i++) {
                            if (array[i] > max) {
                                max = array[i];
                            }
                            }
                        return max;
                    }
                    public static void main(String[] args) {
                        int[] array = {1, 2, 3, 4, 5};
                        int max = getmax(array);
                        System.out.println("The maximum value in the array is " + max + ".");

                }
                }

                public static class getmin{
                    public static int getmin(int[] array) {
                        int min = array[0];
                        for (int i = 1; i < array.length; i++) {
                            if (array[i] < min) {
                                min = array[i];
                }
                        }
                        return min;
                    }

                    public static void main(String[] args) {
                        int[] array = {1, 2, 3, 4, 5};
                        int min = getmin(array);
                        System.out.println("The minimum value in the array is " + min + ".");
                    }
                }

                public static class getsum {
                    public static int getsum(int[] array) {
                        int sum = 0;
                        for (int i = 0; i < array.length; i++) {
                            sum += array[i];
                        }
                        return sum;
                    }

                    public static void main(String[] args) {
                        int[] array = {1, 2, 3, 4, 5};
                        int sum = getsum(array);
                        System.out.println("The sum of the values in the array is " + sum + ".");
                    }
                }

                public static class getaverage{
                    public static double getaverage(int[] array) {
                        int sum = 0;
                        for (int i = 0; i < array.length; i++) {
                            sum += array[i];
                        }
                        return (double) sum / array.length;
                    }
                    public static void main(String[] args) {
                        int[] array = {1, 2, 3, 4, 5};
                        double average = getaverage(array);
                        System.out.println("The average of the values in the array is " + average + ".");
                    }


                public static class getevencount{
                        public static int getevencount(int[] array) {
                        int count = 0;
                        for (int i = 0; i < array.length; i++) {
                            if (array[i] % 2 == 0) {
                                count++;
                            }
                        }

                            return count;
                        }
                        public static void main(String[] args) {
                            int[] array = {1, 2, 3, 4, 5};
                            int count = getevencount(array);
                            System.out.println("The number of even values in the array is " + count + ".");

                    }
                    }
                }
            }

                public static class  getoddcount{
                    public static int getoddcount(int[] array) {
                        int count = 0;
                        for (int i = 0; i < array.length; i++) {
                            if (array[i] % 2 != 0) {
                                count++;
                }
                        }
                        return count;
                    }
                    public static void main(String[] args) {
                        int[] array = {1, 2, 3, 4, 5};
                        int count = getoddcount(array);
                        System.out.println("The number of odd values in the array is " + count + ".");
                    }
            }

                public static class getpositivecount {
                    public static int getpositivecount(int[] array) {
                        int count = 0;
                        for (int i = 0; i < array.length; i++) {
                            if (array[i] > 0) {
                                count++;
                }
                        }
                        return count;
                    }
                    public static void main(String[] args) {
                        int[] array = {1, 2, 3, 4, 5};
                        int count = getpositivecount(array);
                        System.out.println("The number of positive values in the array is " + count + ".");
                    }
            }

            public static class getnegativecount {
                public static int getnegativecount(int[] array) {
                    int count = 0;
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] < 0) {
                            count++;
            }
                    }
                    return count;
                }
                public static void main(String[] args) {
                    int[] array = {1, 2, 3, 4, 5};
                    int count = getnegativecount(array);
                    System.out.println("The number of negative values in the array is " + count + ".");
                }
            }

            public static class sortarray{
                public static void sortarray(int[] array) {
                    for (int i = 0; i < array.length - 1; i++) {
                        for (int j = 0; j < array.length - i - 1; j++) {
                            if (array[j] > array[j + 1]) {
                }

            }
                    }
                }
                public static void main(String[] args) {
                    int[] array = {1, 2, 3, 4, 5};
                    sortarray(array);
                    System.out.println("The sorted array is: ");
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                    }
                    System.out.println();
            }
            }





















        }
    }
}

