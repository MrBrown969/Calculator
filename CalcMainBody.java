
package Calculator;

import static Calculator.RomanCalc.testR;
import java.util.Arrays;
import java.util.Scanner;


public class CalcMainBody {

        static   int n1;
  static  int n2;
   static int n3;
   static RomanCalc testR = new RomanCalc();
   
   
   
     public static void main(String[] args){
         
    
     Scanner scan = new Scanner(System.in);
 
    System.out.println("Добро пожаловать в Черезпробельный калькулятор!");
    System.out.println("Он черезпробельный, поэтому вводи всё через пробел (например: 2(пробел)+(пробел)2).");
    System.out.println("Можешь что-нибудь сложить, вычесть, разделить, или умножить(помни о пробеле).");
    System.out.println("Что-нибудь с 1 до 10. Арабскими (=>)ИЛИ римскими символами (например, так нельзя: II / 2).");
    System.out.println("Еще помни, что у римлян не было ноля и отрицательных чисел. Просто имей это ввиду!");
   
          
    System.out.println("Если умножишь кое-какое римское число на III, то узнаешь, сколько лет было Артасу," );
    System.out.println("когда он предал Альянс и переметнулся на сторону Плети.");
       System.out.println();
             System.out.println();
                System.out.println();
             System.out.println();
    String input =scan.nextLine();
    
    if(input.contains("+")&&(input.contains("V")||input.contains("I")||(input.contains("X")))){
        
          String split = new String(input);  
    String [] plus = split.split(" [+] ");
    
    String number1 =plus[0];
    String number2 = plus[1];
        
        
 
 
    
        switch(RomanNumbers.valueOf(number1)){
            case I:
    testR.n1 = 1;
         break;
           case II:
              testR.n1 =2; 
              break;
           case III:
               testR.n1 =3; 
              break;
               case IV:
                  testR.n1 =4; 
              break; 
  
               case V:
                   testR.n1 =5; 
              break;
               case VI:
                   testR.n1 =6; 
              break;
               case VII:
                   testR.n1 =7; 
              break;
               case VIII:
                   testR.n1 =8; 
              break;
               case IX:
                   testR.n1 =9; 
              break;
               case X:
                   testR.n1 =10; 
              break;
           default:
               System.out.println("");
               
                break;
                 
    }
       switch(RomanNumbers.valueOf(number2)){
          case I:
              testR.n2 = 1;
             break;
          case II:
               testR.n2 = 2;
               break;
           case III:
               testR.n2 =3; 
              break;
               case IV:
                  testR.n2 =4; 
              break; 
  
               case V:
                   testR.n2 =5; 
              break;
               case VI:
                   testR.n2 =6; 
              break;
               case VII:
                   testR.n2 =7; 
              break;
               case VIII:
                   testR.n2 =8; 
              break;
               case IX:
                   testR.n2 =9; 
              break;
               case X:
                   testR.n2 =10; 
              break;
           default:
               System.out.println("");
               
                break;
           
       }
       
       testR.n3 = testR.n1+testR.n2;
   
    }
 
    
    
    
    
    
   else if(input.contains("-")&&(input.contains("V")||input.contains("I")||(input.contains("X")))){
        
          String split = new String(input);  
    String [] plus = split.split(" [-] ");
    
    String number1 =plus[0];
    String number2 = plus[1];
        
        
 
 
    
        switch(RomanNumbers.valueOf(number1)){
            case I:
    testR.n1 = 1;
         break;
           case II:
              testR.n1 =2; 
              break;
           case III:
               testR.n1 =3; 
              break;
               case IV:
                  testR.n1 =4; 
              break; 
  
               case V:
                   testR.n1 =5; 
              break;
               case VI:
                   testR.n1 =6; 
              break;
               case VII:
                   testR.n1 =7; 
              break;
               case VIII:
                   testR.n1 =8; 
              break;
               case IX:
                   testR.n1 =9; 
              break;
               case X:
                   testR.n1 =10; 
              break;
           default:
               System.out.println("");
               
                break;
                 
    }
       switch(RomanNumbers.valueOf(number2)){
          case I:
              testR.n2 = 1;
             break;
          case II:
               testR.n2 = 2;
               break;
           case III:
               testR.n2 =3; 
              break;
               case IV:
                  testR.n2 =4; 
              break; 
  
               case V:
                   testR.n2 =5; 
              break;
               case VI:
                   testR.n2 =6; 
              break;
               case VII:
                   testR.n2 =7; 
              break;
               case VIII:
                   testR.n2 =8; 
              break;
               case IX:
                   testR.n2 =9; 
              break;
               case X:
                   testR.n2 =10; 
              break;
           default:
               System.out.println("");
               
                break;
           
       }
     testR.n3 = testR.n1-testR.n2;
     
    }
    
    
   
   
   else if(input.contains("*")&&(input.contains("V")||input.contains("I")||(input.contains("X")))){
        
          String split = new String(input);  
    String [] plus = split.split(" [*] ");
    
    String number1 =plus[0];
    String number2 = plus[1];
        
        
 
 
    
        switch(RomanNumbers.valueOf(number1)){
            case I:
    testR.n1 = 1;
         break;
           case II:
              testR.n1 =2; 
              break;
           case III:
               testR.n1 =3; 
              break;
               case IV:
                  testR.n1 =4; 
              break; 
  
               case V:
                   testR.n1 =5; 
              break;
               case VI:
                   testR.n1 =6; 
              break;
               case VII:
                   testR.n1 =7; 
              break;
               case VIII:
                   testR.n1 =8; 
              break;
               case IX:
                   testR.n1 =9; 
              break;
               case X:
                   testR.n1 =10; 
              break;
           default:
               System.out.println("");
               
                break;
                 
    }
       switch(RomanNumbers.valueOf(number2)){
          case I:
              testR.n2 = 1;
             break;
          case II:
               testR.n2 = 2;
               break;
           case III:
               testR.n2 =3; 
              break;
               case IV:
                  testR.n2 =4; 
              break; 
  
               case V:
                   testR.n2 =5; 
              break;
               case VI:
                   testR.n2 =6; 
              break;
               case VII:
                   testR.n2 =7; 
              break;
               case VIII:
                   testR.n2 =8; 
              break;
               case IX:
                   testR.n2 =9; 
              break;
               case X:
                   testR.n2 =10; 
              break;
           default:
               System.out.println("");
               
                break;
           
       }
      testR.n3 = testR.n1*testR.n2;
    }
    
    
    
    else if(input.contains("/")&&(input.contains("V")||input.contains("I")||(input.contains("X")))){
        
          String split = new String(input);  
    String [] plus = split.split(" [/] ");
    
    String number1 =plus[0];
    String number2 = plus[1];
        
        
 
 
    
        switch(RomanNumbers.valueOf(number1)){
            case I:
    testR.n1 = 1;
         break;
           case II:
              testR.n1 =2; 
              break;
           case III:
               testR.n1 =3; 
              break;
               case IV:
                  testR.n1 =4; 
              break; 
  
               case V:
                   testR.n1 =5; 
              break;
               case VI:
                   testR.n1 =6; 
              break;
               case VII:
                   testR.n1 =7; 
              break;
               case VIII:
                   testR.n1 =8; 
              break;
               case IX:
                   testR.n1 =9; 
              break;
               case X:
                   testR.n1 =10; 
              break;
           default:
               System.out.println("");
               
                break;
                 
    }
       switch(RomanNumbers.valueOf(number2)){
          case I:
              testR.n2 = 1;
             break;
          case II:
               testR.n2 = 2;
               break;
           case III:
               testR.n2 =3; 
              break;
               case IV:
                  testR.n2 =4; 
              break; 
  
               case V:
                   testR.n2 =5; 
              break;
               case VI:
                   testR.n2 =6; 
              break;
               case VII:
                   testR.n2 =7; 
              break;
               case VIII:
                   testR.n2 =8; 
              break;
               case IX:
                   testR.n2 =9; 
              break;
               case X:
                   testR.n2 =10; 
              break;
           default:
               System.out.println("");
               
                break;
           
       }
      testR.n3 = testR.n1/testR.n2;
    }
    
    
   else if(input.contains("+")){
  
    String split = new String(input);
    
    String [] plus = split.split(" [+] ");
   
   int number1 = Integer.parseInt(plus[0]);
   
   int number2 = Integer.parseInt(plus[1]);
   
   if (number1 > 10 || number1<1||number2>10||number2<1){
       
          System.out.println("Ой, что-то пошло не так.Обрати внимание, что ты можешь вводить только числа с 1 до 10 включительно");
   }
   else
     
    System.out.println(number1+number2);
       }
        
    else if(input.contains("-")){
        
        String split = new String(input);
    
    String [] plus = split.split(" [-] ");
   
   int number1 = Integer.parseInt(plus[0]);
   
   int number2 = Integer.parseInt(plus[1]);
   
     if (number1 > 10 || number1<1||number2>10||number2<1){
       
     System.out.println("Ой, что-то пошло не так.Обрати внимание, что ты можешь вводить только числа с 1 до 10 включительно");
   }
   else
    System.out.println(number1-number2);
           
    }else if(input.contains("*")){
        
        
        String split = new String(input);
    
    String [] plus = split.split(" [*] ");
   
   int number1 = Integer.parseInt(plus[0]);
   
   int number2 = Integer.parseInt(plus[1]);
   if (number1 > 10 || number1<1||number2>10||number2<1){
       
     System.out.println("Ой, что-то пошло не так.Обрати внимание, что ты можешь вводить только числа с 1 до 10 включительно");
   }
   else
     
    System.out.println(number1*number2);
           
    }else if(input.contains("/")){
        
        String split = new String(input);
    
    String [] plus = split.split(" [/] ");
   
   int number1 = Integer.parseInt(plus[0]);
   
   int number2 = Integer.parseInt(plus[1]);
     if (number1 > 10 || number1<1||number2>10||number2<1){
       
     System.out.println("Ой, что-то пошло не так.Обрати внимание, что ты можешь вводить только числа с 1 до 10 включительно");
   }
   else
    System.out.println(number1/number2);
        
    }
    else System.out.println("введи знак умножения, деления, сложения или вычитания");
    
    
    
    if(testR.n3>0){
    
             switch(testR.n3){


             case 1: System.out.println("I");
                 break;
             case 2: System.out.println("II");
             break;
             case 3: System.out.println("III");
             break;
             case 4: System.out.println("IV");
             break;
             case 5: System.out.println("V");
             break;
              case 6: System.out.println("VI");
             break;
              case 7: System.out.println("VII");
             break;
              case 8: System.out.println("VIII");
             break;
              case 9: System.out.println("IX");
             break;
              case 10: System.out.println("X");
             break;
              case 11: System.out.println("XI");
             break;
              case 12: System.out.println("XII");
             break;
              case 13: System.out.println("XIII");
             break;
              case 14: System.out.println("XIV");
             break;
              case 15: System.out.println("XV");
             break;
              case 16: System.out.println("XVI");
             break;
              case 17: System.out.println("XVII");
             break;
              case 18: System.out.println("XVIII");
             break;
              case 19: System.out.println("XIX");
             break;
              case 20: System.out.println("XX");
             break;
            case 21: System.out.println("XXI");
             break;
             case 22: System.out.println("XXII");
             break;
             case 23: System.out.println("XXIII");
             break;
             case 24: System.out.println("XXIV");
             System.out.println("Я становлюсь королём, отец!");
             break;
             case 25: System.out.println("XXV");
             break;
             case 26: System.out.println("XXVI");
             break;
             case 27: System.out.println("XXVII");
             break;
             case 28: System.out.println("XXVIII");
             break;
             case 29: System.out.println("XXIX");
             break;
             case 30: System.out.println("XXX");
             break;
             case 31: System.out.println("XXXI");
             break;
             case 32: System.out.println("XXXII");
             break;
             case 33: System.out.println("XXXIII");
             break;
             case 34: System.out.println("XXXIV");
             break;
             case 35: System.out.println("XXXV");
             break;
             case 36: System.out.println("XXXVI");
             break;
             case 37: System.out.println("XXXVII");
             break;
             case 38: System.out.println("XXXVIII");
             break;
             case 39: System.out.println("XXXIX");
             break;
             case 40: System.out.println("XL");
             break;
             case 41: System.out.println("XLI");
             break;
             case 42: System.out.println("XLII");
             break;
             case 43: System.out.println("XLIII");
             break;
             case 44: System.out.println("XLIV");
             break;
             case 45: System.out.println("XLV");
             break;
             case 46: System.out.println("XLVI");
             break;
             case 47: System.out.println("XLVII");
             break;
             case 48: System.out.println("XLVIII");
             break;
             case 49: System.out.println("XLIX");
             case 50: System.out.println("L");
             break;
             case 51: System.out.println("LI");
             break;
             case 52: System.out.println("LII");
             break;
             case 53: System.out.println("LIII");
             break;
             case 54: System.out.println("LIV");
             break;
             case 55: System.out.println("LV");
             break;
             case 56: System.out.println("LVI");
             break;
             case 57: System.out.println("LVII");
             break;
             case 58: System.out.println("LVIII");
             break;
             case 59: System.out.println("LIX");
             break;
             case 60: System.out.println("LX");
             break;
             case 61: System.out.println("LXI");
             break;
             case 62: System.out.println("LXII");
             break;
             case 63: System.out.println("LXIII");
             break;
             case 64: System.out.println("LXIV");
             break;
             case 65: System.out.println("LXV");
             break;
             case 66: System.out.println("LXVI");
             break;
             case 67: System.out.println("LXVII");
             break;
             case 68: System.out.println("LXVIII");
             break;
             case 69: System.out.println("LXIX(nicccce)");
             break;
             case 70: System.out.println("LXX");
             case 71: System.out.println("LXXI");
             break;
              case 72: System.out.println("LXXII");
             break;
              case 73: System.out.println("LXXIII");
             break;
              case 74: System.out.println("LXXIV");
             break;
              case 75: System.out.println("LXXV");
             break;
              case 76: System.out.println("LXXVI");
             break;
              case 77: System.out.println("LXXVII");
             break;
              case 78: System.out.println("LXXVIII");
             break;
              case 79: System.out.println("LXXIX");
             break;
              case 80: System.out.println("LXXX");
             break;
              case 81: System.out.println("LXXXI");
             break;
              case 82: System.out.println("LXXXII");
             break;
              case 83: System.out.println("LXXXIII");
             break;
              case 84: System.out.println("LXXXIV");
             break;
              case 85: System.out.println("LXXXV");
             break;
              case 86: System.out.println("LXXXVI");
             break;
              case 87: System.out.println("LXXXVII");
             break;
              case 88: System.out.println("LXXXVIII");
             break;
              case 89: System.out.println("LXXXIX");
             break;
              case 90: System.out.println("XC");
             break;
             case 91: System.out.println("XCI");
             break;
             case 92: System.out.println("XCII");
             break;
             case 93: System.out.println("XCIII");
             break;
             case 94: System.out.println("XCIV");
             break;
             case 95: System.out.println("XCV");
             break;
             case 96: System.out.println("XCVI");
             break;
             case 97: System.out.println("XCVII");
             break;
             case 98: System.out.println("XCVIII");
             break;
             case 99: System.out.println("XCIX");
             break;
             case 100: System.out.println("C");
             break;
       
         }
    
    }
    else if (input.contains("V")||input.contains("I")||(input.contains("X"))){
            System.out.println("Неплохо! Только имей ввиду, что у римлян не было ноля и отрицательных чисел,");
System.out.println("поэтому в ответе не может быть что-то меньше единицы.Помни об этом и у тебя всё получится!");
    
}

    
}  
    
} 
    
    
    
    
    
    
    
    
    
    
    
    
    
 
        
 

    

       
