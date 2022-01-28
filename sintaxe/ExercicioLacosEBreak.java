package sintaxe;

public class ExercicioLacosEBreak {
    public static void main(String[] args) {
        /* Forma 1 de mostrar multiplos de 3
         *for (int contador = 1; contador <= 100; contador++) {
         *  if(contador % 3 == 0){
         *       System.out.println(contador);
         *    }
         */
        for (int i = 3; i < 100; i += 3) {
            System.out.println(i);
        }

    }
}
