public class alejosor {
    public static void main(String[] args) {
       // Operadores Lógicos
       boolean cond1 = true, cond2 = false;
       boolean andLogico = cond1 && cond2;
       System.out.println("AND lógico: " + andLogico);

       boolean cond3 = true, cond4 = false;
       boolean orLogico = cond3 || cond4;
       System.out.println("OR lógico: " + orLogico);

       boolean cond5 = true;
       boolean notLogico = !cond5;
       System.out.println("NOT lógico: " + notLogico);
    }
}