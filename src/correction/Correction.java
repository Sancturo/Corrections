/*
        1. Считать файл Ж-кода
            G01 X00 Y00 X100 Y00
            G03 X100 Y00 X100 Y10 R5
            G01 X100 Y10 X00 Y10
            G03 X00 Y10 X00 Y00 R5
        2. Проанализировать координаты.
            Создать объект G, Х, У, R.
            Преобразование: line x1,y1,x2,y2
                            arc x1, y1, x2, y2 , r;
        3. Отрисовка траектории.
        4. Просчет направления.
            цепочкой от точки старта с унаследованием от предыдущей линии.
        5. Установка коррекци.
        6. Пересчет координат.
            G01 X00 Y01 X100 Y01
            G01 X101 Y00 X101 Y10
        7. Прорисовка новой траектории.
        8. Запись нового файла.       
        */
package correction;


public class Correction {
    
   public static String traektory = "G03 X300 Y220 X200 Y100"+"E";
   
public static void maitn(String[] args){
    frame.frame(traektory);
    MainWindow.main(args);
    
}

    private static void drawLine() {
        System.out.println("In progress");
    }

    private static void readGCode() {
        System.out.println("In progress");
    }
    
    

}