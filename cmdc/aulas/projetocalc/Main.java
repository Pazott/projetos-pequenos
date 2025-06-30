package projetocalc;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
import projetocalc.classes.Calcular;
import projetocalc.classes.Mensagens;

public class Main extends Calcular{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);   
        
        DecimalFormat df = new DecimalFormat("0.############");
        Calcular calc = new Calcular();
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int idioma = 1; // 1 = inglês // 2 = português //

        while (i == 1) {
            if (idioma == 1) { //inglês
                System.out.println(Mensagens.introduction);

            } else { //português
                System.out.println(Mensagens.introducaoPtBR);

            }
            try{
                int opcao = sc.nextInt();            
                
                if (opcao == 1) { //SOMAR
                    if (idioma == 1) { //inglês
                        System.out.println(Mensagens.primnumb);
                        double a = sc.nextDouble();
                        System.out.println(Mensagens.segnum);
                        double b = sc.nextDouble();
                        double resultado = calc.somar(a, b);
                        System.out.printf("The results of sum of %s and %s is %s%n", df.format(a), df.format(b), df.format(resultado));

                    } else { //português
                        System.out.println(Mensagens.primnumPTBR);
                        double a = sc.nextDouble();
                        System.out.println(Mensagens.segnumPTBR);
                        double b = sc.nextDouble();
                        double resultado = calc.somar(a, b);
                        System.out.printf("O resultado da soma entre %s e %s é %s%n", df.format(a), df.format(b), df.format(resultado));

                    }
                } else if (opcao == 2) { //SUBTRAIR
                    if (idioma == 1) { //inglês
                        System.out.println(Mensagens.primnumb);
                        double a = sc.nextDouble();
                        System.out.println(Mensagens.segnum);
                        double b = sc.nextDouble();
                        double resultado = calc.subtrair(a, b);
                        System.out.printf("The results of subtraction of %s and %s is %s%n", df.format(a), df.format(b), df.format(resultado));

                    } else { //português
                        System.out.println(Mensagens.primnumPTBR);
                        double a = sc.nextDouble();
                        System.out.println(Mensagens.segnumPTBR);
                        double b = sc.nextDouble();
                        double resultado = calc.subtrair(a, b);
                        System.out.printf("O resultado da subtração entre %s e %s é %s%n", df.format(a), df.format(b), df.format(resultado));

                    }
                } else if (opcao == 3) { //DIVIDIR
                    if (idioma == 1) { //inglês
                        System.out.println(Mensagens.primnumb);
                        double a = sc.nextDouble();
                        System.out.println(Mensagens.segnum);
                        double b = sc.nextDouble();
                        double resultado = calc.dividir(a, b);
                        System.out.printf("The results of division of %s and %s is %s%n", df.format(a), df.format(b), df.format(resultado));

                    } else { //português
                        System.out.println(Mensagens.primnumPTBR);
                        double a = sc.nextDouble();
                        System.out.println(Mensagens.segnumPTBR);
                        double b = sc.nextDouble();
                        double resultado = calc.dividir(a, b);
                        System.out.printf("O resultado da divisão entre %s e %s é %s%n", df.format(a), df.format(b), df.format(resultado));

                    }
                } else if (opcao == 4) { //MULTIPLICAÇÃO
                    if (idioma == 1) { //inglês
                        System.out.println(Mensagens.primnumb);
                        double a = sc.nextDouble();
                        System.out.println(Mensagens.segnum);
                        double b = sc.nextDouble();
                        double resultado = calc.multiplicar(a, b);
                        System.out.printf("The results of multiplication of %s and %s is %s%n", df.format(a), df.format(b), df.format(resultado));

                    } else { //português
                        System.out.println(Mensagens.primnumPTBR);
                        double a = sc.nextDouble();
                        System.out.println(Mensagens.segnumPTBR);
                        double b = sc.nextDouble();
                        double resultado = calc.multiplicar(a, b);
                        System.out.printf("O resultado da multiplicação entre %s e %s é %s%n", df.format(a), df.format(b), df.format(resultado));

                    }
                } else if (opcao == 5) { //POTENCIALIZAÇÃO
                    if (idioma == 1) { //inglês
                        System.out.println(Mensagens.primnumb);
                        double base = sc.nextDouble();
                        System.out.println(Mensagens.segnum);
                        double expoente = sc.nextDouble();
                        double resultado = calc.potencializar(base, expoente);
                        System.out.printf("The results of potentiation of %s and %s is %s%n", df.format(base), df.format(expoente), df.format(resultado));

                    } else { //português
                        System.out.println(Mensagens.primnumPTBR);
                        double base = sc.nextDouble();
                        System.out.println(Mensagens.segnumPTBR);
                        double expoente = sc.nextDouble();
                        double resultado = calc.potencializar(base, expoente);
                        System.out.printf("O resultado da potência entre %s e %s é %s%n", df.format(base), df.format(expoente), df.format(resultado));

                    }
                } else if (opcao == 6) { //RADICIAÇÃO
                    if (idioma == 1) { //inglês
                        System.out.println(Mensagens.primnumb);
                        double base = sc.nextDouble();
                        System.out.println(Mensagens.segnum);
                        double indice = sc.nextDouble();
                        double resultado = calc.radiciar(base, indice);
                        System.out.printf("The results of radicalization of %s and %s is %s%n", df.format(base), df.format(indice), df.format(resultado));

                    } else { //português
                        System.out.println(Mensagens.primnumPTBR);
                        double base = sc.nextDouble();
                        System.out.println(Mensagens.segnumPTBR);
                        double indice = sc.nextDouble();
                        double resultado = calc.radiciar(base, indice);
                        System.out.printf("O resultado da radiciação entre %s e %s é %s%n", df.format(base), df.format(indice), df.format(resultado));

                    }
                } else if (opcao == 9) { //TROCAR LINGUA
                    if (idioma == 1) { //inglês para português
                        idioma = 2;
                        Locale.setDefault(Locale.of("pt", "BR"));
                        System.out.println(Mensagens.language);

                    } else { //português para inglês
                        idioma = 1;
                        Locale.setDefault(Locale.US);
                        System.out.println(Mensagens.linguagem);

                    }

                } else if (opcao == 0) { //FECHAR PROGRAMA
                    if (idioma == 1) { //inglês
                        System.out.println(Mensagens.close);

                    } else { //português
                        System.out.println(Mensagens.fecharPtBR);

                    }
                    i ++;

                } else { //ERRO CASO DIGITE UM NUMERO FORA DO PADRÃO
                    if (idioma == 1) { //inglês
                        System.out.println(Mensagens.error);

                    } else { //português
                        System.out.println(Mensagens.erroPtBR);

                    }
                }

            } catch (java.util.InputMismatchException e) { //ERRO PARA CASO EXCESSÕES TIPO ESSA: =1)
                if (idioma == 1) { //inglês
                    System.out.println(Mensagens.error2);

                } else { //português
                    System.out.println(Mensagens.entradainvalidaPTBR);

                }
                sc.nextLine();

            } catch (Exception e) { //PREVENÇÃO PARA ALGO QUE TENHO MEDO CASO ACONTEÇA
                if (idioma == 1) { //inglês
                    System.out.println(Mensagens.except);

                } else { //português
                    System.out.println(Mensagens.exceptPtBR + e.getMessage());

                }
                sc.nextLine();
            }
        }
        sc.close();
    }
}