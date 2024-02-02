public class Main {
    public static void main(String[] args) {
        int [][] array = {{5, 3, 9, 1},{8, 2, 4, 6},{7, 0, 10, 12}};
        bubleSort(array);//обращение к методу
        //вывод массива через цикл
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void bubleSort (int [][] sortArr){
        for (int i = 0; i < sortArr.length; i++) { //проход по столбцам
            for (int j = 0; j < sortArr[i].length - 1; j++) { //проход по  строкам
                for (int k = 0; k < sortArr[i].length - j - 1; k++) { //проход по неотсортированному массиву
                    if (sortArr[i][k] > sortArr[i][k + 1]) { //замена элементов, если следуюий элемент больше предыдущего
                        int temp = sortArr[i][k];
                        sortArr[i][k] = sortArr[i][k + 1];
                        sortArr[i][k + 1] = temp;
                    }
                }
            }
        }
    }
}