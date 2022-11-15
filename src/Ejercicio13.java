import javax.swing.*;

public class Ejercicio13 {
    public static void main(String[] args) {
        int numero, suma_pos=0, contador_pos=0, suma_neg=0, contador_neg=0, contador_ceros=0;
        float media_pos, media_neg;

        for(int i=1;i<=10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un número: "));

            if(numero ==0){ //Si el número es cero
                contador_ceros++; //Aumentamos en 1 el contador de 0
            }else if(numero>0){ //Si el número es positivo
                suma_pos += numero; //Suma iterativa de positivos
                contador_pos++;
            }else{ //Si el número es negativo
                suma_neg += numero;
                contador_neg++;
            }
        }

        //A continuación  trabajaremos con los positivos
        if(contador_pos ==0){
            System.out.println("No es posible tener una media de los positivos");
        }else{
            media_pos = (float) suma_pos/contador_pos;
            System.out.println("La media de los números positivos es " +media_pos);
        }

        //A continuación trabajaremos con los negativos
        if(contador_neg ==0){
            System.out.println("No es posible tener una media de los negativos");
        }else{
            media_neg = (float) suma_neg/contador_neg;
            System.out.println("La media de los negativos es " + media_neg);
        }

        System.out.println("La cantidad de ceros es " +contador_ceros);
    }
}
