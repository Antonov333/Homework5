public class Main {
    public static void main(String[] args) {
        taskTitle();
        task1();
        task2();
        task3();
        task4();
        task5();}

    public static void taskTitle () {

        System.out.println("Привет!");
        System.out.println(" ");
        System.out.println("Прошу проверить мое домашнее задание по теме Условные операторы, часть 2");
        System.out.println(" ");
    }
    public static void task1 () {
                System.out.println("Задача 1");
        byte clientOS = 0 ;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Для корректного выбора версии приложения необходимо уточнить," +
                    " какая операционная система установлена на Вашем смартфоне");
        }
        System.out.println(" ");
    }

        public static void task2 () {
        System.out.println("Задача 2");
        byte clientOS = 1 ;
        short clientDeviceYear = 2020;
        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченнную версию приложения для iOS по ссылке"); }
            if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке"); }
            if (clientOS != 0 && clientOS != 1) {
                System.out.println("Для корректного выбора версии приложения необходимо уточнить," +
                        " какая операционная система установлена на Вашем смартфоне " + clientDeviceYear + " года выпуска");
                }
            }
        if (clientDeviceYear >= 2015) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке"); }
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке"); }
            if (clientOS != 0 && clientOS != 1) {
                System.out.println("Для корректного выбора версии приложения необходимо уточнить," +
                        " какая операционная система установлена на Вашем смартфоне " + clientDeviceYear + " года выпуска");}

            System.out.println(" ");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
            Short year = 2021 ;
            if ( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ) {
                System.out.println("Год " + year + " является високосным"); }
            else {
                System.out.println("Год " + year + " не является високосным"); }
        System.out.println(" ");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 95 ;
        if (deliveryDistance <= 20 && deliveryDistance >= 0) {
            System.out.println("Потребуется 1 день для выполнения доставки в пределах " + deliveryDistance + "км");
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется 2 дня для выполнения доставки в пределах " + deliveryDistance + "км");
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня для выполнения доставки в пределах " + deliveryDistance + "км");
        }
        if (deliveryDistance > 100) {
            System.out.println("На расстояние " + deliveryDistance +"км доставка не выполняется");
        }
        if (deliveryDistance < 0) {
            System.out.println("Адрес доставки необходимо уточнить");}

        System.out.println(" ");
    }

    public static void task5 () {
        System.out.println("Задача 5");

        int monthNumber = 12 ;

        switch (monthNumber) {
            case 1:     System.out.println("Январь: зима"); break;
            case 2:     System.out.println("Февраль: зима"); break;
            case 3:     System.out.println("Март: весна"); break;
            case 4:     System.out.println("Апрель: весна"); break;
            case 5:     System.out.println("Май: весна"); break;
            case 6:     System.out.println("Июнь: лето"); break;
            case 7:     System.out.println("Июль: лето"); break;
            case 8:     System.out.println("Август: лето"); break;
            case 9:     System.out.println("Сентябрь: осень"); break;
            case 10:    System.out.println("Октябрь: осень"); break;
            case 11:    System.out.println("Ноябрь: осень"); break;
            case 12:    System.out.println("Декабрь: зима"); break;
            default:
                System.out.println("Что-то пошло не так, и номер месяца указан неправильно (("); break;
        }

        System.out.println(" ");
    }

}