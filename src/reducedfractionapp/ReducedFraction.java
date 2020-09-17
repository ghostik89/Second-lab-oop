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
        if(denominator == 0)
            throw new IllegalArgumentException("Division to zero!");

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
    public static ReducedFraction createReducedFractionFromNumber(int number){
        return new ReducedFraction(number, 1);
    }
    
  
    /* --------------------- Арифметические операции ---------------------- */
    
    /** Сложение двух дробей.
    * 
    */
    public ReducedFraction add(int numerator, int denominator){
        if (this._denominator != denominator){
            this._numerator = this._numerator * denominator + numerator * this._denominator;
            this._denominator *= denominator;
            return new ReducedFraction(this._numerator, this._denominator);
        }
        else
            return new ReducedFraction(this._numerator + numerator, denominator);
    }


    public ReducedFraction add(ReducedFraction fraction){
        if (this._denominator != fraction._denominator){
            this._numerator = this._numerator * fraction._denominator + fraction._numerator * this._denominator;
            this._denominator *= fraction._denominator;
            return new ReducedFraction(this._numerator, this._denominator);
        }
        else
            return new ReducedFraction(this._numerator + fraction._numerator, fraction._denominator);
    }

    /** Вычитание двух дробей.
    * 
    */
    public ReducedFraction subtract(int numerator, int denominator){
        if (this._denominator != denominator){
            this._numerator = this._numerator * denominator - numerator * this._denominator;
            this._denominator *= denominator;
            return new ReducedFraction(this._numerator, this._denominator);
        }
        else
            return new ReducedFraction(this._numerator - numerator, denominator);
    }


    public ReducedFraction subtract(ReducedFraction fraction){
        if (this._denominator != fraction._denominator){
            this._numerator = this._numerator * fraction._denominator - fraction._numerator * this._denominator;
            this._denominator *= fraction._denominator;
            return new ReducedFraction(this._numerator, this._denominator);
        }
        else
            return new ReducedFraction(this._numerator - fraction._numerator, fraction._denominator);
    }

    /** Умножение двух дробей.
    * 
    */
    public ReducedFraction multiply(int numerator, int denominator){
        return new ReducedFraction(this._numerator * numerator,
                this._denominator * denominator);
    }


    public ReducedFraction multiply(ReducedFraction fraction){
        return new ReducedFraction(this._numerator * fraction._numerator,
                this._denominator * fraction._denominator);
    }
    
    /** Деление двух дробей.
    * 
    */
    public ReducedFraction division(int numerator, int denominator){
        return new ReducedFraction(this._numerator * denominator,
                this._denominator * numerator);
    }


    public ReducedFraction division(ReducedFraction fraction){
        return new ReducedFraction(this._numerator * fraction._denominator,
                this._denominator * fraction._numerator);
    }


    /* --------------------- Операции сравнения ---------------------- */

    /** Сравнение двух дробей.
    * 
    */
    public boolean more(int numerator, int denominator){
        if (this._denominator != denominator)
            return this._numerator*denominator > numerator*this._denominator;
        return this._numerator > numerator;
    }

    public boolean more(ReducedFraction fraction){
        if (this._denominator != fraction._denominator)
            return this._numerator*fraction._denominator > fraction._numerator*this._denominator;
        return this._numerator > fraction._numerator;
    }

    public boolean less(int numerator, int denominator){
        if (this._denominator != denominator)
            return this._numerator*denominator < numerator*this._denominator;
        return this._numerator < numerator;
    }

    public boolean less(ReducedFraction fraction){
        if (this._denominator != fraction._denominator)
            return this._numerator*fraction._denominator < fraction._numerator*this._denominator;
        return this._numerator < fraction._numerator;
    }
    
    /** Эквивалентность двух дробей.
    * 
    */
    @Override
    public boolean equals(Object other){
        if(other == null || !(other instanceof ReducedFraction))
            return false;

        ReducedFraction fraction = (ReducedFraction)other;
        return fraction._numerator == this._numerator && fraction._denominator == this._denominator;
    }

    
    /* --------------------- Операции преобразования ---------------------- */
    
    /** Представить как строку.
    * 
    */
    @Override
    public String toString(){
        return String.format("Numerator: %d, Denominator: %d", this._numerator, this._denominator);
    }

    /** Представить как вещественное число.
    * 
    */
    public double toDouble(){
        return (double)this._numerator/this._denominator;
    }
}
