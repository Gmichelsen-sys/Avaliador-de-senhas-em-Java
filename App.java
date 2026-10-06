import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        while (true) {

            System.out.println("Digite sua senha:");
            String senha = leitor.nextLine();

            String resultado = avaliarSenha(senha);

            System.out.println(resultado);

            if (resultado.equals("Senha aprovada!")) {
                break;
            }
        }

        leitor.close();
    }

    public static String avaliarSenha(String senha) {

        // 1. definição da quantidade de caracteres

        if (senha.length() < 8) {
            return "Senha muito curta! Sua senha precisa ter pelo menos 8 caracteres.";
        }

        // 2. verificar se a senha possui números

        int contNumeros = 0;

        for (int N = 0; N < senha.length(); N++) {

            if (Character.isDigit(senha.charAt(N))) {
                contNumeros++;
            }
        }

        if (contNumeros == 0) {
            return "Sua senha deve ter no mínimo um número";
        }

        // 3. não aceitar senhas óbvias

        String[] senhaObvias = {"12345678", "senha123", "admin123"};

        for (String obvia : senhaObvias) {

            if (senha.equals(obvia)) {
                return "Senha muito óbvia!";
            }
        }

        // 4. verificar se possui letra maiúscula
        boolean temMaiuscula = false;

        for (int c = 0; c < senha.length(); c++) {

        if (Character.isUpperCase(senha.charAt(c))) {
        temMaiuscula = true;
    }
}

if (!temMaiuscula) {
    return "Sua senha precisa ter pelo menos uma letra maiúscula";
}
        // 5. senha aprovada

        return "Senha aprovada!";
    }
}




