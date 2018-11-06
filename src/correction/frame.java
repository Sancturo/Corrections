package correction;

import POJOs.traektory;
import correction.GUI.MainWindowController;
import java.util.ArrayList;

public class frame {
public static int xStart, xEnd, yStart, yEnd, z, r, gType, feed = 0;
public static int ID = 0;
//переменная для временного хранения символов перед передачей в сегмент кадра
public static String temp = "";
    
    
    public static void frame(String frame) {
        ArrayList<String> cadr = new ArrayList<>();
        String disposed = frame.replaceAll("\\s", "");
        char[] frameChar = disposed.toCharArray();
        for(int i = 0; i < frameChar.length; i++){  // Преобразование в массив чаров и сбор элементов массива в пределах литер
            if(Character.isLetter(frameChar[i])){
                if(frameChar[i] == 'E')break;
                temp = "";
                for(int j = i; frameChar.length >= j; j++){
                    temp = temp + frameChar[j];
                        if(Character.isLetter(frameChar[j+1])){
                            i = j; 
                            cadr.add(temp); 
                            break;}
                }
            }
        }
        Object[] toArray = cadr.toArray();
        
        //Задаем триггер полученых значений начала координат Х и У
        boolean xGotOnce = false;
        boolean yGotOnce = false;
        
        //посимвольно перебираем полученную строку и ищем требуемые чары для сепарации по ним
        for(int i = 0; i < toArray.length; i++){
            char[] curr = toArray[i].toString().toCharArray();
            switch(curr[0]){
                case('G'): 
                    gType = arrayIter(curr);
                        break;
                case('X'): 
                    if(xGotOnce == false){
                        xStart = arrayIter(curr);
                        xGotOnce = true;
                        break;
                    }else
                        xEnd = arrayIter(curr);
                        break;
                case('Y'):  if(yGotOnce == false){
                        yGotOnce = true;
                        yStart = arrayIter(curr);
                        }else
                        yEnd = arrayIter(curr);
                        break;
                case('R'): 
                    r = arrayIter(curr);
                        break;
                case('F'): 
                    feed = arrayIter(curr);
                        break;
                case('Z'): 
                    z = arrayIter(curr);
                        break;        
            }
        }
        //обнуляем триггер получения начала линии Х и У
        xGotOnce = false;
        yGotOnce = false;
        //итератор для нумерации строк
        ID = MainWindowController.frameList.size() + 1;
        //создаем кадр в обзерв.массиве из полученного массива данных и добавляем
        traektory newframe = new traektory(ID, xStart, xEnd, yStart, yEnd, z, r, gType, feed);
        MainWindowController.frameList.add(newframe);
    }
    
    //при встрече требуемого символа этот метод проводит итерацию и собирает массив чаров.
    public static int arrayIter(char[]curr){
        String temp = "";
        for(int iter = 1; iter < curr.length; iter++){
            temp = temp + curr[iter];
        }
        int result = Integer.parseInt(temp);
        return result;
    }
    
    
}
