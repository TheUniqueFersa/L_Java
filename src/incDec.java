public class incDec {
    public static void main(String[] args) {
        int lives = 5;
        lives-=1;
        System.out.println(lives);


        //Posfija
        lives--;
        System.out.println(lives);

        lives++;
        System.out.println(lives);

        int gift = 100 + lives++; //posfijo
        System.out.println(gift);

        gift = 100 + ++lives; //prefijo
        System.out.println(gift);
    }
}
