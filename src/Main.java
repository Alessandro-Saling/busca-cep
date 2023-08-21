import model.Endereco;
import rb.ServicoDeCep;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print("Informe seu CEP: ");
        String cep = new Scanner(System.in).nextLine();
        Endereco endereco = ServicoDeCep.buscaEnderecoPelo(cep);

        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Localidade: " + endereco.getLocalidade());
        System.out.println("Cep: " + endereco.getCep());
        System.out.println("Complemento: " + endereco.getComplemnto());
        System.out.println("UF: " + endereco.getUf());
        System.out.println("Unidade: " + endereco.getUnidade());
        System.out.println("Ibge: " + endereco.getIbge());
        System.out.println("Gia: " + endereco.getGia());
    }

}