public class PrintStringVariable {
    public static void main(String[] args) {
        String texto = "Holberton School";
        System.out.printf(texto + "\n%s\n%s" , texto ,texto.substring(0,9));
    }
}
