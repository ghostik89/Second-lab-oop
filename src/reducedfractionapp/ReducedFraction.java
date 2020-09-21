package reducedfractionapp;

/** Несократимая дробь.
 */
public class ReducedFraction {
    
    /* =========================== Свойства =============================== */
 
    /* ---------------------- Числитель и знаменатель --------------------- */
    private int _numerator;   //числитель
    private int _denominator; //знаменатель
    
    
    /* =========================== Операции ============================== */

    /* ---------------------------- Порождение ---------------------------- */
    /** Нахождение НОД
     * @param a - первое число для нахождения НОД
     * @param b  - второе число для НОД
     * @return НОД a и b
     * */
    private static int gcd(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }

    /** Конструктор класса
    * @param numerator - числитель
     * @param denominator - знаменатель
    * */
    private ReducedFraction(int numerator, int denominator){
        if(denominator == 0){
            this._numerator = 0;
            this._denominator = 0;
        }

        int tempGCD = gcd(numerator, denominator);
        this._numerator = numerator / tempGCD;
        this._denominator = denominator / tempGCD;
    }


    /** Создание дроби с указанием ее числителя и знаменателя.
    * @param numerator - числитель
     * @param denominator - знаменатель
     * @return новый экземпляр ReducedFraction
    */
    public static ReducedFraction createReducedFraction(int numerator, int denominator){
        return new ReducedFraction(numerator, denominator);
    }

    /** Создание дроби на основе целого числа.
    * @param number - целое число
     * @return новый экземпляр ReducedFraction
    */
    public static ReducedFraction createReducedFractionFromNumber(int number){
        return new ReducedFraction(number, 1);
    }
    
  
    /* --------------------- Арифметические операции ---------------------- */
    
    /** Сложение двух дробей.
    * @param denominator - знаменатель
     * @param numerator - числитель
     * @return новая дробь - результат сложения
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


    /** Сложение двух дробей
     * @param fraction - дробь для сложения
     * @return новая дробь - результат сложения
     * */
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
    * @param numerator числитель
     * @param denominator знаменатель
     * @return новая дробь - результат вычитания
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

    /** Вычитание двух дробей.
     * @param fraction - дробь для вычитания
     * @return новая дробь - результат вычитания
     */
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
    * @param denominator - знаменатель
     * @param numerator - числитель
     * @return новая перемноженная дробь
    */
    public ReducedFraction multiply(int numerator, int denominator){
        return new ReducedFraction(this._numerator * numerator,
                this._denominator * denominator);
    }

    /** Умножение двух дробей.
     * @param fraction - дробь для умножения
     * @return новая перемноженная дробь
     */
    public ReducedFraction multiply(ReducedFraction fraction){
        return new ReducedFraction(this._numerator * fraction._numerator,
                this._denominator * fraction._denominator);
    }
    
    /** Деление двух дробей.
    * @param numerator - числитель
     * @param denominator - знаменатель
     * @return новая дробь - результат деления
    */
    public ReducedFraction division(int numerator, int denominator){
        return new ReducedFraction(this._numerator * denominator,
                this._denominator * numerator);
    }

    /** Деление двух дробей.
     * @param fraction - дробь для деления
     * @return новая дробь - результат деления
     */
    public ReducedFraction division(ReducedFraction fraction){
        return new ReducedFraction(this._numerator * fraction._denominator,
                this._denominator * fraction._numerator);
    }


    /* --------------------- Операции сравнения ---------------------- */

    /** Сравнение двух дробей.
    * @param denominator - знаменатель
     * @param numerator - числитель
     * @return ...
    */
    public int compare(int numerator, int denominator){
        if(denominator != this._denominator)
            return Integer.compare(this._numerator*denominator, numerator*this._denominator);
        else
            return Integer.compare(this._numerator, numerator);
    }

    /** Сравнение двух дробей.
     * @param compared - дробь для сравнения
     * @return ...
     */
    public int compare(ReducedFraction compared){
        if(compared._denominator != this._denominator)
            return Integer.compare(this._numerator*compared._denominator, compared._numerator*this._denominator);
        else
            return Integer.compare(this._numerator, compared._numerator);
    }
    
    /** Эквивалентность двух дробей.
    * @param other - объект сравнения
     * @return true - равны, false - не равны
    */
    @Override
    public boolean equals(Object other){
        if(!(other instanceof ReducedFraction))
            return false;

        ReducedFraction fraction = (ReducedFraction)other;
        return fraction._numerator == this._numerator && fraction._denominator == this._denominator;
    }

    
    /* --------------------- Операции преобразования ---------------------- */
    
    /** Представить как строку.
    * @return строка - представление дроби
    */
    @Override
    public String toString(){
        return String.format("Numerator: %d, Denominator: %d", this._numerator, this._denominator);
    }

    /** Представить как вещественное число.
    * @return  дробь - вещественное число
    */
    public double toDouble(){
        return (double)this._numerator/this._denominator;
    }
}
