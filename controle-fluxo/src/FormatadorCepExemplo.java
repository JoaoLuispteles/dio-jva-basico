public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("00000000");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("o cp não corresponde com as regras do negocio.");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length()!=8)
            throw new CepInvalidoException();

            //simulando formato do cep
            return "00.000-000";

        

    }

}