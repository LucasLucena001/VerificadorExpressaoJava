public class VerificadorExpressao {
    public static boolean verificarExpressao(String expressao) {
        Pilha pilha = new Pilha(expressao.length());

        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);

            if (caractere == '(' || caractere == '[' || caractere == '{') {
                pilha.push(caractere);
            } else if (caractere == ')' || caractere == ']' || caractere == '}') {
                if (pilha.isEmpty()) {
                    return false; 
                }

                char topo = pilha.pop();
                if ((caractere == ')' && topo != '(') ||
                        (caractere == ']' && topo != '[') ||
                        (caractere == '}' && topo != '{')) {
                    return false; 
                }
            }
        }

        return pilha.isEmpty(); 
    }

    public static void main(String[] args) {
        String expressao1 = "x+y*(3+z)";
        String expressao2 = "x+y*(3+";

        boolean resultado1 = verificarExpressao(expressao1);
        boolean resultado2 = verificarExpressao(expressao2);

        System.out.println("Expressão 1 está correta? " + resultado1);
        System.out.println("Expressão 2 está correta? " + resultado2);
    }
}
