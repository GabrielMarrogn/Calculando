import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int qtdF = sc.nextInt();
        int qtdLista = sc.nextInt();
        String texto = new String();
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        List<String> come = new ArrayList<>();
        sc.nextLine();
        
        for(int i = 0; i < qtdF; i++) {
            String a = sc.nextLine().toLowerCase();
            list.add(a);
        }

        for (int i = 0; i < qtdLista; i++) {
            String temp = sc.nextLine().toLowerCase();
            sb.append(temp);
        }

        texto = sb.toString();

        for (int i = 0; i < qtdF; i++) {
            if((texto.contains(list.get(i)) || (texto.contains(reverter(list.get(i)))))){
                come.add("Sheldon come a fruta " + list.get(i));
            }else {
                come.add("Sheldon detesta a fruta " +list.get(i));
            }
        }

        for (String p : come) {
            System.out.println(p);
        }
        
        sc.close();
    }

    public static String reverter(String a){
        return new StringBuilder(a).reverse().toString();
    }
}
