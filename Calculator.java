
public class Calculator {

   public static String checkAndCalculate(String stringcheck) {
       boolean firstFlag = true;
       boolean secondFlag = true;
       String romeResult = null;
       int first;
       int second;
       Integer result = 0;
           String[] elements = stringcheck.split(" ");
       if (elements.length != 3) {
           throw new RuntimeException("Формат математической операции не удовлетворяет заданию");
       }
       if (elements[0].contains(".") || elements[0].contains(",") || elements[2].contains(".") || elements[2].contains(",")) {
           throw new RuntimeException("Введенные числа должны быть целыми");
       }
       try {
           first = Integer.parseInt(elements[0]);
       } catch (NumberFormatException e) {
           firstFlag = false;
           first = Info.list.indexOf(elements[0]);
           if (first == -1) {
               throw new RuntimeException("Такого римского числа не существует");
           }
       }
       try {
           second = Integer.parseInt(elements[2]);
       } catch (NumberFormatException e) {
           secondFlag = false;
           second = Info.list.indexOf(elements[2]);
           if (second == -1) {
               throw new RuntimeException("Такого римского числа не существует");
           }
       }
       if (firstFlag != secondFlag) {
           throw new RuntimeException("Оба введенных числа должны быть либо римскими либо арабскими");
       }
       if (first > 10 || first < 1) {
           throw new RuntimeException("Введенные числа должны быть от 1 до 10, либо от I до X");
       }
       if (second > 10 || second < 1) {
           throw new RuntimeException("Введенные числа должны быть от 1 до 10, либо от I до X");
       }
       if (!(elements[1].equals("-") || !elements[1].equals("+") || !elements[1].equals("*") || !elements[1].equals("/"))) {
           throw new RuntimeException("Введенная операция не соответствует одной из возможных");
       }
       if (elements[1].equals("-")) {
           result = first - second;
       }
       if (elements[1].equals("+")) {
           result = first + second;
       }
       if (elements[1].equals("*")) {
           result = first * second;
       }
       if (elements[1].equals("/")) {
           result = (int) (first / second);
       }
       if (firstFlag == false && secondFlag == false && result <0) {
           throw new RuntimeException("В римской системе нет отрицательных чисел");
       }
       if (firstFlag == false && secondFlag == false) {
             return romeResult = Info.numberRom.get(result);
       }
       return result.toString();
   }
   }

