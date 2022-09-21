package Condiciones;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {//Entre 1 y 99
        int num;
        String dec=" ", uni=" ";

        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca el numero: ");
        num=input.nextInt();

        if(num%10==9) uni="nueve";
            else if(num%10==8) uni="ocho";
                else if(num%10==7) uni="siete";
                    else if(num%10==6) uni="seis";
                        else if(num%10==5) uni="cinco";
                            else if(num%10==4) uni="cuatro";
                                else if(num%10==3) uni="tres";
                                    else if(num%10==2) uni="dos";
                                        else if(num%10==1) uni="uno";
                                            else if (num%10==0) uni=" ";//num%10==0 en blanco
        if(num/10==9) dec="noventa";
            else if(num/10==8) dec="ochenta";
                else if(num/10==7) dec="setenta";
                    else if(num/10==6) dec="sesenta";
                        else if(num/10==5) dec="cincuenta";
                            else if(num/10==4) dec="cuarenta";
                                else if(num/10==3) dec="treinta";
                                    else if(num/10==2) dec="veinte";
                                        else if(num/10==1) {
                                            dec="dieci";
                                            if(num%10==5) dec="quince";
                                                else if(num%10==4) dec="catorce";
                                                    else if(num%10==3) dec="trece";
                                                        else if(num%10==2) dec="doce";
                                                            else if(num%10==1) dec="once";
                                                                else if(num%10==0) dec="diez";
                                        }


        if(num/10==0) System.out.println(dec);
            else if (num/10==1 && num%10<=5) System.out.println(dec);//10 --> ()
                else if(num/10==1 && num%10>5) System.out.println(dec+uni);
                    else if(num/10>1 && num%10==0) System.out.println(dec);
                        else if(num/10>1 && num%10>0)System.out.println(dec + " y " + uni);
    }
}
