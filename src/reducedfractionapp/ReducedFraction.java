package reducedfractionapp;

/** Несократимая дробь.
 */
public class ReducedFraction {
    
    /* =========================== Свойства =============================== */
 
    /* ---------------------- Числитель и знаменатель --------------------- */
    private int _numerator;   //числитель
    private int _denominator; //знаменатель

    public int get_denominator() {
        return _denominator;
    }

    public int get_numerator() {
        return _numerator;
    }

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

    /** Конструктор класса. При создании
    * @param numerator - числитель
     * @param denominator - знаменатель
    * */
    public ReducedFraction(int numerator, int denominator){
        if(denominator == 0){
            this._numerator = 0;
            this._denominator = 0;
        }
        else {
            int tempGCD = gcd(numerator, denominator);
            this._numerator = numerator / tempGCD;
            this._denominator = denominator / tempGCD;

            if(this._denominator < 0){
                this._numerator = -this._numerator;
                this._denominator = -this._denominator;
            }
        }
    }


    /** Конструктор класса
    * @param number - целое число
    */
    public ReducedFraction(int number){
        this._numerator = number;
        this._denominator = 1;
    }
    
  
    /* --------------------- Арифметические операции ---------------------- */
    
    /** Сложение двух дробей.
    * @param denominator - знаменатель
     * @param numerator - числитель
     * @return новая дробь - результат сложения
    */
    public ReducedFraction sum(int numerator, int denominator){
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
    public ReducedFraction sum(ReducedFraction fraction){
        return this.sum(fraction._numerator, fraction._denominator);
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
        return this.subtract(fraction._numerator, fraction._denominator);
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
        return this.multiply(fraction._numerator, fraction._denominator);
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
        return this.division(fraction._numerator, fraction._denominator);
    }


    /* --------------------- Операции сравнения ---------------------- */

    /** Сравнение двух дробей.
    * @param denominator - знаменатель
     * @param numerator - числитель
     * @return -1 - меньше, 0 - равно, 1 - больше
    */
    public int compare(int numerator, int denominator){
        return denominator != this._denominator?
                Integer.compare(this._numerator*denominator, numerator*this._denominator):
                Integer.compare(this._numerator, numerator);
    }

    /** Сравнение двух дробей.
     * @param compared - дробь для сравнения
     * @return -1 - меньше, 0 - равно, 1 - больше
     */
    public int compare(ReducedFraction compared){
        return this.compare(compared._numerator, compared._denominator);
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
        return this._denominator == 1 ? String.format("%d", this._numerator)
                : String.format("%d/%d", this._numerator, this._denominator);
    }

    /** Представить как вещественное число.
    * @return  дробь - вещественное число
    */
    public double toDouble(){
        return (double)this._numerator/this._denominator;
    }
}
