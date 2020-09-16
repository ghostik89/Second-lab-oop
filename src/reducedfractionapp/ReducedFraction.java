package reducedfractionapp;

/** Несократимая дробь.
 */
public class ReducedFraction {
    
    /* =========================== Свойства =============================== */
 
    /* ---------------------- Числитель и знаменатель --------------------- */
    private int _numerator = 1;
    private int _denominator = 1;
    
    
    /* =========================== Операции ============================== */

    /* ---------------------------- Порождение ---------------------------- */
    private static int gcd(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }

    /*
    * Конструктор класса
    *
    * */
    private ReducedFraction(int numerator, int denominator){
        int tempGCD = gcd(numerator, denominator);
        this._numerator = numerator / tempGCD;
        this._denominator = denominator / tempGCD;
    }


    /** Создание дроби с указанием ее числителя и знаменателя.
    * 
    */
    public static ReducedFraction createReducedFraction(int numerator, int denominator){
        return new ReducedFraction(numerator, denominator);
    }

    /** Создание дроби на основе целого числа.
    * 
    */
    public static ReducedFraction createReducedFracionFromNumber(int number){
        return new ReducedFraction(number, 1);
    }
    
  
    /* --------------------- Арифметические операции ---------------------- */
    
    /** Сложение двух дробей.
    * 
    */ 

    /** Вычитание двух дробей.
    * 
    */ 

    /** Умножение двух дробей.
    * 
    */ 
    
    /** Деление двух дробей.
    * 
    */ 


    /* --------------------- Операции сравнения ---------------------- */

    /** Сравнение двух дробей.
    * 
    */ 
    
    /** Эквивалентность двух дробей.
    * 
    */     

    
    /* --------------------- Операции преобразования ---------------------- */
    
    /** Представить как строку.
    * 
    */     

    /** Представить как вещественное число.
    * 
    */     
}
